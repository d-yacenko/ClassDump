package android.util;
import android.__Result__;


/*===================================*/ 
/*             Property              */
/*===================================*/

public abstract class Property {
/*========fields=========*/

/*======constructors=====*/
public  Property (java.lang.Class arg0,java.lang.String arg1) {__Result__.str+="|Property|";}

/*========methods========*/
public abstract  java.lang.Object get (java.lang.Object arg0) ;
public  java.lang.String getName () {__Result__.str+="|getName|"; return null;}
public  java.lang.Class getType () {__Result__.str+="|getType|"; return null;}
public  void set (java.lang.Object arg0,java.lang.Object arg1) {__Result__.str+="|set|"; return ;}
public  boolean isReadOnly () {__Result__.str+="|isReadOnly|"; return false;}
public static  android.util.Property of (java.lang.Class arg0,java.lang.Class arg1,java.lang.String arg2) {__Result__.str+="|of|"; return null;}

/*========inner classes========*/

}