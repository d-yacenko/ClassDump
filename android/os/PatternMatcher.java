package android.os;
import android.__Result__;


/*===================================*/ 
/*       PatternMatcher              */
/*===================================*/

public class PatternMatcher implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int PATTERN_LITERAL=0;
public static final  int PATTERN_PREFIX=0;
public static final  int PATTERN_SIMPLE_GLOB=0;

/*======constructors=====*/
public  PatternMatcher (java.lang.String arg0,int arg1) {__Result__.str+="|PatternMatcher|";}
public  PatternMatcher (android.os.Parcel arg0) {__Result__.str+="|PatternMatcher|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public final  int getType () {__Result__.str+="|getType|"; return 0;}
public  boolean match (java.lang.String arg0) {__Result__.str+="|match|"; return false;}
public final  java.lang.String getPath () {__Result__.str+="|getPath|"; return null;}

/*========inner classes========*/

}