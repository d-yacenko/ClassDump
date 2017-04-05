package android.view.inputmethod;
import android.__Result__;


/*===================================*/ 
/*        ExtractedText              */
/*===================================*/

public class ExtractedText implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  int FLAG_SELECTING=0;
public static final  int FLAG_SINGLE_LINE=0;
public  int flags;
public  int partialEndOffset;
public  int partialStartOffset;
public  int selectionEnd;
public  int selectionStart;
public  int startOffset;
public  java.lang.CharSequence text;

/*======constructors=====*/
public  ExtractedText () {__Result__.str+="|ExtractedText|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}

/*========inner classes========*/

}