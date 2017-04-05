package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*  PermissionGroupInfo              */
/*===================================*/

public class PermissionGroupInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int FLAG_PERSONAL_INFO=0;
public  int descriptionRes;
public  int flags;
public  java.lang.CharSequence nonLocalizedDescription;
public  int priority;

/*======constructors=====*/
public  PermissionGroupInfo (android.content.pm.PermissionGroupInfo arg0) {__Result__.str+="|PermissionGroupInfo|";}
public  PermissionGroupInfo () {__Result__.str+="|PermissionGroupInfo|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.CharSequence loadDescription (android.content.pm.PackageManager arg0) {__Result__.str+="|loadDescription|"; return null;}
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