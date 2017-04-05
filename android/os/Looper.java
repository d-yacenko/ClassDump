package android.os;
import android.__Result__;


/*===================================*/ 
/*               Looper              */
/*===================================*/

public final class Looper {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public static  void loop () {__Result__.str+="|loop|"; return ;}
public  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
public static  android.os.Looper getMainLooper () {__Result__.str+="|getMainLooper|"; return null;}
public static  android.os.Looper myLooper () {__Result__.str+="|myLooper|"; return null;}
public static  android.os.MessageQueue myQueue () {__Result__.str+="|myQueue|"; return null;}
public static  void prepareMainLooper () {__Result__.str+="|prepareMainLooper|"; return ;}
public  boolean isCurrentThread () {__Result__.str+="|isCurrentThread|"; return false;}
public  void setMessageLogging (android.util.Printer arg0) {__Result__.str+="|setMessageLogging|"; return ;}
public  void quit () {__Result__.str+="|quit|"; return ;}
public  void quitSafely () {__Result__.str+="|quitSafely|"; return ;}
public  java.lang.Thread getThread () {__Result__.str+="|getThread|"; return null;}
public  android.os.MessageQueue getQueue () {__Result__.str+="|getQueue|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public static  void prepare () {__Result__.str+="|prepare|"; return ;}

/*========inner classes========*/

}