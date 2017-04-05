package android.os;
import android.__Result__;


/*===================================*/ 
/*              Message              */
/*===================================*/

public final class Message implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public  int arg1;
public  int arg2;
public  java.lang.Object obj;
public  android.os.Messenger replyTo;
public  int sendingUid;
public  int what;

/*======constructors=====*/
public  Message () {__Result__.str+="|Message|";}

/*========methods========*/
public  android.os.Bundle getData () {__Result__.str+="|getData|"; return null;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public static  android.os.Message obtain (android.os.Handler arg0,int arg1,java.lang.Object arg2) {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain (android.os.Handler arg0,int arg1,int arg2,int arg3) {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain (android.os.Handler arg0,int arg1,int arg2,int arg3,java.lang.Object arg4) {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain () {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain (android.os.Message arg0) {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain (android.os.Handler arg0) {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain (android.os.Handler arg0,int arg1) {__Result__.str+="|obtain|"; return null;}
public static  android.os.Message obtain (android.os.Handler arg0,java.lang.Runnable arg1) {__Result__.str+="|obtain|"; return null;}
public  void recycle () {__Result__.str+="|recycle|"; return ;}
public  java.lang.Runnable getCallback () {__Result__.str+="|getCallback|"; return null;}
public  void copyFrom (android.os.Message arg0) {__Result__.str+="|copyFrom|"; return ;}
public  long getWhen () {__Result__.str+="|getWhen|"; return 0;}
public  android.os.Bundle peekData () {__Result__.str+="|peekData|"; return null;}
public  void setData (android.os.Bundle arg0) {__Result__.str+="|setData|"; return ;}
public  void sendToTarget () {__Result__.str+="|sendToTarget|"; return ;}
public  boolean isAsynchronous () {__Result__.str+="|isAsynchronous|"; return false;}
public  void setAsynchronous (boolean arg0) {__Result__.str+="|setAsynchronous|"; return ;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  android.os.Handler getTarget () {__Result__.str+="|getTarget|"; return null;}
public  void setTarget (android.os.Handler arg0) {__Result__.str+="|setTarget|"; return ;}

/*========inner classes========*/

}