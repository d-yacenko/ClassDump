package android.os;
import android.__Result__;


/*===================================*/ 
/*           LocaleList              */
/*===================================*/

public final class LocaleList implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/
public transient  LocaleList ([Ljava.util.Locale; arg0) {__Result__.str+="|LocaleList|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.String toLanguageTags () {__Result__.str+="|toLanguageTags|"; return null;}
public static  android.os.LocaleList getEmptyLocaleList () {__Result__.str+="|getEmptyLocaleList|"; return null;}
public static  android.os.LocaleList forLanguageTags (java.lang.String arg0) {__Result__.str+="|forLanguageTags|"; return null;}
public  java.util.Locale getFirstMatch ([Ljava.lang.String; arg0) {__Result__.str+="|getFirstMatch|"; return null;}
public static  android.os.LocaleList getAdjustedDefault () {__Result__.str+="|getAdjustedDefault|"; return null;}
public  java.util.Locale get (int arg0) {__Result__.str+="|get|"; return null;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  int indexOf (java.util.Locale arg0) {__Result__.str+="|indexOf|"; return 0;}
public static  android.os.LocaleList getDefault () {__Result__.str+="|getDefault|"; return null;}
public  boolean isEmpty () {__Result__.str+="|isEmpty|"; return false;}
public  int size () {__Result__.str+="|size|"; return 0;}
public static  void setDefault (android.os.LocaleList arg0) {__Result__.str+="|setDefault|"; return ;}

/*========inner classes========*/

}