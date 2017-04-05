package android.view;
import android.__Result__;


/*===================================*/ 
/*             MenuItem              */
/*===================================*/

public abstract interface MenuItem {
/*========fields=========*/
public static final  int SHOW_AS_ACTION_ALWAYS=0;
public static final  int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW=0;
public static final  int SHOW_AS_ACTION_IF_ROOM=0;
public static final  int SHOW_AS_ACTION_NEVER=0;
public static final  int SHOW_AS_ACTION_WITH_TEXT=0;

/*======constructors=====*/

/*========methods========*/
public abstract  android.view.MenuItem setEnabled (boolean arg0) ;
public abstract  boolean isEnabled () ;
public abstract  boolean isVisible () ;
public abstract  java.lang.CharSequence getTitle () ;
public abstract  boolean isCheckable () ;
public abstract  android.view.MenuItem setCheckable (boolean arg0) ;
public abstract  boolean isChecked () ;
public abstract  android.view.MenuItem setChecked (boolean arg0) ;
public abstract  android.view.MenuItem setTitle (int arg0) ;
public abstract  android.view.MenuItem setTitle (java.lang.CharSequence arg0) ;
public abstract  android.view.MenuItem setVisible (boolean arg0) ;
public abstract  android.view.MenuItem setIcon (android.graphics.drawable.Drawable arg0) ;
public abstract  android.view.MenuItem setIcon (int arg0) ;
public abstract  int getItemId () ;
public abstract  int getGroupId () ;
public abstract  int getOrder () ;
public abstract  android.view.MenuItem setTitleCondensed (java.lang.CharSequence arg0) ;
public abstract  java.lang.CharSequence getTitleCondensed () ;
public abstract  android.graphics.drawable.Drawable getIcon () ;
public abstract  android.view.MenuItem setIntent (android.content.Intent arg0) ;
public abstract  android.view.MenuItem setShortcut (char arg0,char arg1) ;
public abstract  android.view.MenuItem setNumericShortcut (char arg0) ;
public abstract  char getNumericShortcut () ;
public abstract  android.view.MenuItem setAlphabeticShortcut (char arg0) ;
public abstract  char getAlphabeticShortcut () ;
public abstract  boolean hasSubMenu () ;
public abstract  android.view.SubMenu getSubMenu () ;
public abstract  android.view.MenuItem setOnMenuItemClickListener (android.view.MenuItem$OnMenuItemClickListener arg0) ;
public abstract  android.view.ContextMenu$ContextMenuInfo getMenuInfo () ;
public abstract  void setShowAsAction (int arg0) ;
public abstract  android.view.MenuItem setShowAsActionFlags (int arg0) ;
public abstract  android.view.MenuItem setActionView (android.view.View arg0) ;
public abstract  android.view.MenuItem setActionView (int arg0) ;
public abstract  android.view.View getActionView () ;
public abstract  android.view.MenuItem setActionProvider (android.view.ActionProvider arg0) ;
public abstract  android.view.ActionProvider getActionProvider () ;
public abstract  boolean expandActionView () ;
public abstract  boolean collapseActionView () ;
public abstract  boolean isActionViewExpanded () ;
public abstract  android.view.MenuItem setOnActionExpandListener (android.view.MenuItem$OnActionExpandListener arg0) ;
public abstract  android.content.Intent getIntent () ;

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* OnActionExpandListener              */
/*===================================*/

public abstract static interface OnActionExpandListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onMenuItemActionExpand (android.view.MenuItem arg0) ;
public abstract  boolean onMenuItemActionCollapse (android.view.MenuItem arg0) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* OnMenuItemClickListener              */
/*===================================*/

public abstract static interface OnMenuItemClickListener {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onMenuItemClick (android.view.MenuItem arg0) ;

/*========inner classes========*/

}
}