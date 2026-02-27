# Android WebView APK Builder - Prompt Templates

---

## TEMPLATE 1: WEBVIEW APK WITHOUT ADS (Full Features)

```
Create a complete production-ready Android WebView APK with the following specifications:

BASIC APP INFO:
- Website URL: https://example.com/
- App Name: Example App
- Package Name: com.example.appname
- Version Code: 1
- Version Name: 1.0

BUILD CONFIGURATION:
- Min SDK: 21 (Android 5.0)
- Target SDK: 34 (Android 14)
- Compile SDK: 34
- Java Version: 11
- Gradle: 8.2+
- AndroidX: Enabled
- Build Tools: 30.0.3+

REQUIRED FEATURES:
1. WebView Configuration:
   - JavaScript enabled
   - DOM Storage enabled
   - Database enabled
   - Cookie support enabled
   - Local storage support
   - Mixed content allowed (HTTP + HTTPS)
   - Custom User-Agent string
   - Viewport configuration
   - Load overview mode enabled
   - Wide viewport enabled

2. Error Handling:
   - Global onCreate() try-catch
   - SSL/TLS error handler (allow expired certificates)
   - Network error handling with user feedback
   - Page load error handling
   - Graceful fallback UI with error messages
   - Toast notifications for debugging

3. Navigation:
   - Back button navigation support
   - WebView navigation history
   - Home button option
   - Pull-to-refresh capability
   - Loading progress indicator

4. Permissions:
   - INTERNET
   - ACCESS_NETWORK_STATE
   - WRITE_EXTERNAL_STORAGE
   - READ_EXTERNAL_STORAGE
   - ACCESS_FINE_LOCATION
   - ACCESS_COARSE_LOCATION
   - CAMERA (optional)
   - MICROPHONE (optional)

5. UI/UX:
   - AppCompat.Light theme with Material colors
   - Fullscreen WebView layout
   - Error message TextView as fallback
   - Loading toast messages
   - Proper color scheme (primary: #3F51B5, dark: #303F9F, accent: #FF4081)

6. Technical Features:
   - WebChromeClient for JavaScript dialogs
   - Custom WebViewClient for page control
   - Null pointer exception prevention
   - Device info detection
   - TLS 1.2+ support

PROJECT STRUCTURE:
- Root: build.gradle, settings.gradle, gradle.properties
- App module: build.gradle, AndroidManifest.xml
- Java: MainActivity.java with WebViewClient/WebChromeClient
- Resources: activity_main.xml, styles.xml, colors.xml, strings.xml
- Gradle Wrapper: gradlew, gradle-wrapper.properties

MANIFEST CONFIGURATION:
- Activity exported="true"
- Intent filter for MAIN/LAUNCHER
- All required permissions listed
- AppCompat theme applied globally

BUILD OUTPUT:
- Debug APK: app/build/outputs/apk/debug/app-debug.apk
- Ready for installation on Android 5.0+

ADDITIONAL REQUIREMENTS:
- All files in git repository
- Ready to compile with: gradle clean assembleDebug or Docker
- Include error handling that prevents app crashes
- Support for dynamic URL loading
- Cache management enabled

Please provide:
1. Complete project structure
2. All configuration files (build.gradle, AndroidManifest.xml, etc.)
3. MainActivity.java with full implementation
4. Layout files (activity_main.xml, colors.xml, styles.xml, strings.xml)
5. Docker build command for compilation
6. Git push instructions
```

---

## TEMPLATE 2: WEBVIEW APK WITH GOOGLE ADMOB ADS (Full Features)

