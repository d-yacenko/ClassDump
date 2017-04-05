package android.view.animation;
import android.__Result__;


/*===================================*/ 
/*            Animation              */
/*===================================*/

public abstract class Animation implements java.lang.Cloneable {
/*========fields=========*/
public static final  int ABSOLUTE=0;
public static final  int INFINITE=0;
public static final  int RELATIVE_TO_PARENT=0;
public static final  int RELATIVE_TO_SELF=0;
public static final  int RESTART=0;
public static final  int REVERSE=0;
public static final  int START_ON_FIRST_FRAME=0;
public static final  int ZORDER_BOTTOM=0;
public static final  int ZORDER_NORMAL=0;
public static final  int ZORDER_TOP=0;

/*======constructors=====*/
public  Animation () {__Result__.str+="|Animation|";}
public  Animation (android.content.Context arg0,android.util.AttributeSet arg1) {__Result__.str+="|Animation|";}

/*========methods========*/
public  void setBackgroundColor (int arg0) {__Result__.str+="|setBackgroundColor|"; return ;}

public  int getRepeatCount () {__Result__.str+="|getRepeatCount|"; return 0;}
public  void setInterpolator (android.view.animation.Interpolator arg0) {__Result__.str+="|setInterpolator|"; return ;}
public  void setInterpolator (android.content.Context arg0,int arg1) {__Result__.str+="|setInterpolator|"; return ;}
public  void setStartOffset (long arg0) {__Result__.str+="|setStartOffset|"; return ;}
public  void setDuration (long arg0) {__Result__.str+="|setDuration|"; return ;}
public  void restrictDuration (long arg0) {__Result__.str+="|restrictDuration|"; return ;}
public  void scaleCurrentDuration (float arg0) {__Result__.str+="|scaleCurrentDuration|"; return ;}
public  void setStartTime (long arg0) {__Result__.str+="|setStartTime|"; return ;}
public  void startNow () {__Result__.str+="|startNow|"; return ;}
public  void setRepeatMode (int arg0) {__Result__.str+="|setRepeatMode|"; return ;}
public  void setRepeatCount (int arg0) {__Result__.str+="|setRepeatCount|"; return ;}
public  boolean isFillEnabled () {__Result__.str+="|isFillEnabled|"; return false;}
public  void setFillEnabled (boolean arg0) {__Result__.str+="|setFillEnabled|"; return ;}
public  void setFillBefore (boolean arg0) {__Result__.str+="|setFillBefore|"; return ;}
public  void setFillAfter (boolean arg0) {__Result__.str+="|setFillAfter|"; return ;}
public  void setZAdjustment (int arg0) {__Result__.str+="|setZAdjustment|"; return ;}

public  void setDetachWallpaper (boolean arg0) {__Result__.str+="|setDetachWallpaper|"; return ;}
public  android.view.animation.Interpolator getInterpolator () {__Result__.str+="|getInterpolator|"; return null;}
public  long getStartTime () {__Result__.str+="|getStartTime|"; return 0;}
public  long getDuration () {__Result__.str+="|getDuration|"; return 0;}
public  long getStartOffset () {__Result__.str+="|getStartOffset|"; return 0;}
public  int getRepeatMode () {__Result__.str+="|getRepeatMode|"; return 0;}
public  boolean getFillBefore () {__Result__.str+="|getFillBefore|"; return false;}
public  boolean getFillAfter () {__Result__.str+="|getFillAfter|"; return false;}
public  int getZAdjustment () {__Result__.str+="|getZAdjustment|"; return 0;}
public  int getBackgroundColor () {__Result__.str+="|getBackgroundColor|"; return 0;}
public  boolean getDetachWallpaper () {__Result__.str+="|getDetachWallpaper|"; return false;}
public  boolean willChangeTransformationMatrix () {__Result__.str+="|willChangeTransformationMatrix|"; return false;}
public  boolean willChangeBounds () {__Result__.str+="|willChangeBounds|"; return false;}
public  void setAnimationListener (android.view.animation.Animation$AnimationListener arg0) {__Result__.str+="|setAnimationListener|"; return ;}

public  long computeDurationHint () {__Result__.str+="|computeDurationHint|"; return 0;}
public  boolean getTransformation (long arg0,android.view.animation.Transformation arg1,float arg2) {__Result__.str+="|getTransformation|"; return false;}
public  boolean getTransformation (long arg0,android.view.animation.Transformation arg1) {__Result__.str+="|getTransformation|"; return false;}
public  boolean hasStarted () {__Result__.str+="|hasStarted|"; return false;}
public  boolean hasEnded () {__Result__.str+="|hasEnded|"; return false;}

public  void cancel () {__Result__.str+="|cancel|"; return ;}
public  boolean isInitialized () {__Result__.str+="|isInitialized|"; return false;}



public  void start () {__Result__.str+="|start|"; return ;}
public  void reset () {__Result__.str+="|reset|"; return ;}
public  void initialize (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|initialize|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*    AnimationListener              */
/*===================================*/

public abstract static interface AnimationListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onAnimationStart (android.view.animation.Animation arg0) ;
public abstract  void onAnimationEnd (android.view.animation.Animation arg0) ;
public abstract  void onAnimationRepeat (android.view.animation.Animation arg0) ;

/*========inner classes========*/

}
}