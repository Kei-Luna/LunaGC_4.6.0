use std::collections::HashMap;

use anyhow::Result;

use crate::interceptor::Interceptor;

mod http;
mod security;

pub use http::Http;
pub use security::Security;

#[derive(Default)]
pub struct ModuleManager {
    modules: HashMap<ModuleType, Box<dyn MhyModule>>,
}
unsafe impl Sync for ModuleManager {}
unsafe impl Send for ModuleManager {}

impl ModuleManager {
    pub unsafe fn enable(&mut self, module: impl MhyModule + 'static) {
        let mut boxed_module = Box::new(module);
        boxed_module.init().unwrap();
        self.modules
            .insert(boxed_module.get_module_type(), boxed_module);
    }

    #[allow(dead_code)]
    pub unsafe fn disable(&mut self, module_type: ModuleType) {
        let module = self.modules.remove(&module_type);
        if let Some(mut module) = module {
            module.as_mut().de_init().unwrap();
        }
    }
}

#[derive(Copy, Clone, Hash, PartialEq, Eq)]
pub enum ModuleType {
    Http,
    Security,
}

pub trait MhyModule {
    unsafe fn init(&mut self) -> Result<()>;
    unsafe fn de_init(&mut self) -> Result<()>;
    fn get_module_type(&self) -> ModuleType;
}

pub struct MhyContext<T> {
    pub assembly_base: usize,
    pub interceptor: Interceptor,
    _phantom: std::marker::PhantomData<T>,
}

impl<T> MhyContext<T> {
    pub const fn new(assembly_base: usize) -> Self {
        Self {
            assembly_base,
            interceptor: Interceptor::new(),
            _phantom: std::marker::PhantomData,
        }
    }
}
