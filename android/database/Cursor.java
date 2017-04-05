package android.database;
import android.__Result__;


/*===================================*/ 
/*               Cursor              */
/*===================================*/

public abstract interface Cursor extends java.io.Closeable {
/*========fields=========*/
public static final  int FIELD_TYPE_BLOB=0;
public static final  int FIELD_TYPE_FLOAT=0;
public static final  int FIELD_TYPE_INTEGER=0;
public static final  int FIELD_TYPE_NULL=0;
public static final  int FIELD_TYPE_STRING=0;

/*======constructors=====*/

/*========methods========*/
public abstract  boolean isClosed () ;
public abstract  java.lang.String getString (int arg0) ;
public abstract  android.os.Bundle getExtras () ;
public abstract  int getColumnIndex (java.lang.String arg0) ;
public abstract  int getColumnCount () ;
public abstract  int getPosition () ;
public abstract  void registerContentObserver (android.database.ContentObserver arg0) ;
public abstract  void unregisterContentObserver (android.database.ContentObserver arg0) ;
public abstract  void setExtras (android.os.Bundle arg0) ;
public abstract  int getCount () ;
public abstract  boolean move (int arg0) ;
public abstract  boolean moveToPosition (int arg0) ;
public abstract  boolean moveToFirst () ;
public abstract  boolean moveToLast () ;
public abstract  boolean moveToNext () ;
public abstract  boolean moveToPrevious () ;
public abstract  boolean isFirst () ;
public abstract  boolean isLast () ;
public abstract  boolean isBeforeFirst () ;
public abstract  boolean isAfterLast () ;
public abstract  int getColumnIndexOrThrow (java.lang.String arg0) throws java.lang.IllegalArgumentException;
public abstract  java.lang.String getColumnName (int arg0) ;
public abstract  [Ljava.lang.String; getColumnNames () ;
public abstract  [B getBlob (int arg0) ;
public abstract  void copyStringToBuffer (int arg0,android.database.CharArrayBuffer arg1) ;
public abstract  @java.lang.Deprecated() void deactivate () ;
public abstract  @java.lang.Deprecated() boolean requery () ;
public abstract  void registerDataSetObserver (android.database.DataSetObserver arg0) ;
public abstract  void unregisterDataSetObserver (android.database.DataSetObserver arg0) ;
public abstract  void setNotificationUri (android.content.ContentResolver arg0,android.net.Uri arg1) ;
public abstract  android.net.Uri getNotificationUri () ;
public abstract  boolean getWantsAllOnMoveCalls () ;
public abstract  android.os.Bundle respond (android.os.Bundle arg0) ;
public abstract  short getShort (int arg0) ;
public abstract  int getInt (int arg0) ;
public abstract  long getLong (int arg0) ;
public abstract  float getFloat (int arg0) ;
public abstract  double getDouble (int arg0) ;
public abstract  void close () ;
public abstract  int getType (int arg0) ;
public abstract  boolean isNull (int arg0) ;

/*========inner classes========*/

}