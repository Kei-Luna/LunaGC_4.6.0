#![feature(str_from_utf16_endian)]

use std::{sync::RwLock, time::Duration};

use lazy_static::lazy_static;
use util::try_get_base_address;
use windows::Win32::Foundation::HINSTANCE;
use windows::Win32::System::Console;
use windows::Win32::System::SystemServices::DLL_PROCESS_ATTACH;

mod interceptor;
mod marshal;
mod modules;
mod util;
mod version;
use version::VersionDllProxy;

use crate::modules::{Http, MhyContext, ModuleManager, Security};

unsafe fn thread_func() {
    let base = loop {
        if let Some(base) = try_get_base_address("UserAssembly.dll") {
            break base;
        }

        std::thread::sleep(Duration::from_millis(500));
    };

    std::thread::sleep(Duration::from_secs(7));

    util::disable_memprotect_guard();
    Console::AllocConsole().unwrap();

    println!("Genshin Impact encryption patch\nMade by xeondev");
    println!("UserAssembly: {:X}", base);

    let mut module_manager = MODULE_MANAGER.write().unwrap();
    module_manager.enable(MhyContext::<Http>::new(base));
    module_manager.enable(MhyContext::<Security>::new(base));

    println!("Successfully initialized!");
}

lazy_static! {
    static ref VERSION_DLL_PROXY: version::VersionDllProxy =
        VersionDllProxy::new().expect("Failed to load version.dll");
    static ref MODULE_MANAGER: RwLock<ModuleManager> = RwLock::new(ModuleManager::default());
}

#[no_mangle]
unsafe extern "system" fn DllMain(_: HINSTANCE, call_reason: u32, _: *mut ()) -> bool {
    if call_reason == DLL_PROCESS_ATTACH {
        VERSION_DLL_PROXY
            .load_functions()
            .expect("Failed to load functions from version.dll");

        std::thread::spawn(|| thread_func());
    }

    true
}
