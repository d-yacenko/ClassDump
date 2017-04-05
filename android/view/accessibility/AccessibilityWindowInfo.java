package android.view.accessibility;
import android.__Result__;


/*===================================*/ 
/* AccessibilityWindowInfo              */
/*===================================*/

public final class AccessibilityWindowInfo implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int TYPE_ACCESSIBILITY_OVERLAY=0;
public static final  int TYPE_APPLICATION=0;
public static final  int TYPE_INPUT_METHOD=0;
public static final  int TYPE_SPLIT_SCREEN_DIVIDER=0;
public static final  int TYPE_SYSTEM=0;

/*======constructors=====*/


/*========methods========*/
public  boolean isFocused () {__Result__.str+="|isFocused|"; return false;}
public  boolean isAccessibilityFocused () {__Result__.str+="|isAccessibilityFocused|"; return false;}
public  java.lang.CharSequence getTitle () {__Result__.str+="|getTitle|"; return null;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public static  android.view.accessibility.AccessibilityWindowInfo obtain (android.view.accessibility.AccessibilityWindowInfo arg0) {__Result__.str+="|obtain|"; return null;}
public static  android.view.accessibility.AccessibilityWindowInfo obtain () {__Result__.str+="|obtain|"; return null;}
public  void recycle () {__Result__.str+="|recycle|"; return ;}
public  int getChildCount () {__Result__.str+="|getChildCount|"; return 0;}
public  android.view.accessibility.AccessibilityWindowInfo getChild (int arg0) {__Result__.str+="|getChild|"; return null;}
public  void getBoundsInScreen (android.graphics.Rect arg0) {__Result__.str+="|getBoundsInScreen|"; return ;}
public  int getLayer () {__Result__.str+="|getLayer|"; return 0;}
public  android.view.accessibility.AccessibilityNodeInfo getAnchor () {__Result__.str+="|getAnchor|"; return null;}
public  boolean isActive () {__Result__.str+="|isActive|"; return false;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  android.view.accessibility.AccessibilityWindowInfo getParent () {__Result__.str+="|getParent|"; return null;}
public  int getId () {__Result__.str+="|getId|"; return 0;}
public  int getType () {__Result__.str+="|getType|"; return 0;}
public  android.view.accessibility.AccessibilityNodeInfo getRoot () {__Result__.str+="|getRoot|"; return null;}

/*========inner classes========*/

}