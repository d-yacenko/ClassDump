package android.view;
import android.__Result__;


/*===================================*/ 
/*        TouchDelegate              */
/*===================================*/

public class TouchDelegate {
/*========fields=========*/
public static final  int ABOVE=0;
public static final  int BELOW=0;
public static final  int TO_LEFT=0;
public static final  int TO_RIGHT=0;

/*======constructors=====*/
public  TouchDelegate (android.graphics.Rect arg0,android.view.View arg1) {__Result__.str+="|TouchDelegate|";}

/*========methods========*/
public  boolean onTouchEvent (android.view.MotionEvent arg0) {__Result__.str+="|onTouchEvent|"; return false;}

/*========inner classes========*/

}