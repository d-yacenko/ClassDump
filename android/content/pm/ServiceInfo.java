package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*          ServiceInfo              */
/*===================================*/

public class ServiceInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int FLAG_EXTERNAL_SERVICE=0;
public static final  int FLAG_ISOLATED_PROCESS=0;
public static final  int FLAG_SINGLE_USER=0;
public static final  int FLAG_STOP_WITH_TASK=0;
public  int flags;
public  java.lang.String permission;

/*======constructors=====*/
public  ServiceInfo (android.content.pm.ServiceInfo arg0) {__Result__.str+="|ServiceInfo|";}
public  ServiceInfo () {__Result__.str+="|ServiceInfo|";}

/*========methods========*/
public  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
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