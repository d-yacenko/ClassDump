package android.graphics;
import android.__Result__;


/*===================================*/ 
/*               Bitmap              */
/*===================================*/

public final class Bitmap implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int DENSITY_NONE=0;

/*======constructors=====*/


/*========methods========*/
public  void setHeight (int arg0) {__Result__.str+="|setHeight|"; return ;}
public  void setWidth (int arg0) {__Result__.str+="|setWidth|"; return ;}
public final  int getWidth () {__Result__.str+="|getWidth|"; return 0;}
public final  int getHeight () {__Result__.str+="|getHeight|"; return 0;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  void recycle () {__Result__.str+="|recycle|"; return ;}
public  int getDensity () {__Result__.str+="|getDensity|"; return 0;}
public  void setDensity (int arg0) {__Result__.str+="|setDensity|"; return ;}
public final  boolean hasAlpha () {__Result__.str+="|hasAlpha|"; return false;}
public  void reconfigure (int arg0,int arg1,android.graphics.Bitmap$Config arg2) {__Result__.str+="|reconfigure|"; return ;}
public  void setConfig (android.graphics.Bitmap$Config arg0) {__Result__.str+="|setConfig|"; return ;}
public final  boolean isRecycled () {__Result__.str+="|isRecycled|"; return false;}
public  int getGenerationId () {__Result__.str+="|getGenerationId|"; return 0;}
public  void copyPixelsToBuffer (java.nio.Buffer arg0) {__Result__.str+="|copyPixelsToBuffer|"; return ;}
public  void copyPixelsFromBuffer (java.nio.Buffer arg0) {__Result__.str+="|copyPixelsFromBuffer|"; return ;}
public final  boolean isMutable () {__Result__.str+="|isMutable|"; return false;}
public static  android.graphics.Bitmap createScaledBitmap (android.graphics.Bitmap arg0,int arg1,int arg2,boolean arg3) {__Result__.str+="|createScaledBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (android.util.DisplayMetrics arg0,[I arg1,int arg2,int arg3,android.graphics.Bitmap$Config arg4) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap ([I arg0,int arg1,int arg2,android.graphics.Bitmap$Config arg3) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (android.graphics.Bitmap arg0) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (android.util.DisplayMetrics arg0,int arg1,int arg2,android.graphics.Bitmap$Config arg3) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (int arg0,int arg1,android.graphics.Bitmap$Config arg2) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (android.graphics.Bitmap arg0,int arg1,int arg2,int arg3,int arg4,android.graphics.Matrix arg5,boolean arg6) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (android.graphics.Bitmap arg0,int arg1,int arg2,int arg3,int arg4) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap (android.util.DisplayMetrics arg0,[I arg1,int arg2,int arg3,int arg4,int arg5,android.graphics.Bitmap$Config arg6) {__Result__.str+="|createBitmap|"; return null;}
public static  android.graphics.Bitmap createBitmap ([I arg0,int arg1,int arg2,int arg3,int arg4,android.graphics.Bitmap$Config arg5) {__Result__.str+="|createBitmap|"; return null;}
public  [B getNinePatchChunk () {__Result__.str+="|getNinePatchChunk|"; return null;}
public  boolean compress (android.graphics.Bitmap$CompressFormat arg0,int arg1,java.io.OutputStream arg2) {__Result__.str+="|compress|"; return false;}
public final  boolean isPremultiplied () {__Result__.str+="|isPremultiplied|"; return false;}
public final  void setPremultiplied (boolean arg0) {__Result__.str+="|setPremultiplied|"; return ;}
public  int getScaledWidth (android.graphics.Canvas arg0) {__Result__.str+="|getScaledWidth|"; return 0;}
public  int getScaledWidth (android.util.DisplayMetrics arg0) {__Result__.str+="|getScaledWidth|"; return 0;}
public  int getScaledWidth (int arg0) {__Result__.str+="|getScaledWidth|"; return 0;}
public  int getScaledHeight (int arg0) {__Result__.str+="|getScaledHeight|"; return 0;}
public  int getScaledHeight (android.graphics.Canvas arg0) {__Result__.str+="|getScaledHeight|"; return 0;}
public  int getScaledHeight (android.util.DisplayMetrics arg0) {__Result__.str+="|getScaledHeight|"; return 0;}
public final  int getRowBytes () {__Result__.str+="|getRowBytes|"; return 0;}
public final  int getByteCount () {__Result__.str+="|getByteCount|"; return 0;}
public final  int getAllocationByteCount () {__Result__.str+="|getAllocationByteCount|"; return 0;}
public final  android.graphics.Bitmap$Config getConfig () {__Result__.str+="|getConfig|"; return null;}
public  void setHasAlpha (boolean arg0) {__Result__.str+="|setHasAlpha|"; return ;}
public final  boolean hasMipMap () {__Result__.str+="|hasMipMap|"; return false;}
public final  void setHasMipMap (boolean arg0) {__Result__.str+="|setHasMipMap|"; return ;}
public  void eraseColor (int arg0) {__Result__.str+="|eraseColor|"; return ;}
public  int getPixel (int arg0,int arg1) {__Result__.str+="|getPixel|"; return 0;}
public  void getPixels ([I arg0,int arg1,int arg2,int arg3,int arg4,int arg5,int arg6) {__Result__.str+="|getPixels|"; return ;}
public  void setPixel (int arg0,int arg1,int arg2) {__Result__.str+="|setPixel|"; return ;}
public  void setPixels ([I arg0,int arg1,int arg2,int arg3,int arg4,int arg5,int arg6) {__Result__.str+="|setPixels|"; return ;}
public  android.graphics.Bitmap extractAlpha () {__Result__.str+="|extractAlpha|"; return null;}
public  android.graphics.Bitmap extractAlpha (android.graphics.Paint arg0,[I arg1) {__Result__.str+="|extractAlpha|"; return null;}
public  boolean sameAs (android.graphics.Bitmap arg0) {__Result__.str+="|sameAs|"; return false;}
public  void prepareToDraw () {__Result__.str+="|prepareToDraw|"; return ;}
public  android.graphics.Bitmap copy (android.graphics.Bitmap$Config arg0,boolean arg1) {__Result__.str+="|copy|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*       CompressFormat              */
/*===================================*/

public static final class CompressFormat extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Bitmap$CompressFormat JPEG=null;
public static final  android.graphics.Bitmap$CompressFormat PNG=null;
public static final  android.graphics.Bitmap$CompressFormat WEBP=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Bitmap$CompressFormat; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Bitmap$CompressFormat valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*               Config              */
/*===================================*/

public static final class Config extends java.lang.Enum {
/*========fields=========*/
public static final  android.graphics.Bitmap$Config ALPHA_8=null;
public static final  android.graphics.Bitmap$Config ARGB_4444=null;
public static final  android.graphics.Bitmap$Config ARGB_8888=null;
public static final  android.graphics.Bitmap$Config RGB_565=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.graphics.Bitmap$Config; values () {__Result__.str+="|values|"; return null;}
public static  android.graphics.Bitmap$Config valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}
}