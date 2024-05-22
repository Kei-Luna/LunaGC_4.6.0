use super::{MhyContext, MhyModule, ModuleType};
use anyhow::Result;
use ilhook::x64::Registers;

const IL2CPP_ARRAY_NEW: usize = 0x00553C10;
const KEY_SIGN_CHECK: usize = 0x000041C5;

const KEY_SIZE: u64 = 272;
const KEY_PREFIX: u64 = 0x0D700010182020A01;
static SERVER_PUBLIC_KEY: &[u8] = include_bytes!("../../server_public_key.bin");
type Il2cppArrayNew = unsafe extern "fastcall" fn(u64, u64) -> *const u8;

pub struct Security;

impl MhyModule for MhyContext<Security> {
    unsafe fn init(&mut self) -> Result<()> {
        self.interceptor.replace(
            self.assembly_base + IL2CPP_ARRAY_NEW,
            il2cpp_array_new_replacement,
        )?;
        self.interceptor
            .attach(self.assembly_base + KEY_SIGN_CHECK, after_key_sign_check)
    }

    unsafe fn de_init(&mut self) -> Result<()> {
        Ok(())
    }

    fn get_module_type(&self) -> super::ModuleType {
        ModuleType::Security
    }
}

// Sign check of rsa key that we just replaced.
unsafe extern "win64" fn after_key_sign_check(reg: *mut Registers, _: usize) {
    (*reg).rax = 1
}

static mut KEY_PTR: Option<*mut u8> = None;
unsafe extern "win64" fn il2cpp_array_new_replacement(
    reg: *mut Registers,
    actual_func: usize,
    _: usize,
) -> usize {
    let il2cpp_array_new = std::mem::transmute::<usize, Il2cppArrayNew>(actual_func);
    let ret_val = il2cpp_array_new((*reg).rcx, (*reg).rdx) as usize;

    let rdx = (*reg).rdx;
    if rdx == KEY_SIZE {
        KEY_PTR = Some(ret_val as *mut u8);
    } else {
        if let Some(key_ptr) = KEY_PTR {
            if *(key_ptr.wrapping_add(32) as *const u64) == KEY_PREFIX {
                std::ptr::copy_nonoverlapping(
                    SERVER_PUBLIC_KEY.as_ptr(),
                    key_ptr.wrapping_add(32),
                    SERVER_PUBLIC_KEY.len(),
                );
            }
        }

        KEY_PTR = None;
    }

    ret_val
}
