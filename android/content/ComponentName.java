package android.content;
import android.__Result__;


/*===================================*/ 
/*        ComponentName              */
/*===================================*/

public final class ComponentName implements android.os.Parcelable,java.lang.Cloneable,java.lang.Comparable<android.content.ComponentName> {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/
public  ComponentName (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|ComponentName|";}
public  ComponentName (android.content.Context arg0,java.lang.Class arg1) {__Result__.str+="|ComponentName|";}
public  ComponentName (android.content.Context arg0,java.lang.String arg1) {__Result__.str+="|ComponentName|";}
public  ComponentName (android.os.Parcel arg0) {__Result__.str+="|ComponentName|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public static  void writeToParcel (android.content.ComponentName arg0,android.os.Parcel arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.String getPackageName () {__Result__.str+="|getPackageName|"; return null;}
public static  android.content.ComponentName readFromParcel (android.os.Parcel arg0) {__Result__.str+="|readFromParcel|"; return null;}
public  java.lang.String toShortString () {__Result__.str+="|toShortString|"; return null;}
public  java.lang.String flattenToString () {__Result__.str+="|flattenToString|"; return null;}
public static  android.content.ComponentName unflattenFromString (java.lang.String arg0) {__Result__.str+="|unflattenFromString|"; return null;}
public static  android.content.ComponentName createRelative (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|createRelative|"; return null;}
public static  android.content.ComponentName createRelative (android.content.Context arg0,java.lang.String arg1) {__Result__.str+="|createRelative|"; return null;}
public  java.lang.String getShortClassName () {__Result__.str+="|getShortClassName|"; return null;}
public  java.lang.String flattenToShortString () {__Result__.str+="|flattenToShortString|"; return null;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

public  android.content.ComponentName clone () {__Result__.str+="|clone|"; return null;}

public  int compareTo (android.content.ComponentName arg0) {__Result__.str+="|compareTo|"; return 0;}
public  java.lang.String getClassName () {__Result__.str+="|getClassName|"; return null;}

/*========inner classes========*/

}