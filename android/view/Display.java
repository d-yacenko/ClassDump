package android.view;
import android.__Result__;


/*===================================*/ 
/*              Display              */
/*===================================*/

public final class Display {
/*========fields=========*/
public static final  int DEFAULT_DISPLAY=0;
public static final  int FLAG_PRESENTATION=0;
public static final  int FLAG_PRIVATE=0;
public static final  int FLAG_ROUND=0;
public static final  int FLAG_SECURE=0;
public static final  int FLAG_SUPPORTS_PROTECTED_BUFFERS=0;
public static final  int INVALID_DISPLAY=0;
public static final  int STATE_DOZE=0;
public static final  int STATE_DOZE_SUSPEND=0;
public static final  int STATE_OFF=0;
public static final  int STATE_ON=0;
public static final  int STATE_UNKNOWN=0;

/*======constructors=====*/


/*========methods========*/
public  boolean isValid () {__Result__.str+="|isValid|"; return false;}
public  @java.lang.Deprecated() int getWidth () {__Result__.str+="|getWidth|"; return 0;}
public  @java.lang.Deprecated() int getHeight () {__Result__.str+="|getHeight|"; return 0;}
public  int getRotation () {__Result__.str+="|getRotation|"; return 0;}
public  android.view.Display$Mode getMode () {__Result__.str+="|getMode|"; return null;}
public  int getFlags () {__Result__.str+="|getFlags|"; return 0;}
public  @java.lang.Deprecated() int getOrientation () {__Result__.str+="|getOrientation|"; return 0;}
public  int getDisplayId () {__Result__.str+="|getDisplayId|"; return 0;}
public  void getRectSize (android.graphics.Rect arg0) {__Result__.str+="|getRectSize|"; return ;}
public  void getCurrentSizeRange (android.graphics.Point arg0,android.graphics.Point arg1) {__Result__.str+="|getCurrentSizeRange|"; return ;}
public  @java.lang.Deprecated() int getPixelFormat () {__Result__.str+="|getPixelFormat|"; return 0;}
public  float getRefreshRate () {__Result__.str+="|getRefreshRate|"; return 0f;}
public  @java.lang.Deprecated() [F getSupportedRefreshRates () {__Result__.str+="|getSupportedRefreshRates|"; return null;}
public  [Landroid.view.Display$Mode; getSupportedModes () {__Result__.str+="|getSupportedModes|"; return null;}
public  android.view.Display$HdrCapabilities getHdrCapabilities () {__Result__.str+="|getHdrCapabilities|"; return null;}
public  long getAppVsyncOffsetNanos () {__Result__.str+="|getAppVsyncOffsetNanos|"; return 0;}
public  long getPresentationDeadlineNanos () {__Result__.str+="|getPresentationDeadlineNanos|"; return 0;}
public  void getMetrics (android.util.DisplayMetrics arg0) {__Result__.str+="|getMetrics|"; return ;}
public  void getRealSize (android.graphics.Point arg0) {__Result__.str+="|getRealSize|"; return ;}
public  void getRealMetrics (android.util.DisplayMetrics arg0) {__Result__.str+="|getRealMetrics|"; return ;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  java.lang.String getName () {__Result__.str+="|getName|"; return null;}
public  int getState () {__Result__.str+="|getState|"; return 0;}
public  void getSize (android.graphics.Point arg0) {__Result__.str+="|getSize|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*      HdrCapabilities              */
/*===================================*/

public static final class HdrCapabilities implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int HDR_TYPE_DOLBY_VISION=0;
public static final  int HDR_TYPE_HDR10=0;
public static final  int HDR_TYPE_HLG=0;
public static final  float INVALID_LUMINANCE=0f;

/*======constructors=====*/


/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  [I getSupportedHdrTypes () {__Result__.str+="|getSupportedHdrTypes|"; return null;}
public  float getDesiredMaxLuminance () {__Result__.str+="|getDesiredMaxLuminance|"; return 0f;}
public  float getDesiredMaxAverageLuminance () {__Result__.str+="|getDesiredMaxAverageLuminance|"; return 0f;}
public  float getDesiredMinLuminance () {__Result__.str+="|getDesiredMinLuminance|"; return 0f;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*                 Mode              */
/*===================================*/

public static final class Mode implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/


/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  float getRefreshRate () {__Result__.str+="|getRefreshRate|"; return 0f;}
public  int getModeId () {__Result__.str+="|getModeId|"; return 0;}
public  int getPhysicalWidth () {__Result__.str+="|getPhysicalWidth|"; return 0;}
public  int getPhysicalHeight () {__Result__.str+="|getPhysicalHeight|"; return 0;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

/*========inner classes========*/

}
}