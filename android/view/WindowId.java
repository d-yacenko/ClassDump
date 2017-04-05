package android.view;
import android.__Result__;


/*===================================*/ 
/*             WindowId              */
/*===================================*/

public class WindowId implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/


/*========methods========*/
public  boolean isFocused () {__Result__.str+="|isFocused|"; return false;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void registerFocusObserver (android.view.WindowId$FocusObserver arg0) {__Result__.str+="|registerFocusObserver|"; return ;}
public  void unregisterFocusObserver (android.view.WindowId$FocusObserver arg0) {__Result__.str+="|unregisterFocusObserver|"; return ;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*        FocusObserver              */
/*===================================*/

public abstract static class FocusObserver {
/*========fields=========*/

/*======constructors=====*/
public  FocusObserver () {__Result__.str+="|FocusObserver|";}

/*========methods========*/
public abstract  void onFocusGained (android.view.WindowId arg0) ;
public abstract  void onFocusLost (android.view.WindowId arg0) ;

/*========inner classes========*/

}
}