package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*       PermissionInfo              */
/*===================================*/

public class PermissionInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int FLAG_COSTS_MONEY=0;
public static final  int FLAG_INSTALLED=0;
public static final  int PROTECTION_DANGEROUS=0;
public static final  int PROTECTION_FLAG_APPOP=0;
public static final  int PROTECTION_FLAG_DEVELOPMENT=0;
public static final  int PROTECTION_FLAG_INSTALLER=0;
public static final  int PROTECTION_FLAG_PRE23=0;
public static final  int PROTECTION_FLAG_PREINSTALLED=0;
public static final  int PROTECTION_FLAG_PRIVILEGED=0;
public static final  int PROTECTION_FLAG_SETUP=0;
public static final  @java.lang.Deprecated() int PROTECTION_FLAG_SYSTEM=0;
public static final  int PROTECTION_FLAG_VERIFIER=0;
public static final  int PROTECTION_MASK_BASE=0;
public static final  int PROTECTION_MASK_FLAGS=0;
public static final  int PROTECTION_NORMAL=0;
public static final  int PROTECTION_SIGNATURE=0;
public static final  @java.lang.Deprecated() int PROTECTION_SIGNATURE_OR_SYSTEM=0;
public  int descriptionRes;
public  int flags;
public  java.lang.String group;
public  java.lang.CharSequence nonLocalizedDescription;
public  int protectionLevel;

/*======constructors=====*/
public  PermissionInfo (android.content.pm.PermissionInfo arg0) {__Result__.str+="|PermissionInfo|";}
public  PermissionInfo () {__Result__.str+="|PermissionInfo|";}

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