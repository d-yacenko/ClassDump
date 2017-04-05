package android.view.accessibility;
import android.__Result__;


/*===================================*/ 
/* AccessibilityNodeInfo              */
/*===================================*/

public class AccessibilityNodeInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  int ACTION_ACCESSIBILITY_FOCUS=0;
public static final  java.lang.String ACTION_ARGUMENT_COLUMN_INT=null;
public static final  java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN=null;
public static final  java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING=null;
public static final  java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT=null;
public static final  java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE=null;
public static final  java.lang.String ACTION_ARGUMENT_ROW_INT=null;
public static final  java.lang.String ACTION_ARGUMENT_SELECTION_END_INT=null;
public static final  java.lang.String ACTION_ARGUMENT_SELECTION_START_INT=null;
public static final  java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE=null;
public static final  int ACTION_CLEAR_ACCESSIBILITY_FOCUS=0;
public static final  int ACTION_CLEAR_FOCUS=0;
public static final  int ACTION_CLEAR_SELECTION=0;
public static final  int ACTION_CLICK=0;
public static final  int ACTION_COLLAPSE=0;
public static final  int ACTION_COPY=0;
public static final  int ACTION_CUT=0;
public static final  int ACTION_DISMISS=0;
public static final  int ACTION_EXPAND=0;
public static final  int ACTION_FOCUS=0;
public static final  int ACTION_LONG_CLICK=0;
public static final  int ACTION_NEXT_AT_MOVEMENT_GRANULARITY=0;
public static final  int ACTION_NEXT_HTML_ELEMENT=0;
public static final  int ACTION_PASTE=0;
public static final  int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY=0;
public static final  int ACTION_PREVIOUS_HTML_ELEMENT=0;
public static final  int ACTION_SCROLL_BACKWARD=0;
public static final  int ACTION_SCROLL_FORWARD=0;
public static final  int ACTION_SELECT=0;
public static final  int ACTION_SET_SELECTION=0;
public static final  int ACTION_SET_TEXT=0;
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int FOCUS_ACCESSIBILITY=0;
public static final  int FOCUS_INPUT=0;
public static final  int MOVEMENT_GRANULARITY_CHARACTER=0;
public static final  int MOVEMENT_GRANULARITY_LINE=0;
public static final  int MOVEMENT_GRANULARITY_PAGE=0;
public static final  int MOVEMENT_GRANULARITY_PARAGRAPH=0;
public static final  int MOVEMENT_GRANULARITY_WORD=0;

/*======constructors=====*/


