package android.os;
import android.__Result__;


/*===================================*/ 
/*           Parcelable              */
/*===================================*/

public abstract interface Parcelable {
/*========fields=========*/
public static final  int CONTENTS_FILE_DESCRIPTOR=0;
public static final  int PARCELABLE_WRITE_RETURN_VALUE=0;

/*======constructors=====*/

/*========methods========*/
public abstract  void writeToParcel (android.os.Parcel arg0,int arg1) ;
public abstract  int describeContents () ;

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*   ClassLoaderCreator              */
/*===================================*/

public abstract static interface ClassLoaderCreator extends android.os.Parcelable$Creator> {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  java.lang.Object createFromParcel (android.os.Parcel arg0,java.lang.ClassLoader arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*              Creator              */
/*===================================*/

public abstract static interface Creator {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  java.lang.Object createFromParcel (android.os.Parcel arg0) ;
public abstract  [Ljava.lang.Object; newArray (int arg0) ;

/*========inner classes========*/

}
}