package android.view;
import android.__Result__;


/*===================================*/ 
/*           ActionMode              */
/*===================================*/

public abstract class ActionMode {
/*========fields=========*/
public static final  int DEFAULT_HIDE_DURATION=0;
public static final  int TYPE_FLOATING=0;
public static final  int TYPE_PRIMARY=0;

/*======constructors=====*/
public  ActionMode () {__Result__.str+="|ActionMode|";}

/*========methods========*/
public  void onWindowFocusChanged (boolean arg0) {__Result__.str+="|onWindowFocusChanged|"; return ;}
public abstract  void invalidate () ;
public  java.lang.Object getTag () {__Result__.str+="|getTag|"; return null;}
public  void setTag (java.lang.Object arg0) {__Result__.str+="|setTag|"; return ;}
public abstract  java.lang.CharSequence getTitle () ;
public  boolean getTitleOptionalHint () {__Result__.str+="|getTitleOptionalHint|"; return false;}
public abstract  void setCustomView (android.view.View arg0) ;
public  void setType (int arg0) {__Result__.str+="|setType|"; return ;}
public  void invalidateContentRect () {__Result__.str+="|invalidateContentRect|"; return ;}
public  void hide (long arg0) {__Result__.str+="|hide|"; return ;}
public abstract  void finish () ;
public abstract  android.view.Menu getMenu () ;
public abstract  java.lang.CharSequence getSubtitle () ;
public abstract  android.view.View getCustomView () ;
public abstract  android.view.MenuInflater getMenuInflater () ;
public abstract  void setTitle (java.lang.CharSequence arg0) ;
public abstract  void setTitle (int arg0) ;
public abstract  void setSubtitle (java.lang.CharSequence arg0) ;
public abstract  void setSubtitle (int arg0) ;
public  void setTitleOptionalHint (boolean arg0) {__Result__.str+="|setTitleOptionalHint|"; return ;}
public  boolean isTitleOptional () {__Result__.str+="|isTitleOptional|"; return false;}
public  int getType () {__Result__.str+="|getType|"; return 0;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*            Callback2              */
/*===================================*/

public abstract static class Callback2 implements android.view.ActionMode$Callback {
/*========fields=========*/

/*======constructors=====*/
public  Callback2 () {__Result__.str+="|Callback2|";}

/*========methods========*/
public  void onGetContentRect (android.view.ActionMode arg0,android.view.View arg1,android.graphics.Rect arg2) {__Result__.str+="|onGetContentRect|"; return ;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*             Callback              */
/*===================================*/

public abstract static interface Callback {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean onCreateActionMode (android.view.ActionMode arg0,android.view.Menu arg1) ;
public abstract  boolean onPrepareActionMode (android.view.ActionMode arg0,android.view.Menu arg1) ;
public abstract  boolean onActionItemClicked (android.view.ActionMode arg0,android.view.MenuItem arg1) ;
public abstract  void onDestroyActionMode (android.view.ActionMode arg0) ;

/*========inner classes========*/

}
}