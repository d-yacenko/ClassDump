package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*         ActivityInfo              */
/*===================================*/

public class ActivityInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  int CONFIG_DENSITY=0;
public static final  int CONFIG_FONT_SCALE=0;
public static final  int CONFIG_KEYBOARD=0;
public static final  int CONFIG_KEYBOARD_HIDDEN=0;
public static final  int CONFIG_LAYOUT_DIRECTION=0;
public static final  int CONFIG_LOCALE=0;
public static final  int CONFIG_MCC=0;
public static final  int CONFIG_MNC=0;
public static final  int CONFIG_NAVIGATION=0;
public static final  int CONFIG_ORIENTATION=0;
public static final  int CONFIG_SCREEN_LAYOUT=0;
public static final  int CONFIG_SCREEN_SIZE=0;
public static final  int CONFIG_SMALLEST_SCREEN_SIZE=0;
public static final  int CONFIG_TOUCHSCREEN=0;
public static final  int CONFIG_UI_MODE=0;
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int DOCUMENT_LAUNCH_ALWAYS=0;
public static final  int DOCUMENT_LAUNCH_INTO_EXISTING=0;
public static final  int DOCUMENT_LAUNCH_NEVER=0;
public static final  int DOCUMENT_LAUNCH_NONE=0;
public static final  int FLAG_ALLOW_TASK_REPARENTING=0;
public static final  int FLAG_ALWAYS_RETAIN_TASK_STATE=0;
public static final  int FLAG_AUTO_REMOVE_FROM_RECENTS=0;
public static final  int FLAG_CLEAR_TASK_ON_LAUNCH=0;
public static final  int FLAG_ENABLE_VR_MODE=0;
public static final  int FLAG_EXCLUDE_FROM_RECENTS=0;
public static final  int FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS=0;
public static final  int FLAG_FINISH_ON_TASK_LAUNCH=0;
public static final  int FLAG_HARDWARE_ACCELERATED=0;
public static final  int FLAG_IMMERSIVE=0;
public static final  int FLAG_MULTIPROCESS=0;
public static final  int FLAG_NO_HISTORY=0;
public static final  int FLAG_RELINQUISH_TASK_IDENTITY=0;
public static final  int FLAG_RESUME_WHILE_PAUSING=0;
public static final  int FLAG_SINGLE_USER=0;
public static final  int FLAG_STATE_NOT_NEEDED=0;
public static final  int LAUNCH_MULTIPLE=0;
public static final  int LAUNCH_SINGLE_INSTANCE=0;
public static final  int LAUNCH_SINGLE_TASK=0;
public static final  int LAUNCH_SINGLE_TOP=0;
public static final  int PERSIST_ACROSS_REBOOTS=0;
public static final  int PERSIST_NEVER=0;
public static final  int PERSIST_ROOT_ONLY=0;
public static final  int SCREEN_ORIENTATION_BEHIND=0;
public static final  int SCREEN_ORIENTATION_FULL_SENSOR=0;
public static final  int SCREEN_ORIENTATION_FULL_USER=0;
public static final  int SCREEN_ORIENTATION_LANDSCAPE=0;
public static final  int SCREEN_ORIENTATION_LOCKED=0;
public static final  int SCREEN_ORIENTATION_NOSENSOR=0;
public static final  int SCREEN_ORIENTATION_PORTRAIT=0;
public static final  int SCREEN_ORIENTATION_REVERSE_LANDSCAPE=0;
public static final  int SCREEN_ORIENTATION_REVERSE_PORTRAIT=0;
public static final  int SCREEN_ORIENTATION_SENSOR=0;
public static final  int SCREEN_ORIENTATION_SENSOR_LANDSCAPE=0;
public static final  int SCREEN_ORIENTATION_SENSOR_PORTRAIT=0;
public static final  int SCREEN_ORIENTATION_UNSPECIFIED=0;
public static final  int SCREEN_ORIENTATION_USER=0;
public static final  int SCREEN_ORIENTATION_USER_LANDSCAPE=0;
public static final  int SCREEN_ORIENTATION_USER_PORTRAIT=0;
public static final  int UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW=0;
public  int configChanges;
public  int documentLaunchMode;
public  int flags;
public  int launchMode;
public  int maxRecents;
public  java.lang.String parentActivityName;
public  java.lang.String permission;
public  int persistableMode;
public  int screenOrientation;
public  int softInputMode;
public  java.lang.String targetActivity;
public  java.lang.String taskAffinity;
public  int theme;
public  int uiOptions;
public  android.content.pm.ActivityInfo$WindowLayout windowLayout;

/*======constructors=====*/
public  ActivityInfo (android.content.pm.ActivityInfo arg0) {__Result__.str+="|ActivityInfo|";}
public  ActivityInfo () {__Result__.str+="|ActivityInfo|";}

/*========methods========*/
public  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public final  int getThemeResource () {__Result__.str+="|getThemeResource|"; return 0;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*         WindowLayout              */
/*===================================*/

public static final class WindowLayout {
/*========fields=========*/
public final  int gravity=0;
public final  int height=0;
public final  float heightFraction=0f;
public final  int minHeight=0;
public final  int minWidth=0;
public final  int width=0;
public final  float widthFraction=0f;

/*======constructors=====*/
public  WindowLayout (int arg0,float arg1,int arg2,float arg3,int arg4,int arg5,int arg6) {__Result__.str+="|WindowLayout|";}

/*========methods========*/

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