package android.view.accessibility;
import android.__Result__;


/*===================================*/ 
/* AccessibilityNodeProvider              */
/*===================================*/

public abstract class AccessibilityNodeProvider {
/*========fields=========*/
public static final  int HOST_VIEW_ID=0;

/*======constructors=====*/
public  AccessibilityNodeProvider () {__Result__.str+="|AccessibilityNodeProvider|";}

/*========methods========*/
public  android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo (int arg0) {__Result__.str+="|createAccessibilityNodeInfo|"; return null;}
public  android.view.accessibility.AccessibilityNodeInfo findFocus (int arg0) {__Result__.str+="|findFocus|"; return null;}
public  boolean performAction (int arg0,int arg1,android.os.Bundle arg2) {__Result__.str+="|performAction|"; return false;}
public  java.util.List findAccessibilityNodeInfosByText (java.lang.String arg0,int arg1) {__Result__.str+="|findAccessibilityNodeInfosByText|"; return null;}

/*========inner classes========*/

}