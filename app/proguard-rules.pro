# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/rrodriguez/Documents/roman/apps/sdk/android/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# COMMON ANDROID
-keepattributes *Annotation*
-keepattributes Signature
-keep public class * {
    public protected *;
}
-keep public interface *
-keep public enum * {
    **[] $VALUES;
    public *;
}
-keep public class * {
    public *;
}
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final *** NULL;
}
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}
-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# Remove log 'i', 'v' , 'e', 'w' and 'd', for preventing security problems.
# If you remove this rule you must check 'LogConditionals' on Lint tool
-assumenosideeffects class android.util.Log {
    public static *** i(...);
    public static *** v(...);
    public static *** d(...);
}

# BUTTERKNIFE
-keep class butterknife.** { *; }
-dontwarn butterknife.internal.**
-keep class **$$ViewInjector { *; }
-keepclasseswithmembernames class * {
    @butterknife.* <fields>;
}
-keepclasseswithmembernames class * {
    @butterknife.* <methods>;
}

# OTTO
-keepattributes *Annotation*
-keepclassmembers class ** {
    @com.squareup.otto.Subscribe public *;
    @com.squareup.otto.Produce public *;
}