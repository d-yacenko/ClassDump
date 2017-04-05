package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*       PackageManager              */
/*===================================*/

public abstract class PackageManager {
/*========fields=========*/
public static final  int COMPONENT_ENABLED_STATE_DEFAULT=0;
public static final  int COMPONENT_ENABLED_STATE_DISABLED=0;
public static final  int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED=0;
public static final  int COMPONENT_ENABLED_STATE_DISABLED_USER=0;
public static final  int COMPONENT_ENABLED_STATE_ENABLED=0;
public static final  int DONT_KILL_APP=0;
public static final  java.lang.String EXTRA_VERIFICATION_ID=null;
public static final  java.lang.String EXTRA_VERIFICATION_RESULT=null;
public static final  java.lang.String FEATURE_APP_WIDGETS=null;
public static final  java.lang.String FEATURE_AUDIO_LOW_LATENCY=null;
public static final  java.lang.String FEATURE_AUDIO_OUTPUT=null;
public static final  java.lang.String FEATURE_AUDIO_PRO=null;
public static final  java.lang.String FEATURE_AUTOMOTIVE=null;
public static final  java.lang.String FEATURE_BACKUP=null;
public static final  java.lang.String FEATURE_BLUETOOTH=null;
public static final  java.lang.String FEATURE_BLUETOOTH_LE=null;
public static final  java.lang.String FEATURE_CAMERA=null;
public static final  java.lang.String FEATURE_CAMERA_ANY=null;
public static final  java.lang.String FEATURE_CAMERA_AUTOFOCUS=null;
public static final  java.lang.String FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING=null;
public static final  java.lang.String FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR=null;
public static final  java.lang.String FEATURE_CAMERA_CAPABILITY_RAW=null;
public static final  java.lang.String FEATURE_CAMERA_EXTERNAL=null;
public static final  java.lang.String FEATURE_CAMERA_FLASH=null;
public static final  java.lang.String FEATURE_CAMERA_FRONT=null;
public static final  java.lang.String FEATURE_CAMERA_LEVEL_FULL=null;
public static final  java.lang.String FEATURE_CONNECTION_SERVICE=null;
public static final  java.lang.String FEATURE_CONSUMER_IR=null;
public static final  java.lang.String FEATURE_DEVICE_ADMIN=null;
public static final  java.lang.String FEATURE_ETHERNET=null;
public static final  java.lang.String FEATURE_FAKETOUCH=null;
public static final  java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT=null;
public static final  java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND=null;
public static final  java.lang.String FEATURE_FINGERPRINT=null;
public static final  java.lang.String FEATURE_FREEFORM_WINDOW_MANAGEMENT=null;
public static final  java.lang.String FEATURE_GAMEPAD=null;
public static final  java.lang.String FEATURE_HIFI_SENSORS=null;
public static final  java.lang.String FEATURE_HOME_SCREEN=null;
public static final  java.lang.String FEATURE_INPUT_METHODS=null;
public static final  java.lang.String FEATURE_LEANBACK=null;
public static final  java.lang.String FEATURE_LIVE_TV=null;
public static final  java.lang.String FEATURE_LIVE_WALLPAPER=null;
public static final  java.lang.String FEATURE_LOCATION=null;
public static final  java.lang.String FEATURE_LOCATION_GPS=null;
public static final  java.lang.String FEATURE_LOCATION_NETWORK=null;
public static final  java.lang.String FEATURE_MANAGED_USERS=null;
public static final  java.lang.String FEATURE_MICROPHONE=null;
public static final  java.lang.String FEATURE_MIDI=null;
public static final  java.lang.String FEATURE_NFC=null;
public static final  java.lang.String FEATURE_NFC_HOST_CARD_EMULATION=null;
public static final  java.lang.String FEATURE_NFC_HOST_CARD_EMULATION_NFCF=null;
public static final  java.lang.String FEATURE_OPENGLES_EXTENSION_PACK=null;
public static final  java.lang.String FEATURE_PICTURE_IN_PICTURE=null;
public static final  java.lang.String FEATURE_PRINTING=null;
public static final  java.lang.String FEATURE_SCREEN_LANDSCAPE=null;
public static final  java.lang.String FEATURE_SCREEN_PORTRAIT=null;
public static final  java.lang.String FEATURE_SECURELY_REMOVES_USERS=null;
public static final  java.lang.String FEATURE_SENSOR_ACCELEROMETER=null;
public static final  java.lang.String FEATURE_SENSOR_AMBIENT_TEMPERATURE=null;
public static final  java.lang.String FEATURE_SENSOR_BAROMETER=null;
public static final  java.lang.String FEATURE_SENSOR_COMPASS=null;
public static final  java.lang.String FEATURE_SENSOR_GYROSCOPE=null;
public static final  java.lang.String FEATURE_SENSOR_HEART_RATE=null;
public static final  java.lang.String FEATURE_SENSOR_HEART_RATE_ECG=null;
public static final  java.lang.String FEATURE_SENSOR_LIGHT=null;
public static final  java.lang.String FEATURE_SENSOR_PROXIMITY=null;
public static final  java.lang.String FEATURE_SENSOR_RELATIVE_HUMIDITY=null;
public static final  java.lang.String FEATURE_SENSOR_STEP_COUNTER=null;
public static final  java.lang.String FEATURE_SENSOR_STEP_DETECTOR=null;
public static final  java.lang.String FEATURE_SIP=null;
public static final  java.lang.String FEATURE_SIP_VOIP=null;
public static final  java.lang.String FEATURE_TELEPHONY=null;
public static final  java.lang.String FEATURE_TELEPHONY_CDMA=null;
public static final  java.lang.String FEATURE_TELEPHONY_GSM=null;
public static final  @java.lang.Deprecated() java.lang.String FEATURE_TELEVISION=null;
public static final  java.lang.String FEATURE_TOUCHSCREEN=null;
public static final  java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH=null;
public static final  java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT=null;
public static final  java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND=null;
public static final  java.lang.String FEATURE_USB_ACCESSORY=null;
public static final  java.lang.String FEATURE_USB_HOST=null;
public static final  java.lang.String FEATURE_VERIFIED_BOOT=null;
public static final  java.lang.String FEATURE_VR_MODE=null;
public static final  java.lang.String FEATURE_VR_MODE_HIGH_PERFORMANCE=null;
public static final  java.lang.String FEATURE_VULKAN_HARDWARE_LEVEL=null;
public static final  java.lang.String FEATURE_VULKAN_HARDWARE_VERSION=null;
public static final  java.lang.String FEATURE_WATCH=null;
public static final  java.lang.String FEATURE_WEBVIEW=null;
public static final  java.lang.String FEATURE_WIFI=null;
public static final  java.lang.String FEATURE_WIFI_DIRECT=null;
public static final  int GET_ACTIVITIES=0;
public static final  int GET_CONFIGURATIONS=0;
public static final  @java.lang.Deprecated() int GET_DISABLED_COMPONENTS=0;
public static final  @java.lang.Deprecated() int GET_DISABLED_UNTIL_USED_COMPONENTS=0;
public static final  int GET_GIDS=0;
public static final  int GET_INSTRUMENTATION=0;
public static final  int GET_INTENT_FILTERS=0;
public static final  int GET_META_DATA=0;
public static final  int GET_PERMISSIONS=0;
public static final  int GET_PROVIDERS=0;
public static final  int GET_RECEIVERS=0;
public static final  int GET_RESOLVED_FILTER=0;
public static final  int GET_SERVICES=0;
public static final  int GET_SHARED_LIBRARY_FILES=0;
public static final  int GET_SIGNATURES=0;
public static final  @java.lang.Deprecated() int GET_UNINSTALLED_PACKAGES=0;
public static final  int GET_URI_PERMISSION_PATTERNS=0;
public static final  int MATCH_ALL=0;
public static final  int MATCH_DEFAULT_ONLY=0;
public static final  int MATCH_DIRECT_BOOT_AWARE=0;
public static final  int MATCH_DIRECT_BOOT_UNAWARE=0;
public static final  int MATCH_DISABLED_COMPONENTS=0;
public static final  int MATCH_DISABLED_UNTIL_USED_COMPONENTS=0;
public static final  int MATCH_SYSTEM_ONLY=0;
public static final  int MATCH_UNINSTALLED_PACKAGES=0;
public static final  long MAXIMUM_VERIFICATION_TIMEOUT=0;
public static final  int PERMISSION_DENIED=0;
public static final  int PERMISSION_GRANTED=0;
public static final  int SIGNATURE_FIRST_NOT_SIGNED=0;
public static final  int SIGNATURE_MATCH=0;
public static final  int SIGNATURE_NEITHER_SIGNED=0;
public static final  int SIGNATURE_NO_MATCH=0;
public static final  int SIGNATURE_SECOND_NOT_SIGNED=0;
public static final  int SIGNATURE_UNKNOWN_PACKAGE=0;
public static final  int VERIFICATION_ALLOW=0;
public static final  int VERIFICATION_REJECT=0;

/*======constructors=====*/
public  PackageManager () {__Result__.str+="|PackageManager|";}

/*========methods========*/
public abstract  android.content.pm.PackageInfo getPackageInfo (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  java.lang.CharSequence getText (java.lang.String arg0,int arg1,android.content.pm.ApplicationInfo arg2) ;
public abstract  android.graphics.drawable.Drawable getDrawable (java.lang.String arg0,int arg1,android.content.pm.ApplicationInfo arg2) ;
public abstract  android.content.pm.ApplicationInfo getApplicationInfo (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.res.XmlResourceParser getXml (java.lang.String arg0,int arg1,android.content.pm.ApplicationInfo arg2) ;
public abstract  android.content.pm.ResolveInfo resolveActivity (android.content.Intent arg0,int arg1) ;
public abstract  [Ljava.lang.String; currentToCanonicalPackageNames ([Ljava.lang.String; arg0) ;
public abstract  [Ljava.lang.String; canonicalToCurrentPackageNames ([Ljava.lang.String; arg0) ;
public abstract  android.content.Intent getLaunchIntentForPackage (java.lang.String arg0) ;
public abstract  android.content.Intent getLeanbackLaunchIntentForPackage (java.lang.String arg0) ;
public abstract  [I getPackageGids (java.lang.String arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  [I getPackageGids (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  int getPackageUid (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.pm.PermissionInfo getPermissionInfo (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  java.util.List queryPermissionsByGroup (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.pm.PermissionGroupInfo getPermissionGroupInfo (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  java.util.List getAllPermissionGroups (int arg0) ;
public abstract  android.content.pm.ActivityInfo getActivityInfo (android.content.ComponentName arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.pm.ActivityInfo getReceiverInfo (android.content.ComponentName arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.pm.ServiceInfo getServiceInfo (android.content.ComponentName arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.pm.ProviderInfo getProviderInfo (android.content.ComponentName arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  java.util.List getInstalledPackages (int arg0) ;
public abstract  java.util.List getPackagesHoldingPermissions ([Ljava.lang.String; arg0,int arg1) ;
public abstract  boolean isPermissionRevokedByPolicy (java.lang.String arg0,java.lang.String arg1) ;
public abstract  boolean addPermission (android.content.pm.PermissionInfo arg0) ;
public abstract  boolean addPermissionAsync (android.content.pm.PermissionInfo arg0) ;
public abstract  void removePermission (java.lang.String arg0) ;
public abstract  int checkSignatures (java.lang.String arg0,java.lang.String arg1) ;
public abstract  int checkSignatures (int arg0,int arg1) ;
public abstract  [Ljava.lang.String; getPackagesForUid (int arg0) ;
public abstract  java.lang.String getNameForUid (int arg0) ;
public abstract  java.util.List getInstalledApplications (int arg0) ;
public abstract  [Ljava.lang.String; getSystemSharedLibraryNames () ;
public abstract  [Landroid.content.pm.FeatureInfo; getSystemAvailableFeatures () ;
public abstract  boolean hasSystemFeature (java.lang.String arg0) ;
public abstract  boolean hasSystemFeature (java.lang.String arg0,int arg1) ;
public abstract  java.util.List queryIntentActivities (android.content.Intent arg0,int arg1) ;
public abstract  java.util.List queryIntentActivityOptions (android.content.ComponentName arg0,[Landroid.content.Intent; arg1,android.content.Intent arg2,int arg3) ;
public abstract  java.util.List queryBroadcastReceivers (android.content.Intent arg0,int arg1) ;
public abstract  android.content.pm.ResolveInfo resolveService (android.content.Intent arg0,int arg1) ;
public abstract  java.util.List queryIntentServices (android.content.Intent arg0,int arg1) ;
public abstract  java.util.List queryIntentContentProviders (android.content.Intent arg0,int arg1) ;
public abstract  android.content.pm.ProviderInfo resolveContentProvider (java.lang.String arg0,int arg1) ;
public abstract  java.util.List queryContentProviders (java.lang.String arg0,int arg1,int arg2) ;
public abstract  android.content.pm.InstrumentationInfo getInstrumentationInfo (android.content.ComponentName arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  java.util.List queryInstrumentation (java.lang.String arg0,int arg1) ;
public abstract  android.graphics.drawable.Drawable getActivityIcon (android.content.Intent arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityIcon (android.content.ComponentName arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityBanner (android.content.Intent arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityBanner (android.content.ComponentName arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getDefaultActivityIcon () ;
public abstract  android.graphics.drawable.Drawable getApplicationIcon (java.lang.String arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getApplicationIcon (android.content.pm.ApplicationInfo arg0) ;
public abstract  android.graphics.drawable.Drawable getApplicationBanner (java.lang.String arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getApplicationBanner (android.content.pm.ApplicationInfo arg0) ;
public abstract  android.graphics.drawable.Drawable getActivityLogo (android.content.Intent arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityLogo (android.content.ComponentName arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getApplicationLogo (java.lang.String arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getApplicationLogo (android.content.pm.ApplicationInfo arg0) ;
public abstract  android.graphics.drawable.Drawable getUserBadgedIcon (android.graphics.drawable.Drawable arg0,android.os.UserHandle arg1) ;
public abstract  android.graphics.drawable.Drawable getUserBadgedDrawableForDensity (android.graphics.drawable.Drawable arg0,android.os.UserHandle arg1,android.graphics.Rect arg2,int arg3) ;
public abstract  java.lang.CharSequence getUserBadgedLabel (java.lang.CharSequence arg0,android.os.UserHandle arg1) ;
public abstract  java.lang.CharSequence getApplicationLabel (android.content.pm.ApplicationInfo arg0) ;
public abstract  android.content.res.Resources getResourcesForActivity (android.content.ComponentName arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.res.Resources getResourcesForApplication (android.content.pm.ApplicationInfo arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.res.Resources getResourcesForApplication (java.lang.String arg0) throws android.content.pm.PackageManager$NameNotFoundException;
public  android.content.pm.PackageInfo getPackageArchiveInfo (java.lang.String arg0,int arg1) {__Result__.str+="|getPackageArchiveInfo|"; return null;}
public abstract  void verifyPendingInstall (int arg0,int arg1) ;
public abstract  void extendVerificationTimeout (int arg0,int arg1,long arg2) ;
public abstract  void setInstallerPackageName (java.lang.String arg0,java.lang.String arg1) ;
public abstract  java.lang.String getInstallerPackageName (java.lang.String arg0) ;
public abstract  @java.lang.Deprecated() void addPackageToPreferred (java.lang.String arg0) ;
public abstract  @java.lang.Deprecated() void removePackageFromPreferred (java.lang.String arg0) ;
public abstract  java.util.List getPreferredPackages (int arg0) ;
public abstract  @java.lang.Deprecated() void addPreferredActivity (android.content.IntentFilter arg0,int arg1,[Landroid.content.ComponentName; arg2,android.content.ComponentName arg3) ;
public abstract  void clearPackagePreferredActivities (java.lang.String arg0) ;
public abstract  int getPreferredActivities (java.util.List arg0,java.util.List arg1,java.lang.String arg2) ;
public abstract  void setComponentEnabledSetting (android.content.ComponentName arg0,int arg1,int arg2) ;
public abstract  int getComponentEnabledSetting (android.content.ComponentName arg0) ;
public abstract  void setApplicationEnabledSetting (java.lang.String arg0,int arg1,int arg2) ;
public abstract  int getApplicationEnabledSetting (java.lang.String arg0) ;
public abstract  boolean isSafeMode () ;
public abstract  android.content.pm.PackageInstaller getPackageInstaller () ;
public abstract  int checkPermission (java.lang.String arg0,java.lang.String arg1) ;

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* NameNotFoundException              */
/*===================================*/

public static class NameNotFoundException extends android.util.AndroidException {
/*========fields=========*/

/*======constructors=====*/
public  NameNotFoundException () {__Result__.str+="|NameNotFoundException|";}
public  NameNotFoundException (java.lang.String arg0) {__Result__.str+="|NameNotFoundException|";}

/*========methods========*/

/*========inner classes========*/

}
}