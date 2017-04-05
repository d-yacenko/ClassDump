package android.content;
import android.__Result__;


/*===================================*/ 
/*      ClipDescription              */
/*===================================*/

public class ClipDescription implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  java.lang.String MIMETYPE_TEXT_HTML=null;
public static final  java.lang.String MIMETYPE_TEXT_INTENT=null;
public static final  java.lang.String MIMETYPE_TEXT_PLAIN=null;
public static final  java.lang.String MIMETYPE_TEXT_URILIST=null;

/*======constructors=====*/
public  ClipDescription (android.content.ClipDescription arg0) {__Result__.str+="|ClipDescription|";}
public  ClipDescription (java.lang.CharSequence arg0,[Ljava.lang.String; arg1) {__Result__.str+="|ClipDescription|";}

/*========methods========*/
public  java.lang.CharSequence getLabel () {__Result__.str+="|getLabel|"; return null;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  android.os.PersistableBundle getExtras () {__Result__.str+="|getExtras|"; return null;}
public  int getMimeTypeCount () {__Result__.str+="|getMimeTypeCount|"; return 0;}
public  java.lang.String getMimeType (int arg0) {__Result__.str+="|getMimeType|"; return null;}
public  void setExtras (android.os.PersistableBundle arg0) {__Result__.str+="|setExtras|"; return ;}
public static  boolean compareMimeTypes (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|compareMimeTypes|"; return false;}
public  boolean hasMimeType (java.lang.String arg0) {__Result__.str+="|hasMimeType|"; return false;}
public  [Ljava.lang.String; filterMimeTypes (java.lang.String arg0) {__Result__.str+="|filterMimeTypes|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/

}