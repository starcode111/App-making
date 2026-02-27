# WebView APK with AdMob

Complete Android project configured to compile an APK with WebView and Google AdMob ads.

## Project Structure

- **MainActivity.java**: WebView + AdMob banner ad integration
- **activity_main.xml**: Layout with WebView and AdView
- **AndroidManifest.xml**: App permissions and configuration
- **build.gradle**: Gradle configuration with Google Mobile Ads dependency

## Features

✅ WebView loads https://awmkkj.rf.gd  
✅ Google AdMob integration (ad unit: ca-app-pub-2811640399661665/3650754053)  
✅ JavaScript enabled  
✅ Back button navigation support  
✅ Network access permissions

## How to Build APK

### Option 1: Using Android Studio (Recommended)

1. Install [Android Studio](https://developer.android.com/studio)
2. Open this project in Android Studio
3. Click **Build** → **Build Bundle(s)/APK(s)** → **Build APK(s)**
4. Output: `app/build/outputs/apk/debug/app-debug.apk`

### Option 2: Command Line Build

Prerequisites:
- Install [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Install [Android SDK](https://developer.android.com/studio/command-line-tools)
- Set ANDROID_HOME environment variable

Then run:
```bash
./gradlew assembleDebug
```

Output: `app/build/outputs/apk/debug/app-debug.apk`

### Option 3: Using Gradle Wrapper

If you don't have Gradle installed:
```bash
chmod +x gradlew
./gradlew assembleDebug
```

## Configuration

### Change Website URL
Edit `MainActivity.java` line 29:
```java
webView.loadUrl("https://your-website.com");
```

### Update AdMob Ad Unit ID
Edit `strings.xml`:
```xml
<string name="banner_ad_unit_id">your-ad-unit-id</string>
```

## Signing & Release Build

For production release:
```bash
./gradlew assembleRelease
```

Note: You'll need a signing keystore. Generate one:
```bash
keytool -genkey -v -keystore release.keystore -keyalg RSA -keysize 2048 -validity 10000
```

## Required Permissions

- `INTERNET`: Load web content
- `ACCESS_NETWORK_STATE`: Check network connectivity

## Troubleshooting

**No SDK found**: Install Android SDK via Android Studio SDK Manager (API 34)  
**Build fails**: Ensure Java 11+ and Gradle 9.0+ are installed  
**App crashes**: Check logcat for errors: `adb logcat`

## Output APK Location

- Debug: `app/build/outputs/apk/debug/app-debug.apk`
- Release: `app/build/outputs/apk/release/app-release.apk`

Install on device:
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```
