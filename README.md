Nova Island TV V3 FINAL - Java only, no Kotlin
Package: com.nova.island.tv - HOME launcher = true
Build: GitHub Actions
Install: adb -s 192.168.1.94:43351 install app-debug.apk
Set home: adb -s 192.168.1.94:43351 shell cmd package set-home-activity com.nova.island.tv/.MainActivity
Restore: adb -s 192.168.1.94:43351 shell cmd package set-home-activity com.smartdevice.leanbacklauncher.customizer/.MainActivity
