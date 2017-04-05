package android.content;
import android.__Result__;


/*===================================*/ 
/*              Context              */
/*===================================*/

public abstract class Context {
/*========fields=========*/
public static final  java.lang.String ACCESSIBILITY_SERVICE=null;
public static final  java.lang.String ACCOUNT_SERVICE=null;
public static final  java.lang.String ACTIVITY_SERVICE=null;
public static final  java.lang.String ALARM_SERVICE=null;
public static final  java.lang.String APPWIDGET_SERVICE=null;
public static final  java.lang.String APP_OPS_SERVICE=null;
public static final  java.lang.String AUDIO_SERVICE=null;
public static final  java.lang.String BATTERY_SERVICE=null;
public static final  int BIND_ABOVE_CLIENT=0;
public static final  int BIND_ADJUST_WITH_ACTIVITY=0;
public static final  int BIND_ALLOW_OOM_MANAGEMENT=0;
public static final  int BIND_AUTO_CREATE=0;
public static final  int BIND_DEBUG_UNBIND=0;
public static final  int BIND_EXTERNAL_SERVICE=0;
public static final  int BIND_IMPORTANT=0;
public static final  int BIND_NOT_FOREGROUND=0;
public static final  int BIND_WAIVE_PRIORITY=0;
public static final  java.lang.String BLUETOOTH_SERVICE=null;
public static final  java.lang.String CAMERA_SERVICE=null;
public static final  java.lang.String CAPTIONING_SERVICE=null;
public static final  java.lang.String CARRIER_CONFIG_SERVICE=null;
public static final  java.lang.String CLIPBOARD_SERVICE=null;
public static final  java.lang.String CONNECTIVITY_SERVICE=null;
public static final  java.lang.String CONSUMER_IR_SERVICE=null;
public static final  int CONTEXT_IGNORE_SECURITY=0;
public static final  int CONTEXT_INCLUDE_CODE=0;
public static final  int CONTEXT_RESTRICTED=0;
public static final  java.lang.String DEVICE_POLICY_SERVICE=null;
public static final  java.lang.String DISPLAY_SERVICE=null;
public static final  java.lang.String DOWNLOAD_SERVICE=null;
public static final  java.lang.String DROPBOX_SERVICE=null;
public static final  java.lang.String FINGERPRINT_SERVICE=null;
public static final  java.lang.String HARDWARE_PROPERTIES_SERVICE=null;
public static final  java.lang.String INPUT_METHOD_SERVICE=null;
public static final  java.lang.String INPUT_SERVICE=null;
public static final  java.lang.String JOB_SCHEDULER_SERVICE=null;
public static final  java.lang.String KEYGUARD_SERVICE=null;
public static final  java.lang.String LAUNCHER_APPS_SERVICE=null;
public static final  java.lang.String LAYOUT_INFLATER_SERVICE=null;
public static final  java.lang.String LOCATION_SERVICE=null;
public static final  java.lang.String MEDIA_PROJECTION_SERVICE=null;
public static final  java.lang.String MEDIA_ROUTER_SERVICE=null;
public static final  java.lang.String MEDIA_SESSION_SERVICE=null;
public static final  java.lang.String MIDI_SERVICE=null;
public static final  int MODE_APPEND=0;
public static final  int MODE_ENABLE_WRITE_AHEAD_LOGGING=0;
public static final  @java.lang.Deprecated() int MODE_MULTI_PROCESS=0;
public static final  int MODE_NO_LOCALIZED_COLLATORS=0;
public static final  int MODE_PRIVATE=0;
public static final  @java.lang.Deprecated() int MODE_WORLD_READABLE=0;
public static final  @java.lang.Deprecated() int MODE_WORLD_WRITEABLE=0;
public static final  java.lang.String NETWORK_STATS_SERVICE=null;
public static final  java.lang.String NFC_SERVICE=null;
public static final  java.lang.String NOTIFICATION_SERVICE=null;
public static final  java.lang.String NSD_SERVICE=null;
public static final  java.lang.String POWER_SERVICE=null;
public static final  java.lang.String PRINT_SERVICE=null;
public static final  java.lang.String RESTRICTIONS_SERVICE=null;
public static final  java.lang.String SEARCH_SERVICE=null;
public static final  java.lang.String SENSOR_SERVICE=null;
public static final  java.lang.String SHORTCUT_SERVICE=null;
public static final  java.lang.String STORAGE_SERVICE=null;
public static final  java.lang.String SYSTEM_HEALTH_SERVICE=null;
public static final  java.lang.String TELECOM_SERVICE=null;
public static final  java.lang.String TELEPHONY_SERVICE=null;
public static final  java.lang.String TELEPHONY_SUBSCRIPTION_SERVICE=null;
public static final  java.lang.String TEXT_SERVICES_MANAGER_SERVICE=null;
public static final  java.lang.String TV_INPUT_SERVICE=null;
public static final  java.lang.String UI_MODE_SERVICE=null;
public static final  java.lang.String USAGE_STATS_SERVICE=null;
public static final  java.lang.String USB_SERVICE=null;
public static final  java.lang.String USER_SERVICE=null;
public static final  java.lang.String VIBRATOR_SERVICE=null;
public static final  java.lang.String WALLPAPER_SERVICE=null;
public static final  java.lang.String WIFI_P2P_SERVICE=null;
public static final  java.lang.String WIFI_SERVICE=null;
public static final  java.lang.String WINDOW_SERVICE=null;

/*======constructors=====*/
public  Context () {__Result__.str+="|Context|";}

/*========methods========*/
public final transient  java.lang.String getString (int arg0,[Ljava.lang.Object; arg1) {__Result__.str+="|getString|"; return null;}
public final  java.lang.String getString (int arg0) {__Result__.str+="|getString|"; return null;}
public final  java.lang.CharSequence getText (int arg0) {__Result__.str+="|getText|"; return null;}
public abstract  android.content.Intent registerReceiver (android.content.BroadcastReceiver arg0,android.content.IntentFilter arg1,java.lang.String arg2,android.os.Handler arg3) ;
public abstract  android.content.Intent registerReceiver (android.content.BroadcastReceiver arg0,android.content.IntentFilter arg1) ;
public abstract  void unregisterReceiver (android.content.BroadcastReceiver arg0) ;
public abstract  android.content.ComponentName startService (android.content.Intent arg0) ;
public abstract  boolean stopService (android.content.Intent arg0) ;
public abstract  boolean bindService (android.content.Intent arg0,android.content.ServiceConnection arg1,int arg2) ;
public abstract  void unbindService (android.content.ServiceConnection arg0) ;
public abstract  boolean startInstrumentation (android.content.ComponentName arg0,java.lang.String arg1,android.os.Bundle arg2) ;
public final  java.lang.Object getSystemService (java.lang.Class arg0) {__Result__.str+="|getSystemService|"; return null;}
public abstract  java.lang.Object getSystemService (java.lang.String arg0) ;
public abstract  java.lang.String getSystemServiceName (java.lang.Class arg0) ;
public abstract  int checkCallingPermission (java.lang.String arg0) ;
public abstract  int checkCallingOrSelfPermission (java.lang.String arg0) ;
public abstract  int checkSelfPermission (java.lang.String arg0) ;
public abstract  void enforcePermission (java.lang.String arg0,int arg1,int arg2,java.lang.String arg3) ;
public abstract  void enforceCallingPermission (java.lang.String arg0,java.lang.String arg1) ;
public abstract  void enforceCallingOrSelfPermission (java.lang.String arg0,java.lang.String arg1) ;
public abstract  void grantUriPermission (java.lang.String arg0,android.net.Uri arg1,int arg2) ;
public abstract  void revokeUriPermission (android.net.Uri arg0,int arg1) ;
public abstract  int checkUriPermission (android.net.Uri arg0,int arg1,int arg2,int arg3) ;
public abstract  int checkUriPermission (android.net.Uri arg0,java.lang.String arg1,java.lang.String arg2,int arg3,int arg4,int arg5) ;
public abstract  int checkCallingUriPermission (android.net.Uri arg0,int arg1) ;
public abstract  int checkCallingOrSelfUriPermission (android.net.Uri arg0,int arg1) ;
public abstract  void enforceUriPermission (android.net.Uri arg0,java.lang.String arg1,java.lang.String arg2,int arg3,int arg4,int arg5,java.lang.String arg6) ;
public abstract  void enforceUriPermission (android.net.Uri arg0,int arg1,int arg2,int arg3,java.lang.String arg4) ;
public abstract  void enforceCallingUriPermission (android.net.Uri arg0,int arg1,java.lang.String arg2) ;
public abstract  void enforceCallingOrSelfUriPermission (android.net.Uri arg0,int arg1,java.lang.String arg2) ;
public abstract  android.content.Context createPackageContext (java.lang.String arg0,int arg1) throws android.content.pm.PackageManager$NameNotFoundException;
public abstract  android.content.Context createConfigurationContext (android.content.res.Configuration arg0) ;
public abstract  android.content.Context createDisplayContext (android.view.Display arg0) ;
public abstract  android.content.Context createDeviceProtectedStorageContext () ;
public  boolean isRestricted () {__Result__.str+="|isRestricted|"; return false;}
public abstract  boolean isDeviceProtectedStorage () ;
public abstract  android.content.res.AssetManager getAssets () ;
public abstract  android.content.pm.PackageManager getPackageManager () ;
public abstract  android.content.ContentResolver getContentResolver () ;
public abstract  android.os.Looper getMainLooper () ;
public abstract  android.content.Context getApplicationContext () ;
public  void registerComponentCallbacks (android.content.ComponentCallbacks arg0) {__Result__.str+="|registerComponentCallbacks|"; return ;}
public  void unregisterComponentCallbacks (android.content.ComponentCallbacks arg0) {__Result__.str+="|unregisterComponentCallbacks|"; return ;}
public final  int getColor (int arg0) {__Result__.str+="|getColor|"; return 0;}
public final  android.graphics.drawable.Drawable getDrawable (int arg0) {__Result__.str+="|getDrawable|"; return null;}
public final  android.content.res.ColorStateList getColorStateList (int arg0) {__Result__.str+="|getColorStateList|"; return null;}
public abstract  void setTheme (int arg0) ;
public abstract  android.content.res.Resources$Theme getTheme () ;
public final  android.content.res.TypedArray obtainStyledAttributes ([I arg0) {__Result__.str+="|obtainStyledAttributes|"; return null;}
public final  android.content.res.TypedArray obtainStyledAttributes (android.util.AttributeSet arg0,[I arg1) {__Result__.str+="|obtainStyledAttributes|"; return null;}
public final  android.content.res.TypedArray obtainStyledAttributes (android.util.AttributeSet arg0,[I arg1,int arg2,int arg3) {__Result__.str+="|obtainStyledAttributes|"; return null;}
public final  android.content.res.TypedArray obtainStyledAttributes (int arg0,[I arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|obtainStyledAttributes|"; return null;}
public abstract  java.lang.String getPackageName () ;
public abstract  android.content.pm.ApplicationInfo getApplicationInfo () ;
public abstract  java.lang.String getPackageResourcePath () ;
public abstract  java.lang.String getPackageCodePath () ;
public abstract  android.content.SharedPreferences getSharedPreferences (java.lang.String arg0,int arg1) ;
public abstract  boolean moveSharedPreferencesFrom (android.content.Context arg0,java.lang.String arg1) ;
public abstract  boolean deleteSharedPreferences (java.lang.String arg0) ;
public abstract  java.io.FileInputStream openFileInput (java.lang.String arg0) throws java.io.FileNotFoundException;
public abstract  java.io.FileOutputStream openFileOutput (java.lang.String arg0,int arg1) throws java.io.FileNotFoundException;
public abstract  boolean deleteFile (java.lang.String arg0) ;
public abstract  java.io.File getFileStreamPath (java.lang.String arg0) ;
public abstract  java.io.File getDataDir () ;
public abstract  java.io.File getFilesDir () ;
public abstract  java.io.File getNoBackupFilesDir () ;
public abstract  java.io.File getExternalFilesDir (java.lang.String arg0) ;
public abstract  [Ljava.io.File; getExternalFilesDirs (java.lang.String arg0) ;
public abstract  java.io.File getObbDir () ;
public abstract  [Ljava.io.File; getObbDirs () ;
public abstract  java.io.File getCacheDir () ;
public abstract  java.io.File getCodeCacheDir () ;
public abstract  java.io.File getExternalCacheDir () ;
public abstract  [Ljava.io.File; getExternalCacheDirs () ;
public abstract  [Ljava.io.File; getExternalMediaDirs () ;
public abstract  [Ljava.lang.String; fileList () ;
public abstract  java.io.File getDir (java.lang.String arg0,int arg1) ;
public abstract  android.database.sqlite.SQLiteDatabase openOrCreateDatabase (java.lang.String arg0,int arg1,android.database.sqlite.SQLiteDatabase$CursorFactory arg2,android.database.DatabaseErrorHandler arg3) ;
public abstract  android.database.sqlite.SQLiteDatabase openOrCreateDatabase (java.lang.String arg0,int arg1,android.database.sqlite.SQLiteDatabase$CursorFactory arg2) ;
public abstract  boolean moveDatabaseFrom (android.content.Context arg0,java.lang.String arg1) ;
public abstract  boolean deleteDatabase (java.lang.String arg0) ;
public abstract  java.io.File getDatabasePath (java.lang.String arg0) ;
public abstract  [Ljava.lang.String; databaseList () ;
public abstract  @java.lang.Deprecated() android.graphics.drawable.Drawable getWallpaper () ;
public abstract  @java.lang.Deprecated() android.graphics.drawable.Drawable peekWallpaper () ;
public abstract  @java.lang.Deprecated() int getWallpaperDesiredMinimumWidth () ;
public abstract  @java.lang.Deprecated() int getWallpaperDesiredMinimumHeight () ;
public abstract  @java.lang.Deprecated() void setWallpaper (java.io.InputStream arg0) throws java.io.IOException;
public abstract  @java.lang.Deprecated() void setWallpaper (android.graphics.Bitmap arg0) throws java.io.IOException;
public abstract  @java.lang.Deprecated() void clearWallpaper () throws java.io.IOException;
public abstract  void startActivity (android.content.Intent arg0,android.os.Bundle arg1) ;
public abstract  void startActivity (android.content.Intent arg0) ;
public abstract  void startActivities ([Landroid.content.Intent; arg0,android.os.Bundle arg1) ;
public abstract  void startActivities ([Landroid.content.Intent; arg0) ;
public abstract  void startIntentSender (android.content.IntentSender arg0,android.content.Intent arg1,int arg2,int arg3,int arg4) throws android.content.IntentSender$SendIntentException;
public abstract  void startIntentSender (android.content.IntentSender arg0,android.content.Intent arg1,int arg2,int arg3,int arg4,android.os.Bundle arg5) throws android.content.IntentSender$SendIntentException;
public abstract  void sendBroadcast (android.content.Intent arg0,java.lang.String arg1) ;
public abstract  void sendBroadcast (android.content.Intent arg0) ;
public abstract  void sendOrderedBroadcast (android.content.Intent arg0,java.lang.String arg1) ;
public abstract  void sendOrderedBroadcast (android.content.Intent arg0,java.lang.String arg1,android.content.BroadcastReceiver arg2,android.os.Handler arg3,int arg4,java.lang.String arg5,android.os.Bundle arg6) ;
public abstract  void sendBroadcastAsUser (android.content.Intent arg0,android.os.UserHandle arg1) ;
public abstract  void sendBroadcastAsUser (android.content.Intent arg0,android.os.UserHandle arg1,java.lang.String arg2) ;
public abstract  void sendOrderedBroadcastAsUser (android.content.Intent arg0,android.os.UserHandle arg1,java.lang.String arg2,android.content.BroadcastReceiver arg3,android.os.Handler arg4,int arg5,java.lang.String arg6,android.os.Bundle arg7) ;
public abstract  @java.lang.Deprecated() void sendStickyBroadcast (android.content.Intent arg0) ;
public abstract  @java.lang.Deprecated() void sendStickyOrderedBroadcast (android.content.Intent arg0,android.content.BroadcastReceiver arg1,android.os.Handler arg2,int arg3,java.lang.String arg4,android.os.Bundle arg5) ;
public abstract  @java.lang.Deprecated() void removeStickyBroadcast (android.content.Intent arg0) ;
public abstract  @java.lang.Deprecated() void sendStickyBroadcastAsUser (android.content.Intent arg0,android.os.UserHandle arg1) ;
public abstract  @java.lang.Deprecated() void sendStickyOrderedBroadcastAsUser (android.content.Intent arg0,android.os.UserHandle arg1,android.content.BroadcastReceiver arg2,android.os.Handler arg3,int arg4,java.lang.String arg5,android.os.Bundle arg6) ;
public abstract  @java.lang.Deprecated() void removeStickyBroadcastAsUser (android.content.Intent arg0,android.os.UserHandle arg1) ;
public abstract  int checkPermission (java.lang.String arg0,int arg1,int arg2) ;
public abstract  java.lang.ClassLoader getClassLoader () ;
public abstract  android.content.res.Resources getResources () ;

/*========inner classes========*/

}