package android.graphics;
import android.__Result__;


/*===================================*/ 
/*                Movie              */
/*===================================*/

public class Movie {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public native  boolean setTime (int arg0) {__Result__.str+="|setTime|"; return false;}
public native  int width () {__Result__.str+="|width|"; return 0;}
public  void draw (android.graphics.Canvas arg0,float arg1,float arg2) {__Result__.str+="|draw|"; return ;}
public  void draw (android.graphics.Canvas arg0,float arg1,float arg2,android.graphics.Paint arg3) {__Result__.str+="|draw|"; return ;}
public native  int height () {__Result__.str+="|height|"; return 0;}
public native  int duration () {__Result__.str+="|duration|"; return 0;}
public static native  android.graphics.Movie decodeByteArray ([B arg0,int arg1,int arg2) {__Result__.str+="|decodeByteArray|"; return null;}
public static  android.graphics.Movie decodeStream (java.io.InputStream arg0) {__Result__.str+="|decodeStream|"; return null;}
public static  android.graphics.Movie decodeFile (java.lang.String arg0) {__Result__.str+="|decodeFile|"; return null;}

public native  boolean isOpaque () {__Result__.str+="|isOpaque|"; return false;}

/*========inner classes========*/

}