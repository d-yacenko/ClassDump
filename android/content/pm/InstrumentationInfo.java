package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*  InstrumentationInfo              */
/*===================================*/

public class InstrumentationInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public  java.lang.String dataDir;
public  boolean functionalTest;
public  boolean handleProfiling;
public  java.lang.String publicSourceDir;
public  java.lang.String sourceDir;
public  [Ljava.lang.String; splitPublicSourceDirs;
public  [Ljava.lang.String; splitSourceDirs;
public  java.lang.String targetPackage;

/*======constructors=====*/
public  InstrumentationInfo () {__Result__.str+="|InstrumentationInfo|";}
public  InstrumentationInfo (android.content.pm.InstrumentationInfo arg0) {__Result__.str+="|InstrumentationInfo|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/
import android.__Result__;


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