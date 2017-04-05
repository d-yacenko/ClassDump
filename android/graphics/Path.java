package android.graphics;
import android.__Result__;


/*===================================*/ 
/*                 Path              */
/*===================================*/

public class Path {
/*========fields=========*/

/*======constructors=====*/
public  Path (android.graphics.Path arg0) {__Result__.str+="|Path|";}
public  Path () {__Result__.str+="|Path|";}

/*========methods========*/
public  boolean op (android.graphics.Path arg0,android.graphics.Path arg1,android.graphics.Path$Op arg2) {__Result__.str+="|op|"; return false;}
public  boolean op (android.graphics.Path arg0,android.graphics.Path$Op arg1) {__Result__.str+="|op|"; return false;}
public  void transform (android.graphics.Matrix arg0) {__Result__.str+="|transform|"; return ;}
public  void transform (android.graphics.Matrix arg0,android.graphics.Path arg1) {__Result__.str+="|transform|"; return ;}
public  boolean isRect (android.graphics.RectF arg0) {__Result__.str+="|isRect|"; return false;}
public  boolean isConvex () {__Result__.str+="|isConvex|"; return false;}
public  android.graphics.Path$FillType getFillType () {__Result__.str+="|getFillType|"; return null;}
public  void setFillType (android.graphics.Path$FillType arg0) {__Result__.str+="|setFillType|"; return ;}
public  boolean isInverseFillType () {__Result__.str+="|isInverseFillType|"; return false;}
public  void toggleInverseFillType () {__Result__.str+="|toggleInverseFillType|"; return ;}
public  void computeBounds (android.graphics.RectF arg0,boolean arg1) {__Result__.str+="|computeBounds|"; return ;}
public  void incReserve (int arg0) {__Result__.str+="|incReserve|"; return ;}
public  void moveTo (float arg0,float arg1) {__Result__.str+="|moveTo|"; return ;}
public  void rMoveTo (float arg0,float arg1) {__Result__.str+="|rMoveTo|"; return ;}
public  void lineTo (float arg0,float arg1) {__Result__.str+="|lineTo|"; return ;}
public  void rLineTo (float arg0,float arg1) {__Result__.str+="|rLineTo|"; return ;}
public  void quadTo (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|quadTo|"; return ;}
public  void rQuadTo (float arg0,float arg1,float arg2,float arg3) {__Result__.str+="|rQuadTo|"; return ;}
public  void cubicTo (float arg0,float arg1,float arg2,float arg3,float arg4,float arg5) {__Result__.str+="|cubicTo|"; return ;}
public  void rCubicTo (float arg0,float arg1,float arg2,float arg3,float arg4,float arg5) {__Result__.str+="|rCubicTo|"; return ;}
public  void arcTo (android.graphics.RectF arg0,float arg1,float arg2) {__Result__.str+="|arcTo|"; return ;}
public  void arcTo (float arg0,float arg1,float arg2,float arg3,float arg4,float arg5,boolean arg6) {__Result__.str+="|arcTo|"; return ;}
public  void arcTo (android.graphics.RectF arg0,float arg1,float arg2,boolean arg3) {__Result__.str+="|arcTo|"; return ;}
public  void addRect (float arg0,float arg1,float arg2,float arg3,android.graphics.Path$Direction arg4) {__Result__.str+="|addRect|"; return ;}
public  void addRect (android.graphics.RectF arg0,android.graphics.Path$Direction arg1) {__Result__.str+="|addRect|"; return ;}
public  void addOval (float arg0,float arg1,float arg2,float arg3,android.graphics.Path$Direction arg4) {__Result__.str+="|addOval|"; return ;}
public  void addOval (android.graphics.RectF arg0,android.graphics.Path$Direction arg1) {__Result__.str+="|addOval|"; return ;}
public  void addCircle (float arg0,float arg1,float arg2,android.graphics.Path$Direction arg3) {__Result__.str+="|addCircle|"; return ;}
public  void addArc (float arg0,float arg1,float arg2,float arg3,float arg4,float arg5) {__Result__.str+="|addArc|"; return ;}
public  void addArc (android.graphics.RectF arg0,float arg1,float arg2) {__Result__.str+="|addArc|"; return ;}
public  void addRoundRect (float arg0,float arg1,float arg2,float arg3,float arg4,float arg5,android.graphics.Path$Direction arg6) {__Result__.str+="|addRoundRect|"; return ;}
public  void addRoundRect (android.graphics.RectF arg0,[F arg1,android.graphics.Path$Direction arg2) {__Result__.str+="|addRoundRect|"; return ;}
public  void addRoundRect (android.graphics.RectF arg0,float arg1,float arg2,android.graphics.Path$Direction arg3) {__Result__.str+="|addRoundRect|"; return ;}
public  void addRoundRect (float arg0,float arg1,float arg2,float arg3,[F arg4,android.graphics.Path$Direction arg5) {__Result__.str+="|addRoundRect|"; return ;}
public  void addPath (android.graphics.Path arg0,android.graphics.Matrix arg1) {__Result__.str+="|addPath|"; return ;}
public  void addPath (android.graphics.Path arg0,float arg1,float arg2) {__Result__.str+="|addPath|"; return ;}
public  void addPath (android.graphics.Path arg0) {__Result__.str+="|addPath|"; return ;}
public  void setLastPoint (float arg0,float arg1) {__Result__.str+="|setLastPoint|"; return ;}

public  void offset (float arg0,float arg1) {__Result__.str+="|offset|"; return ;}
public  void offset (float arg0,float arg1,android.graphics.Path arg2) {__Result__.str+="|offset|"; return ;}
public  boolean isEmpty () {__Result__.str+="|isEmpty|"; return false;}
public  void close () {__Result__.str+="|close|"; return ;}
public  void set (android.graphics.Path arg0) {__Result__.str+="|set|"; return ;}
public  void reset () {__Result__.str+="|reset|"; return ;}
public  void rewind () {__Result__.str+="|rewind|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*            Direction              */
/*===================================*/

public static final class Direction extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Path$Direction CCW=null;
public static final  android.graphics.Path$Direction CW=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Path$Direction; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Path$Direction valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*             FillType              */
/*===================================*/

public static final class FillType extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Path$FillType EVEN_ODD=null;
public static final  android.graphics.Path$FillType INVERSE_EVEN_ODD=null;
public static final  android.graphics.Path$FillType INVERSE_WINDING=null;
public static final  android.graphics.Path$FillType WINDING=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Path$FillType; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Path$FillType valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*                   Op              */
/*===================================*/

public static final class Op extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Path$Op DIFFERENCE=null;
public static final  android.graphics.Path$Op INTERSECT=null;
public static final  android.graphics.Path$Op REVERSE_DIFFERENCE=null;
public static final  android.graphics.Path$Op UNION=null;
public static final  android.graphics.Path$Op XOR=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Path$Op; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Path$Op valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}
}