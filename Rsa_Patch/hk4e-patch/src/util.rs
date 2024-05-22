use core::iter::once;
use std::ffi::{c_void, OsStr};

use std::os::windows::ffi::OsStrExt;
use windows::Win32::System::LibraryLoader::{GetProcAddress, GetModuleHandleW};
use windows::Win32::System::Memory::{PAGE_EXECUTE_READWRITE, PAGE_PROTECTION_FLAGS, VirtualProtect};
use windows::core::{PCSTR, PCWSTR};

pub fn wide_str(value: &str) -> Vec<u16> {
    OsStr::new(value).encode_wide().chain(once(0)).collect()
}

pub unsafe fn try_get_base_address(module_name: &str) -> Option<usize> {
    let w_module_name = wide_str(module_name);

    match GetModuleHandleW(PCWSTR::from_raw(w_module_name.as_ptr())) {
        Ok(module) => Some(module.0 as usize),
        Err(_) => None
    }
}

// VMProtect hooks NtProtectVirtualMemory to prevent changing protection of executable segments
// We use this trick to remove hook
pub unsafe fn disable_memprotect_guard() {
    let ntdll = wide_str("ntdll.dll");
    let ntdll = GetModuleHandleW(PCWSTR::from_raw(ntdll.as_ptr())).unwrap();
    let proc_addr = GetProcAddress(
        ntdll,
        PCSTR::from_raw(c"NtProtectVirtualMemory".to_bytes_with_nul().as_ptr()),
    )
    .unwrap();
    let nt_query = GetProcAddress(ntdll, PCSTR::from_raw(c"NtQuerySection".to_bytes_with_nul().as_ptr())).unwrap();

    let mut old_prot = PAGE_PROTECTION_FLAGS(0);
    VirtualProtect(
        proc_addr as *const usize as *mut c_void,
        1,
        PAGE_EXECUTE_READWRITE,
        &mut old_prot,
    )
    .unwrap();

    let routine = nt_query as *mut u32;
    let routine_val = *(routine as *const usize);

    let lower_bits_mask = !(0xFFu64 << 32);
    let lower_bits = routine_val & lower_bits_mask as usize;

    let offset_val = *((routine as usize + 4) as *const u32);
    let upper_bits = ((offset_val as usize).wrapping_sub(1) as usize) << 32;

    let result = lower_bits | upper_bits;

    *(proc_addr as *mut usize) = result;

    VirtualProtect(
        proc_addr as *const usize as *mut c_void,
        1,
        old_prot,
        &mut old_prot,
    )
    .unwrap();
}
