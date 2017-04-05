package android.view;
import android.__Result__;


/*===================================*/ 
/*       ActionProvider              */
/*===================================*/

public abstract class ActionProvider {
/*========fields=========*/

/*======constructors=====*/
public  ActionProvider (android.content.Context arg0) {__Result__.str+="|ActionProvider|";}

/*========methods========*/
public  boolean isVisible () {__Result__.str+="|isVisible|"; return false;}
public  android.view.View onCreateActionView (android.view.MenuItem arg0) {__Result__.str+="|onCreateActionView|"; return null;}
public abstract  @java.lang.Deprecated() android.view.View onCreateActionView () ;
public  void onPrepareSubMenu (android.view.SubMenu arg0) {__Result__.str+="|onPrepareSubMenu|"; return ;}
public  boolean overridesItemVisibility () {__Result__.str+="|overridesItemVisibility|"; return false;}
public  boolean hasSubMenu () {__Result__.str+="|hasSubMenu|"; return false;}
public  void refreshVisibility () {__Result__.str+="|refreshVisibility|"; return ;}
public  boolean onPerformDefaultAction () {__Result__.str+="|onPerformDefaultAction|"; return false;}
public  void setVisibilityListener (android.view.ActionProvider$VisibilityListener arg0) {__Result__.str+="|setVisibilityListener|"; return ;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*   VisibilityListener              */
/*===================================*/

public abstract static interface VisibilityListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void onActionProviderVisibilityChanged (boolean arg0) ;

/*========inner classes========*/

}
}