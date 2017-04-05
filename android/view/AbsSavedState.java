package android.view;
import android.__Result__;


/*===================================*/ 
/*        AbsSavedState              */
/*===================================*/

public abstract class AbsSavedState implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  android.view.AbsSavedState EMPTY_STATE=null;
public static final  int CONTENTS_FILE_DESCRIPTOR=0;
public static final  int PARCELABLE_WRITE_RETURN_VALUE=0;

/*======constructors=====*/

/*========methods========*/
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public final  android.os.Parcelable getSuperState () {__Result__.str+="|getSuperState|"; return null;}
public final  void wait () throws java.lang.InterruptedException{__Result__.str+="|wait|"; return ;}
public final  void wait (long arg0,int arg1) throws java.lang.InterruptedException{__Result__.str+="|wait|"; return ;}
public final native  void wait (long arg0) throws java.lang.InterruptedException{__Result__.str+="|wait|"; return ;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public native  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public final native  java.lang.Class getClass () {__Result__.str+="|getClass|"; return null;}
public final native  void notify () {__Result__.str+="|notify|"; return ;}
public final native  void notifyAll () {__Result__.str+="|notifyAll|"; return ;}

/*========inner classes========*/

}