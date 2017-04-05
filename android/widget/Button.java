package android.widget;
import android.__Result__;


/*===================================*/ 
/*               Button              */
/*===================================*/
 @android.widget.RemoteViews$RemoteView()
public class Button extends android.widget.TextView {
/*========fields=========*/

/*======constructors=====*/
public  Button (android.content.Context arg0) {__Result__.str+="|Button|";}
public  Button (android.content.Context arg0,android.util.AttributeSet arg1,int arg2,int arg3) {__Result__.str+="|Button|";}
public  Button (android.content.Context arg0,android.util.AttributeSet arg1,int arg2) {__Result__.str+="|Button|";}
public  Button (android.content.Context arg0,android.util.AttributeSet arg1) {__Result__.str+="|Button|";}

/*========methods========*/
public  java.lang.CharSequence getAccessibilityClassName () {__Result__.str+="|getAccessibilityClassName|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*           SavedState              */
/*===================================*/

public static class SavedState extends android.view.View$BaseSavedState {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/


/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*           BufferType              */
/*===================================*/

public static final class BufferType extends java.lang.Enum {
/*========fields=========*/
public static final  android.widget.TextView$BufferType EDITABLE=null;
public static final  android.widget.TextView$BufferType NORMAL=null;
public static final  android.widget.TextView$BufferType SPANNABLE=null;


/*======constructors=====*/


/*========methods========*/
public static  [Landroid.widget.TextView$BufferType; values () {__Result__.str+="|values|"; return null;}
public static  android.widget.TextView$BufferType valueOf (java.lang.String arg0) {__Result__.str+="|valueOf|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnEditorActionListener              */
/*===================================*/

public abstract static interface OnEditorActionListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onEditorAction (android.widget.TextView arg0,int arg1,android.view.KeyEvent arg2) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* AccessibilityDelegate              */
/*===================================*/

public static class AccessibilityDelegate {
/*========fields=========*/

/*======constructors=====*/
public  AccessibilityDelegate () {__Result__.str+="|AccessibilityDelegate|";}

/*========methods========*/
public  void sendAccessibilityEvent (android.view.View arg0,int arg1) {__Result__.str+="|sendAccessibilityEvent|"; return ;}
public  void sendAccessibilityEventUnchecked (android.view.View arg0,android.view.accessibility.AccessibilityEvent arg1) {__Result__.str+="|sendAccessibilityEventUnchecked|"; return ;}
public  boolean dispatchPopulateAccessibilityEvent (android.view.View arg0,android.view.accessibility.AccessibilityEvent arg1) {__Result__.str+="|dispatchPopulateAccessibilityEvent|"; return false;}
public  void onPopulateAccessibilityEvent (android.view.View arg0,android.view.accessibility.AccessibilityEvent arg1) {__Result__.str+="|onPopulateAccessibilityEvent|"; return ;}
public  void onInitializeAccessibilityEvent (android.view.View arg0,android.view.accessibility.AccessibilityEvent arg1) {__Result__.str+="|onInitializeAccessibilityEvent|"; return ;}
public  void onInitializeAccessibilityNodeInfo (android.view.View arg0,android.view.accessibility.AccessibilityNodeInfo arg1) {__Result__.str+="|onInitializeAccessibilityNodeInfo|"; return ;}
public  android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider (android.view.View arg0) {__Result__.str+="|getAccessibilityNodeProvider|"; return null;}
public  boolean performAccessibilityAction (android.view.View arg0,int arg1,android.os.Bundle arg2) {__Result__.str+="|performAccessibilityAction|"; return false;}
public  boolean onRequestSendAccessibilityEvent (android.view.ViewGroup arg0,android.view.View arg1,android.view.accessibility.AccessibilityEvent arg2) {__Result__.str+="|onRequestSendAccessibilityEvent|"; return false;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*       BaseSavedState              */
/*===================================*/

public static class BaseSavedState extends android.view.AbsSavedState {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/
public  BaseSavedState (android.os.Parcelable arg0) {__Result__.str+="|BaseSavedState|";}
public  BaseSavedState (android.os.Parcel arg0,java.lang.ClassLoader arg1) {__Result__.str+="|BaseSavedState|";}
public  BaseSavedState (android.os.Parcel arg0) {__Result__.str+="|BaseSavedState|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnApplyWindowInsetsListener              */
/*===================================*/

public abstract static interface OnApplyWindowInsetsListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  android.view.WindowInsets onApplyWindowInsets (android.view.View arg0,android.view.WindowInsets arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnAttachStateChangeListener              */
/*===================================*/

public abstract static interface OnAttachStateChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onViewAttachedToWindow (android.view.View arg0) ;
public abstract  void onViewDetachedFromWindow (android.view.View arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnSystemUiVisibilityChangeListener              */
/*===================================*/

public abstract static interface OnSystemUiVisibilityChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onSystemUiVisibilityChange (int arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnCreateContextMenuListener              */
/*===================================*/

public abstract static interface OnCreateContextMenuListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onCreateContextMenu (android.view.ContextMenu arg0,android.view.View arg1,android.view.ContextMenu$ContextMenuInfo arg2) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnContextClickListener              */
/*===================================*/

public abstract static interface OnContextClickListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onContextClick (android.view.View arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*      OnClickListener              */
/*===================================*/

public abstract static interface OnClickListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onClick (android.view.View arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnFocusChangeListener              */
/*===================================*/

public abstract static interface OnFocusChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onFocusChange (android.view.View arg0,boolean arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*       OnDragListener              */
/*===================================*/

public abstract static interface OnDragListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onDrag (android.view.View arg0,android.view.DragEvent arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*  OnLongClickListener              */
/*===================================*/

public abstract static interface OnLongClickListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onLongClick (android.view.View arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnGenericMotionListener              */
/*===================================*/

public abstract static interface OnGenericMotionListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onGenericMotion (android.view.View arg0,android.view.MotionEvent arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*      OnHoverListener              */
/*===================================*/

public abstract static interface OnHoverListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onHover (android.view.View arg0,android.view.MotionEvent arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*      OnTouchListener              */
/*===================================*/

public abstract static interface OnTouchListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onTouch (android.view.View arg0,android.view.MotionEvent arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*        OnKeyListener              */
/*===================================*/

public abstract static interface OnKeyListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onKey (android.view.View arg0,int arg1,android.view.KeyEvent arg2) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*          MeasureSpec              */
/*===================================*/

public static class MeasureSpec {
/*========fields=========*/
public static final  int AT_MOST=0;
public static final  int EXACTLY=0;
public static final  int UNSPECIFIED=0;

/*======constructors=====*/
public  MeasureSpec () {__Result__.str+="|MeasureSpec|";}

/*========methods========*/
public static  int makeMeasureSpec (int arg0,int arg1) {__Result__.str+="|makeMeasureSpec|"; return 0;}
public static  int getMode (int arg0) {__Result__.str+="|getMode|"; return 0;}
public static  java.lang.String toString (int arg0) {__Result__.str+="|toString|"; return null;}
public static  int getSize (int arg0) {__Result__.str+="|getSize|"; return 0;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*    DragShadowBuilder              */
/*===================================*/

public static class DragShadowBuilder {
/*========fields=========*/

/*======constructors=====*/
public  DragShadowBuilder () {__Result__.str+="|DragShadowBuilder|";}
public  DragShadowBuilder (android.view.View arg0) {__Result__.str+="|DragShadowBuilder|";}

/*========methods========*/
public  void onDrawShadow (android.graphics.Canvas arg0) {__Result__.str+="|onDrawShadow|"; return ;}
public  void onProvideShadowMetrics (android.graphics.Point arg0,android.graphics.Point arg1) {__Result__.str+="|onProvideShadowMetrics|"; return ;}
public final  android.view.View getView () {__Result__.str+="|getView|"; return null;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnLayoutChangeListener              */
/*===================================*/

public abstract static interface OnLayoutChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onLayoutChange (android.view.View arg0,int arg1,int arg2,int arg3,int arg4,int arg5,int arg6,int arg7,int arg8) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnScrollChangeListener              */
/*===================================*/

public abstract static interface OnScrollChangeListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onScrollChange (android.view.View arg0,int arg1,int arg2,int arg3,int arg4) ;

/*========inner classes========*/

}
}