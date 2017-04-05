package android.content;
import android.__Result__;


/*===================================*/ 
/*             ClipData              */
/*===================================*/

public class ClipData implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;

/*======constructors=====*/
public  ClipData (android.content.ClipDescription arg0,android.content.ClipData$Item arg1) {__Result__.str+="|ClipData|";}
public  ClipData (android.content.ClipData arg0) {__Result__.str+="|ClipData|";}
public  ClipData (java.lang.CharSequence arg0,[Ljava.lang.String; arg1,android.content.ClipData$Item arg2) {__Result__.str+="|ClipData|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  int getItemCount () {__Result__.str+="|getItemCount|"; return 0;}
public static  android.content.ClipData newPlainText (java.lang.CharSequence arg0,java.lang.CharSequence arg1) {__Result__.str+="|newPlainText|"; return null;}
public static  android.content.ClipData newHtmlText (java.lang.CharSequence arg0,java.lang.CharSequence arg1,java.lang.String arg2) {__Result__.str+="|newHtmlText|"; return null;}
public static  android.content.ClipData newIntent (java.lang.CharSequence arg0,android.content.Intent arg1) {__Result__.str+="|newIntent|"; return null;}
public static  android.content.ClipData newUri (android.content.ContentResolver arg0,java.lang.CharSequence arg1,android.net.Uri arg2) {__Result__.str+="|newUri|"; return null;}
public static  android.content.ClipData newRawUri (java.lang.CharSequence arg0,android.net.Uri arg1) {__Result__.str+="|newRawUri|"; return null;}
public  android.content.ClipDescription getDescription () {__Result__.str+="|getDescription|"; return null;}
public  void addItem (android.content.ClipData$Item arg0) {__Result__.str+="|addItem|"; return ;}
public  android.content.ClipData$Item getItemAt (int arg0) {__Result__.str+="|getItemAt|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*                 Item              */
/*===================================*/

public static class Item {
/*========fields=========*/

/*======constructors=====*/
public  Item (java.lang.CharSequence arg0) {__Result__.str+="|Item|";}
public  Item (java.lang.CharSequence arg0,java.lang.String arg1) {__Result__.str+="|Item|";}
public  Item (android.content.Intent arg0) {__Result__.str+="|Item|";}
public  Item (android.net.Uri arg0) {__Result__.str+="|Item|";}
public  Item (java.lang.CharSequence arg0,android.content.Intent arg1,android.net.Uri arg2) {__Result__.str+="|Item|";}
public  Item (java.lang.CharSequence arg0,java.lang.String arg1,android.content.Intent arg2,android.net.Uri arg3) {__Result__.str+="|Item|";}

/*========methods========*/
public  java.lang.CharSequence getText () {__Result__.str+="|getText|"; return null;}
public  android.content.Intent getIntent () {__Result__.str+="|getIntent|"; return null;}
public  java.lang.String getHtmlText () {__Result__.str+="|getHtmlText|"; return null;}
public  android.net.Uri getUri () {__Result__.str+="|getUri|"; return null;}
public  java.lang.CharSequence coerceToText (android.content.Context arg0) {__Result__.str+="|coerceToText|"; return null;}
public  java.lang.CharSequence coerceToStyledText (android.content.Context arg0) {__Result__.str+="|coerceToStyledText|"; return null;}
public  java.lang.String coerceToHtmlText (android.content.Context arg0) {__Result__.str+="|coerceToHtmlText|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/

}
}