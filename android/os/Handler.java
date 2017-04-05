package android.os;
import android.__Result__;


/*===================================*/ 
/*              Handler              */
/*===================================*/

public class Handler {
/*========fields=========*/

/*======constructors=====*/
public  Handler (android.os.Handler$Callback arg0) {__Result__.str+="|Handler|";}
public  Handler (android.os.Looper arg0) {__Result__.str+="|Handler|";}
public  Handler (android.os.Looper arg0,android.os.Handler$Callback arg1) {__Result__.str+="|Handler|";}
public  Handler () {__Result__.str+="|Handler|";}

/*========methods========*/
public final  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
public final  boolean post (java.lang.Runnable arg0) {__Result__.str+="|post|"; return false;}
public final  boolean postDelayed (java.lang.Runnable arg0,long arg1) {__Result__.str+="|postDelayed|"; return false;}
public final  void removeCallbacks (java.lang.Runnable arg0,java.lang.Object arg1) {__Result__.str+="|removeCallbacks|"; return ;}
public final  void removeCallbacks (java.lang.Runnable arg0) {__Result__.str+="|removeCallbacks|"; return ;}
public  void handleMessage (android.os.Message arg0) {__Result__.str+="|handleMessage|"; return ;}
public  void dispatchMessage (android.os.Message arg0) {__Result__.str+="|dispatchMessage|"; return ;}
public  java.lang.String getMessageName (android.os.Message arg0) {__Result__.str+="|getMessageName|"; return null;}
public final  android.os.Message obtainMessage (int arg0,int arg1,int arg2) {__Result__.str+="|obtainMessage|"; return null;}
public final  android.os.Message obtainMessage (int arg0,int arg1,int arg2,java.lang.Object arg3) {__Result__.str+="|obtainMessage|"; return null;}
public final  android.os.Message obtainMessage () {__Result__.str+="|obtainMessage|"; return null;}
public final  android.os.Message obtainMessage (int arg0) {__Result__.str+="|obtainMessage|"; return null;}
public final  android.os.Message obtainMessage (int arg0,java.lang.Object arg1) {__Result__.str+="|obtainMessage|"; return null;}
public final  boolean postAtTime (java.lang.Runnable arg0,java.lang.Object arg1,long arg2) {__Result__.str+="|postAtTime|"; return false;}
public final  boolean postAtTime (java.lang.Runnable arg0,long arg1) {__Result__.str+="|postAtTime|"; return false;}
public final  boolean postAtFrontOfQueue (java.lang.Runnable arg0) {__Result__.str+="|postAtFrontOfQueue|"; return false;}
public final  boolean sendMessage (android.os.Message arg0) {__Result__.str+="|sendMessage|"; return false;}
public final  boolean sendEmptyMessage (int arg0) {__Result__.str+="|sendEmptyMessage|"; return false;}
public final  boolean sendEmptyMessageDelayed (int arg0,long arg1) {__Result__.str+="|sendEmptyMessageDelayed|"; return false;}
public final  boolean sendEmptyMessageAtTime (int arg0,long arg1) {__Result__.str+="|sendEmptyMessageAtTime|"; return false;}
public final  boolean sendMessageDelayed (android.os.Message arg0,long arg1) {__Result__.str+="|sendMessageDelayed|"; return false;}
public  boolean sendMessageAtTime (android.os.Message arg0,long arg1) {__Result__.str+="|sendMessageAtTime|"; return false;}
public final  boolean sendMessageAtFrontOfQueue (android.os.Message arg0) {__Result__.str+="|sendMessageAtFrontOfQueue|"; return false;}
public final  void removeMessages (int arg0,java.lang.Object arg1) {__Result__.str+="|removeMessages|"; return ;}
public final  void removeMessages (int arg0) {__Result__.str+="|removeMessages|"; return ;}
public final  void removeCallbacksAndMessages (java.lang.Object arg0) {__Result__.str+="|removeCallbacksAndMessages|"; return ;}
public final  boolean hasMessages (int arg0) {__Result__.str+="|hasMessages|"; return false;}
public final  boolean hasMessages (int arg0,java.lang.Object arg1) {__Result__.str+="|hasMessages|"; return false;}
public final  android.os.Looper getLooper () {__Result__.str+="|getLooper|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*             Callback              */
/*===================================*/

public abstract static interface Callback {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean handleMessage (android.os.Message arg0) ;

/*========inner classes========*/

}
}