package android.view;
import android.__Result__;


/*===================================*/ 
/*                 Menu              */
/*===================================*/

public abstract interface Menu {
/*========fields=========*/
public static final  int CATEGORY_ALTERNATIVE=0;
public static final  int CATEGORY_CONTAINER=0;
public static final  int CATEGORY_SECONDARY=0;
public static final  int CATEGORY_SYSTEM=0;
public static final  int FIRST=0;
public static final  int FLAG_ALWAYS_PERFORM_CLOSE=0;
public static final  int FLAG_APPEND_TO_GROUP=0;
public static final  int FLAG_PERFORM_NO_CLOSE=0;
public static final  int NONE=0;

/*======constructors=====*/

/*========methods========*/
public abstract  android.view.SubMenu addSubMenu (int arg0,int arg1,int arg2,java.lang.CharSequence arg3) ;
public abstract  android.view.SubMenu addSubMenu (int arg0) ;
public abstract  android.view.SubMenu addSubMenu (int arg0,int arg1,int arg2,int arg3) ;
public abstract  android.view.SubMenu addSubMenu (java.lang.CharSequence arg0) ;
public abstract  int addIntentOptions (int arg0,int arg1,int arg2,android.content.ComponentName arg3,[Landroid.content.Intent; arg4,android.content.Intent arg5,int arg6,[Landroid.view.MenuItem; arg7) ;
public abstract  void removeItem (int arg0) ;
public abstract  void removeGroup (int arg0) ;
public abstract  void setGroupCheckable (int arg0,boolean arg1,boolean arg2) ;
public abstract  void setGroupVisible (int arg0,boolean arg1) ;
public abstract  void setGroupEnabled (int arg0,boolean arg1) ;
public abstract  boolean hasVisibleItems () ;
public abstract  android.view.MenuItem findItem (int arg0) ;
public abstract  android.view.MenuItem getItem (int arg0) ;
public abstract  boolean performShortcut (int arg0,android.view.KeyEvent arg1,int arg2) ;
public abstract  boolean isShortcutKey (int arg0,android.view.KeyEvent arg1) ;
public abstract  boolean performIdentifierAction (int arg0,int arg1) ;
public abstract  void setQwertyMode (boolean arg0) ;
public abstract  android.view.MenuItem add (int arg0,int arg1,int arg2,int arg3) ;
public abstract  android.view.MenuItem add (int arg0,int arg1,int arg2,java.lang.CharSequence arg3) ;
public abstract  android.view.MenuItem add (int arg0) ;
public abstract  android.view.MenuItem add (java.lang.CharSequence arg0) ;
public abstract  void clear () ;
public abstract  int size () ;
public abstract  void close () ;

/*========inner classes========*/

}