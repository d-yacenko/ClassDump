package android.os;
import android.__Result__;


/*===================================*/ 
/*               Bundle              */
/*===================================*/

public final class Bundle extends android.os.BaseBundle implements java.lang.Cloneable,android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  android.os.Bundle EMPTY=null;

/*======constructors=====*/
public  Bundle (android.os.Bundle arg0) {__Result__.str+="|Bundle|";}
public  Bundle (java.lang.ClassLoader arg0) {__Result__.str+="|Bundle|";}
public  Bundle (int arg0) {__Result__.str+="|Bundle|";}
public  Bundle () {__Result__.str+="|Bundle|";}
public  Bundle (android.os.PersistableBundle arg0) {__Result__.str+="|Bundle|";}

/*========methods========*/
public  android.os.Bundle getBundle (java.lang.String arg0) {__Result__.str+="|getBundle|"; return null;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  boolean hasFileDescriptors () {__Result__.str+="|hasFileDescriptors|"; return false;}
public  void putFloatArray (java.lang.String arg0,[F arg1) {__Result__.str+="|putFloatArray|"; return ;}
public  void putCharSequenceArray (java.lang.String arg0,[Ljava.lang.CharSequence; arg1) {__Result__.str+="|putCharSequenceArray|"; return ;}
public  void putBundle (java.lang.String arg0,android.os.Bundle arg1) {__Result__.str+="|putBundle|"; return ;}
public  void putBinder (java.lang.String arg0,android.os.IBinder arg1) {__Result__.str+="|putBinder|"; return ;}
public  java.lang.CharSequence getCharSequence (java.lang.String arg0,java.lang.CharSequence arg1) {__Result__.str+="|getCharSequence|"; return null;}
public  java.lang.CharSequence getCharSequence (java.lang.String arg0) {__Result__.str+="|getCharSequence|"; return null;}
public  android.util.SizeF getSizeF (java.lang.String arg0) {__Result__.str+="|getSizeF|"; return null;}
public  android.os.Parcelable getParcelable (java.lang.String arg0) {__Result__.str+="|getParcelable|"; return null;}
public  [Landroid.os.Parcelable; getParcelableArray (java.lang.String arg0) {__Result__.str+="|getParcelableArray|"; return null;}
public  java.util.ArrayList getParcelableArrayList (java.lang.String arg0) {__Result__.str+="|getParcelableArrayList|"; return null;}
public  android.util.SparseArray getSparseParcelableArray (java.lang.String arg0) {__Result__.str+="|getSparseParcelableArray|"; return null;}
public  java.io.Serializable getSerializable (java.lang.String arg0) {__Result__.str+="|getSerializable|"; return null;}
public  java.util.ArrayList getIntegerArrayList (java.lang.String arg0) {__Result__.str+="|getIntegerArrayList|"; return null;}
public  java.util.ArrayList getStringArrayList (java.lang.String arg0) {__Result__.str+="|getStringArrayList|"; return null;}
public  java.util.ArrayList getCharSequenceArrayList (java.lang.String arg0) {__Result__.str+="|getCharSequenceArrayList|"; return null;}
public  [B getByteArray (java.lang.String arg0) {__Result__.str+="|getByteArray|"; return null;}
public  [S getShortArray (java.lang.String arg0) {__Result__.str+="|getShortArray|"; return null;}
public  [C getCharArray (java.lang.String arg0) {__Result__.str+="|getCharArray|"; return null;}
public  [F getFloatArray (java.lang.String arg0) {__Result__.str+="|getFloatArray|"; return null;}
public  [Ljava.lang.CharSequence; getCharSequenceArray (java.lang.String arg0) {__Result__.str+="|getCharSequenceArray|"; return null;}
public  android.os.IBinder getBinder (java.lang.String arg0) {__Result__.str+="|getBinder|"; return null;}
public  void readFromParcel (android.os.Parcel arg0) {__Result__.str+="|readFromParcel|"; return ;}
public  void putParcelableArrayList (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putParcelableArrayList|"; return ;}
public  void putSparseParcelableArray (java.lang.String arg0,android.util.SparseArray arg1) {__Result__.str+="|putSparseParcelableArray|"; return ;}
public  void putIntegerArrayList (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putIntegerArrayList|"; return ;}
public  void putStringArrayList (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putStringArrayList|"; return ;}
public  void putCharSequenceArrayList (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putCharSequenceArrayList|"; return ;}
public  void putByteArray (java.lang.String arg0,[B arg1) {__Result__.str+="|putByteArray|"; return ;}
public  void putShortArray (java.lang.String arg0,[S arg1) {__Result__.str+="|putShortArray|"; return ;}
public  void putCharArray (java.lang.String arg0,[C arg1) {__Result__.str+="|putCharArray|"; return ;}
public  void putSerializable (java.lang.String arg0,java.io.Serializable arg1) {__Result__.str+="|putSerializable|"; return ;}
public  void setClassLoader (java.lang.ClassLoader arg0) {__Result__.str+="|setClassLoader|"; return ;}
public  void putCharSequence (java.lang.String arg0,java.lang.CharSequence arg1) {__Result__.str+="|putCharSequence|"; return ;}
public  void putParcelable (java.lang.String arg0,android.os.Parcelable arg1) {__Result__.str+="|putParcelable|"; return ;}
public  void putSize (java.lang.String arg0,android.util.Size arg1) {__Result__.str+="|putSize|"; return ;}
public  void putSizeF (java.lang.String arg0,android.util.SizeF arg1) {__Result__.str+="|putSizeF|"; return ;}
public  void putParcelableArray (java.lang.String arg0,[Landroid.os.Parcelable; arg1) {__Result__.str+="|putParcelableArray|"; return ;}
public  void remove (java.lang.String arg0) {__Result__.str+="|remove|"; return ;}
public synchronized  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  java.lang.Object clone () {__Result__.str+="|clone|"; return null;}
public  byte getByte (java.lang.String arg0) {__Result__.str+="|getByte|"; return 0;}
public  java.lang.Byte getByte (java.lang.String arg0,byte arg1) {__Result__.str+="|getByte|"; return null;}
public  void putByte (java.lang.String arg0,byte arg1) {__Result__.str+="|putByte|"; return ;}
public  short getShort (java.lang.String arg0,short arg1) {__Result__.str+="|getShort|"; return 0;}
public  short getShort (java.lang.String arg0) {__Result__.str+="|getShort|"; return 0;}
public  void putShort (java.lang.String arg0,short arg1) {__Result__.str+="|putShort|"; return ;}
public  char getChar (java.lang.String arg0) {__Result__.str+="|getChar|"; return 0;}
public  char getChar (java.lang.String arg0,char arg1) {__Result__.str+="|getChar|"; return 0;}
public  void putChar (java.lang.String arg0,char arg1) {__Result__.str+="|putChar|"; return ;}
public  float getFloat (java.lang.String arg0,float arg1) {__Result__.str+="|getFloat|"; return 0f;}
public  float getFloat (java.lang.String arg0) {__Result__.str+="|getFloat|"; return 0f;}
public  void putFloat (java.lang.String arg0,float arg1) {__Result__.str+="|putFloat|"; return ;}
public  void clear () {__Result__.str+="|clear|"; return ;}
public  java.lang.ClassLoader getClassLoader () {__Result__.str+="|getClassLoader|"; return null;}
public  void putAll (android.os.Bundle arg0) {__Result__.str+="|putAll|"; return ;}
public  android.util.Size getSize (java.lang.String arg0) {__Result__.str+="|getSize|"; return null;}

/*========inner classes========*/

}