```
Create a complete production-ready Android WebView APK with Google AdMob integration:

BASIC APP INFO:
- Website URL: https://example.com/
- App Name: Example App
- Package Name: com.example.appname
- Version Code: 1
- Version Name: 1.0
- AdMob App ID: ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy
- Banner Ad Unit ID: ca-app-pub-xxxxxxxxxxxxxxxx/zzzzzzzzzz
- Interstitial Ad Unit ID: ca-app-pub-xxxxxxxxxxxxxxxx/aaaaaaaaaaaa (optional)

BUILD CONFIGURATION:
- Min SDK: 21 (Android 5.0)
- Target SDK: 34 (Android 14)
- Compile SDK: 34
- Java Version: 11
- Gradle: 8.2+
- AndroidX: Enabled
- Build Tools: 30.0.3+
- Google Mobile Ads SDK: 22.0.0+

REQUIRED FEATURES:
1. WebView Configuration:
   - JavaScript enabled
   - DOM Storage enabled
   - Database enabled
   - Cookie support enabled
   - Local storage support
   - Mixed content allowed (HTTP + HTTPS)
   - Custom User-Agent string
   - Viewport configuration
   - Load overview mode enabled
   - Wide viewport enabled

2. Google AdMob Integration:
   - AdMob SDK initialized safely
   - Banner Ad at bottom of screen
   - AdView properly configured
   - Ad request with test device support
   - AdMob initialization try-catch
   - Ad loading error handling
   - Banner ad lifecycle management
   - Responsive ad sizing

3. Ad Placement:
   - Banner ad below WebView
   - Linear layout with weight distribution
   - AdView: 320x50dp (mobile banner size)
   - Centered horizontally
   - Gravity set to bottom|center_horizontal

4. Error Handling:
   - Global onCreate() try-catch
   - SSL/TLS error handler (allow expired certificates)
   - Network error handling with user feedback
   - Page load error handling
   - AdMob initialization error handling
   - Ad loading failure handling
   - Graceful fallback UI with error messages
   - Toast notifications for debugging

5. Navigation:
   - Back button navigation support
   - WebView navigation history
   - Home button option
   - Pull-to-refresh capability
   - Loading progress indicator

6. Permissions:
   - INTERNET (required for ads)
   - ACCESS_NETWORK_STATE (required for ads)
   - WRITE_EXTERNAL_STORAGE
   - READ_EXTERNAL_STORAGE
   - ACCESS_FINE_LOCATION
   - ACCESS_COARSE_LOCATION
   - CAMERA (optional)
   - MICROPHONE (optional)

7. Dependencies:
   - androidx.appcompat:appcompat:1.6.1
   - androidx.constraintlayout:constraintlayout:2.1.4
   - com.google.android.gms:play-services-ads:22.0.0

8. UI/UX:
   - AppCompat.Light theme with Material colors
   - WebView above ads
   - AdView below WebView
   - Error message TextView as fallback
   - Loading toast messages
   - Proper color scheme (primary: #3F51B5, dark: #303F9F, accent: #FF4081)

9. Technical Features:
   - WebChromeClient for JavaScript dialogs
   - Custom WebViewClient for page control
   - Null pointer exception prevention
   - Device info detection
   - TLS 1.2+ support
   - MobileAds.initialize() with error handling

10. AndroidX Properties:
    - android.useAndroidX=true
    - android.enableJetifier=true
    - android.suppressUnsupportedCompileSdk=34

PROJECT STRUCTURE:
- Root: build.gradle, settings.gradle, gradle.properties
- App module: build.gradle (with Google Play Services), AndroidManifest.xml
- Java: MainActivity.java with WebViewClient/WebChromeClient/AdMob
- Resources: activity_main.xml, styles.xml, colors.xml, strings.xml
- Gradle Wrapper: gradlew, gradle-wrapper.properties

MANIFEST CONFIGURATION:
- Activity exported="true"
- Intent filter for MAIN/LAUNCHER
- All required permissions listed
- AppCompat theme applied globally
- Meta-data for AdMob App ID

BUILD OUTPUT:
- Debug APK: app/build/outputs/apk/debug/app-debug.apk
- Ready for installation on Android 5.0+
- Ready for Google Play Store release build

ADDITIONAL REQUIREMENTS:
- All files in git repository
- Ready to compile with: gradle clean assembleDebug or Docker
- Include error handling that prevents app crashes
- Support for dynamic URL loading
- Cache management enabled
- AdMob test device configuration commented in code
- Production Ad Unit IDs supported
- Ad loading with proper lifecycle management

Please provide:
1. Complete project structure
2. All configuration files (build.gradle, AndroidManifest.xml, etc.)
3. MainActivity.java with full AdMob implementation
4. Layout files (activity_main.xml with AdView, colors.xml, styles.xml, strings.xml)
5. gradle.properties with AndroidX settings
6. Docker build command for compilation
7. Git push instructions
8. Instructions for replacing test Ad Unit IDs with production IDs
```

---

## HOW TO USE THESE TEMPLATES:

**For NO ADS version:**
1. Copy TEMPLATE 1
2. Replace `https://example.com/` with your website
3. Replace `com.example.appname` with your package name
4. Replace `Example App` with your app name
5. Paste into ChatGPT, Claude, or your favorite AI
6. Ask it to build the project

**For WITH ADS version:**
1. Copy TEMPLATE 2
2. Replace all `example.com`, package name, app name
3. Replace `ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy` with your AdMob App ID
4. Replace `ca-app-pub-xxxxxxxxxxxxxxxx/zzzzzzzzzz` with your Banner Ad Unit ID
5. Paste into AI and build

Both templates are production-ready and comprehensive!
