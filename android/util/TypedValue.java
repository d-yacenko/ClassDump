package android.util;
import android.__Result__;


/*===================================*/ 
/*           TypedValue              */
/*===================================*/

public class TypedValue {
/*========fields=========*/
public static final  int COMPLEX_MANTISSA_MASK=0;
public static final  int COMPLEX_MANTISSA_SHIFT=0;
public static final  int COMPLEX_RADIX_0p23=0;
public static final  int COMPLEX_RADIX_16p7=0;
public static final  int COMPLEX_RADIX_23p0=0;
public static final  int COMPLEX_RADIX_8p15=0;
public static final  int COMPLEX_RADIX_MASK=0;
public static final  int COMPLEX_RADIX_SHIFT=0;
public static final  int COMPLEX_UNIT_DIP=0;
public static final  int COMPLEX_UNIT_FRACTION=0;
public static final  int COMPLEX_UNIT_FRACTION_PARENT=0;
public static final  int COMPLEX_UNIT_IN=0;
public static final  int COMPLEX_UNIT_MASK=0;
public static final  int COMPLEX_UNIT_MM=0;
public static final  int COMPLEX_UNIT_PT=0;
public static final  int COMPLEX_UNIT_PX=0;
public static final  int COMPLEX_UNIT_SHIFT=0;
public static final  int COMPLEX_UNIT_SP=0;
public static final  int DATA_NULL_EMPTY=0;
public static final  int DATA_NULL_UNDEFINED=0;
public static final  int DENSITY_DEFAULT=0;
public static final  int DENSITY_NONE=0;
public static final  int TYPE_ATTRIBUTE=0;
public static final  int TYPE_DIMENSION=0;
public static final  int TYPE_FIRST_COLOR_INT=0;
public static final  int TYPE_FIRST_INT=0;
public static final  int TYPE_FLOAT=0;
public static final  int TYPE_FRACTION=0;
public static final  int TYPE_INT_BOOLEAN=0;
public static final  int TYPE_INT_COLOR_ARGB4=0;
public static final  int TYPE_INT_COLOR_ARGB8=0;
public static final  int TYPE_INT_COLOR_RGB4=0;
public static final  int TYPE_INT_COLOR_RGB8=0;
public static final  int TYPE_INT_DEC=0;
public static final  int TYPE_INT_HEX=0;
public static final  int TYPE_LAST_COLOR_INT=0;
public static final  int TYPE_LAST_INT=0;
public static final  int TYPE_NULL=0;
public static final  int TYPE_REFERENCE=0;
public static final  int TYPE_STRING=0;
public  int assetCookie;
public  int changingConfigurations;
public  int data;
public  int density;
public  int resourceId;
public  java.lang.CharSequence string;
public  int type;

/*======constructors=====*/
public  TypedValue () {__Result__.str+="|TypedValue|";}

/*========methods========*/
public  void setTo (android.util.TypedValue arg0) {__Result__.str+="|setTo|"; return ;}
public  float getDimension (android.util.DisplayMetrics arg0) {__Result__.str+="|getDimension|"; return 0f;}
public  float getFraction (float arg0,float arg1) {__Result__.str+="|getFraction|"; return 0f;}
public static  float complexToFloat (int arg0) {__Result__.str+="|complexToFloat|"; return 0f;}
public static  float complexToDimension (int arg0,android.util.DisplayMetrics arg1) {__Result__.str+="|complexToDimension|"; return 0f;}
public static  int complexToDimensionPixelOffset (int arg0,android.util.DisplayMetrics arg1) {__Result__.str+="|complexToDimensionPixelOffset|"; return 0;}
public static  int complexToDimensionPixelSize (int arg0,android.util.DisplayMetrics arg1) {__Result__.str+="|complexToDimensionPixelSize|"; return 0;}
public  int getComplexUnit () {__Result__.str+="|getComplexUnit|"; return 0;}
public static  float applyDimension (int arg0,float arg1,android.util.DisplayMetrics arg2) {__Result__.str+="|applyDimension|"; return 0f;}
public static  float complexToFraction (int arg0,float arg1,float arg2) {__Result__.str+="|complexToFraction|"; return 0f;}
public final  java.lang.CharSequence coerceToString () {__Result__.str+="|coerceToString|"; return null;}
public static final  java.lang.String coerceToString (int arg0,int arg1) {__Result__.str+="|coerceToString|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public final  float getFloat () {__Result__.str+="|getFloat|"; return 0f;}

/*========inner classes========*/

}