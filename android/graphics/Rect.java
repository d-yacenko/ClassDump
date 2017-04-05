package android.graphics;
import android.__Result__;


/*===================================*/ 
/*                 Rect              */
/*===================================*/

public final class Rect implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public  int bottom;
public  int left;
public  int right;
public  int top;

/*======constructors=====*/
public  Rect (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|Rect|";}
public  Rect () {__Result__.str+="|Rect|";}
public  Rect (android.graphics.Rect arg0) {__Result__.str+="|Rect|";}

/*========methods========*/
public  void union (android.graphics.Rect arg0) {__Result__.str+="|union|"; return ;}
public  void union (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|union|"; return ;}
public  void union (int arg0,int arg1) {__Result__.str+="|union|"; return ;}
public final  int width () {__Result__.str+="|width|"; return 0;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void readFromParcel (android.os.Parcel arg0) {__Result__.str+="|readFromParcel|"; return ;}
public final  int height () {__Result__.str+="|height|"; return 0;}
public  java.lang.String toShortString () {__Result__.str+="|toShortString|"; return null;}
public  java.lang.String flattenToString () {__Result__.str+="|flattenToString|"; return null;}
public static  android.graphics.Rect unflattenFromString (java.lang.String arg0) {__Result__.str+="|unflattenFromString|"; return null;}
public final  int centerX () {__Result__.str+="|centerX|"; return 0;}
public final  int centerY () {__Result__.str+="|centerY|"; return 0;}
public final  float exactCenterX () {__Result__.str+="|exactCenterX|"; return 0f;}
public final  float exactCenterY () {__Result__.str+="|exactCenterY|"; return 0f;}
public  void setEmpty () {__Result__.str+="|setEmpty|"; return ;}
public  void offsetTo (int arg0,int arg1) {__Result__.str+="|offsetTo|"; return ;}
public  void inset (int arg0,int arg1) {__Result__.str+="|inset|"; return ;}
public  boolean intersect (android.graphics.Rect arg0) {__Result__.str+="|intersect|"; return false;}
public  boolean intersect (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|intersect|"; return false;}
public  boolean setIntersect (android.graphics.Rect arg0,android.graphics.Rect arg1) {__Result__.str+="|setIntersect|"; return false;}
public  void offset (int arg0,int arg1) {__Result__.str+="|offset|"; return ;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  boolean contains (android.graphics.Rect arg0) {__Result__.str+="|contains|"; return false;}
public  boolean contains (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|contains|"; return false;}
public  boolean contains (int arg0,int arg1) {__Result__.str+="|contains|"; return false;}
public final  boolean isEmpty () {__Result__.str+="|isEmpty|"; return false;}
public  void set (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|set|"; return ;}
public  void set (android.graphics.Rect arg0) {__Result__.str+="|set|"; return ;}
public  void sort () {__Result__.str+="|sort|"; return ;}
public static  boolean intersects (android.graphics.Rect arg0,android.graphics.Rect arg1) {__Result__.str+="|intersects|"; return false;}
public  boolean intersects (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|intersects|"; return false;}

/*========inner classes========*/

}