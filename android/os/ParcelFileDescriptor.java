package android.os;
import android.__Result__;


/*===================================*/ 
/* ParcelFileDescriptor              */
/*===================================*/

public class ParcelFileDescriptor implements android.os.Parcelable,java.io.Closeable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int MODE_APPEND=0;
public static final  int MODE_CREATE=0;
public static final  int MODE_READ_ONLY=0;
public static final  int MODE_READ_WRITE=0;
public static final  int MODE_TRUNCATE=0;
public static final  @java.lang.Deprecated() int MODE_WORLD_READABLE=0;
public static final  @java.lang.Deprecated() int MODE_WORLD_WRITEABLE=0;
public static final  int MODE_WRITE_ONLY=0;

/*======constructors=====*/
public  ParcelFileDescriptor (android.os.ParcelFileDescriptor arg0) {__Result__.str+="|ParcelFileDescriptor|";}

/*========methods========*/
public static  android.os.ParcelFileDescriptor dup (java.io.FileDescriptor arg0) throws java.io.IOException{__Result__.str+="|dup|"; return null;}
public  android.os.ParcelFileDescriptor dup () throws java.io.IOException{__Result__.str+="|dup|"; return null;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.io.FileDescriptor getFileDescriptor () {__Result__.str+="|getFileDescriptor|"; return null;}
public static  android.os.ParcelFileDescriptor fromFd (int arg0) throws java.io.IOException{__Result__.str+="|fromFd|"; return null;}
public static  android.os.ParcelFileDescriptor adoptFd (int arg0) {__Result__.str+="|adoptFd|"; return null;}
public static  android.os.ParcelFileDescriptor fromSocket (java.net.Socket arg0) {__Result__.str+="|fromSocket|"; return null;}
public static  android.os.ParcelFileDescriptor fromDatagramSocket (java.net.DatagramSocket arg0) {__Result__.str+="|fromDatagramSocket|"; return null;}
public static  [Landroid.os.ParcelFileDescriptor; createPipe () throws java.io.IOException{__Result__.str+="|createPipe|"; return null;}
public static  [Landroid.os.ParcelFileDescriptor; createReliablePipe () throws java.io.IOException{__Result__.str+="|createReliablePipe|"; return null;}
public static  [Landroid.os.ParcelFileDescriptor; createSocketPair () throws java.io.IOException{__Result__.str+="|createSocketPair|"; return null;}
public static  [Landroid.os.ParcelFileDescriptor; createReliableSocketPair () throws java.io.IOException{__Result__.str+="|createReliableSocketPair|"; return null;}
public static  int parseMode (java.lang.String arg0) {__Result__.str+="|parseMode|"; return 0;}
public  long getStatSize () {__Result__.str+="|getStatSize|"; return 0;}
public  int getFd () {__Result__.str+="|getFd|"; return 0;}
public  int detachFd () {__Result__.str+="|detachFd|"; return 0;}
public  void closeWithError (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|closeWithError|"; return ;}
public  boolean canDetectErrors () {__Result__.str+="|canDetectErrors|"; return false;}

public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  void close () throws java.io.IOException{__Result__.str+="|close|"; return ;}
public static  android.os.ParcelFileDescriptor open (java.io.File arg0,int arg1) throws java.io.FileNotFoundException{__Result__.str+="|open|"; return null;}
public static  android.os.ParcelFileDescriptor open (java.io.File arg0,int arg1,android.os.Handler arg2,android.os.ParcelFileDescriptor$OnCloseListener arg3) throws java.io.IOException{__Result__.str+="|open|"; return null;}
public  void checkError () throws java.io.IOException{__Result__.str+="|checkError|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* FileDescriptorDetachedException              */
/*===================================*/

public static class FileDescriptorDetachedException extends java.io.IOException {
/*========fields=========*/

/*======constructors=====*/
public  FileDescriptorDetachedException () {__Result__.str+="|FileDescriptorDetachedException|";}

/*========methods========*/

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*      OnCloseListener              */
/*===================================*/

public abstract static interface OnCloseListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onClose (java.io.IOException arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* AutoCloseOutputStream              */
/*===================================*/

public static class AutoCloseOutputStream extends java.io.FileOutputStream {
/*========fields=========*/

/*======constructors=====*/
public  AutoCloseOutputStream (android.os.ParcelFileDescriptor arg0) {__Result__.str+="|AutoCloseOutputStream|";}

/*========methods========*/
public  void close () throws java.io.IOException{__Result__.str+="|close|"; return ;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* AutoCloseInputStream              */
/*===================================*/

public static class AutoCloseInputStream extends java.io.FileInputStream {
/*========fields=========*/

/*======constructors=====*/
public  AutoCloseInputStream (android.os.ParcelFileDescriptor arg0) {__Result__.str+="|AutoCloseInputStream|";}

/*========methods========*/
public  int read ([B arg0,int arg1,int arg2) throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public  int read ([B arg0) throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public  int read () throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public  void close () throws java.io.IOException{__Result__.str+="|close|"; return ;}

/*========inner classes========*/

}
}