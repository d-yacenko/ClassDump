package android.graphics;
import android.__Result__;


/*===================================*/ 
/*               Matrix              */
/*===================================*/

public class Matrix {
/*========fields=========*/
public static final  int MPERSP_0=0;
public static final  int MPERSP_1=0;
public static final  int MPERSP_2=0;
public static final  int MSCALE_X=0;
public static final  int MSCALE_Y=0;
public static final  int MSKEW_X=0;
public static final  int MSKEW_Y=0;
public static final  int MTRANS_X=0;
public static final  int MTRANS_Y=0;

/*======constructors=====*/
public  Matrix () {__Result__.str+="|Matrix|";}
public  Matrix (android.graphics.Matrix arg0) {__Result__.str+="|Matrix|";}

/*========methods========*/
public  void setScale (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|setScale|"; return ;}
public  void setScale (float arg0,float arg1) {__Result__.str+="|setScale|"; return ;}
public  java.lang.String toShortString () {__Result__.str+="|toShortString|"; return null;}
public  boolean isIdentity () {__Result__.str+="|isIdentity|"; return false;}
public  boolean isAffine () {__Result__.str+="|isAffine|"; return false;}
public  boolean rectStaysRect () {__Result__.str+="|rectStaysRect|"; return false;}
public  void setTranslate (float arg0,float arg1) {__Result__.str+="|setTranslate|"; return ;}
public  void setRotate (float arg0) {__Result__.str+="|setRotate|"; return ;}
public  void setRotate (float arg0,float arg1,float arg2) {__Result__.str+="|setRotate|"; return ;}
public  void setSinCos (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|setSinCos|"; return ;}
public  void setSinCos (float arg0,float arg1) {__Result__.str+="|setSinCos|"; return ;}
public  void setSkew (float arg0,float arg1) {__Result__.str+="|setSkew|"; return ;}
public  void setSkew (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|setSkew|"; return ;}
public  boolean setConcat (android.graphics.Matrix arg0,android.graphics.Matrix arg1) {__Result__.str+="|setConcat|"; return false;}
public  boolean preTranslate (float arg0,float arg1) {__Result__.str+="|preTranslate|"; return false;}
public  boolean preScale (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|preScale|"; return false;}
public  boolean preScale (float arg0,float arg1) {__Result__.str+="|preScale|"; return false;}
public  boolean preRotate (float arg0,float arg1,float arg2) {__Result__.str+="|preRotate|"; return false;}
public  boolean preRotate (float arg0) {__Result__.str+="|preRotate|"; return false;}
public  boolean preSkew (float arg0,float arg1) {__Result__.str+="|preSkew|"; return false;}
public  boolean preSkew (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|preSkew|"; return false;}
public  boolean preConcat (android.graphics.Matrix arg0) {__Result__.str+="|preConcat|"; return false;}
public  boolean postTranslate (float arg0,float arg1) {__Result__.str+="|postTranslate|"; return false;}
public  boolean postScale (float arg0,float arg1) {__Result__.str+="|postScale|"; return false;}
public  boolean postScale (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|postScale|"; return false;}
public  boolean postRotate (float arg0,float arg1,float arg2) {__Result__.str+="|postRotate|"; return false;}
public  boolean postRotate (float arg0) {__Result__.str+="|postRotate|"; return false;}
public  boolean postSkew (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|postSkew|"; return false;}
public  boolean postSkew (float arg0,float arg1) {__Result__.str+="|postSkew|"; return false;}
public  boolean postConcat (android.graphics.Matrix arg0) {__Result__.str+="|postConcat|"; return false;}
public  boolean setRectToRect (android.graphics.RectF arg0,android.graphics.RectF arg1,android.graphics.Matrix$ScaleToFit arg2) {__Result__.str+="|setRectToRect|"; return false;}
public  boolean setPolyToPoly ([F arg0,int arg1,[F arg2,int arg3,int arg4) {__Result__.str+="|setPolyToPoly|"; return false;}
public  boolean invert (android.graphics.Matrix arg0) {__Result__.str+="|invert|"; return false;}
public  void mapPoints ([F arg0,int arg1,[F arg2,int arg3,int arg4) {__Result__.str+="|mapPoints|"; return ;}
public  void mapPoints ([F arg0,[F arg1) {__Result__.str+="|mapPoints|"; return ;}
public  void mapPoints ([F arg0) {__Result__.str+="|mapPoints|"; return ;}
public  void mapVectors ([F arg0,[F arg1) {__Result__.str+="|mapVectors|"; return ;}
public  void mapVectors ([F arg0,int arg1,[F arg2,int arg3,int arg4) {__Result__.str+="|mapVectors|"; return ;}
public  void mapVectors ([F arg0) {__Result__.str+="|mapVectors|"; return ;}
public  boolean mapRect (android.graphics.RectF arg0) {__Result__.str+="|mapRect|"; return false;}
public  boolean mapRect (android.graphics.RectF arg0,android.graphics.RectF arg1) {__Result__.str+="|mapRect|"; return false;}
public  float mapRadius (float arg0) {__Result__.str+="|mapRadius|"; return 0f;}
public  void getValues ([F arg0) {__Result__.str+="|getValues|"; return ;}
public  void setValues ([F arg0) {__Result__.str+="|setValues|"; return ;}

public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  void set (android.graphics.Matrix arg0) {__Result__.str+="|set|"; return ;}
public  void reset () {__Result__.str+="|reset|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*           ScaleToFit              */
/*===================================*/

public static final class ScaleToFit extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Matrix$ScaleToFit CENTER=null;
public static final  android.graphics.Matrix$ScaleToFit END=null;
public static final  android.graphics.Matrix$ScaleToFit FILL=null;
public static final  android.graphics.Matrix$ScaleToFit START=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Matrix$ScaleToFit; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Matrix$ScaleToFit valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}
}