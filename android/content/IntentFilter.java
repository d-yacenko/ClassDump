package android.content;
import android.__Result__;


/*===================================*/ 
/*         IntentFilter              */
/*===================================*/

public class IntentFilter implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int MATCH_ADJUSTMENT_MASK=0;
public static final  int MATCH_ADJUSTMENT_NORMAL=0;
public static final  int MATCH_CATEGORY_EMPTY=0;
public static final  int MATCH_CATEGORY_HOST=0;
public static final  int MATCH_CATEGORY_MASK=0;
public static final  int MATCH_CATEGORY_PATH=0;
public static final  int MATCH_CATEGORY_PORT=0;
public static final  int MATCH_CATEGORY_SCHEME=0;
public static final  int MATCH_CATEGORY_SCHEME_SPECIFIC_PART=0;
public static final  int MATCH_CATEGORY_TYPE=0;
public static final  int NO_MATCH_ACTION=0;
public static final  int NO_MATCH_CATEGORY=0;
public static final  int NO_MATCH_DATA=0;
public static final  int NO_MATCH_TYPE=0;
public static final  int SYSTEM_HIGH_PRIORITY=0;
public static final  int SYSTEM_LOW_PRIORITY=0;

/*======constructors=====*/
public  IntentFilter (android.content.IntentFilter arg0) {__Result__.str+="|IntentFilter|";}
public  IntentFilter (java.lang.String arg0,java.lang.String arg1) throws android.content.IntentFilter$MalformedMimeTypeException{__Result__.str+="|IntentFilter|";}
public  IntentFilter (java.lang.String arg0) {__Result__.str+="|IntentFilter|";}
public  IntentFilter () {__Result__.str+="|IntentFilter|";}

