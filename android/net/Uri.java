package android.net;
import android.__Result__;


/*===================================*/ 
/*                  Uri              */
/*===================================*/

public abstract class Uri implements android.os.Parcelable,java.lang.Comparable<android.net.Uri> {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  android.net.Uri EMPTY=null;

/*======constructors=====*/


/*========methods========*/
public static  void writeToParcel (android.os.Parcel arg0,android.net.Uri arg1) {__Result__.str+="|writeToParcel|"; return ;}
public abstract  boolean isHierarchical () ;
public abstract  java.lang.String getSchemeSpecificPart () ;
public abstract  java.lang.String getEncodedAuthority () ;
public abstract  java.lang.String getEncodedUserInfo () ;
public abstract  java.lang.String getEncodedPath () ;
public abstract  java.lang.String getEncodedQuery () ;
public abstract  java.lang.String getEncodedFragment () ;
public abstract  java.util.List getPathSegments () ;
public abstract  java.lang.String getLastPathSegment () ;
public abstract  android.net.Uri$Builder buildUpon () ;
public abstract  boolean isRelative () ;
public abstract  java.lang.String getEncodedSchemeSpecificPart () ;
public static  android.net.Uri fromFile (java.io.File arg0) {__Result__.str+="|fromFile|"; return null;}
public static  android.net.Uri fromParts (java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {__Result__.str+="|fromParts|"; return null;}
public  java.util.Set getQueryParameterNames () {__Result__.str+="|getQueryParameterNames|"; return null;}
public  java.util.List getQueryParameters (java.lang.String arg0) {__Result__.str+="|getQueryParameters|"; return null;}
public  java.lang.String getQueryParameter (java.lang.String arg0) {__Result__.str+="|getQueryParameter|"; return null;}
public  boolean getBooleanQueryParameter (java.lang.String arg0,boolean arg1) {__Result__.str+="|getBooleanQueryParameter|"; return false;}
public  android.net.Uri normalizeScheme () {__Result__.str+="|normalizeScheme|"; return null;}
public static  android.net.Uri withAppendedPath (android.net.Uri arg0,java.lang.String arg1) {__Result__.str+="|withAppendedPath|"; return null;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public abstract  java.lang.String toString () ;
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}
public  int compareTo (android.net.Uri arg0) {__Result__.str+="|compareTo|"; return 0;}

public static  java.lang.String decode (java.lang.String arg0) {__Result__.str+="|decode|"; return null;}
public static  java.lang.String encode (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|encode|"; return null;}
public static  java.lang.String encode (java.lang.String arg0) {__Result__.str+="|encode|"; return null;}
public  boolean isAbsolute () {__Result__.str+="|isAbsolute|"; return false;}
public static  android.net.Uri parse (java.lang.String arg0) {__Result__.str+="|parse|"; return null;}
public abstract  java.lang.String getPath () ;
public abstract  java.lang.String getAuthority () ;
public abstract  java.lang.String getFragment () ;
public abstract  java.lang.String getQuery () ;
public abstract  java.lang.String getScheme () ;
public  boolean isOpaque () {__Result__.str+="|isOpaque|"; return false;}
public abstract  java.lang.String getHost () ;
public abstract  int getPort () ;
public abstract  java.lang.String getUserInfo () ;

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*              Builder              */
/*===================================*/

public static final class Builder {
/*========fields=========*/

/*======constructors=====*/
public  Builder () {__Result__.str+="|Builder|";}

/*========methods========*/
public  android.net.Uri build () {__Result__.str+="|build|"; return null;}
public  android.net.Uri$Builder scheme (java.lang.String arg0) {__Result__.str+="|scheme|"; return null;}
public  android.net.Uri$Builder fragment (java.lang.String arg0) {__Result__.str+="|fragment|"; return null;}
public  android.net.Uri$Builder opaquePart (java.lang.String arg0) {__Result__.str+="|opaquePart|"; return null;}
public  android.net.Uri$Builder encodedAuthority (java.lang.String arg0) {__Result__.str+="|encodedAuthority|"; return null;}
public  android.net.Uri$Builder encodedOpaquePart (java.lang.String arg0) {__Result__.str+="|encodedOpaquePart|"; return null;}
public  android.net.Uri$Builder encodedPath (java.lang.String arg0) {__Result__.str+="|encodedPath|"; return null;}
public  android.net.Uri$Builder appendPath (java.lang.String arg0) {__Result__.str+="|appendPath|"; return null;}
public  android.net.Uri$Builder appendEncodedPath (java.lang.String arg0) {__Result__.str+="|appendEncodedPath|"; return null;}
public  android.net.Uri$Builder encodedQuery (java.lang.String arg0) {__Result__.str+="|encodedQuery|"; return null;}
public  android.net.Uri$Builder encodedFragment (java.lang.String arg0) {__Result__.str+="|encodedFragment|"; return null;}
public  android.net.Uri$Builder appendQueryParameter (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|appendQueryParameter|"; return null;}
public  android.net.Uri$Builder clearQuery () {__Result__.str+="|clearQuery|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  android.net.Uri$Builder path (java.lang.String arg0) {__Result__.str+="|path|"; return null;}
public  android.net.Uri$Builder authority (java.lang.String arg0) {__Result__.str+="|authority|"; return null;}
public  android.net.Uri$Builder query (java.lang.String arg0) {__Result__.str+="|query|"; return null;}

/*========inner classes========*/

}
}