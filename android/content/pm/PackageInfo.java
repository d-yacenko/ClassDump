package android.content.pm;
import android.__Result__;


/*===================================*/ 
/*          PackageInfo              */
/*===================================*/

public class PackageInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int INSTALL_LOCATION_AUTO=0;
public static final  int INSTALL_LOCATION_INTERNAL_ONLY=0;
public static final  int INSTALL_LOCATION_PREFER_EXTERNAL=0;
public static final  int REQUESTED_PERMISSION_GRANTED=0;
public  [Landroid.content.pm.ActivityInfo; activities;
public  android.content.pm.ApplicationInfo applicationInfo;
public  int baseRevisionCode;
public  [Landroid.content.pm.ConfigurationInfo; configPreferences;
public  [Landroid.content.pm.FeatureGroupInfo; featureGroups;
public  long firstInstallTime;
public  [I gids;
public  int installLocation;
public  [Landroid.content.pm.InstrumentationInfo; instrumentation;
public  long lastUpdateTime;
public  java.lang.String packageName;
public  [Landroid.content.pm.PermissionInfo; permissions;
public  [Landroid.content.pm.ProviderInfo; providers;
public  [Landroid.content.pm.ActivityInfo; receivers;
public  [Landroid.content.pm.FeatureInfo; reqFeatures;
public  [Ljava.lang.String; requestedPermissions;
public  [I requestedPermissionsFlags;
public  [Landroid.content.pm.ServiceInfo; services;
public  java.lang.String sharedUserId;
public  int sharedUserLabel;
public  [Landroid.content.pm.Signature; signatures;
public  [Ljava.lang.String; splitNames;
public  [I splitRevisionCodes;
public  int versionCode;
public  java.lang.String versionName;

/*======constructors=====*/
public  PackageInfo () {__Result__.str+="|PackageInfo|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/

}