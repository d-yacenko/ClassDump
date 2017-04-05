package android.content.res;
import android.__Result__;


/*===================================*/ 
/*        Configuration              */
/*===================================*/

public final class Configuration implements android.os.Parcelable,java.lang.Comparable<android.content.res.Configuration> {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int DENSITY_DPI_UNDEFINED=0;
public static final  int HARDKEYBOARDHIDDEN_NO=0;
public static final  int HARDKEYBOARDHIDDEN_UNDEFINED=0;
public static final  int HARDKEYBOARDHIDDEN_YES=0;
public static final  int KEYBOARDHIDDEN_NO=0;
public static final  int KEYBOARDHIDDEN_UNDEFINED=0;
public static final  int KEYBOARDHIDDEN_YES=0;
public static final  int KEYBOARD_12KEY=0;
public static final  int KEYBOARD_NOKEYS=0;
public static final  int KEYBOARD_QWERTY=0;
public static final  int KEYBOARD_UNDEFINED=0;
public static final  int MNC_ZERO=0;
public static final  int NAVIGATIONHIDDEN_NO=0;
public static final  int NAVIGATIONHIDDEN_UNDEFINED=0;
public static final  int NAVIGATIONHIDDEN_YES=0;
public static final  int NAVIGATION_DPAD=0;
public static final  int NAVIGATION_NONAV=0;
public static final  int NAVIGATION_TRACKBALL=0;
public static final  int NAVIGATION_UNDEFINED=0;
public static final  int NAVIGATION_WHEEL=0;
public static final  int ORIENTATION_LANDSCAPE=0;
public static final  int ORIENTATION_PORTRAIT=0;
public static final  @java.lang.Deprecated() int ORIENTATION_SQUARE=0;
public static final  int ORIENTATION_UNDEFINED=0;
public static final  int SCREENLAYOUT_LAYOUTDIR_LTR=0;
public static final  int SCREENLAYOUT_LAYOUTDIR_MASK=0;
public static final  int SCREENLAYOUT_LAYOUTDIR_RTL=0;
public static final  int SCREENLAYOUT_LAYOUTDIR_SHIFT=0;
public static final  int SCREENLAYOUT_LAYOUTDIR_UNDEFINED=0;
public static final  int SCREENLAYOUT_LONG_MASK=0;
public static final  int SCREENLAYOUT_LONG_NO=0;
public static final  int SCREENLAYOUT_LONG_UNDEFINED=0;
public static final  int SCREENLAYOUT_LONG_YES=0;
public static final  int SCREENLAYOUT_ROUND_MASK=0;
public static final  int SCREENLAYOUT_ROUND_NO=0;
public static final  int SCREENLAYOUT_ROUND_UNDEFINED=0;
public static final  int SCREENLAYOUT_ROUND_YES=0;
public static final  int SCREENLAYOUT_SIZE_LARGE=0;
public static final  int SCREENLAYOUT_SIZE_MASK=0;
public static final  int SCREENLAYOUT_SIZE_NORMAL=0;
public static final  int SCREENLAYOUT_SIZE_SMALL=0;
public static final  int SCREENLAYOUT_SIZE_UNDEFINED=0;
public static final  int SCREENLAYOUT_SIZE_XLARGE=0;
public static final  int SCREENLAYOUT_UNDEFINED=0;
public static final  int SCREEN_HEIGHT_DP_UNDEFINED=0;
public static final  int SCREEN_WIDTH_DP_UNDEFINED=0;
public static final  int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED=0;
public static final  int TOUCHSCREEN_FINGER=0;
public static final  int TOUCHSCREEN_NOTOUCH=0;
public static final  @java.lang.Deprecated() int TOUCHSCREEN_STYLUS=0;
public static final  int TOUCHSCREEN_UNDEFINED=0;
public static final  int UI_MODE_NIGHT_MASK=0;
public static final  int UI_MODE_NIGHT_NO=0;
public static final  int UI_MODE_NIGHT_UNDEFINED=0;
public static final  int UI_MODE_NIGHT_YES=0;
public static final  int UI_MODE_TYPE_APPLIANCE=0;
public static final  int UI_MODE_TYPE_CAR=0;
public static final  int UI_MODE_TYPE_DESK=0;
public static final  int UI_MODE_TYPE_MASK=0;
public static final  int UI_MODE_TYPE_NORMAL=0;
public static final  int UI_MODE_TYPE_TELEVISION=0;
public static final  int UI_MODE_TYPE_UNDEFINED=0;
public static final  int UI_MODE_TYPE_WATCH=0;
public  int densityDpi;
public  float fontScale;
public  int hardKeyboardHidden;
public  int keyboard;
public  int keyboardHidden;
public  @java.lang.Deprecated() java.util.Locale locale;
public  int mcc;
public  int mnc;
public  int navigation;
public  int navigationHidden;
public  int orientation;
public  int screenHeightDp;
public  int screenLayout;
public  int screenWidthDp;
public  int smallestScreenWidthDp;
public  int touchscreen;
public  int uiMode;

/*======constructors=====*/
public  Configuration () {__Result__.str+="|Configuration|";}
public  Configuration (android.content.res.Configuration arg0) {__Result__.str+="|Configuration|";}

/*========methods========*/
public  void setLocale (java.util.Locale arg0) {__Result__.str+="|setLocale|"; return ;}
public  void setLayoutDirection (java.util.Locale arg0) {__Result__.str+="|setLayoutDirection|"; return ;}
public  int getLayoutDirection () {__Result__.str+="|getLayoutDirection|"; return 0;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void readFromParcel (android.os.Parcel arg0) {__Result__.str+="|readFromParcel|"; return ;}
public  boolean isLayoutSizeAtLeast (int arg0) {__Result__.str+="|isLayoutSizeAtLeast|"; return false;}
public  void setTo (android.content.res.Configuration arg0) {__Result__.str+="|setTo|"; return ;}
public  void setToDefaults () {__Result__.str+="|setToDefaults|"; return ;}
public  int updateFrom (android.content.res.Configuration arg0) {__Result__.str+="|updateFrom|"; return 0;}
public  int diff (android.content.res.Configuration arg0) {__Result__.str+="|diff|"; return 0;}
public static  boolean needNewResources (int arg0,int arg1) {__Result__.str+="|needNewResources|"; return false;}
public  android.os.LocaleList getLocales () {__Result__.str+="|getLocales|"; return null;}
public  void setLocales (android.os.LocaleList arg0) {__Result__.str+="|setLocales|"; return ;}
public  boolean isScreenRound () {__Result__.str+="|isScreenRound|"; return false;}
public  boolean equals (android.content.res.Configuration arg0) {__Result__.str+="|equals|"; return false;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

public  int compareTo (android.content.res.Configuration arg0) {__Result__.str+="|compareTo|"; return 0;}

/*========inner classes========*/

}