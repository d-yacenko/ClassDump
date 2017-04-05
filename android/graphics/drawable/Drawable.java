package android.graphics.drawable;
import android.__Result__;


/*===================================*/ 
/*             Drawable              */
/*===================================*/

public abstract class Drawable {
/*========fields=========*/

/*======constructors=====*/
public  Drawable () {__Result__.str+="|Drawable|";}

/*========methods========*/
public  void inflate (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1,android.util.AttributeSet arg2) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|inflate|"; return ;}
public  void inflate (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1,android.util.AttributeSet arg2,android.content.res.Resources$Theme arg3) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|inflate|"; return ;}
public final  android.graphics.Rect getBounds () {__Result__.str+="|getBounds|"; return null;}
public final  boolean setLayoutDirection (int arg0) {__Result__.str+="|setLayoutDirection|"; return false;}
public  int getLayoutDirection () {__Result__.str+="|getLayoutDirection|"; return 0;}
public final  boolean isVisible () {__Result__.str+="|isVisible|"; return false;}
public  int getAlpha () {__Result__.str+="|getAlpha|"; return 0;}
public abstract  void setAlpha (int arg0) ;
public abstract  void draw (android.graphics.Canvas arg0) ;
public  int getMinimumHeight () {__Result__.str+="|getMinimumHeight|"; return 0;}
public  int getMinimumWidth () {__Result__.str+="|getMinimumWidth|"; return 0;}
public  android.graphics.drawable.Drawable getCurrent () {__Result__.str+="|getCurrent|"; return null;}
public  void setBounds (android.graphics.Rect arg0) {__Result__.str+="|setBounds|"; return ;}
public  void setBounds (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|setBounds|"; return ;}
public  void setChangingConfigurations (int arg0) {__Result__.str+="|setChangingConfigurations|"; return ;}
public  @java.lang.Deprecated() void setDither (boolean arg0) {__Result__.str+="|setDither|"; return ;}
public final  android.graphics.Rect copyBounds () {__Result__.str+="|copyBounds|"; return null;}
public final  void copyBounds (android.graphics.Rect arg0) {__Result__.str+="|copyBounds|"; return ;}
public  android.graphics.Rect getDirtyBounds () {__Result__.str+="|getDirtyBounds|"; return null;}
public  int getChangingConfigurations () {__Result__.str+="|getChangingConfigurations|"; return 0;}
public  void setFilterBitmap (boolean arg0) {__Result__.str+="|setFilterBitmap|"; return ;}
public  boolean isFilterBitmap () {__Result__.str+="|isFilterBitmap|"; return false;}
public final  void setCallback (android.graphics.drawable.Drawable$Callback arg0) {__Result__.str+="|setCallback|"; return ;}
public  android.graphics.drawable.Drawable$Callback getCallback () {__Result__.str+="|getCallback|"; return null;}
public  void invalidateSelf () {__Result__.str+="|invalidateSelf|"; return ;}
public  void scheduleSelf (java.lang.Runnable arg0,long arg1) {__Result__.str+="|scheduleSelf|"; return ;}
public  void unscheduleSelf (java.lang.Runnable arg0) {__Result__.str+="|unscheduleSelf|"; return ;}
public  boolean onLayoutDirectionChanged (int arg0) {__Result__.str+="|onLayoutDirectionChanged|"; return false;}
public abstract  void setColorFilter (android.graphics.ColorFilter arg0) ;
public  void setColorFilter (int arg0,android.graphics.PorterDuff$Mode arg1) {__Result__.str+="|setColorFilter|"; return ;}
public  void setTint (int arg0) {__Result__.str+="|setTint|"; return ;}
public  void setTintList (android.content.res.ColorStateList arg0) {__Result__.str+="|setTintList|"; return ;}
public  void setTintMode (android.graphics.PorterDuff$Mode arg0) {__Result__.str+="|setTintMode|"; return ;}
public  android.graphics.ColorFilter getColorFilter () {__Result__.str+="|getColorFilter|"; return null;}
public  void clearColorFilter () {__Result__.str+="|clearColorFilter|"; return ;}
public  void setHotspot (float arg0,float arg1) {__Result__.str+="|setHotspot|"; return ;}
public  void setHotspotBounds (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|setHotspotBounds|"; return ;}
public  void getHotspotBounds (android.graphics.Rect arg0) {__Result__.str+="|getHotspotBounds|"; return ;}
public  boolean isStateful () {__Result__.str+="|isStateful|"; return false;}
public  boolean setState ([I arg0) {__Result__.str+="|setState|"; return false;}
public  void jumpToCurrentState () {__Result__.str+="|jumpToCurrentState|"; return ;}
public final  boolean setLevel (int arg0) {__Result__.str+="|setLevel|"; return false;}
public final  int getLevel () {__Result__.str+="|getLevel|"; return 0;}
public  boolean setVisible (boolean arg0,boolean arg1) {__Result__.str+="|setVisible|"; return false;}
public  void setAutoMirrored (boolean arg0) {__Result__.str+="|setAutoMirrored|"; return ;}
public  boolean isAutoMirrored () {__Result__.str+="|isAutoMirrored|"; return false;}
public  void applyTheme (android.content.res.Resources$Theme arg0) {__Result__.str+="|applyTheme|"; return ;}
public  boolean canApplyTheme () {__Result__.str+="|canApplyTheme|"; return false;}
public abstract  int getOpacity () ;
public static  int resolveOpacity (int arg0,int arg1) {__Result__.str+="|resolveOpacity|"; return 0;}
public  android.graphics.Region getTransparentRegion () {__Result__.str+="|getTransparentRegion|"; return null;}



public  int getIntrinsicWidth () {__Result__.str+="|getIntrinsicWidth|"; return 0;}
public  int getIntrinsicHeight () {__Result__.str+="|getIntrinsicHeight|"; return 0;}
public  boolean getPadding (android.graphics.Rect arg0) {__Result__.str+="|getPadding|"; return false;}
public  void getOutline (android.graphics.Outline arg0) {__Result__.str+="|getOutline|"; return ;}
public  android.graphics.drawable.Drawable mutate () {__Result__.str+="|mutate|"; return null;}
public static  android.graphics.drawable.Drawable createFromStream (java.io.InputStream arg0,java.lang.String arg1) {__Result__.str+="|createFromStream|"; return null;}
public static  android.graphics.drawable.Drawable createFromResourceStream (android.content.res.Resources arg0,android.util.TypedValue arg1,java.io.InputStream arg2,java.lang.String arg3,android.graphics.BitmapFactory$Options arg4) {__Result__.str+="|createFromResourceStream|"; return null;}
public static  android.graphics.drawable.Drawable createFromResourceStream (android.content.res.Resources arg0,android.util.TypedValue arg1,java.io.InputStream arg2,java.lang.String arg3) {__Result__.str+="|createFromResourceStream|"; return null;}
public static  android.graphics.drawable.Drawable createFromXml (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1,android.content.res.Resources$Theme arg2) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|createFromXml|"; return null;}
public static  android.graphics.drawable.Drawable createFromXml (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|createFromXml|"; return null;}
public static  android.graphics.drawable.Drawable createFromXmlInner (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1,android.util.AttributeSet arg2,android.content.res.Resources$Theme arg3) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|createFromXmlInner|"; return null;}
public static  android.graphics.drawable.Drawable createFromXmlInner (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1,android.util.AttributeSet arg2) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|createFromXmlInner|"; return null;}
public static  android.graphics.drawable.Drawable createFromPath (java.lang.String arg0) {__Result__.str+="|createFromPath|"; return null;}
public  android.graphics.drawable.Drawable$ConstantState getConstantState () {__Result__.str+="|getConstantState|"; return null;}
public  [I getState () {__Result__.str+="|getState|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*        ConstantState              */
/*===================================*/

public abstract static class ConstantState {
/*========fields=========*/

/*======constructors=====*/
public  ConstantState () {__Result__.str+="|ConstantState|";}

/*========methods========*/
public abstract  int getChangingConfigurations () ;
public  boolean canApplyTheme () {__Result__.str+="|canApplyTheme|"; return false;}
public  android.graphics.drawable.Drawable newDrawable (android.content.res.Resources arg0,android.content.res.Resources$Theme arg1) {__Result__.str+="|newDrawable|"; return null;}
public  android.graphics.drawable.Drawable newDrawable (android.content.res.Resources arg0) {__Result__.str+="|newDrawable|"; return null;}
public abstract  android.graphics.drawable.Drawable newDrawable () ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*             Callback              */
/*===================================*/

public abstract static interface Callback {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void invalidateDrawable (android.graphics.drawable.Drawable arg0) ;
public abstract  void scheduleDrawable (android.graphics.drawable.Drawable arg0,java.lang.Runnable arg1,long arg2) ;
public abstract  void unscheduleDrawable (android.graphics.drawable.Drawable arg0,java.lang.Runnable arg1) ;

/*========inner classes========*/

}
}