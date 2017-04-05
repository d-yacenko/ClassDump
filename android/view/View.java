package android.view;
import android.__Result__;


/*===================================*/ 
/*                 View              */
/*===================================*/

public class View implements android.graphics.drawable.Drawable$Callback,android.view.KeyEvent$Callback,android.view.accessibility.AccessibilityEventSource {
/*========fields=========*/
public static final  int ACCESSIBILITY_LIVE_REGION_ASSERTIVE=0;
public static final  int ACCESSIBILITY_LIVE_REGION_NONE=0;
public static final  int ACCESSIBILITY_LIVE_REGION_POLITE=0;
public static final  android.util.Property ALPHA=null;
public static final  int DRAG_FLAG_GLOBAL=0;
public static final  int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION=0;
public static final  int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION=0;
public static final  int DRAG_FLAG_GLOBAL_URI_READ=0;
public static final  int DRAG_FLAG_GLOBAL_URI_WRITE=0;
public static final  int DRAG_FLAG_OPAQUE=0;
public static final  int DRAWING_CACHE_QUALITY_AUTO=0;
public static final  int DRAWING_CACHE_QUALITY_HIGH=0;
public static final  int DRAWING_CACHE_QUALITY_LOW=0;









public static final  int FIND_VIEWS_WITH_CONTENT_DESCRIPTION=0;
public static final  int FIND_VIEWS_WITH_TEXT=0;
public static final  int FOCUSABLES_ALL=0;
public static final  int FOCUSABLES_TOUCH_MODE=0;




public static final  int FOCUS_BACKWARD=0;
public static final  int FOCUS_DOWN=0;
public static final  int FOCUS_FORWARD=0;
public static final  int FOCUS_LEFT=0;
public static final  int FOCUS_RIGHT=0;
public static final  int FOCUS_UP=0;
public static final  int GONE=0;
public static final  int HAPTIC_FEEDBACK_ENABLED=0;
public static final  int IMPORTANT_FOR_ACCESSIBILITY_AUTO=0;
public static final  int IMPORTANT_FOR_ACCESSIBILITY_NO=0;
public static final  int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS=0;
public static final  int IMPORTANT_FOR_ACCESSIBILITY_YES=0;
public static final  int INVISIBLE=0;
public static final  int KEEP_SCREEN_ON=0;
public static final  int LAYER_TYPE_HARDWARE=0;
public static final  int LAYER_TYPE_NONE=0;
public static final  int LAYER_TYPE_SOFTWARE=0;
public static final  int LAYOUT_DIRECTION_INHERIT=0;
public static final  int LAYOUT_DIRECTION_LOCALE=0;
public static final  int LAYOUT_DIRECTION_LTR=0;
public static final  int LAYOUT_DIRECTION_RTL=0;
public static final  int MEASURED_HEIGHT_STATE_SHIFT=0;
public static final  int MEASURED_SIZE_MASK=0;
public static final  int MEASURED_STATE_MASK=0;
public static final  int MEASURED_STATE_TOO_SMALL=0;
public static final  int NO_ID=0;
public static final  int OVER_SCROLL_ALWAYS=0;
public static final  int OVER_SCROLL_IF_CONTENT_SCROLLS=0;
public static final  int OVER_SCROLL_NEVER=0;
















public static final  android.util.Property ROTATION=null;
public static final  android.util.Property ROTATION_X=null;
public static final  android.util.Property ROTATION_Y=null;
public static final  android.util.Property SCALE_X=null;
public static final  android.util.Property SCALE_Y=null;
public static final  int SCREEN_STATE_OFF=0;
public static final  int SCREEN_STATE_ON=0;
public static final  int SCROLLBARS_INSIDE_INSET=0;
public static final  int SCROLLBARS_INSIDE_OVERLAY=0;
public static final  int SCROLLBARS_OUTSIDE_INSET=0;
public static final  int SCROLLBARS_OUTSIDE_OVERLAY=0;
public static final  int SCROLLBAR_POSITION_DEFAULT=0;
public static final  int SCROLLBAR_POSITION_LEFT=0;
public static final  int SCROLLBAR_POSITION_RIGHT=0;
public static final  int SCROLL_AXIS_HORIZONTAL=0;
public static final  int SCROLL_AXIS_NONE=0;
public static final  int SCROLL_AXIS_VERTICAL=0;
public static final  int SCROLL_INDICATOR_BOTTOM=0;
public static final  int SCROLL_INDICATOR_END=0;
public static final  int SCROLL_INDICATOR_LEFT=0;
public static final  int SCROLL_INDICATOR_RIGHT=0;
public static final  int SCROLL_INDICATOR_START=0;
public static final  int SCROLL_INDICATOR_TOP=0;


public static final  int SOUND_EFFECTS_ENABLED=0;
public static final  @java.lang.Deprecated() int STATUS_BAR_HIDDEN=0;
public static final  @java.lang.Deprecated() int STATUS_BAR_VISIBLE=0;
public static final  int SYSTEM_UI_FLAG_FULLSCREEN=0;
public static final  int SYSTEM_UI_FLAG_HIDE_NAVIGATION=0;
public static final  int SYSTEM_UI_FLAG_IMMERSIVE=0;
public static final  int SYSTEM_UI_FLAG_IMMERSIVE_STICKY=0;
public static final  int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN=0;
public static final  int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION=0;
public static final  int SYSTEM_UI_FLAG_LAYOUT_STABLE=0;
public static final  int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR=0;
public static final  int SYSTEM_UI_FLAG_LOW_PROFILE=0;
public static final  int SYSTEM_UI_FLAG_VISIBLE=0;
public static final  int SYSTEM_UI_LAYOUT_FLAGS=0;
public static final  int TEXT_ALIGNMENT_CENTER=0;
public static final  int TEXT_ALIGNMENT_GRAVITY=0;
public static final  int TEXT_ALIGNMENT_INHERIT=0;
public static final  int TEXT_ALIGNMENT_TEXT_END=0;
public static final  int TEXT_ALIGNMENT_TEXT_START=0;
public static final  int TEXT_ALIGNMENT_VIEW_END=0;
public static final  int TEXT_ALIGNMENT_VIEW_START=0;
public static final  int TEXT_DIRECTION_ANY_RTL=0;
public static final  int TEXT_DIRECTION_FIRST_STRONG=0;
public static final  int TEXT_DIRECTION_FIRST_STRONG_LTR=0;
public static final  int TEXT_DIRECTION_FIRST_STRONG_RTL=0;
public static final  int TEXT_DIRECTION_INHERIT=0;
public static final  int TEXT_DIRECTION_LOCALE=0;
public static final  int TEXT_DIRECTION_LTR=0;
public static final  int TEXT_DIRECTION_RTL=0;
public static final  android.util.Property TRANSLATION_X=null;
public static final  android.util.Property TRANSLATION_Y=null;
public static final  android.util.Property TRANSLATION_Z=null;

public static final  int VISIBLE=0;

public static final  android.util.Property X=null;
public static final  android.util.Property Y=null;
public static final  android.util.Property Z=null;

/*======constructors=====*/
public  View (android.content.Context arg0,android.util.AttributeSet arg1,int arg2) {__Result__.str+="|View|";}
public  View (android.content.Context arg0,android.util.AttributeSet arg1) {__Result__.str+="|View|";}
public  View (android.content.Context arg0,android.util.AttributeSet arg1,int arg2,int arg3) {__Result__.str+="|View|";}
public  View (android.content.Context arg0) {__Result__.str+="|View|";}

/*========methods========*/
public  boolean isDirty () {__Result__.str+="|isDirty|"; return false;}
public static  android.view.View inflate (android.content.Context arg0,int arg1,android.view.ViewGroup arg2) {__Result__.str+="|inflate|"; return null;}
public  void setEnabled (boolean arg0) {__Result__.str+="|setEnabled|"; return ;}
public  java.lang.CharSequence getAccessibilityClassName () {__Result__.str+="|getAccessibilityClassName|"; return null;}
public  void setPadding (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|setPadding|"; return ;}
public  void setPaddingRelative (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|setPaddingRelative|"; return ;}


public  void drawableHotspotChanged (float arg0,float arg1) {__Result__.str+="|drawableHotspotChanged|"; return ;}



public  void onScreenStateChanged (int arg0) {__Result__.str+="|onScreenStateChanged|"; return ;}






public  void jumpDrawablesToCurrentState () {__Result__.str+="|jumpDrawablesToCurrentState|"; return ;}
public  void invalidateDrawable (android.graphics.drawable.Drawable arg0) {__Result__.str+="|invalidateDrawable|"; return ;}
public  boolean hasOverlappingRendering () {__Result__.str+="|hasOverlappingRendering|"; return false;}


public  void getFocusedRect (android.graphics.Rect arg0) {__Result__.str+="|getFocusedRect|"; return ;}
public  int getBaseline () {__Result__.str+="|getBaseline|"; return 0;}
public  android.view.PointerIcon onResolvePointerIcon (android.view.MotionEvent arg0,int arg1) {__Result__.str+="|onResolvePointerIcon|"; return null;}
public  boolean onKeyPreIme (int arg0,android.view.KeyEvent arg1) {__Result__.str+="|onKeyPreIme|"; return false;}
public  boolean onKeyDown (int arg0,android.view.KeyEvent arg1) {__Result__.str+="|onKeyDown|"; return false;}
public  boolean onKeyMultiple (int arg0,int arg1,android.view.KeyEvent arg2) {__Result__.str+="|onKeyMultiple|"; return false;}
public  boolean onKeyUp (int arg0,android.view.KeyEvent arg1) {__Result__.str+="|onKeyUp|"; return false;}
public  boolean onCheckIsTextEditor () {__Result__.str+="|onCheckIsTextEditor|"; return false;}
public  android.view.inputmethod.InputConnection onCreateInputConnection (android.view.inputmethod.EditorInfo arg0) {__Result__.str+="|onCreateInputConnection|"; return null;}


public  void computeScroll () {__Result__.str+="|computeScroll|"; return ;}

public  void onWindowFocusChanged (boolean arg0) {__Result__.str+="|onWindowFocusChanged|"; return ;}
public  boolean hasWindowFocus () {__Result__.str+="|hasWindowFocus|"; return false;}

public  void setSelected (boolean arg0) {__Result__.str+="|setSelected|"; return ;}
public  boolean onTouchEvent (android.view.MotionEvent arg0) {__Result__.str+="|onTouchEvent|"; return false;}
public  boolean onGenericMotionEvent (android.view.MotionEvent arg0) {__Result__.str+="|onGenericMotionEvent|"; return false;}

public  boolean showContextMenu (float arg0,float arg1) {__Result__.str+="|showContextMenu|"; return false;}
public  boolean showContextMenu () {__Result__.str+="|showContextMenu|"; return false;}
public  void cancelLongPress () {__Result__.str+="|cancelLongPress|"; return ;}
public  boolean onTrackballEvent (android.view.MotionEvent arg0) {__Result__.str+="|onTrackballEvent|"; return false;}





public  void findViewsWithText (java.util.ArrayList arg0,java.lang.CharSequence arg1,int arg2) {__Result__.str+="|findViewsWithText|"; return ;}
public  boolean onKeyShortcut (int arg0,android.view.KeyEvent arg1) {__Result__.str+="|onKeyShortcut|"; return false;}
public  void onProvideStructure (android.view.ViewStructure arg0) {__Result__.str+="|onProvideStructure|"; return ;}
public  boolean performLongClick (float arg0,float arg1) {__Result__.str+="|performLongClick|"; return false;}
public  boolean performLongClick () {__Result__.str+="|performLongClick|"; return false;}

public  boolean onDragEvent (android.view.DragEvent arg0) {__Result__.str+="|onDragEvent|"; return false;}
public  void onRtlPropertiesChanged (int arg0) {__Result__.str+="|onRtlPropertiesChanged|"; return ;}
public  int getVerticalFadingEdgeLength () {__Result__.str+="|getVerticalFadingEdgeLength|"; return 0;}
public  void setFadingEdgeLength (int arg0) {__Result__.str+="|setFadingEdgeLength|"; return ;}
public  int getHorizontalFadingEdgeLength () {__Result__.str+="|getHorizontalFadingEdgeLength|"; return 0;}
public  int getVerticalScrollbarWidth () {__Result__.str+="|getVerticalScrollbarWidth|"; return 0;}

public  void setVerticalScrollbarPosition (int arg0) {__Result__.str+="|setVerticalScrollbarPosition|"; return ;}
public  int getVerticalScrollbarPosition () {__Result__.str+="|getVerticalScrollbarPosition|"; return 0;}
public  void setScrollIndicators (int arg0) {__Result__.str+="|setScrollIndicators|"; return ;}
public  void setScrollIndicators (int arg0,int arg1) {__Result__.str+="|setScrollIndicators|"; return ;}
public  int getScrollIndicators () {__Result__.str+="|getScrollIndicators|"; return 0;}
public  void setOnScrollChangeListener (android.view.View$OnScrollChangeListener arg0) {__Result__.str+="|setOnScrollChangeListener|"; return ;}
public  void setOnFocusChangeListener (android.view.View$OnFocusChangeListener arg0) {__Result__.str+="|setOnFocusChangeListener|"; return ;}
public  void addOnLayoutChangeListener (android.view.View$OnLayoutChangeListener arg0) {__Result__.str+="|addOnLayoutChangeListener|"; return ;}
public  void removeOnLayoutChangeListener (android.view.View$OnLayoutChangeListener arg0) {__Result__.str+="|removeOnLayoutChangeListener|"; return ;}
public  void addOnAttachStateChangeListener (android.view.View$OnAttachStateChangeListener arg0) {__Result__.str+="|addOnAttachStateChangeListener|"; return ;}
public  void removeOnAttachStateChangeListener (android.view.View$OnAttachStateChangeListener arg0) {__Result__.str+="|removeOnAttachStateChangeListener|"; return ;}
public  android.view.View$OnFocusChangeListener getOnFocusChangeListener () {__Result__.str+="|getOnFocusChangeListener|"; return null;}
public  void setOnClickListener (android.view.View$OnClickListener arg0) {__Result__.str+="|setOnClickListener|"; return ;}
public  boolean hasOnClickListeners () {__Result__.str+="|hasOnClickListeners|"; return false;}
public  void setOnLongClickListener (android.view.View$OnLongClickListener arg0) {__Result__.str+="|setOnLongClickListener|"; return ;}
public  void setOnContextClickListener (android.view.View$OnContextClickListener arg0) {__Result__.str+="|setOnContextClickListener|"; return ;}
public  void setOnCreateContextMenuListener (android.view.View$OnCreateContextMenuListener arg0) {__Result__.str+="|setOnCreateContextMenuListener|"; return ;}
public  boolean performClick () {__Result__.str+="|performClick|"; return false;}
public  boolean callOnClick () {__Result__.str+="|callOnClick|"; return false;}
public  boolean performContextClick (float arg0,float arg1) {__Result__.str+="|performContextClick|"; return false;}
public  boolean performContextClick () {__Result__.str+="|performContextClick|"; return false;}
public  android.view.ActionMode startActionMode (android.view.ActionMode$Callback arg0,int arg1) {__Result__.str+="|startActionMode|"; return null;}
public  android.view.ActionMode startActionMode (android.view.ActionMode$Callback arg0) {__Result__.str+="|startActionMode|"; return null;}
public  void setOnKeyListener (android.view.View$OnKeyListener arg0) {__Result__.str+="|setOnKeyListener|"; return ;}
public  void setOnTouchListener (android.view.View$OnTouchListener arg0) {__Result__.str+="|setOnTouchListener|"; return ;}
public  void setOnGenericMotionListener (android.view.View$OnGenericMotionListener arg0) {__Result__.str+="|setOnGenericMotionListener|"; return ;}
public  void setOnHoverListener (android.view.View$OnHoverListener arg0) {__Result__.str+="|setOnHoverListener|"; return ;}
public  void setOnDragListener (android.view.View$OnDragListener arg0) {__Result__.str+="|setOnDragListener|"; return ;}
public final  void setRevealOnFocusHint (boolean arg0) {__Result__.str+="|setRevealOnFocusHint|"; return ;}
public final  boolean getRevealOnFocusHint () {__Result__.str+="|getRevealOnFocusHint|"; return false;}
public  boolean requestRectangleOnScreen (android.graphics.Rect arg0) {__Result__.str+="|requestRectangleOnScreen|"; return false;}
public  boolean requestRectangleOnScreen (android.graphics.Rect arg0,boolean arg1) {__Result__.str+="|requestRectangleOnScreen|"; return false;}
public  void clearFocus () {__Result__.str+="|clearFocus|"; return ;}
public  boolean hasFocus () {__Result__.str+="|hasFocus|"; return false;}
public  boolean hasFocusable () {__Result__.str+="|hasFocusable|"; return false;}
public  void sendAccessibilityEvent (int arg0) {__Result__.str+="|sendAccessibilityEvent|"; return ;}
public  void announceForAccessibility (java.lang.CharSequence arg0) {__Result__.str+="|announceForAccessibility|"; return ;}
public  void sendAccessibilityEventUnchecked (android.view.accessibility.AccessibilityEvent arg0) {__Result__.str+="|sendAccessibilityEventUnchecked|"; return ;}
public  boolean dispatchPopulateAccessibilityEvent (android.view.accessibility.AccessibilityEvent arg0) {__Result__.str+="|dispatchPopulateAccessibilityEvent|"; return false;}
public  void onPopulateAccessibilityEvent (android.view.accessibility.AccessibilityEvent arg0) {__Result__.str+="|onPopulateAccessibilityEvent|"; return ;}
public  void onInitializeAccessibilityEvent (android.view.accessibility.AccessibilityEvent arg0) {__Result__.str+="|onInitializeAccessibilityEvent|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo () {__Result__.str+="|createAccessibilityNodeInfo|"; return null;}
public  void onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo arg0) {__Result__.str+="|onInitializeAccessibilityNodeInfo|"; return ;}
public  void onProvideVirtualStructure (android.view.ViewStructure arg0) {__Result__.str+="|onProvideVirtualStructure|"; return ;}
public  void dispatchProvideStructure (android.view.ViewStructure arg0) {__Result__.str+="|dispatchProvideStructure|"; return ;}
public  void setAccessibilityDelegate (android.view.View$AccessibilityDelegate arg0) {__Result__.str+="|setAccessibilityDelegate|"; return ;}
public  android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider () {__Result__.str+="|getAccessibilityNodeProvider|"; return null;}
public  java.lang.CharSequence getContentDescription () {__Result__.str+="|getContentDescription|"; return null;}
public  void setContentDescription (java.lang.CharSequence arg0) {__Result__.str+="|setContentDescription|"; return ;}
public  void setAccessibilityTraversalBefore (int arg0) {__Result__.str+="|setAccessibilityTraversalBefore|"; return ;}
public  int getAccessibilityTraversalBefore () {__Result__.str+="|getAccessibilityTraversalBefore|"; return 0;}
public  void setAccessibilityTraversalAfter (int arg0) {__Result__.str+="|setAccessibilityTraversalAfter|"; return ;}
public  int getAccessibilityTraversalAfter () {__Result__.str+="|getAccessibilityTraversalAfter|"; return 0;}
public  int getLabelFor () {__Result__.str+="|getLabelFor|"; return 0;}
public  void setLabelFor (int arg0) {__Result__.str+="|setLabelFor|"; return ;}
public  boolean isFocused () {__Result__.str+="|isFocused|"; return false;}
public  android.view.View findFocus () {__Result__.str+="|findFocus|"; return null;}
public  boolean isScrollContainer () {__Result__.str+="|isScrollContainer|"; return false;}
public  void setScrollContainer (boolean arg0) {__Result__.str+="|setScrollContainer|"; return ;}
public  int getDrawingCacheQuality () {__Result__.str+="|getDrawingCacheQuality|"; return 0;}
public  void setDrawingCacheQuality (int arg0) {__Result__.str+="|setDrawingCacheQuality|"; return ;}
public  boolean getKeepScreenOn () {__Result__.str+="|getKeepScreenOn|"; return false;}
public  void setKeepScreenOn (boolean arg0) {__Result__.str+="|setKeepScreenOn|"; return ;}
public  int getNextFocusLeftId () {__Result__.str+="|getNextFocusLeftId|"; return 0;}
public  void setNextFocusLeftId (int arg0) {__Result__.str+="|setNextFocusLeftId|"; return ;}
public  int getNextFocusRightId () {__Result__.str+="|getNextFocusRightId|"; return 0;}
public  void setNextFocusRightId (int arg0) {__Result__.str+="|setNextFocusRightId|"; return ;}
public  int getNextFocusUpId () {__Result__.str+="|getNextFocusUpId|"; return 0;}
public  void setNextFocusUpId (int arg0) {__Result__.str+="|setNextFocusUpId|"; return ;}
public  int getNextFocusDownId () {__Result__.str+="|getNextFocusDownId|"; return 0;}
public  void setNextFocusDownId (int arg0) {__Result__.str+="|setNextFocusDownId|"; return ;}
public  int getNextFocusForwardId () {__Result__.str+="|getNextFocusForwardId|"; return 0;}
public  void setNextFocusForwardId (int arg0) {__Result__.str+="|setNextFocusForwardId|"; return ;}
public  boolean isShown () {__Result__.str+="|isShown|"; return false;}

public  android.view.WindowInsets onApplyWindowInsets (android.view.WindowInsets arg0) {__Result__.str+="|onApplyWindowInsets|"; return null;}
public  void setOnApplyWindowInsetsListener (android.view.View$OnApplyWindowInsetsListener arg0) {__Result__.str+="|setOnApplyWindowInsetsListener|"; return ;}
public  android.view.WindowInsets dispatchApplyWindowInsets (android.view.WindowInsets arg0) {__Result__.str+="|dispatchApplyWindowInsets|"; return null;}
public  android.view.WindowInsets getRootWindowInsets () {__Result__.str+="|getRootWindowInsets|"; return null;}
public  android.view.WindowInsets computeSystemWindowInsets (android.view.WindowInsets arg0,android.graphics.Rect arg1) {__Result__.str+="|computeSystemWindowInsets|"; return null;}
public  void setFitsSystemWindows (boolean arg0) {__Result__.str+="|setFitsSystemWindows|"; return ;}
public  boolean getFitsSystemWindows () {__Result__.str+="|getFitsSystemWindows|"; return false;}
public  @java.lang.Deprecated() void requestFitSystemWindows () {__Result__.str+="|requestFitSystemWindows|"; return ;}
public  void requestApplyInsets () {__Result__.str+="|requestApplyInsets|"; return ;}
public  int getVisibility () {__Result__.str+="|getVisibility|"; return 0;}
public  void setVisibility (int arg0) {__Result__.str+="|setVisibility|"; return ;}
public  boolean isEnabled () {__Result__.str+="|isEnabled|"; return false;}
public  void setFocusable (boolean arg0) {__Result__.str+="|setFocusable|"; return ;}
public  void setFocusableInTouchMode (boolean arg0) {__Result__.str+="|setFocusableInTouchMode|"; return ;}
public  void setSoundEffectsEnabled (boolean arg0) {__Result__.str+="|setSoundEffectsEnabled|"; return ;}
public  boolean isSoundEffectsEnabled () {__Result__.str+="|isSoundEffectsEnabled|"; return false;}
public  void setHapticFeedbackEnabled (boolean arg0) {__Result__.str+="|setHapticFeedbackEnabled|"; return ;}
public  boolean isHapticFeedbackEnabled () {__Result__.str+="|isHapticFeedbackEnabled|"; return false;}
public  void setLayoutDirection (int arg0) {__Result__.str+="|setLayoutDirection|"; return ;}
public  int getLayoutDirection () {__Result__.str+="|getLayoutDirection|"; return 0;}
public  void layout (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|layout|"; return ;}
public  boolean hasTransientState () {__Result__.str+="|hasTransientState|"; return false;}
public  void setHasTransientState (boolean arg0) {__Result__.str+="|setHasTransientState|"; return ;}
public  boolean isAttachedToWindow () {__Result__.str+="|isAttachedToWindow|"; return false;}
public  boolean isLaidOut () {__Result__.str+="|isLaidOut|"; return false;}
public  void setWillNotDraw (boolean arg0) {__Result__.str+="|setWillNotDraw|"; return ;}
public  boolean willNotDraw () {__Result__.str+="|willNotDraw|"; return false;}
public  void setWillNotCacheDrawing (boolean arg0) {__Result__.str+="|setWillNotCacheDrawing|"; return ;}
public  boolean willNotCacheDrawing () {__Result__.str+="|willNotCacheDrawing|"; return false;}
public  boolean isClickable () {__Result__.str+="|isClickable|"; return false;}
public  void setClickable (boolean arg0) {__Result__.str+="|setClickable|"; return ;}
public  boolean isLongClickable () {__Result__.str+="|isLongClickable|"; return false;}
public  void setLongClickable (boolean arg0) {__Result__.str+="|setLongClickable|"; return ;}
public  boolean isContextClickable () {__Result__.str+="|isContextClickable|"; return false;}
public  void setContextClickable (boolean arg0) {__Result__.str+="|setContextClickable|"; return ;}
public  void setPressed (boolean arg0) {__Result__.str+="|setPressed|"; return ;}

public  boolean isPressed () {__Result__.str+="|isPressed|"; return false;}
public  boolean isSaveEnabled () {__Result__.str+="|isSaveEnabled|"; return false;}
public  void setSaveEnabled (boolean arg0) {__Result__.str+="|setSaveEnabled|"; return ;}
public  boolean getFilterTouchesWhenObscured () {__Result__.str+="|getFilterTouchesWhenObscured|"; return false;}
public  void setFilterTouchesWhenObscured (boolean arg0) {__Result__.str+="|setFilterTouchesWhenObscured|"; return ;}
public  boolean isSaveFromParentEnabled () {__Result__.str+="|isSaveFromParentEnabled|"; return false;}
public  void setSaveFromParentEnabled (boolean arg0) {__Result__.str+="|setSaveFromParentEnabled|"; return ;}
public final  boolean isFocusable () {__Result__.str+="|isFocusable|"; return false;}
public final  boolean isFocusableInTouchMode () {__Result__.str+="|isFocusableInTouchMode|"; return false;}
public  android.view.View focusSearch (int arg0) {__Result__.str+="|focusSearch|"; return null;}
public  boolean dispatchUnhandledMove (android.view.View arg0,int arg1) {__Result__.str+="|dispatchUnhandledMove|"; return false;}
public  java.util.ArrayList getFocusables (int arg0) {__Result__.str+="|getFocusables|"; return null;}
public  void addFocusables (java.util.ArrayList arg0,int arg1,int arg2) {__Result__.str+="|addFocusables|"; return ;}
public  void addFocusables (java.util.ArrayList arg0,int arg1) {__Result__.str+="|addFocusables|"; return ;}
public  java.util.ArrayList getTouchables () {__Result__.str+="|getTouchables|"; return null;}
public  void addTouchables (java.util.ArrayList arg0) {__Result__.str+="|addTouchables|"; return ;}
public  boolean isAccessibilityFocused () {__Result__.str+="|isAccessibilityFocused|"; return false;}
public final  boolean requestFocus (int arg0) {__Result__.str+="|requestFocus|"; return false;}
public  boolean requestFocus (int arg0,android.graphics.Rect arg1) {__Result__.str+="|requestFocus|"; return false;}
public final  boolean requestFocus () {__Result__.str+="|requestFocus|"; return false;}
public final  boolean requestFocusFromTouch () {__Result__.str+="|requestFocusFromTouch|"; return false;}
public  int getImportantForAccessibility () {__Result__.str+="|getImportantForAccessibility|"; return 0;}
public  void setAccessibilityLiveRegion (int arg0) {__Result__.str+="|setAccessibilityLiveRegion|"; return ;}
public  int getAccessibilityLiveRegion () {__Result__.str+="|getAccessibilityLiveRegion|"; return 0;}
public  void setImportantForAccessibility (int arg0) {__Result__.str+="|setImportantForAccessibility|"; return ;}
public  boolean isImportantForAccessibility () {__Result__.str+="|isImportantForAccessibility|"; return false;}
public  android.view.ViewParent getParentForAccessibility () {__Result__.str+="|getParentForAccessibility|"; return null;}
public  void addChildrenForAccessibility (java.util.ArrayList arg0) {__Result__.str+="|addChildrenForAccessibility|"; return ;}
public  boolean dispatchNestedPrePerformAccessibilityAction (int arg0,android.os.Bundle arg1) {__Result__.str+="|dispatchNestedPrePerformAccessibilityAction|"; return false;}
public  boolean performAccessibilityAction (int arg0,android.os.Bundle arg1) {__Result__.str+="|performAccessibilityAction|"; return false;}
public final  boolean isTemporarilyDetached () {__Result__.str+="|isTemporarilyDetached|"; return false;}
public  void dispatchStartTemporaryDetach () {__Result__.str+="|dispatchStartTemporaryDetach|"; return ;}
public  void onStartTemporaryDetach () {__Result__.str+="|onStartTemporaryDetach|"; return ;}
public  void dispatchFinishTemporaryDetach () {__Result__.str+="|dispatchFinishTemporaryDetach|"; return ;}
public  void onFinishTemporaryDetach () {__Result__.str+="|onFinishTemporaryDetach|"; return ;}
public  android.view.KeyEvent$DispatcherState getKeyDispatcherState () {__Result__.str+="|getKeyDispatcherState|"; return null;}
public  boolean dispatchKeyEventPreIme (android.view.KeyEvent arg0) {__Result__.str+="|dispatchKeyEventPreIme|"; return false;}
public  boolean dispatchKeyEvent (android.view.KeyEvent arg0) {__Result__.str+="|dispatchKeyEvent|"; return false;}
public  boolean dispatchKeyShortcutEvent (android.view.KeyEvent arg0) {__Result__.str+="|dispatchKeyShortcutEvent|"; return false;}
public  boolean dispatchTouchEvent (android.view.MotionEvent arg0) {__Result__.str+="|dispatchTouchEvent|"; return false;}
public  boolean onFilterTouchEventForSecurity (android.view.MotionEvent arg0) {__Result__.str+="|onFilterTouchEventForSecurity|"; return false;}
public  boolean dispatchTrackballEvent (android.view.MotionEvent arg0) {__Result__.str+="|dispatchTrackballEvent|"; return false;}
public  boolean dispatchGenericMotionEvent (android.view.MotionEvent arg0) {__Result__.str+="|dispatchGenericMotionEvent|"; return false;}



public  void dispatchWindowFocusChanged (boolean arg0) {__Result__.str+="|dispatchWindowFocusChanged|"; return ;}

public  void dispatchDisplayHint (int arg0) {__Result__.str+="|dispatchDisplayHint|"; return ;}

public  void dispatchWindowVisibilityChanged (int arg0) {__Result__.str+="|dispatchWindowVisibilityChanged|"; return ;}

public  void onVisibilityAggregated (boolean arg0) {__Result__.str+="|onVisibilityAggregated|"; return ;}
public  int getWindowVisibility () {__Result__.str+="|getWindowVisibility|"; return 0;}
public  void getWindowVisibleDisplayFrame (android.graphics.Rect arg0) {__Result__.str+="|getWindowVisibleDisplayFrame|"; return ;}
public  void dispatchConfigurationChanged (android.content.res.Configuration arg0) {__Result__.str+="|dispatchConfigurationChanged|"; return ;}
public  boolean isInTouchMode () {__Result__.str+="|isInTouchMode|"; return false;}
public  boolean onKeyLongPress (int arg0,android.view.KeyEvent arg1) {__Result__.str+="|onKeyLongPress|"; return false;}
public  boolean checkInputConnectionProxy (android.view.View arg0) {__Result__.str+="|checkInputConnectionProxy|"; return false;}
public  void createContextMenu (android.view.ContextMenu arg0) {__Result__.str+="|createContextMenu|"; return ;}

public  boolean onHoverEvent (android.view.MotionEvent arg0) {__Result__.str+="|onHoverEvent|"; return false;}
public  boolean isHovered () {__Result__.str+="|isHovered|"; return false;}
public  void setHovered (boolean arg0) {__Result__.str+="|setHovered|"; return ;}
public  void onHoverChanged (boolean arg0) {__Result__.str+="|onHoverChanged|"; return ;}
public  void setTouchDelegate (android.view.TouchDelegate arg0) {__Result__.str+="|setTouchDelegate|"; return ;}
public  android.view.TouchDelegate getTouchDelegate () {__Result__.str+="|getTouchDelegate|"; return null;}
public final  void requestUnbufferedDispatch (android.view.MotionEvent arg0) {__Result__.str+="|requestUnbufferedDispatch|"; return ;}
public  void bringToFront () {__Result__.str+="|bringToFront|"; return ;}


public  void setScrollX (int arg0) {__Result__.str+="|setScrollX|"; return ;}
public  void setScrollY (int arg0) {__Result__.str+="|setScrollY|"; return ;}
public final  int getScrollX () {__Result__.str+="|getScrollX|"; return 0;}
public final  int getScrollY () {__Result__.str+="|getScrollY|"; return 0;}
public final  int getWidth () {__Result__.str+="|getWidth|"; return 0;}
public final  int getHeight () {__Result__.str+="|getHeight|"; return 0;}
public  void getDrawingRect (android.graphics.Rect arg0) {__Result__.str+="|getDrawingRect|"; return ;}
public final  int getMeasuredWidth () {__Result__.str+="|getMeasuredWidth|"; return 0;}
public final  int getMeasuredWidthAndState () {__Result__.str+="|getMeasuredWidthAndState|"; return 0;}
public final  int getMeasuredHeight () {__Result__.str+="|getMeasuredHeight|"; return 0;}
public final  int getMeasuredHeightAndState () {__Result__.str+="|getMeasuredHeightAndState|"; return 0;}
public final  int getMeasuredState () {__Result__.str+="|getMeasuredState|"; return 0;}
public  android.graphics.Matrix getMatrix () {__Result__.str+="|getMatrix|"; return null;}
public  float getCameraDistance () {__Result__.str+="|getCameraDistance|"; return 0f;}
public  void setCameraDistance (float arg0) {__Result__.str+="|setCameraDistance|"; return ;}
public  float getRotation () {__Result__.str+="|getRotation|"; return 0f;}
public  void setRotation (float arg0) {__Result__.str+="|setRotation|"; return ;}
public  float getRotationY () {__Result__.str+="|getRotationY|"; return 0f;}
public  void setRotationY (float arg0) {__Result__.str+="|setRotationY|"; return ;}
public  float getRotationX () {__Result__.str+="|getRotationX|"; return 0f;}
public  void setRotationX (float arg0) {__Result__.str+="|setRotationX|"; return ;}
public  float getScaleX () {__Result__.str+="|getScaleX|"; return 0f;}
public  void setScaleX (float arg0) {__Result__.str+="|setScaleX|"; return ;}
public  float getScaleY () {__Result__.str+="|getScaleY|"; return 0f;}
public  void setScaleY (float arg0) {__Result__.str+="|setScaleY|"; return ;}
public  float getPivotX () {__Result__.str+="|getPivotX|"; return 0f;}
public  void setPivotX (float arg0) {__Result__.str+="|setPivotX|"; return ;}
public  float getPivotY () {__Result__.str+="|getPivotY|"; return 0f;}
public  void setPivotY (float arg0) {__Result__.str+="|setPivotY|"; return ;}
public  float getAlpha () {__Result__.str+="|getAlpha|"; return 0f;}
public  void forceHasOverlappingRendering (boolean arg0) {__Result__.str+="|forceHasOverlappingRendering|"; return ;}
public final  boolean getHasOverlappingRendering () {__Result__.str+="|getHasOverlappingRendering|"; return false;}
public  void setAlpha (float arg0) {__Result__.str+="|setAlpha|"; return ;}
public final  @android.view.ViewDebug$CapturedViewProperty(retrieveReturn=false) int getTop () {__Result__.str+="|getTop|"; return 0;}
public final  void setTop (int arg0) {__Result__.str+="|setTop|"; return ;}
public final  @android.view.ViewDebug$CapturedViewProperty(retrieveReturn=false) int getBottom () {__Result__.str+="|getBottom|"; return 0;}
public final  void setBottom (int arg0) {__Result__.str+="|setBottom|"; return ;}
public final  @android.view.ViewDebug$CapturedViewProperty(retrieveReturn=false) int getLeft () {__Result__.str+="|getLeft|"; return 0;}
public final  void setLeft (int arg0) {__Result__.str+="|setLeft|"; return ;}
public final  @android.view.ViewDebug$CapturedViewProperty(retrieveReturn=false) int getRight () {__Result__.str+="|getRight|"; return 0;}
public final  void setRight (int arg0) {__Result__.str+="|setRight|"; return ;}
public  float getX () {__Result__.str+="|getX|"; return 0f;}
public  void setX (float arg0) {__Result__.str+="|setX|"; return ;}
public  float getY () {__Result__.str+="|getY|"; return 0f;}
public  void setY (float arg0) {__Result__.str+="|setY|"; return ;}
public  float getZ () {__Result__.str+="|getZ|"; return 0f;}
public  void setZ (float arg0) {__Result__.str+="|setZ|"; return ;}
public  float getElevation () {__Result__.str+="|getElevation|"; return 0f;}
public  void setElevation (float arg0) {__Result__.str+="|setElevation|"; return ;}
public  float getTranslationX () {__Result__.str+="|getTranslationX|"; return 0f;}
public  void setTranslationX (float arg0) {__Result__.str+="|setTranslationX|"; return ;}
public  float getTranslationY () {__Result__.str+="|getTranslationY|"; return 0f;}
public  void setTranslationY (float arg0) {__Result__.str+="|setTranslationY|"; return ;}
public  float getTranslationZ () {__Result__.str+="|getTranslationZ|"; return 0f;}
public  void setTranslationZ (float arg0) {__Result__.str+="|setTranslationZ|"; return ;}
public  android.animation.StateListAnimator getStateListAnimator () {__Result__.str+="|getStateListAnimator|"; return null;}
public  void setStateListAnimator (android.animation.StateListAnimator arg0) {__Result__.str+="|setStateListAnimator|"; return ;}
public final  boolean getClipToOutline () {__Result__.str+="|getClipToOutline|"; return false;}
public  void setClipToOutline (boolean arg0) {__Result__.str+="|setClipToOutline|"; return ;}
public  void setOutlineProvider (android.view.ViewOutlineProvider arg0) {__Result__.str+="|setOutlineProvider|"; return ;}
public  android.view.ViewOutlineProvider getOutlineProvider () {__Result__.str+="|getOutlineProvider|"; return null;}
public  void invalidateOutline () {__Result__.str+="|invalidateOutline|"; return ;}
public  void getHitRect (android.graphics.Rect arg0) {__Result__.str+="|getHitRect|"; return ;}
public final  boolean getGlobalVisibleRect (android.graphics.Rect arg0) {__Result__.str+="|getGlobalVisibleRect|"; return false;}
public  boolean getGlobalVisibleRect (android.graphics.Rect arg0,android.graphics.Point arg1) {__Result__.str+="|getGlobalVisibleRect|"; return false;}
public final  boolean getLocalVisibleRect (android.graphics.Rect arg0) {__Result__.str+="|getLocalVisibleRect|"; return false;}
public  void offsetTopAndBottom (int arg0) {__Result__.str+="|offsetTopAndBottom|"; return ;}
public  void offsetLeftAndRight (int arg0) {__Result__.str+="|offsetLeftAndRight|"; return ;}
public  android.view.ViewGroup$LayoutParams getLayoutParams () {__Result__.str+="|getLayoutParams|"; return null;}
public  void setLayoutParams (android.view.ViewGroup$LayoutParams arg0) {__Result__.str+="|setLayoutParams|"; return ;}
public  void scrollTo (int arg0,int arg1) {__Result__.str+="|scrollTo|"; return ;}
public  void scrollBy (int arg0,int arg1) {__Result__.str+="|scrollBy|"; return ;}



public  void invalidate (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|invalidate|"; return ;}
public  void invalidate (android.graphics.Rect arg0) {__Result__.str+="|invalidate|"; return ;}
public  void invalidate () {__Result__.str+="|invalidate|"; return ;}
public  boolean post (java.lang.Runnable arg0) {__Result__.str+="|post|"; return false;}
public  boolean postDelayed (java.lang.Runnable arg0,long arg1) {__Result__.str+="|postDelayed|"; return false;}
public  void postOnAnimation (java.lang.Runnable arg0) {__Result__.str+="|postOnAnimation|"; return ;}
public  void postOnAnimationDelayed (java.lang.Runnable arg0,long arg1) {__Result__.str+="|postOnAnimationDelayed|"; return ;}
public  boolean removeCallbacks (java.lang.Runnable arg0) {__Result__.str+="|removeCallbacks|"; return false;}
public  void postInvalidate () {__Result__.str+="|postInvalidate|"; return ;}
public  void postInvalidate (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|postInvalidate|"; return ;}
public  void postInvalidateDelayed (long arg0,int arg1,int arg2,int arg3,int arg4) {__Result__.str+="|postInvalidateDelayed|"; return ;}
public  void postInvalidateDelayed (long arg0) {__Result__.str+="|postInvalidateDelayed|"; return ;}
public  void postInvalidateOnAnimation (int arg0,int arg1,int arg2,int arg3) {__Result__.str+="|postInvalidateOnAnimation|"; return ;}
public  void postInvalidateOnAnimation () {__Result__.str+="|postInvalidateOnAnimation|"; return ;}
public  boolean isHorizontalFadingEdgeEnabled () {__Result__.str+="|isHorizontalFadingEdgeEnabled|"; return false;}
public  void setHorizontalFadingEdgeEnabled (boolean arg0) {__Result__.str+="|setHorizontalFadingEdgeEnabled|"; return ;}
public  boolean isVerticalFadingEdgeEnabled () {__Result__.str+="|isVerticalFadingEdgeEnabled|"; return false;}
public  void setVerticalFadingEdgeEnabled (boolean arg0) {__Result__.str+="|setVerticalFadingEdgeEnabled|"; return ;}


public  boolean isHorizontalScrollBarEnabled () {__Result__.str+="|isHorizontalScrollBarEnabled|"; return false;}
public  void setHorizontalScrollBarEnabled (boolean arg0) {__Result__.str+="|setHorizontalScrollBarEnabled|"; return ;}
public  boolean isVerticalScrollBarEnabled () {__Result__.str+="|isVerticalScrollBarEnabled|"; return false;}
public  void setVerticalScrollBarEnabled (boolean arg0) {__Result__.str+="|setVerticalScrollBarEnabled|"; return ;}
public  void setScrollbarFadingEnabled (boolean arg0) {__Result__.str+="|setScrollbarFadingEnabled|"; return ;}
public  boolean isScrollbarFadingEnabled () {__Result__.str+="|isScrollbarFadingEnabled|"; return false;}
public  int getScrollBarDefaultDelayBeforeFade () {__Result__.str+="|getScrollBarDefaultDelayBeforeFade|"; return 0;}
public  void setScrollBarDefaultDelayBeforeFade (int arg0) {__Result__.str+="|setScrollBarDefaultDelayBeforeFade|"; return ;}
public  int getScrollBarFadeDuration () {__Result__.str+="|getScrollBarFadeDuration|"; return 0;}
public  void setScrollBarFadeDuration (int arg0) {__Result__.str+="|setScrollBarFadeDuration|"; return ;}
public  int getScrollBarSize () {__Result__.str+="|getScrollBarSize|"; return 0;}
public  void setScrollBarSize (int arg0) {__Result__.str+="|setScrollBarSize|"; return ;}
public  void setScrollBarStyle (int arg0) {__Result__.str+="|setScrollBarStyle|"; return ;}
public  int getScrollBarStyle () {__Result__.str+="|getScrollBarStyle|"; return 0;}



public  boolean canScrollHorizontally (int arg0) {__Result__.str+="|canScrollHorizontally|"; return false;}
public  boolean canScrollVertically (int arg0) {__Result__.str+="|canScrollVertically|"; return false;}

public  boolean canResolveLayoutDirection () {__Result__.str+="|canResolveLayoutDirection|"; return false;}
public  boolean isLayoutDirectionResolved () {__Result__.str+="|isLayoutDirectionResolved|"; return false;}


public  android.os.IBinder getWindowToken () {__Result__.str+="|getWindowToken|"; return null;}
public  android.view.WindowId getWindowId () {__Result__.str+="|getWindowId|"; return null;}
public  android.os.IBinder getApplicationWindowToken () {__Result__.str+="|getApplicationWindowToken|"; return null;}
public  android.view.Display getDisplay () {__Result__.str+="|getDisplay|"; return null;}
public final  void cancelPendingInputEvents () {__Result__.str+="|cancelPendingInputEvents|"; return ;}
public  void onCancelPendingInputEvents () {__Result__.str+="|onCancelPendingInputEvents|"; return ;}
public  void saveHierarchyState (android.util.SparseArray arg0) {__Result__.str+="|saveHierarchyState|"; return ;}

public  void restoreHierarchyState (android.util.SparseArray arg0) {__Result__.str+="|restoreHierarchyState|"; return ;}

public  long getDrawingTime () {__Result__.str+="|getDrawingTime|"; return 0;}
public  void setDuplicateParentStateEnabled (boolean arg0) {__Result__.str+="|setDuplicateParentStateEnabled|"; return ;}
public  boolean isDuplicateParentStateEnabled () {__Result__.str+="|isDuplicateParentStateEnabled|"; return false;}
public  void setLayerType (int arg0,android.graphics.Paint arg1) {__Result__.str+="|setLayerType|"; return ;}
public  void setLayerPaint (android.graphics.Paint arg0) {__Result__.str+="|setLayerPaint|"; return ;}
public  int getLayerType () {__Result__.str+="|getLayerType|"; return 0;}
public  void buildLayer () {__Result__.str+="|buildLayer|"; return ;}
public  void setDrawingCacheEnabled (boolean arg0) {__Result__.str+="|setDrawingCacheEnabled|"; return ;}
public  boolean isDrawingCacheEnabled () {__Result__.str+="|isDrawingCacheEnabled|"; return false;}
public  android.graphics.Bitmap getDrawingCache () {__Result__.str+="|getDrawingCache|"; return null;}
public  android.graphics.Bitmap getDrawingCache (boolean arg0) {__Result__.str+="|getDrawingCache|"; return null;}
public  void destroyDrawingCache () {__Result__.str+="|destroyDrawingCache|"; return ;}
public  void setDrawingCacheBackgroundColor (int arg0) {__Result__.str+="|setDrawingCacheBackgroundColor|"; return ;}
public  int getDrawingCacheBackgroundColor () {__Result__.str+="|getDrawingCacheBackgroundColor|"; return 0;}
public  void buildDrawingCache (boolean arg0) {__Result__.str+="|buildDrawingCache|"; return ;}
public  void buildDrawingCache () {__Result__.str+="|buildDrawingCache|"; return ;}
public  boolean isInEditMode () {__Result__.str+="|isInEditMode|"; return false;}
public  boolean isHardwareAccelerated () {__Result__.str+="|isHardwareAccelerated|"; return false;}
public  void setClipBounds (android.graphics.Rect arg0) {__Result__.str+="|setClipBounds|"; return ;}
public  boolean getClipBounds (android.graphics.Rect arg0) {__Result__.str+="|getClipBounds|"; return false;}
public  android.graphics.Rect getClipBounds () {__Result__.str+="|getClipBounds|"; return null;}
public  void draw (android.graphics.Canvas arg0) {__Result__.str+="|draw|"; return ;}
public  android.view.ViewOverlay getOverlay () {__Result__.str+="|getOverlay|"; return null;}
public  int getSolidColor () {__Result__.str+="|getSolidColor|"; return 0;}
public  boolean isLayoutRequested () {__Result__.str+="|isLayoutRequested|"; return false;}

public  void scheduleDrawable (android.graphics.drawable.Drawable arg0,java.lang.Runnable arg1,long arg2) {__Result__.str+="|scheduleDrawable|"; return ;}
public  void unscheduleDrawable (android.graphics.drawable.Drawable arg0) {__Result__.str+="|unscheduleDrawable|"; return ;}
public  void unscheduleDrawable (android.graphics.drawable.Drawable arg0,java.lang.Runnable arg1) {__Result__.str+="|unscheduleDrawable|"; return ;}
public  void dispatchDrawableHotspotChanged (float arg0,float arg1) {__Result__.str+="|dispatchDrawableHotspotChanged|"; return ;}
public  void refreshDrawableState () {__Result__.str+="|refreshDrawableState|"; return ;}
public final  [I getDrawableState () {__Result__.str+="|getDrawableState|"; return null;}

public  void setBackgroundColor (int arg0) {__Result__.str+="|setBackgroundColor|"; return ;}
public  void setBackgroundResource (int arg0) {__Result__.str+="|setBackgroundResource|"; return ;}
public  void setBackground (android.graphics.drawable.Drawable arg0) {__Result__.str+="|setBackground|"; return ;}
public  @java.lang.Deprecated() void setBackgroundDrawable (android.graphics.drawable.Drawable arg0) {__Result__.str+="|setBackgroundDrawable|"; return ;}
public  android.graphics.drawable.Drawable getBackground () {__Result__.str+="|getBackground|"; return null;}
public  void setBackgroundTintList (android.content.res.ColorStateList arg0) {__Result__.str+="|setBackgroundTintList|"; return ;}
public  android.content.res.ColorStateList getBackgroundTintList () {__Result__.str+="|getBackgroundTintList|"; return null;}
public  void setBackgroundTintMode (android.graphics.PorterDuff$Mode arg0) {__Result__.str+="|setBackgroundTintMode|"; return ;}
public  android.graphics.PorterDuff$Mode getBackgroundTintMode () {__Result__.str+="|getBackgroundTintMode|"; return null;}
public  android.graphics.drawable.Drawable getForeground () {__Result__.str+="|getForeground|"; return null;}
public  void setForeground (android.graphics.drawable.Drawable arg0) {__Result__.str+="|setForeground|"; return ;}
public  int getForegroundGravity () {__Result__.str+="|getForegroundGravity|"; return 0;}
public  void setForegroundGravity (int arg0) {__Result__.str+="|setForegroundGravity|"; return ;}
public  void setForegroundTintList (android.content.res.ColorStateList arg0) {__Result__.str+="|setForegroundTintList|"; return ;}
public  android.content.res.ColorStateList getForegroundTintList () {__Result__.str+="|getForegroundTintList|"; return null;}
public  void setForegroundTintMode (android.graphics.PorterDuff$Mode arg0) {__Result__.str+="|setForegroundTintMode|"; return ;}
public  android.graphics.PorterDuff$Mode getForegroundTintMode () {__Result__.str+="|getForegroundTintMode|"; return null;}
public  void onDrawForeground (android.graphics.Canvas arg0) {__Result__.str+="|onDrawForeground|"; return ;}
public  int getPaddingTop () {__Result__.str+="|getPaddingTop|"; return 0;}
public  int getPaddingBottom () {__Result__.str+="|getPaddingBottom|"; return 0;}
public  int getPaddingLeft () {__Result__.str+="|getPaddingLeft|"; return 0;}
public  int getPaddingStart () {__Result__.str+="|getPaddingStart|"; return 0;}
public  int getPaddingRight () {__Result__.str+="|getPaddingRight|"; return 0;}
public  int getPaddingEnd () {__Result__.str+="|getPaddingEnd|"; return 0;}
public  boolean isPaddingRelative () {__Result__.str+="|isPaddingRelative|"; return false;}

public  boolean isSelected () {__Result__.str+="|isSelected|"; return false;}
public  void setActivated (boolean arg0) {__Result__.str+="|setActivated|"; return ;}

public  boolean isActivated () {__Result__.str+="|isActivated|"; return false;}
public  android.view.ViewTreeObserver getViewTreeObserver () {__Result__.str+="|getViewTreeObserver|"; return null;}
public  android.view.View getRootView () {__Result__.str+="|getRootView|"; return null;}
public  void getLocationOnScreen ([I arg0) {__Result__.str+="|getLocationOnScreen|"; return ;}
public  void getLocationInWindow ([I arg0) {__Result__.str+="|getLocationInWindow|"; return ;}
public final  android.view.View findViewById (int arg0) {__Result__.str+="|findViewById|"; return null;}
public final  android.view.View findViewWithTag (java.lang.Object arg0) {__Result__.str+="|findViewWithTag|"; return null;}
public  void setId (int arg0) {__Result__.str+="|setId|"; return ;}
public  java.lang.Object getTag () {__Result__.str+="|getTag|"; return null;}
public  java.lang.Object getTag (int arg0) {__Result__.str+="|getTag|"; return null;}
public  void setTag (int arg0,java.lang.Object arg1) {__Result__.str+="|setTag|"; return ;}
public  void setTag (java.lang.Object arg0) {__Result__.str+="|setTag|"; return ;}
public  boolean isInLayout () {__Result__.str+="|isInLayout|"; return false;}
public  void requestLayout () {__Result__.str+="|requestLayout|"; return ;}
public  void forceLayout () {__Result__.str+="|forceLayout|"; return ;}
public final  void measure (int arg0,int arg1) {__Result__.str+="|measure|"; return ;}

public static  int combineMeasuredStates (int arg0,int arg1) {__Result__.str+="|combineMeasuredStates|"; return 0;}
public static  int resolveSize (int arg0,int arg1) {__Result__.str+="|resolveSize|"; return 0;}
public static  int resolveSizeAndState (int arg0,int arg1,int arg2) {__Result__.str+="|resolveSizeAndState|"; return 0;}
public static  int getDefaultSize (int arg0,int arg1) {__Result__.str+="|getDefaultSize|"; return 0;}


public  int getMinimumHeight () {__Result__.str+="|getMinimumHeight|"; return 0;}
public  void setMinimumHeight (int arg0) {__Result__.str+="|setMinimumHeight|"; return ;}
public  int getMinimumWidth () {__Result__.str+="|getMinimumWidth|"; return 0;}
public  void setMinimumWidth (int arg0) {__Result__.str+="|setMinimumWidth|"; return ;}
public  android.view.animation.Animation getAnimation () {__Result__.str+="|getAnimation|"; return null;}
public  void startAnimation (android.view.animation.Animation arg0) {__Result__.str+="|startAnimation|"; return ;}
public  void clearAnimation () {__Result__.str+="|clearAnimation|"; return ;}
public  void setAnimation (android.view.animation.Animation arg0) {__Result__.str+="|setAnimation|"; return ;}



public  void playSoundEffect (int arg0) {__Result__.str+="|playSoundEffect|"; return ;}
public  boolean performHapticFeedback (int arg0) {__Result__.str+="|performHapticFeedback|"; return false;}
public  boolean performHapticFeedback (int arg0,int arg1) {__Result__.str+="|performHapticFeedback|"; return false;}
public  void setSystemUiVisibility (int arg0) {__Result__.str+="|setSystemUiVisibility|"; return ;}
public  int getSystemUiVisibility () {__Result__.str+="|getSystemUiVisibility|"; return 0;}
public  int getWindowSystemUiVisibility () {__Result__.str+="|getWindowSystemUiVisibility|"; return 0;}
public  void onWindowSystemUiVisibilityChanged (int arg0) {__Result__.str+="|onWindowSystemUiVisibilityChanged|"; return ;}
public  void dispatchWindowSystemUiVisiblityChanged (int arg0) {__Result__.str+="|dispatchWindowSystemUiVisiblityChanged|"; return ;}
public  void setOnSystemUiVisibilityChangeListener (android.view.View$OnSystemUiVisibilityChangeListener arg0) {__Result__.str+="|setOnSystemUiVisibilityChangeListener|"; return ;}
public  void dispatchSystemUiVisibilityChanged (int arg0) {__Result__.str+="|dispatchSystemUiVisibilityChanged|"; return ;}
public final  @java.lang.Deprecated() boolean startDrag (android.content.ClipData arg0,android.view.View$DragShadowBuilder arg1,java.lang.Object arg2,int arg3) {__Result__.str+="|startDrag|"; return false;}
public final  boolean startDragAndDrop (android.content.ClipData arg0,android.view.View$DragShadowBuilder arg1,java.lang.Object arg2,int arg3) {__Result__.str+="|startDragAndDrop|"; return false;}
public final  void cancelDragAndDrop () {__Result__.str+="|cancelDragAndDrop|"; return ;}
public final  void updateDragShadow (android.view.View$DragShadowBuilder arg0) {__Result__.str+="|updateDragShadow|"; return ;}
public  boolean dispatchDragEvent (android.view.DragEvent arg0) {__Result__.str+="|dispatchDragEvent|"; return false;}


public  int getOverScrollMode () {__Result__.str+="|getOverScrollMode|"; return 0;}
public  void setOverScrollMode (int arg0) {__Result__.str+="|setOverScrollMode|"; return ;}
public  void setNestedScrollingEnabled (boolean arg0) {__Result__.str+="|setNestedScrollingEnabled|"; return ;}
public  boolean isNestedScrollingEnabled () {__Result__.str+="|isNestedScrollingEnabled|"; return false;}
public  boolean startNestedScroll (int arg0) {__Result__.str+="|startNestedScroll|"; return false;}
public  void stopNestedScroll () {__Result__.str+="|stopNestedScroll|"; return ;}
public  boolean hasNestedScrollingParent () {__Result__.str+="|hasNestedScrollingParent|"; return false;}
public  boolean dispatchNestedScroll (int arg0,int arg1,int arg2,int arg3,[I arg4) {__Result__.str+="|dispatchNestedScroll|"; return false;}
public  boolean dispatchNestedPreScroll (int arg0,int arg1,[I arg2,[I arg3) {__Result__.str+="|dispatchNestedPreScroll|"; return false;}
public  boolean dispatchNestedFling (float arg0,float arg1,boolean arg2) {__Result__.str+="|dispatchNestedFling|"; return false;}
public  boolean dispatchNestedPreFling (float arg0,float arg1) {__Result__.str+="|dispatchNestedPreFling|"; return false;}
public  void setTextDirection (int arg0) {__Result__.str+="|setTextDirection|"; return ;}
public  int getTextDirection () {__Result__.str+="|getTextDirection|"; return 0;}
public  boolean canResolveTextDirection () {__Result__.str+="|canResolveTextDirection|"; return false;}
public  boolean isTextDirectionResolved () {__Result__.str+="|isTextDirectionResolved|"; return false;}
public  void setTextAlignment (int arg0) {__Result__.str+="|setTextAlignment|"; return ;}
public  int getTextAlignment () {__Result__.str+="|getTextAlignment|"; return 0;}
public  boolean canResolveTextAlignment () {__Result__.str+="|canResolveTextAlignment|"; return false;}
public  boolean isTextAlignmentResolved () {__Result__.str+="|isTextAlignmentResolved|"; return false;}
public static  int generateViewId () {__Result__.str+="|generateViewId|"; return 0;}
public  void setPointerIcon (android.view.PointerIcon arg0) {__Result__.str+="|setPointerIcon|"; return ;}
public  android.view.PointerIcon getPointerIcon () {__Result__.str+="|getPointerIcon|"; return null;}
public  android.view.ViewPropertyAnimator animate () {__Result__.str+="|animate|"; return null;}
public final  void setTransitionName (java.lang.String arg0) {__Result__.str+="|setTransitionName|"; return ;}
public  java.lang.String getTransitionName () {__Result__.str+="|getTransitionName|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public final  android.view.ViewParent getParent () {__Result__.str+="|getParent|"; return null;}
public  android.content.res.Resources getResources () {__Result__.str+="|getResources|"; return null;}
public final  @android.view.ViewDebug$CapturedViewProperty(retrieveReturn=false) android.content.Context getContext () {__Result__.str+="|getContext|"; return null;}
public  @android.view.ViewDebug$CapturedViewProperty(retrieveReturn=false) int getId () {__Result__.str+="|getId|"; return 0;}
public  boolean isOpaque () {__Result__.str+="|isOpaque|"; return false;}
public  android.os.Handler getHandler () {__Result__.str+="|getHandler|"; return null;}

/*========inner classes========*/
import android.__Result__;


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