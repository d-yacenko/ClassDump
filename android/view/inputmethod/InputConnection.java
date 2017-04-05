package android.view.inputmethod;
import android.__Result__;


/*===================================*/ 
/*      InputConnection              */
/*===================================*/

public abstract interface InputConnection {
/*========fields=========*/
public static final  int CURSOR_UPDATE_IMMEDIATE=0;
public static final  int CURSOR_UPDATE_MONITOR=0;
public static final  int GET_EXTRACTED_TEXT_MONITOR=0;
public static final  int GET_TEXT_WITH_STYLES=0;
public static final  int INPUT_CONTENT_GRANT_READ_URI_PERMISSION=0;

/*======constructors=====*/

/*========methods========*/
public abstract  boolean beginBatchEdit () ;
public abstract  boolean endBatchEdit () ;
public abstract  java.lang.CharSequence getTextBeforeCursor (int arg0,int arg1) ;
public abstract  java.lang.CharSequence getTextAfterCursor (int arg0,int arg1) ;
public abstract  java.lang.CharSequence getSelectedText (int arg0) ;
public abstract  int getCursorCapsMode (int arg0) ;
public abstract  android.view.inputmethod.ExtractedText getExtractedText (android.view.inputmethod.ExtractedTextRequest arg0,int arg1) ;
public abstract  boolean deleteSurroundingText (int arg0,int arg1) ;
public abstract  boolean deleteSurroundingTextInCodePoints (int arg0,int arg1) ;
public abstract  boolean setComposingText (java.lang.CharSequence arg0,int arg1) ;
public abstract  boolean setComposingRegion (int arg0,int arg1) ;
public abstract  boolean finishComposingText () ;
public abstract  boolean commitText (java.lang.CharSequence arg0,int arg1) ;
public abstract  boolean commitCompletion (android.view.inputmethod.CompletionInfo arg0) ;
public abstract  boolean commitCorrection (android.view.inputmethod.CorrectionInfo arg0) ;
public abstract  boolean setSelection (int arg0,int arg1) ;
public abstract  boolean performEditorAction (int arg0) ;
public abstract  boolean performContextMenuAction (int arg0) ;
public abstract  boolean sendKeyEvent (android.view.KeyEvent arg0) ;
public abstract  boolean clearMetaKeyStates (int arg0) ;
public abstract  boolean reportFullscreenMode (boolean arg0) ;
public abstract  boolean performPrivateCommand (java.lang.String arg0,android.os.Bundle arg1) ;
public abstract  boolean requestCursorUpdates (int arg0) ;
public abstract  void closeConnection () ;
public abstract  boolean commitContent (android.view.inputmethod.InputContentInfo arg0,int arg1,android.os.Bundle arg2) ;
public abstract  android.os.Handler getHandler () ;

/*========inner classes========*/

}