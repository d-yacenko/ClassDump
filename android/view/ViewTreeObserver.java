package android.view;
import android.__Result__;


/*===================================*/ 
/*     ViewTreeObserver              */
/*===================================*/

public final class ViewTreeObserver {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public  void removeOnWindowAttachListener (android.view.ViewTreeObserver$OnWindowAttachListener arg0) {__Result__.str+="|removeOnWindowAttachListener|"; return ;}
public  void addOnWindowFocusChangeListener (android.view.ViewTreeObserver$OnWindowFocusChangeListener arg0) {__Result__.str+="|addOnWindowFocusChangeListener|"; return ;}
public  void removeOnWindowFocusChangeListener (android.view.ViewTreeObserver$OnWindowFocusChangeListener arg0) {__Result__.str+="|removeOnWindowFocusChangeListener|"; return ;}
public  void addOnGlobalFocusChangeListener (android.view.ViewTreeObserver$OnGlobalFocusChangeListener arg0) {__Result__.str+="|addOnGlobalFocusChangeListener|"; return ;}
public  void removeOnGlobalFocusChangeListener (android.view.ViewTreeObserver$OnGlobalFocusChangeListener arg0) {__Result__.str+="|removeOnGlobalFocusChangeListener|"; return ;}
public  void addOnGlobalLayoutListener (android.view.ViewTreeObserver$OnGlobalLayoutListener arg0) {__Result__.str+="|addOnGlobalLayoutListener|"; return ;}
public  @java.lang.Deprecated() void removeGlobalOnLayoutListener (android.view.ViewTreeObserver$OnGlobalLayoutListener arg0) {__Result__.str+="|removeGlobalOnLayoutListener|"; return ;}
public  void removeOnGlobalLayoutListener (android.view.ViewTreeObserver$OnGlobalLayoutListener arg0) {__Result__.str+="|removeOnGlobalLayoutListener|"; return ;}
public  void addOnPreDrawListener (android.view.ViewTreeObserver$OnPreDrawListener arg0) {__Result__.str+="|addOnPreDrawListener|"; return ;}
public  void removeOnPreDrawListener (android.view.ViewTreeObserver$OnPreDrawListener arg0) {__Result__.str+="|removeOnPreDrawListener|"; return ;}
public  void addOnDrawListener (android.view.ViewTreeObserver$OnDrawListener arg0) {__Result__.str+="|addOnDrawListener|"; return ;}
public  void removeOnDrawListener (android.view.ViewTreeObserver$OnDrawListener arg0) {__Result__.str+="|removeOnDrawListener|"; return ;}
public  void addOnScrollChangedListener (android.view.ViewTreeObserver$OnScrollChangedListener arg0) {__Result__.str+="|addOnScrollChangedListener|"; return ;}
public  void removeOnScrollChangedListener (android.view.ViewTreeObserver$OnScrollChangedListener arg0) {__Result__.str+="|removeOnScrollChangedListener|"; return ;}
public  void addOnTouchModeChangeListener (android.view.ViewTreeObserver$OnTouchModeChangeListener arg0) {__Result__.str+="|addOnTouchModeChangeListener|"; return ;}
public  void removeOnTouchModeChangeListener (android.view.ViewTreeObserver$OnTouchModeChangeListener arg0) {__Result__.str+="|removeOnTouchModeChangeListener|"; return ;}
public final  void dispatchOnGlobalLayout () {__Result__.str+="|dispatchOnGlobalLayout|"; return ;}
public final  boolean dispatchOnPreDraw () {__Result__.str+="|dispatchOnPreDraw|"; return false;}
public final  void dispatchOnDraw () {__Result__.str+="|dispatchOnDraw|"; return ;}
public  void addOnWindowAttachListener (android.view.ViewTreeObserver$OnWindowAttachListener arg0) {__Result__.str+="|addOnWindowAttachListener|"; return ;}
public  boolean isAlive () {__Result__.str+="|isAlive|"; return false;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* OnScrollChangedListener              */
/*===================================*/

public abstract static interface OnScrollChangedListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onScrollChanged () ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnTouchModeChangeListener              */
/*===================================*/

public abstract static interface OnTouchModeChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onTouchModeChanged (boolean arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*       OnDrawListener              */
/*===================================*/

public abstract static interface OnDrawListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onDraw () ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*    OnPreDrawListener              */
/*===================================*/

public abstract static interface OnPreDrawListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onPreDraw () ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnGlobalLayoutListener              */
/*===================================*/

public abstract static interface OnGlobalLayoutListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onGlobalLayout () ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnGlobalFocusChangeListener              */
/*===================================*/

public abstract static interface OnGlobalFocusChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onGlobalFocusChanged (android.view.View arg0,android.view.View arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnWindowFocusChangeListener              */
/*===================================*/

public abstract static interface OnWindowFocusChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onWindowFocusChanged (boolean arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnWindowAttachListener              */
/*===================================*/

public abstract static interface OnWindowAttachListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onWindowAttached () ;
public abstract  void onWindowDetached () ;

/*========inner classes========*/

}
}