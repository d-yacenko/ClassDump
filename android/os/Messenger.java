package android.os;
import android.__Result__;


/*===================================*/ 
/*            Messenger              */
/*===================================*/

public final class Messenger implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/
public  Messenger (android.os.Handler arg0) {__Result__.str+="|Messenger|";}
public  Messenger (android.os.IBinder arg0) {__Result__.str+="|Messenger|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  android.os.IBinder getBinder () {__Result__.str+="|getBinder|"; return null;}
public static  android.os.Messenger readMessengerOrNullFromParcel (android.os.Parcel arg0) {__Result__.str+="|readMessengerOrNullFromParcel|"; return null;}
public static  void writeMessengerOrNullToParcel (android.os.Messenger arg0,android.os.Parcel arg1) {__Result__.str+="|writeMessengerOrNullToParcel|"; return ;}
public  void send (android.os.Message arg0) throws android.os.RemoteException{__Result__.str+="|send|"; return ;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

/*========inner classes========*/

}