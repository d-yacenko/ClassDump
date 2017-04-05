package android.graphics;
import android.__Result__;


/*===================================*/ 
/*               Region              */
/*===================================*/

public class Region implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/
public  Region (android.graphics.Region arg0) {__Result__.str+="|Region|";}
public  Region (android.graphics.Rect arg0) {__Result__.str+="|Region|";}
public  Region (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|Region|";}
public  Region () {__Result__.str+="|Region|";}

/*========methods========*/
public final  boolean union (android.graphics.Rect arg0) {__Result__.str+="|union|"; return false;}
public  android.graphics.Rect getBounds () {__Result__.str+="|getBounds|"; return null;}
public  boolean getBounds (android.graphics.Rect arg0) {__Result__.str+="|getBounds|"; return false;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void setEmpty () {__Result__.str+="|setEmpty|"; return ;}
public native  void translate (int arg0,int arg1,android.graphics.Region arg2) {__Result__.str+="|translate|"; return ;}
public  void translate (int arg0,int arg1) {__Result__.str+="|translate|"; return ;}
public  boolean op (android.graphics.Region arg0,android.graphics.Region arg1,android.graphics.Region$Op arg2) {__Result__.str+="|op|"; return false;}
public  boolean op (android.graphics.Rect arg0,android.graphics.Region arg1,android.graphics.Region$Op arg2) {__Result__.str+="|op|"; return false;}
public  boolean op (android.graphics.Region arg0,android.graphics.Region$Op arg1) {__Result__.str+="|op|"; return false;}
public  boolean op (android.graphics.Rect arg0,android.graphics.Region$Op arg1) {__Result__.str+="|op|"; return false;}
public  boolean op (int arg0,int arg1,int arg2,int arg3,android.graphics.Region$Op arg4) {__Result__.str+="|op|"; return false;}
public native  boolean quickReject (android.graphics.Region arg0) {__Result__.str+="|quickReject|"; return false;}
public  boolean quickReject (android.graphics.Rect arg0) {__Result__.str+="|quickReject|"; return false;}
public native  boolean quickReject (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|quickReject|"; return false;}
public native  boolean isComplex () {__Result__.str+="|isComplex|"; return false;}
public  boolean getBoundaryPath (android.graphics.Path arg0) {__Result__.str+="|getBoundaryPath|"; return false;}
public  android.graphics.Path getBoundaryPath () {__Result__.str+="|getBoundaryPath|"; return null;}
public native  boolean quickContains (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|quickContains|"; return false;}
public  boolean quickContains (android.graphics.Rect arg0) {__Result__.str+="|quickContains|"; return false;}
public native  boolean isRect () {__Result__.str+="|isRect|"; return false;}
public  boolean setPath (android.graphics.Path arg0,android.graphics.Region arg1) {__Result__.str+="|setPath|"; return false;}

public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public native  boolean contains (int arg0,int arg1) {__Result__.str+="|contains|"; return false;}
public native  boolean isEmpty () {__Result__.str+="|isEmpty|"; return false;}
public  boolean set (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|set|"; return false;}
public  boolean set (android.graphics.Rect arg0) {__Result__.str+="|set|"; return false;}
public  boolean set (android.graphics.Region arg0) {__Result__.str+="|set|"; return false;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*                   Op              */
/*===================================*/

public static final class Op extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Region$Op DIFFERENCE=null;
public static final  android.graphics.Region$Op INTERSECT=null;
public static final  android.graphics.Region$Op REPLACE=null;
public static final  android.graphics.Region$Op REVERSE_DIFFERENCE=null;
public static final  android.graphics.Region$Op UNION=null;
public static final  android.graphics.Region$Op XOR=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Region$Op; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Region$Op valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}
}