/*========methods========*/
public  void setEnabled (boolean arg0) {__Result__.str+="|setEnabled|"; return ;}
public  java.lang.CharSequence getText () {__Result__.str+="|getText|"; return null;}
public  void setText (java.lang.CharSequence arg0) {__Result__.str+="|setText|"; return ;}
public  void setInputType (int arg0) {__Result__.str+="|setInputType|"; return ;}
public  int getInputType () {__Result__.str+="|getInputType|"; return 0;}
public  java.lang.CharSequence getError () {__Result__.str+="|getError|"; return null;}
public  void setSelected (boolean arg0) {__Result__.str+="|setSelected|"; return ;}
public  java.lang.CharSequence getContentDescription () {__Result__.str+="|getContentDescription|"; return null;}
public  void setContentDescription (java.lang.CharSequence arg0) {__Result__.str+="|setContentDescription|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo getLabelFor () {__Result__.str+="|getLabelFor|"; return null;}
public  void setLabelFor (android.view.View arg0,int arg1) {__Result__.str+="|setLabelFor|"; return ;}
public  void setLabelFor (android.view.View arg0) {__Result__.str+="|setLabelFor|"; return ;}
public  boolean isFocused () {__Result__.str+="|isFocused|"; return false;}
public  android.view.accessibility.AccessibilityNodeInfo findFocus (int arg0) {__Result__.str+="|findFocus|"; return null;}
public  boolean isEnabled () {__Result__.str+="|isEnabled|"; return false;}
public  void setFocusable (boolean arg0) {__Result__.str+="|setFocusable|"; return ;}
public  boolean isClickable () {__Result__.str+="|isClickable|"; return false;}
public  void setClickable (boolean arg0) {__Result__.str+="|setClickable|"; return ;}
public  boolean isLongClickable () {__Result__.str+="|isLongClickable|"; return false;}
public  void setLongClickable (boolean arg0) {__Result__.str+="|setLongClickable|"; return ;}
public  boolean isContextClickable () {__Result__.str+="|isContextClickable|"; return false;}
public  void setContextClickable (boolean arg0) {__Result__.str+="|setContextClickable|"; return ;}
public  boolean isFocusable () {__Result__.str+="|isFocusable|"; return false;}
public  android.view.accessibility.AccessibilityNodeInfo focusSearch (int arg0) {__Result__.str+="|focusSearch|"; return null;}
public  boolean isAccessibilityFocused () {__Result__.str+="|isAccessibilityFocused|"; return false;}
public  void setImportantForAccessibility (boolean arg0) {__Result__.str+="|setImportantForAccessibility|"; return ;}
public  boolean isImportantForAccessibility () {__Result__.str+="|isImportantForAccessibility|"; return false;}
public  int getWindowId () {__Result__.str+="|getWindowId|"; return 0;}
public  boolean isSelected () {__Result__.str+="|isSelected|"; return false;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.CharSequence getPackageName () {__Result__.str+="|getPackageName|"; return null;}
public static  android.view.accessibility.AccessibilityNodeInfo obtain () {__Result__.str+="|obtain|"; return null;}
public static  android.view.accessibility.AccessibilityNodeInfo obtain (android.view.accessibility.AccessibilityNodeInfo arg0) {__Result__.str+="|obtain|"; return null;}
public static  android.view.accessibility.AccessibilityNodeInfo obtain (android.view.View arg0,int arg1) {__Result__.str+="|obtain|"; return null;}
public static  android.view.accessibility.AccessibilityNodeInfo obtain (android.view.View arg0) {__Result__.str+="|obtain|"; return null;}
public  void recycle () {__Result__.str+="|recycle|"; return ;}
public  boolean refresh () {__Result__.str+="|refresh|"; return false;}
public  int getChildCount () {__Result__.str+="|getChildCount|"; return 0;}
public  android.view.accessibility.AccessibilityNodeInfo getChild (int arg0) {__Result__.str+="|getChild|"; return null;}
public  void addChild (android.view.View arg0,int arg1) {__Result__.str+="|addChild|"; return ;}
public  void addChild (android.view.View arg0) {__Result__.str+="|addChild|"; return ;}
public  boolean removeChild (android.view.View arg0,int arg1) {__Result__.str+="|removeChild|"; return false;}
public  boolean removeChild (android.view.View arg0) {__Result__.str+="|removeChild|"; return false;}
public  java.util.List getActionList () {__Result__.str+="|getActionList|"; return null;}
public  void addAction (android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction arg0) {__Result__.str+="|addAction|"; return ;}
public  @java.lang.Deprecated() void addAction (int arg0) {__Result__.str+="|addAction|"; return ;}
public  @java.lang.Deprecated() void removeAction (int arg0) {__Result__.str+="|removeAction|"; return ;}
public  boolean removeAction (android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction arg0) {__Result__.str+="|removeAction|"; return false;}
public  android.view.accessibility.AccessibilityNodeInfo getTraversalBefore () {__Result__.str+="|getTraversalBefore|"; return null;}
public  void setTraversalBefore (android.view.View arg0) {__Result__.str+="|setTraversalBefore|"; return ;}
public  void setTraversalBefore (android.view.View arg0,int arg1) {__Result__.str+="|setTraversalBefore|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo getTraversalAfter () {__Result__.str+="|getTraversalAfter|"; return null;}
public  void setTraversalAfter (android.view.View arg0,int arg1) {__Result__.str+="|setTraversalAfter|"; return ;}
public  void setTraversalAfter (android.view.View arg0) {__Result__.str+="|setTraversalAfter|"; return ;}
public  void setMaxTextLength (int arg0) {__Result__.str+="|setMaxTextLength|"; return ;}
public  int getMaxTextLength () {__Result__.str+="|getMaxTextLength|"; return 0;}
public  void setMovementGranularities (int arg0) {__Result__.str+="|setMovementGranularities|"; return ;}
public  int getMovementGranularities () {__Result__.str+="|getMovementGranularities|"; return 0;}
public  boolean performAction (int arg0) {__Result__.str+="|performAction|"; return false;}
public  boolean performAction (int arg0,android.os.Bundle arg1) {__Result__.str+="|performAction|"; return false;}
public  java.util.List findAccessibilityNodeInfosByText (java.lang.String arg0) {__Result__.str+="|findAccessibilityNodeInfosByText|"; return null;}
public  java.util.List findAccessibilityNodeInfosByViewId (java.lang.String arg0) {__Result__.str+="|findAccessibilityNodeInfosByViewId|"; return null;}
public  android.view.accessibility.AccessibilityWindowInfo getWindow () {__Result__.str+="|getWindow|"; return null;}
public  void getBoundsInParent (android.graphics.Rect arg0) {__Result__.str+="|getBoundsInParent|"; return ;}
public  void setBoundsInParent (android.graphics.Rect arg0) {__Result__.str+="|setBoundsInParent|"; return ;}
public  void getBoundsInScreen (android.graphics.Rect arg0) {__Result__.str+="|getBoundsInScreen|"; return ;}
public  void setBoundsInScreen (android.graphics.Rect arg0) {__Result__.str+="|setBoundsInScreen|"; return ;}
public  boolean isCheckable () {__Result__.str+="|isCheckable|"; return false;}
public  void setCheckable (boolean arg0) {__Result__.str+="|setCheckable|"; return ;}
public  void setFocused (boolean arg0) {__Result__.str+="|setFocused|"; return ;}
public  boolean isVisibleToUser () {__Result__.str+="|isVisibleToUser|"; return false;}
public  void setVisibleToUser (boolean arg0) {__Result__.str+="|setVisibleToUser|"; return ;}
public  void setAccessibilityFocused (boolean arg0) {__Result__.str+="|setAccessibilityFocused|"; return ;}
public  boolean isEditable () {__Result__.str+="|isEditable|"; return false;}
public  void setEditable (boolean arg0) {__Result__.str+="|setEditable|"; return ;}
public  int getDrawingOrder () {__Result__.str+="|getDrawingOrder|"; return 0;}
public  void setDrawingOrder (int arg0) {__Result__.str+="|setDrawingOrder|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo getCollectionInfo () {__Result__.str+="|getCollectionInfo|"; return null;}
public  void setCollectionInfo (android.view.accessibility.AccessibilityNodeInfo$CollectionInfo arg0) {__Result__.str+="|setCollectionInfo|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo getCollectionItemInfo () {__Result__.str+="|getCollectionItemInfo|"; return null;}
public  void setCollectionItemInfo (android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo arg0) {__Result__.str+="|setCollectionItemInfo|"; return ;}
public  void setPackageName (java.lang.CharSequence arg0) {__Result__.str+="|setPackageName|"; return ;}
public  boolean isChecked () {__Result__.str+="|isChecked|"; return false;}
public  void setChecked (boolean arg0) {__Result__.str+="|setChecked|"; return ;}
public  boolean isPassword () {__Result__.str+="|isPassword|"; return false;}
public  void setPassword (boolean arg0) {__Result__.str+="|setPassword|"; return ;}
public  boolean isScrollable () {__Result__.str+="|isScrollable|"; return false;}
public  void setScrollable (boolean arg0) {__Result__.str+="|setScrollable|"; return ;}
public  void setClassName (java.lang.CharSequence arg0) {__Result__.str+="|setClassName|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo$RangeInfo getRangeInfo () {__Result__.str+="|getRangeInfo|"; return null;}
public  void setRangeInfo (android.view.accessibility.AccessibilityNodeInfo$RangeInfo arg0) {__Result__.str+="|setRangeInfo|"; return ;}
public  boolean isContentInvalid () {__Result__.str+="|isContentInvalid|"; return false;}
public  void setContentInvalid (boolean arg0) {__Result__.str+="|setContentInvalid|"; return ;}
public  int getLiveRegion () {__Result__.str+="|getLiveRegion|"; return 0;}
public  void setLiveRegion (int arg0) {__Result__.str+="|setLiveRegion|"; return ;}
public  boolean isMultiLine () {__Result__.str+="|isMultiLine|"; return false;}
public  void setMultiLine (boolean arg0) {__Result__.str+="|setMultiLine|"; return ;}
public  boolean canOpenPopup () {__Result__.str+="|canOpenPopup|"; return false;}
public  void setCanOpenPopup (boolean arg0) {__Result__.str+="|setCanOpenPopup|"; return ;}
public  boolean isDismissable () {__Result__.str+="|isDismissable|"; return false;}
public  void setDismissable (boolean arg0) {__Result__.str+="|setDismissable|"; return ;}
public  void setLabeledBy (android.view.View arg0,int arg1) {__Result__.str+="|setLabeledBy|"; return ;}
public  void setLabeledBy (android.view.View arg0) {__Result__.str+="|setLabeledBy|"; return ;}
public  android.view.accessibility.AccessibilityNodeInfo getLabeledBy () {__Result__.str+="|getLabeledBy|"; return null;}
public  void setViewIdResourceName (java.lang.String arg0) {__Result__.str+="|setViewIdResourceName|"; return ;}
public  java.lang.String getViewIdResourceName () {__Result__.str+="|getViewIdResourceName|"; return null;}
public  int getTextSelectionStart () {__Result__.str+="|getTextSelectionStart|"; return 0;}
public  int getTextSelectionEnd () {__Result__.str+="|getTextSelectionEnd|"; return 0;}
public  void setTextSelection (int arg0,int arg1) {__Result__.str+="|setTextSelection|"; return ;}
public  android.os.Bundle getExtras () {__Result__.str+="|getExtras|"; return null;}
public  void setSource (android.view.View arg0) {__Result__.str+="|setSource|"; return ;}
public  void setSource (android.view.View arg0,int arg1) {__Result__.str+="|setSource|"; return ;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  android.view.accessibility.AccessibilityNodeInfo getParent () {__Result__.str+="|getParent|"; return null;}
public  @java.lang.Deprecated() int getActions () {__Result__.str+="|getActions|"; return 0;}
public  java.lang.CharSequence getClassName () {__Result__.str+="|getClassName|"; return null;}
public  void setParent (android.view.View arg0,int arg1) {__Result__.str+="|setParent|"; return ;}
public  void setParent (android.view.View arg0) {__Result__.str+="|setParent|"; return ;}
public  void setError (java.lang.CharSequence arg0) {__Result__.str+="|setError|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*   CollectionItemInfo              */
/*===================================*/

public static final class CollectionItemInfo {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public  boolean isSelected () {__Result__.str+="|isSelected|"; return false;}
public static  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo obtain (int arg0,int arg1,int arg2,int arg3,boolean arg4,boolean arg5) {__Result__.str+="|obtain|"; return null;}
public static  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo obtain (int arg0,int arg1,int arg2,int arg3,boolean arg4) {__Result__.str+="|obtain|"; return null;}
public  int getColumnIndex () {__Result__.str+="|getColumnIndex|"; return 0;}
public  int getRowIndex () {__Result__.str+="|getRowIndex|"; return 0;}
public  int getColumnSpan () {__Result__.str+="|getColumnSpan|"; return 0;}
public  int getRowSpan () {__Result__.str+="|getRowSpan|"; return 0;}
public  boolean isHeading () {__Result__.str+="|isHeading|"; return false;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*       CollectionInfo              */
/*===================================*/

public static final class CollectionInfo {
/*========fields=========*/
public static final  int SELECTION_MODE_MULTIPLE=0;
public static final  int SELECTION_MODE_NONE=0;
public static final  int SELECTION_MODE_SINGLE=0;

/*======constructors=====*/


/*========methods========*/
public static  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo obtain (int arg0,int arg1,boolean arg2,int arg3) {__Result__.str+="|obtain|"; return null;}
public static  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo obtain (int arg0,int arg1,boolean arg2) {__Result__.str+="|obtain|"; return null;}
public  int getRowCount () {__Result__.str+="|getRowCount|"; return 0;}
public  int getColumnCount () {__Result__.str+="|getColumnCount|"; return 0;}
public  boolean isHierarchical () {__Result__.str+="|isHierarchical|"; return false;}
public  int getSelectionMode () {__Result__.str+="|getSelectionMode|"; return 0;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*            RangeInfo              */
/*===================================*/

public static final class RangeInfo {
/*========fields=========*/
public static final  int RANGE_TYPE_FLOAT=0;
public static final  int RANGE_TYPE_INT=0;
public static final  int RANGE_TYPE_PERCENT=0;

/*======constructors=====*/


/*========methods========*/
public static  android.view.accessibility.AccessibilityNodeInfo$RangeInfo obtain (int arg0,float arg1,float arg2,float arg3) {__Result__.str+="|obtain|"; return null;}
public  float getMin () {__Result__.str+="|getMin|"; return 0f;}
public  float getMax () {__Result__.str+="|getMax|"; return 0f;}
public  float getCurrent () {__Result__.str+="|getCurrent|"; return 0f;}
public  int getType () {__Result__.str+="|getType|"; return 0;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*  AccessibilityAction              */
/*===================================*/

public static final class AccessibilityAction {
/*========fields=========*/
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_ACCESSIBILITY_FOCUS=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_CLEAR_ACCESSIBILITY_FOCUS=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_CLEAR_FOCUS=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_CLEAR_SELECTION=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_CLICK=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_COLLAPSE=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_CONTEXT_CLICK=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_COPY=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_CUT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_DISMISS=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_EXPAND=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_FOCUS=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_LONG_CLICK=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_NEXT_AT_MOVEMENT_GRANULARITY=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_NEXT_HTML_ELEMENT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_PASTE=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_PREVIOUS_HTML_ELEMENT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_BACKWARD=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_DOWN=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_FORWARD=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_LEFT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_RIGHT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_TO_POSITION=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SCROLL_UP=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SELECT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SET_PROGRESS=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SET_SELECTION=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SET_TEXT=null;
public static final  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction ACTION_SHOW_ON_SCREEN=null;

/*======constructors=====*/
public  AccessibilityAction (int arg0,java.lang.CharSequence arg1) {__Result__.str+="|AccessibilityAction|";}

/*========methods========*/
public  java.lang.CharSequence getLabel () {__Result__.str+="|getLabel|"; return null;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  int getId () {__Result__.str+="|getId|"; return 0;}

/*========inner classes========*/

}
}