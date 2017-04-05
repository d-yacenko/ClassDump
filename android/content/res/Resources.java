package android.content.res;
import android.__Result__;


/*===================================*/ 
/*            Resources              */
/*===================================*/

public class Resources {
/*========fields=========*/

/*======constructors=====*/
public  @java.lang.Deprecated() Resources (android.content.res.AssetManager arg0,android.util.DisplayMetrics arg1,android.content.res.Configuration arg2) {__Result__.str+="|Resources|";}

/*========methods========*/
public  [Ljava.lang.String; getStringArray (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getStringArray|"; return null;}
public  int getIdentifier (java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {__Result__.str+="|getIdentifier|"; return 0;}
public  java.lang.String getString (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getString|"; return null;}
public transient  java.lang.String getString (int arg0,[Ljava.lang.Object; arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getString|"; return null;}
public  java.lang.CharSequence getText (int arg0,java.lang.CharSequence arg1) {__Result__.str+="|getText|"; return null;}
public  java.lang.CharSequence getText (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getText|"; return null;}
public  android.content.res.XmlResourceParser getLayout (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getLayout|"; return null;}
public  android.content.res.XmlResourceParser getAnimation (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getAnimation|"; return null;}
public final  android.content.res.AssetManager getAssets () {__Result__.str+="|getAssets|"; return null;}
public  int getColor (int arg0,android.content.res.Resources$Theme arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getColor|"; return 0;}
public  @java.lang.Deprecated() int getColor (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getColor|"; return 0;}
public  android.graphics.drawable.Drawable getDrawable (int arg0,android.content.res.Resources$Theme arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDrawable|"; return null;}
public  @java.lang.Deprecated() android.graphics.drawable.Drawable getDrawable (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDrawable|"; return null;}
public  android.content.res.ColorStateList getColorStateList (int arg0,android.content.res.Resources$Theme arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getColorStateList|"; return null;}
public  @java.lang.Deprecated() android.content.res.ColorStateList getColorStateList (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getColorStateList|"; return null;}
public  [I getIntArray (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getIntArray|"; return null;}
public transient  java.lang.String getQuantityString (int arg0,int arg1,[Ljava.lang.Object; arg2) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getQuantityString|"; return null;}
public  java.lang.String getQuantityString (int arg0,int arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getQuantityString|"; return null;}
public static  android.content.res.Resources getSystem () {__Result__.str+="|getSystem|"; return null;}
public  java.lang.CharSequence getQuantityText (int arg0,int arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getQuantityText|"; return null;}
public  [Ljava.lang.CharSequence; getTextArray (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getTextArray|"; return null;}
public  android.content.res.TypedArray obtainTypedArray (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|obtainTypedArray|"; return null;}
public  float getDimension (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDimension|"; return 0f;}
public  int getDimensionPixelOffset (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDimensionPixelOffset|"; return 0;}
public  int getDimensionPixelSize (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDimensionPixelSize|"; return 0;}
public  float getFraction (int arg0,int arg1,int arg2) {__Result__.str+="|getFraction|"; return 0f;}
public  @java.lang.Deprecated() android.graphics.drawable.Drawable getDrawableForDensity (int arg0,int arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDrawableForDensity|"; return null;}
public  android.graphics.drawable.Drawable getDrawableForDensity (int arg0,int arg1,android.content.res.Resources$Theme arg2) {__Result__.str+="|getDrawableForDensity|"; return null;}
public  android.graphics.Movie getMovie (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getMovie|"; return null;}
public  android.content.res.XmlResourceParser getXml (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getXml|"; return null;}
public  java.io.InputStream openRawResource (int arg0,android.util.TypedValue arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|openRawResource|"; return null;}
public  java.io.InputStream openRawResource (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|openRawResource|"; return null;}
public  android.content.res.AssetFileDescriptor openRawResourceFd (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|openRawResourceFd|"; return null;}
public  void getValueForDensity (int arg0,int arg1,android.util.TypedValue arg2,boolean arg3) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getValueForDensity|"; return ;}
public final  android.content.res.Resources$Theme newTheme () {__Result__.str+="|newTheme|"; return null;}
public  android.content.res.TypedArray obtainAttributes (android.util.AttributeSet arg0,[I arg1) {__Result__.str+="|obtainAttributes|"; return null;}
public  @java.lang.Deprecated() void updateConfiguration (android.content.res.Configuration arg0,android.util.DisplayMetrics arg1) {__Result__.str+="|updateConfiguration|"; return ;}
public  android.util.DisplayMetrics getDisplayMetrics () {__Result__.str+="|getDisplayMetrics|"; return null;}
public  android.content.res.Configuration getConfiguration () {__Result__.str+="|getConfiguration|"; return null;}
public  java.lang.String getResourceName (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getResourceName|"; return null;}
public  java.lang.String getResourcePackageName (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getResourcePackageName|"; return null;}
public  java.lang.String getResourceTypeName (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getResourceTypeName|"; return null;}
public  java.lang.String getResourceEntryName (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getResourceEntryName|"; return null;}
public  void parseBundleExtras (android.content.res.XmlResourceParser arg0,android.os.Bundle arg1) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|parseBundleExtras|"; return ;}
public  void parseBundleExtra (java.lang.String arg0,android.util.AttributeSet arg1,android.os.Bundle arg2) throws org.xmlpull.v1.XmlPullParserException{__Result__.str+="|parseBundleExtra|"; return ;}
public final  void flushLayoutCache () {__Result__.str+="|flushLayoutCache|"; return ;}
public final  void finishPreloading () {__Result__.str+="|finishPreloading|"; return ;}
public  boolean getBoolean (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getBoolean|"; return false;}
public  void getValue (java.lang.String arg0,android.util.TypedValue arg1,boolean arg2) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getValue|"; return ;}
public  void getValue (int arg0,android.util.TypedValue arg1,boolean arg2) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getValue|"; return ;}
public  int getInteger (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getInteger|"; return 0;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*                Theme              */
/*===================================*/

public final class Theme {
/*========fields=========*/


/*======constructors=====*/


/*========methods========*/
public  void dump (int arg0,java.lang.String arg1,java.lang.String arg2) {__Result__.str+="|dump|"; return ;}
public  android.graphics.drawable.Drawable getDrawable (int arg0) throws android.content.res.Resources$NotFoundException{__Result__.str+="|getDrawable|"; return null;}
public  android.content.res.TypedArray obtainStyledAttributes (int arg0,[I arg1) throws android.content.res.Resources$NotFoundException{__Result__.str+="|obtainStyledAttributes|"; return null;}
public  android.content.res.TypedArray obtainStyledAttributes (android.util.AttributeSet arg0,[I arg1,int arg2,int arg3) {__Result__.str+="|obtainStyledAttributes|"; return null;}
public  android.content.res.TypedArray obtainStyledAttributes ([I arg0) {__Result__.str+="|obtainStyledAttributes|"; return null;}
public  void setTo (android.content.res.Resources$Theme arg0) {__Result__.str+="|setTo|"; return ;}
public  int getChangingConfigurations () {__Result__.str+="|getChangingConfigurations|"; return 0;}
public  void applyStyle (int arg0,boolean arg1) {__Result__.str+="|applyStyle|"; return ;}
public  boolean resolveAttribute (int arg0,android.util.TypedValue arg1,boolean arg2) {__Result__.str+="|resolveAttribute|"; return false;}
public  android.content.res.Resources getResources () {__Result__.str+="|getResources|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*    NotFoundException              */
/*===================================*/

public static class NotFoundException extends java.lang.RuntimeException {
/*========fields=========*/

/*======constructors=====*/
public  NotFoundException () {__Result__.str+="|NotFoundException|";}
public  NotFoundException (java.lang.String arg0) {__Result__.str+="|NotFoundException|";}
public  NotFoundException (java.lang.String arg0,java.lang.Exception arg1) {__Result__.str+="|NotFoundException|";}

/*========methods========*/

/*========inner classes========*/

}
}