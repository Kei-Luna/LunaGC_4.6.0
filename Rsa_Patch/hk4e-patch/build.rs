fn main() {
    cc::Build::new().file("version.asm").compile("version");

    println!("cargo:rerun-if-changed=version.asm");
    println!(
        "cargo:rustc-link-search=native={}",
        std::env::var("OUT_DIR").unwrap()
    );
    println!("cargo:rustc-link-lib=static=version");
    println!("cargo:rustc-link-arg=/DEF:version.def");
}
