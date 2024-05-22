use anyhow::{bail, Result};
use ilhook::x64::{
    CallbackOption, HookFlags, HookPoint, HookType, Hooker, JmpBackRoutine, RetnRoutine,
};

pub struct Interceptor {
    pub hooks: Vec<HookPoint>,
}

impl Interceptor {
    pub const fn new() -> Self {
        Self { hooks: Vec::new() }
    }

    pub unsafe fn attach(&mut self, addr: usize, routine: JmpBackRoutine) -> Result<()> {
        let hooker = Hooker::new(
            addr,
            HookType::JmpBack(routine),
            CallbackOption::None,
            0,
            HookFlags::empty(),
        );

        let Ok(hook_point) = hooker.hook() else {
            bail!("Failed to attach 0x{addr:X}")
        };

        self.hooks.push(hook_point);
        Ok(())
    }

    pub unsafe fn replace(&mut self, addr: usize, routine: RetnRoutine) -> Result<()> {
        let hooker = Hooker::new(
            addr,
            HookType::Retn(routine),
            CallbackOption::None,
            0,
            HookFlags::empty(),
        );

        let Ok(hook_point) = hooker.hook() else {
            bail!("Failed to replace 0x{addr:X}")
        };

        self.hooks.push(hook_point);
        Ok(())
    }
}
