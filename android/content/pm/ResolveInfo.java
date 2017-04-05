package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*          ResolveInfo              */
/*===================================*/

public class ResolveInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public  android.content.pm.ActivityInfo activityInfo;
public  android.content.IntentFilter filter;
public  int icon;
public  boolean isDefault;
public  int labelRes;
public  int match;
public  java.lang.CharSequence nonLocalizedLabel;
public  int preferredOrder;
public  int priority;
public  android.content.pm.ProviderInfo providerInfo;
public  java.lang.String resolvePackageName;
public  android.content.pm.ServiceInfo serviceInfo;
public  int specificIndex;

/*======constructors=====*/
public  ResolveInfo (android.content.pm.ResolveInfo arg0) {__Result__.str+="|ResolveInfo|";}
public  ResolveInfo () {__Result__.str+="|ResolveInfo|";}

/*========methods========*/
public  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.CharSequence loadLabel (android.content.pm.PackageManager arg0) {__Result__.str+="|loadLabel|"; return null;}
public final  int getIconResource () {__Result__.str+="|getIconResource|"; return 0;}
public  android.graphics.drawable.Drawable loadIcon (android.content.pm.PackageManager arg0) {__Result__.str+="|loadIcon|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* DisplayNameComparator              */
/*===================================*/

public static class DisplayNameComparator implements java.util.Comparator<android.content.pm.ResolveInfo> {
/*========fields=========*/

/*======constructors=====*/
public  DisplayNameComparator (android.content.pm.PackageManager arg0) {__Result__.str+="|DisplayNameComparator|";}

/*========methods========*/
public final  int compare (android.content.pm.ResolveInfo arg0,android.content.pm.ResolveInfo arg1) {__Result__.str+="|compare|"; return 0;}


/*========inner classes========*/

}
}