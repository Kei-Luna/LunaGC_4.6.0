use libloading::{Error, Library, Symbol};
use std::env;
use std::ffi::CStr;

static FUNCTION_NAMES: &[&CStr] = &[
    c"GetFileVersionInfoA",
    c"GetFileVersionInfoByHandle",
    c"GetFileVersionInfoExA",
    c"GetFileVersionInfoExW",
    c"GetFileVersionInfoSizeA",
    c"GetFileVersionInfoSizeExA",
    c"GetFileVersionInfoSizeExW",
    c"GetFileVersionInfoSizeW",
    c"GetFileVersionInfoW",
    c"VerFindFileA",
    c"VerFindFileW",
    c"VerInstallFileA",
    c"VerInstallFileW",
    c"VerLanguageNameA",
    c"VerLanguageNameW",
    c"VerQueryValueA",
    c"VerQueryValueW",
];

#[no_mangle]
static mut ORIGINAL_FUNCTIONS: [*const usize; 17] = [0 as *const usize; 17];

pub struct VersionDllProxy {
    library: Library,
}

impl VersionDllProxy {
    pub fn new() -> Result<Self, Box<dyn std::error::Error>> {
        let system_directory = env::var("windir")? + ("\\System32\\");
        let dll_path = system_directory + "version.dll";
        let library = unsafe { Library::new(dll_path) }?;
        Ok(Self { library })
    }

    fn get_function<T>(&self, func_name: &CStr) -> Result<Symbol<T>, Error> {
        unsafe { self.library.get(func_name.to_bytes_with_nul()) }
    }

    pub fn load_functions(&self) -> Result<(), Error> {
        for (i, &name) in FUNCTION_NAMES.iter().enumerate() {
            let fn_ptr = self.get_function::<Symbol<*mut usize>>(name)?;
            unsafe { ORIGINAL_FUNCTIONS[i] = **fn_ptr };
            println!("Loaded function {}@{:p}", name.to_str().unwrap(), unsafe {
                ORIGINAL_FUNCTIONS[i]
            });
        }
        Ok(())
    }
}
