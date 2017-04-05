package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*     PackageInstaller              */
/*===================================*/

public class PackageInstaller {
/*========fields=========*/
public static final  java.lang.String ACTION_SESSION_DETAILS=null;
public static final  java.lang.String EXTRA_OTHER_PACKAGE_NAME=null;
public static final  java.lang.String EXTRA_PACKAGE_NAME=null;
public static final  java.lang.String EXTRA_SESSION_ID=null;
public static final  java.lang.String EXTRA_STATUS=null;
public static final  java.lang.String EXTRA_STATUS_MESSAGE=null;
public static final  java.lang.String EXTRA_STORAGE_PATH=null;
public static final  int STATUS_FAILURE=0;
public static final  int STATUS_FAILURE_ABORTED=0;
public static final  int STATUS_FAILURE_BLOCKED=0;
public static final  int STATUS_FAILURE_CONFLICT=0;
public static final  int STATUS_FAILURE_INCOMPATIBLE=0;
public static final  int STATUS_FAILURE_INVALID=0;
public static final  int STATUS_FAILURE_STORAGE=0;
public static final  int STATUS_PENDING_USER_ACTION=0;
public static final  int STATUS_SUCCESS=0;

/*======constructors=====*/


/*========methods========*/
public  int createSession (android.content.pm.PackageInstaller$SessionParams arg0) throws java.io.IOException{__Result__.str+="|createSession|"; return 0;}
public  android.content.pm.PackageInstaller$Session openSession (int arg0) throws java.io.IOException{__Result__.str+="|openSession|"; return null;}
public  void updateSessionAppIcon (int arg0,android.graphics.Bitmap arg1) {__Result__.str+="|updateSessionAppIcon|"; return ;}
public  void updateSessionAppLabel (int arg0,java.lang.CharSequence arg1) {__Result__.str+="|updateSessionAppLabel|"; return ;}
public  void abandonSession (int arg0) {__Result__.str+="|abandonSession|"; return ;}
public  android.content.pm.PackageInstaller$SessionInfo getSessionInfo (int arg0) {__Result__.str+="|getSessionInfo|"; return null;}
public  java.util.List getAllSessions () {__Result__.str+="|getAllSessions|"; return null;}
public  java.util.List getMySessions () {__Result__.str+="|getMySessions|"; return null;}
public  void uninstall (java.lang.String arg0,android.content.IntentSender arg1) {__Result__.str+="|uninstall|"; return ;}
public  void registerSessionCallback (android.content.pm.PackageInstaller$SessionCallback arg0) {__Result__.str+="|registerSessionCallback|"; return ;}
public  void registerSessionCallback (android.content.pm.PackageInstaller$SessionCallback arg0,android.os.Handler arg1) {__Result__.str+="|registerSessionCallback|"; return ;}
public  void unregisterSessionCallback (android.content.pm.PackageInstaller$SessionCallback arg0) {__Result__.str+="|unregisterSessionCallback|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*          SessionInfo              */
/*===================================*/

public static class SessionInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/


/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  boolean isActive () {__Result__.str+="|isActive|"; return false;}
public  java.lang.String getInstallerPackageName () {__Result__.str+="|getInstallerPackageName|"; return null;}
public  int getSessionId () {__Result__.str+="|getSessionId|"; return 0;}
public  float getProgress () {__Result__.str+="|getProgress|"; return 0f;}
public  java.lang.String getAppPackageName () {__Result__.str+="|getAppPackageName|"; return null;}
public  android.graphics.Bitmap getAppIcon () {__Result__.str+="|getAppIcon|"; return null;}
public  java.lang.CharSequence getAppLabel () {__Result__.str+="|getAppLabel|"; return null;}
public  android.content.Intent createDetailsIntent () {__Result__.str+="|createDetailsIntent|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*        SessionParams              */
/*===================================*/

public static class SessionParams implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int MODE_FULL_INSTALL=0;
public static final  int MODE_INHERIT_EXISTING=0;

/*======constructors=====*/
public  SessionParams (int arg0) {__Result__.str+="|SessionParams|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void setInstallLocation (int arg0) {__Result__.str+="|setInstallLocation|"; return ;}
public  void setAppPackageName (java.lang.String arg0) {__Result__.str+="|setAppPackageName|"; return ;}
public  void setAppIcon (android.graphics.Bitmap arg0) {__Result__.str+="|setAppIcon|"; return ;}
public  void setAppLabel (java.lang.CharSequence arg0) {__Result__.str+="|setAppLabel|"; return ;}
public  void setOriginatingUri (android.net.Uri arg0) {__Result__.str+="|setOriginatingUri|"; return ;}
public  void setOriginatingUid (int arg0) {__Result__.str+="|setOriginatingUid|"; return ;}
public  void setReferrerUri (android.net.Uri arg0) {__Result__.str+="|setReferrerUri|"; return ;}
public  void setSize (long arg0) {__Result__.str+="|setSize|"; return ;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*              Session              */
/*===================================*/

public static class Session implements java.io.Closeable {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public  void fsync (java.io.OutputStream arg0) throws java.io.IOException{__Result__.str+="|fsync|"; return ;}
public  [Ljava.lang.String; getNames () throws java.io.IOException{__Result__.str+="|getNames|"; return null;}
public  void setStagingProgress (float arg0) {__Result__.str+="|setStagingProgress|"; return ;}
public  java.io.OutputStream openWrite (java.lang.String arg0,long arg1,long arg2) throws java.io.IOException{__Result__.str+="|openWrite|"; return null;}
public  java.io.InputStream openRead (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|openRead|"; return null;}
public  void removeSplit (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|removeSplit|"; return ;}
public  void commit (android.content.IntentSender arg0) {__Result__.str+="|commit|"; return ;}
public  void abandon () {__Result__.str+="|abandon|"; return ;}
public  void close () {__Result__.str+="|close|"; return ;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*      SessionCallback              */
/*===================================*/

public abstract static class SessionCallback {
/*========fields=========*/

/*======constructors=====*/
public  SessionCallback () {__Result__.str+="|SessionCallback|";}

/*========methods========*/
public abstract  void onFinished (int arg0,boolean arg1) ;
public abstract  void onBadgingChanged (int arg0) ;
public abstract  void onActiveChanged (int arg0,boolean arg1) ;
public abstract  void onCreated (int arg0) ;
public abstract  void onProgressChanged (int arg0,float arg1) ;

/*========inner classes========*/

}
}