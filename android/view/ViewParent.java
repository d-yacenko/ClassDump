package android.view;
import android.__Result__;


/*===================================*/ 
/*           ViewParent              */
/*===================================*/

public abstract interface ViewParent {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void requestFitSystemWindows () ;
public abstract  int getLayoutDirection () ;
public abstract  android.view.View focusSearch (android.view.View arg0,int arg1) ;
public abstract  android.view.ViewParent getParentForAccessibility () ;
public abstract  void createContextMenu (android.view.ContextMenu arg0) ;
public abstract  boolean canResolveLayoutDirection () ;
public abstract  boolean isLayoutDirectionResolved () ;
public abstract  boolean isLayoutRequested () ;
public abstract  void requestLayout () ;
public abstract  int getTextDirection () ;
public abstract  boolean canResolveTextDirection () ;
public abstract  boolean isTextDirectionResolved () ;
public abstract  int getTextAlignment () ;
public abstract  boolean canResolveTextAlignment () ;
public abstract  boolean isTextAlignmentResolved () ;
public abstract  void clearChildFocus (android.view.View arg0) ;
public abstract  void requestChildFocus (android.view.View arg0,android.view.View arg1) ;
public abstract  void focusableViewAvailable (android.view.View arg0) ;
public abstract  boolean showContextMenuForChild (android.view.View arg0) ;
public abstract  boolean showContextMenuForChild (android.view.View arg0,float arg1,float arg2) ;
public abstract  android.view.ActionMode startActionModeForChild (android.view.View arg0,android.view.ActionMode$Callback arg1,int arg2) ;
public abstract  android.view.ActionMode startActionModeForChild (android.view.View arg0,android.view.ActionMode$Callback arg1) ;
public abstract  boolean requestChildRectangleOnScreen (android.view.View arg0,android.graphics.Rect arg1,boolean arg2) ;
public abstract  boolean requestSendAccessibilityEvent (android.view.View arg0,android.view.accessibility.AccessibilityEvent arg1) ;
public abstract  void childHasTransientStateChanged (android.view.View arg0,boolean arg1) ;
public abstract  void recomputeViewAttributes (android.view.View arg0) ;
public abstract  void bringChildToFront (android.view.View arg0) ;
public abstract  void requestDisallowInterceptTouchEvent (boolean arg0) ;
public abstract  void notifySubtreeAccessibilityStateChanged (android.view.View arg0,android.view.View arg1,int arg2) ;
public abstract  boolean onNestedPrePerformAccessibilityAction (android.view.View arg0,int arg1,android.os.Bundle arg2) ;
public abstract  void invalidateChild (android.view.View arg0,android.graphics.Rect arg1) ;
public abstract  android.view.ViewParent invalidateChildInParent ([I arg0,android.graphics.Rect arg1) ;
public abstract  boolean getChildVisibleRect (android.view.View arg0,android.graphics.Rect arg1,android.graphics.Point arg2) ;
public abstract  void requestTransparentRegion (android.view.View arg0) ;
public abstract  void childDrawableStateChanged (android.view.View arg0) ;
public abstract  boolean onStartNestedScroll (android.view.View arg0,android.view.View arg1,int arg2) ;
public abstract  void onNestedScrollAccepted (android.view.View arg0,android.view.View arg1,int arg2) ;
public abstract  void onStopNestedScroll (android.view.View arg0) ;
public abstract  void onNestedScroll (android.view.View arg0,int arg1,int arg2,int arg3,int arg4) ;
public abstract  void onNestedPreScroll (android.view.View arg0,int arg1,int arg2,[I arg3) ;
public abstract  boolean onNestedFling (android.view.View arg0,float arg1,float arg2,boolean arg3) ;
public abstract  boolean onNestedPreFling (android.view.View arg0,float arg1,float arg2) ;
public abstract  android.view.ViewParent getParent () ;

/*========inner classes========*/

}