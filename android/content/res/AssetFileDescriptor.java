package android.content.res;
import android.__Result__;


/*===================================*/ 
/*  AssetFileDescriptor              */
/*===================================*/

public class AssetFileDescriptor implements android.os.Parcelable,java.io.Closeable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  long UNKNOWN_LENGTH=0;

/*======constructors=====*/
public  AssetFileDescriptor (android.os.ParcelFileDescriptor arg0,long arg1,long arg2,android.os.Bundle arg3) {__Result__.str+="|AssetFileDescriptor|";}
public  AssetFileDescriptor (android.os.ParcelFileDescriptor arg0,long arg1,long arg2) {__Result__.str+="|AssetFileDescriptor|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  android.os.Bundle getExtras () {__Result__.str+="|getExtras|"; return null;}
public  long getStartOffset () {__Result__.str+="|getStartOffset|"; return 0;}
public  android.os.ParcelFileDescriptor getParcelFileDescriptor () {__Result__.str+="|getParcelFileDescriptor|"; return null;}
public  java.io.FileDescriptor getFileDescriptor () {__Result__.str+="|getFileDescriptor|"; return null;}
public  long getDeclaredLength () {__Result__.str+="|getDeclaredLength|"; return 0;}
public  java.io.FileInputStream createInputStream () throws java.io.IOException{__Result__.str+="|createInputStream|"; return null;}
public  java.io.FileOutputStream createOutputStream () throws java.io.IOException{__Result__.str+="|createOutputStream|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  long getLength () {__Result__.str+="|getLength|"; return 0;}
public  void close () throws java.io.IOException{__Result__.str+="|close|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* AutoCloseOutputStream              */
/*===================================*/

public static class AutoCloseOutputStream extends android.os.ParcelFileDescriptor$AutoCloseOutputStream {
/*========fields=========*/

/*======constructors=====*/
public  AutoCloseOutputStream (android.content.res.AssetFileDescriptor arg0) throws java.io.IOException{__Result__.str+="|AutoCloseOutputStream|";}

/*========methods========*/
public  void write (int arg0) throws java.io.IOException{__Result__.str+="|write|"; return ;}
public  void write ([B arg0) throws java.io.IOException{__Result__.str+="|write|"; return ;}
public  void write ([B arg0,int arg1,int arg2) throws java.io.IOException{__Result__.str+="|write|"; return ;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* AutoCloseInputStream              */
/*===================================*/

public static class AutoCloseInputStream extends android.os.ParcelFileDescriptor$AutoCloseInputStream {
/*========fields=========*/

/*======constructors=====*/
public  AutoCloseInputStream (android.content.res.AssetFileDescriptor arg0) throws java.io.IOException{__Result__.str+="|AutoCloseInputStream|";}

/*========methods========*/
public  int read ([B arg0) throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public  int read ([B arg0,int arg1,int arg2) throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public  int read () throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public  void mark (int arg0) {__Result__.str+="|mark|"; return ;}
public synchronized  void reset () throws java.io.IOException{__Result__.str+="|reset|"; return ;}
public  int available () throws java.io.IOException{__Result__.str+="|available|"; return 0;}
public  long skip (long arg0) throws java.io.IOException{__Result__.str+="|skip|"; return 0;}
public  boolean markSupported () {__Result__.str+="|markSupported|"; return false;}

/*========inner classes========*/

}
}