/*========methods========*/
public  void dump (android.util.Printer arg0,java.lang.String arg1) {__Result__.str+="|dump|"; return ;}
public final  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public final  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public final  void addAction (java.lang.String arg0) {__Result__.str+="|addAction|"; return ;}
public final  java.lang.String getAction (int arg0) {__Result__.str+="|getAction|"; return null;}
public final  boolean hasCategory (java.lang.String arg0) {__Result__.str+="|hasCategory|"; return false;}
public final  void addCategory (java.lang.String arg0) {__Result__.str+="|addCategory|"; return ;}
public final  int countActions () {__Result__.str+="|countActions|"; return 0;}
public final  boolean hasAction (java.lang.String arg0) {__Result__.str+="|hasAction|"; return false;}
public final  boolean matchAction (java.lang.String arg0) {__Result__.str+="|matchAction|"; return false;}
public final  java.util.Iterator actionsIterator () {__Result__.str+="|actionsIterator|"; return null;}
public final  void addDataType (java.lang.String arg0) throws android.content.IntentFilter$MalformedMimeTypeException{__Result__.str+="|addDataType|"; return ;}
public final  boolean hasDataType (java.lang.String arg0) {__Result__.str+="|hasDataType|"; return false;}
public final  int countDataTypes () {__Result__.str+="|countDataTypes|"; return 0;}
public final  java.lang.String getDataType (int arg0) {__Result__.str+="|getDataType|"; return null;}
public final  java.util.Iterator typesIterator () {__Result__.str+="|typesIterator|"; return null;}
public final  void addDataScheme (java.lang.String arg0) {__Result__.str+="|addDataScheme|"; return ;}
public final  int countDataSchemes () {__Result__.str+="|countDataSchemes|"; return 0;}
public final  java.lang.String getDataScheme (int arg0) {__Result__.str+="|getDataScheme|"; return null;}
public final  boolean hasDataScheme (java.lang.String arg0) {__Result__.str+="|hasDataScheme|"; return false;}
public final  java.util.Iterator schemesIterator () {__Result__.str+="|schemesIterator|"; return null;}
public final  void addDataSchemeSpecificPart (java.lang.String arg0,int arg1) {__Result__.str+="|addDataSchemeSpecificPart|"; return ;}
public final  int countDataSchemeSpecificParts () {__Result__.str+="|countDataSchemeSpecificParts|"; return 0;}
public final  android.os.PatternMatcher getDataSchemeSpecificPart (int arg0) {__Result__.str+="|getDataSchemeSpecificPart|"; return null;}
public final  boolean hasDataSchemeSpecificPart (java.lang.String arg0) {__Result__.str+="|hasDataSchemeSpecificPart|"; return false;}
public final  java.util.Iterator schemeSpecificPartsIterator () {__Result__.str+="|schemeSpecificPartsIterator|"; return null;}
public final  void addDataAuthority (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|addDataAuthority|"; return ;}
public final  int countDataAuthorities () {__Result__.str+="|countDataAuthorities|"; return 0;}
public final  android.content.IntentFilter$AuthorityEntry getDataAuthority (int arg0) {__Result__.str+="|getDataAuthority|"; return null;}
public final  boolean hasDataAuthority (android.net.Uri arg0) {__Result__.str+="|hasDataAuthority|"; return false;}
public final  java.util.Iterator authoritiesIterator () {__Result__.str+="|authoritiesIterator|"; return null;}
public final  void addDataPath (java.lang.String arg0,int arg1) {__Result__.str+="|addDataPath|"; return ;}
public final  int countDataPaths () {__Result__.str+="|countDataPaths|"; return 0;}
public final  android.os.PatternMatcher getDataPath (int arg0) {__Result__.str+="|getDataPath|"; return null;}
public final  boolean hasDataPath (java.lang.String arg0) {__Result__.str+="|hasDataPath|"; return false;}
public final  java.util.Iterator pathsIterator () {__Result__.str+="|pathsIterator|"; return null;}
public final  int matchDataAuthority (android.net.Uri arg0) {__Result__.str+="|matchDataAuthority|"; return 0;}
public final  int matchData (java.lang.String arg0,java.lang.String arg1,android.net.Uri arg2) {__Result__.str+="|matchData|"; return 0;}
public final  int countCategories () {__Result__.str+="|countCategories|"; return 0;}
public final  java.lang.String getCategory (int arg0) {__Result__.str+="|getCategory|"; return null;}
public final  java.util.Iterator categoriesIterator () {__Result__.str+="|categoriesIterator|"; return null;}
public final  java.lang.String matchCategories (java.util.Set arg0) {__Result__.str+="|matchCategories|"; return null;}
public  void writeToXml (org.xmlpull.v1.XmlSerializer arg0) throws java.io.IOException{__Result__.str+="|writeToXml|"; return ;}
public  void readFromXml (org.xmlpull.v1.XmlPullParser arg0) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|readFromXml|"; return ;}
public final  void setPriority (int arg0) {__Result__.str+="|setPriority|"; return ;}
public final  int getPriority () {__Result__.str+="|getPriority|"; return 0;}
public final  int match (android.content.ContentResolver arg0,android.content.Intent arg1,boolean arg2,java.lang.String arg3) {__Result__.str+="|match|"; return 0;}
public final  int match (java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,android.net.Uri arg3,java.util.Set arg4,java.lang.String arg5) {__Result__.str+="|match|"; return 0;}
public static  android.content.IntentFilter create (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|create|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*       AuthorityEntry              */
/*===================================*/

public static final class AuthorityEntry {
/*========fields=========*/

/*======constructors=====*/
public  AuthorityEntry (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|AuthorityEntry|";}

/*========methods========*/
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  int match (android.net.Uri arg0) {__Result__.str+="|match|"; return 0;}
public  java.lang.String getHost () {__Result__.str+="|getHost|"; return null;}
public  int getPort () {__Result__.str+="|getPort|"; return 0;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* MalformedMimeTypeException              */
/*===================================*/

public static class MalformedMimeTypeException extends android.util.AndroidException {
/*========fields=========*/

/*======constructors=====*/
public  MalformedMimeTypeException () {__Result__.str+="|MalformedMimeTypeException|";}
public  MalformedMimeTypeException (java.lang.String arg0) {__Result__.str+="|MalformedMimeTypeException|";}

/*========methods========*/

/*========inner classes========*/

}
}