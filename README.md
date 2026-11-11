Nova Island TV V2 - High Quality 1920x1080
Package: com.nova.island.tv
HOME launcher = true
Build: GitHub Actions -> Actions -> Build Nova Island TV APK -> Download artifact
Install: adb -s 192.168.1.94:43351 install app-debug.apk
Set home: adb -s 192.168.1.94:43351 shell cmd package set-home-activity com.nova.island.tv/.MainActivity
Restore: adb -s 192.168.1.94:43351 shell cmd package set-home-activity com.smartdevice.leanbacklauncher.customizer/.MainActivity
