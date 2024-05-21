# LunaGC-4.6.0

my Discord https://discord.gg/8vSyTHVphj

Please contribute actively to this repository

# Setup Guide

There is only a minimal guide here

If you need a more detailed guide, please refer to GrassCutter's official repository (no fiddler required)


## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL4.6.0 (If you don't have a 4.6.0 client, you can find it here and download it) :


| Download link | Package size | MD5 checksum |
| :---: | :---: | :---: |
| [GenshinImpact_4.6.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/GenshinImpact_4.6.0.zip.001) | 10.0 GB | 03ce6a5d4b7d8ba192cc6d9133a00bef |
| [GenshinImpact_4.6.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/GenshinImpact_4.6.0.zip.002) | 10.0 GB | a0320432c00779630df4a421ac7f3999 |
| [GenshinImpact_4.6.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/GenshinImpact_4.6.0.zip.003) | 10.0 GB | 335a750e6576205970a0bb49fbb2ce72 |
| [GenshinImpact_4.6.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/GenshinImpact_4.6.0.zip.004) | 10.0 GB | 2210fca193fc5261c5ae75841ce17002 |
| [GenshinImpact_4.6.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/GenshinImpact_4.6.0.zip.005) | 10.0 GB | f96757dbce7764e65150449f4a476b3e |
| [GenshinImpact_4.6.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/GenshinImpact_4.6.0.zip.006) | 5.67 GB | 6b43dac3616027ce7a980c41092f72fa |
| [Audio_Chinese_4.6.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/Audio_Chinese_4.6.0.zip) | 14.0 GB | 974bc5df3f7d96de01b68f1aab0371e5 |
| [Audio_English(US)_4.6.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/Audio_English(US)_4.6.0.zip) | 16.4 GB | f577ea4624981b36789e24913d0f3745 |
| [Audio_Japanese_4.6.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/Audio_Japanese_4.6.0.zip) | 18.4 GB | f039da619e670259d7e57c4f5e84be9e |
| [Audio_Korean_4.6.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240412191920_HThGUGlY3Gjy6AXP/Audio_Korean_4.6.0.zip) | 13.8 GB | 58c3fc8782f3d59b324dfd603fa93e6d |


- set Java environment variables
- build server
- Place Rsa_Patch/version.dll in the game root directory
- Download the older version of [mihoyonet.dll](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20231030132335_iOEfPMcbrXpiA8Ca/ScatteredFiles/GenshinImpact_Data/Plugins/mihoyonet.dll) (4.2.0) and replace `GenshinImpact_Data/Plugins/mihoyonet.dll`
- Download the [Resources](https://github.com/Kei-Luna/LunaGC_Resources_4.6.0) and place it in `/Resources`
- Set useEncryption and Questing to false(Set to false by default)
- Start the server and game
- have fun


### Compile the actual Server

**Sidenote**: Make sure to append the right prefix and suffix based on your operating system (./ for linux | .\ for windows | add .bat for windows systems when compiling server JAR/handbook).

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.

- **For Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*If you are wondering, the first command is to set up the environment while the 2nd one is for building the server JAR file.*

- **For Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*If you are wondering, the first command is to make the file executeable and for the rest refer to the windows explanation.*

### You can find the output JAR in the project root folder.

### Manually compile the handbook
```shell
./gradlew generateHandbook
```
