# This is a sample proguard configuration file for use with Gradle.

-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
