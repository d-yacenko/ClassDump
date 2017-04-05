package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*      ApplicationInfo              */
/*===================================*/

public class ApplicationInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int FLAG_ALLOW_BACKUP=0;
public static final  int FLAG_ALLOW_CLEAR_USER_DATA=0;
public static final  int FLAG_ALLOW_TASK_REPARENTING=0;
public static final  int FLAG_DEBUGGABLE=0;
public static final  int FLAG_EXTERNAL_STORAGE=0;
public static final  int FLAG_EXTRACT_NATIVE_LIBS=0;
public static final  int FLAG_FACTORY_TEST=0;
public static final  int FLAG_FULL_BACKUP_ONLY=0;
public static final  int FLAG_HARDWARE_ACCELERATED=0;
public static final  int FLAG_HAS_CODE=0;
public static final  int FLAG_INSTALLED=0;
public static final  int FLAG_IS_DATA_ONLY=0;
public static final  int FLAG_IS_GAME=0;
public static final  int FLAG_KILL_AFTER_RESTORE=0;
public static final  int FLAG_LARGE_HEAP=0;
public static final  int FLAG_MULTIARCH=0;
public static final  int FLAG_PERSISTENT=0;
public static final  int FLAG_RESIZEABLE_FOR_SCREENS=0;
public static final  int FLAG_RESTORE_ANY_VERSION=0;
public static final  int FLAG_STOPPED=0;
public static final  int FLAG_SUPPORTS_LARGE_SCREENS=0;
public static final  int FLAG_SUPPORTS_NORMAL_SCREENS=0;
public static final  int FLAG_SUPPORTS_RTL=0;
public static final  int FLAG_SUPPORTS_SCREEN_DENSITIES=0;
public static final  int FLAG_SUPPORTS_SMALL_SCREENS=0;
public static final  int FLAG_SUPPORTS_XLARGE_SCREENS=0;
public static final  int FLAG_SUSPENDED=0;
public static final  int FLAG_SYSTEM=0;
public static final  int FLAG_TEST_ONLY=0;
public static final  int FLAG_UPDATED_SYSTEM_APP=0;
public static final  int FLAG_USES_CLEARTEXT_TRAFFIC=0;
public static final  int FLAG_VM_SAFE_MODE=0;
public  java.lang.String backupAgentName;
public  java.lang.String className;
public  int compatibleWidthLimitDp;
public  java.lang.String dataDir;
public  int descriptionRes;
public  java.lang.String deviceProtectedDataDir;
public  boolean enabled;
public  int flags;
public  int largestWidthLimitDp;
public  java.lang.String manageSpaceActivityName;
public  int minSdkVersion;
public  java.lang.String nativeLibraryDir;
public  java.lang.String permission;
public  java.lang.String processName;
public  java.lang.String publicSourceDir;
public  int requiresSmallestWidthDp;
public  [Ljava.lang.String; sharedLibraryFiles;
public  java.lang.String sourceDir;
public  [Ljava.lang.String; splitPublicSourceDirs;
public  [Ljava.lang.String; splitSourceDirs;
public  int targetSdkVersion;
public  java.lang.String taskAffinity;
public  int theme;
public  int uiOptions;
public  int uid;

/*======constructors=====*/
public  ApplicationInfo () {__Result__.str+="|ApplicationInfo|";}
public  ApplicationInfo (android.content.pm.ApplicationInfo arg0) {__Result__.str+="|ApplicationInfo|";}

/*========methods========*/
public  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.CharSequence loadDescription (android.content.pm.PackageManager arg0) {__Result__.str+="|loadDescription|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* DisplayNameComparator              */
/*===================================*/

public static class DisplayNameComparator implements java.util.Comparator<android.content.pm.ApplicationInfo> {
/*========fields=========*/

/*======constructors=====*/
public  DisplayNameComparator (android.content.pm.PackageManager arg0) {__Result__.str+="|DisplayNameComparator|";}

/*========methods========*/
public final  int compare (android.content.pm.ApplicationInfo arg0,android.content.pm.ApplicationInfo arg1) {__Result__.str+="|compare|"; return 0;}


/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* DisplayNameComparator              */
/*===================================*/

public static class DisplayNameComparator implements java.util.Comparator<android.content.pm.PackageItemInfo> {
/*========fields=========*/

/*======constructors=====*/
public  DisplayNameComparator (android.content.pm.PackageManager arg0) {__Result__.str+="|DisplayNameComparator|";}

/*========methods========*/
public final  int compare (android.content.pm.PackageItemInfo arg0,android.content.pm.PackageItemInfo arg1) {__Result__.str+="|compare|"; return 0;}


/*========inner classes========*/

}
}