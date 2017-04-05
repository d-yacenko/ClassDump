package android.database.sqlite;
import android.__Result__;


/*===================================*/ 
/*       SQLiteDatabase              */
/*===================================*/

public final class SQLiteDatabase extends android.database.sqlite.SQLiteClosable {
/*========fields=========*/
public static final  int CONFLICT_ABORT=0;
public static final  int CONFLICT_FAIL=0;
public static final  int CONFLICT_IGNORE=0;
public static final  int CONFLICT_NONE=0;
public static final  int CONFLICT_REPLACE=0;
public static final  int CONFLICT_ROLLBACK=0;
public static final  int CREATE_IF_NECESSARY=0;
public static final  int ENABLE_WRITE_AHEAD_LOGGING=0;
public static final  int MAX_SQL_CACHE_SIZE=0;
public static final  int NO_LOCALIZED_COLLATORS=0;
public static final  int OPEN_READONLY=0;
public static final  int OPEN_READWRITE=0;
public static final  int SQLITE_MAX_LIKE_PATTERN_LENGTH=0;

/*======constructors=====*/


/*========methods========*/
public  int getVersion () {__Result__.str+="|getVersion|"; return 0;}
public  void setLocale (java.util.Locale arg0) {__Result__.str+="|setLocale|"; return ;}
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase (java.lang.String arg0,android.database.sqlite.SQLiteDatabase$CursorFactory arg1,android.database.DatabaseErrorHandler arg2) {__Result__.str+="|openOrCreateDatabase|"; return null;}
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase (java.io.File arg0,android.database.sqlite.SQLiteDatabase$CursorFactory arg1) {__Result__.str+="|openOrCreateDatabase|"; return null;}
public static  android.database.sqlite.SQLiteDatabase openOrCreateDatabase (java.lang.String arg0,android.database.sqlite.SQLiteDatabase$CursorFactory arg1) {__Result__.str+="|openOrCreateDatabase|"; return null;}
public static  boolean deleteDatabase (java.io.File arg0) {__Result__.str+="|deleteDatabase|"; return false;}

public static  int releaseMemory () {__Result__.str+="|releaseMemory|"; return 0;}
public  @java.lang.Deprecated() void setLockingEnabled (boolean arg0) {__Result__.str+="|setLockingEnabled|"; return ;}
public  void beginTransaction () {__Result__.str+="|beginTransaction|"; return ;}
public  void beginTransactionNonExclusive () {__Result__.str+="|beginTransactionNonExclusive|"; return ;}
public  void beginTransactionWithListener (android.database.sqlite.SQLiteTransactionListener arg0) {__Result__.str+="|beginTransactionWithListener|"; return ;}
public  void beginTransactionWithListenerNonExclusive (android.database.sqlite.SQLiteTransactionListener arg0) {__Result__.str+="|beginTransactionWithListenerNonExclusive|"; return ;}
public  void endTransaction () {__Result__.str+="|endTransaction|"; return ;}
public  void setTransactionSuccessful () {__Result__.str+="|setTransactionSuccessful|"; return ;}
public  boolean inTransaction () {__Result__.str+="|inTransaction|"; return false;}
public  boolean isDbLockedByCurrentThread () {__Result__.str+="|isDbLockedByCurrentThread|"; return false;}
public  @java.lang.Deprecated() boolean isDbLockedByOtherThreads () {__Result__.str+="|isDbLockedByOtherThreads|"; return false;}
public  @java.lang.Deprecated() boolean yieldIfContended () {__Result__.str+="|yieldIfContended|"; return false;}
public  boolean yieldIfContendedSafely (long arg0) {__Result__.str+="|yieldIfContendedSafely|"; return false;}
public  boolean yieldIfContendedSafely () {__Result__.str+="|yieldIfContendedSafely|"; return false;}
public  @java.lang.Deprecated() java.util.Map getSyncedTables () {__Result__.str+="|getSyncedTables|"; return null;}
public static  android.database.sqlite.SQLiteDatabase openDatabase (java.lang.String arg0,android.database.sqlite.SQLiteDatabase$CursorFactory arg1,int arg2,android.database.DatabaseErrorHandler arg3) {__Result__.str+="|openDatabase|"; return null;}
public static  android.database.sqlite.SQLiteDatabase openDatabase (java.lang.String arg0,android.database.sqlite.SQLiteDatabase$CursorFactory arg1,int arg2) {__Result__.str+="|openDatabase|"; return null;}
public  void setVersion (int arg0) {__Result__.str+="|setVersion|"; return ;}
public  long getMaximumSize () {__Result__.str+="|getMaximumSize|"; return 0;}
public  long setMaximumSize (long arg0) {__Result__.str+="|setMaximumSize|"; return 0;}
public  long getPageSize () {__Result__.str+="|getPageSize|"; return 0;}
public  void setPageSize (long arg0) {__Result__.str+="|setPageSize|"; return ;}
public  @java.lang.Deprecated() void markTableSyncable (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|markTableSyncable|"; return ;}
public  @java.lang.Deprecated() void markTableSyncable (java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {__Result__.str+="|markTableSyncable|"; return ;}
public static  java.lang.String findEditTable (java.lang.String arg0) {__Result__.str+="|findEditTable|"; return null;}
public  android.database.sqlite.SQLiteStatement compileStatement (java.lang.String arg0) throws android.database.SQLException{__Result__.str+="|compileStatement|"; return null;}
public  android.database.Cursor queryWithFactory (android.database.sqlite.SQLiteDatabase$CursorFactory arg0,boolean arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,[Ljava.lang.String; arg5,java.lang.String arg6,java.lang.String arg7,java.lang.String arg8,java.lang.String arg9) {__Result__.str+="|queryWithFactory|"; return null;}
public  android.database.Cursor queryWithFactory (android.database.sqlite.SQLiteDatabase$CursorFactory arg0,boolean arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,[Ljava.lang.String; arg5,java.lang.String arg6,java.lang.String arg7,java.lang.String arg8,java.lang.String arg9,android.os.CancellationSignal arg10) {__Result__.str+="|queryWithFactory|"; return null;}
public  android.database.Cursor rawQuery (java.lang.String arg0,[Ljava.lang.String; arg1,android.os.CancellationSignal arg2) {__Result__.str+="|rawQuery|"; return null;}
public  android.database.Cursor rawQuery (java.lang.String arg0,[Ljava.lang.String; arg1) {__Result__.str+="|rawQuery|"; return null;}
public  android.database.Cursor rawQueryWithFactory (android.database.sqlite.SQLiteDatabase$CursorFactory arg0,java.lang.String arg1,[Ljava.lang.String; arg2,java.lang.String arg3) {__Result__.str+="|rawQueryWithFactory|"; return null;}
public  android.database.Cursor rawQueryWithFactory (android.database.sqlite.SQLiteDatabase$CursorFactory arg0,java.lang.String arg1,[Ljava.lang.String; arg2,java.lang.String arg3,android.os.CancellationSignal arg4) {__Result__.str+="|rawQueryWithFactory|"; return null;}
public  long insertOrThrow (java.lang.String arg0,java.lang.String arg1,android.content.ContentValues arg2) throws android.database.SQLException{__Result__.str+="|insertOrThrow|"; return 0;}
public  long replaceOrThrow (java.lang.String arg0,java.lang.String arg1,android.content.ContentValues arg2) throws android.database.SQLException{__Result__.str+="|replaceOrThrow|"; return 0;}
public  long insertWithOnConflict (java.lang.String arg0,java.lang.String arg1,android.content.ContentValues arg2,int arg3) {__Result__.str+="|insertWithOnConflict|"; return 0;}
public  int updateWithOnConflict (java.lang.String arg0,android.content.ContentValues arg1,java.lang.String arg2,[Ljava.lang.String; arg3,int arg4) {__Result__.str+="|updateWithOnConflict|"; return 0;}
public  void execSQL (java.lang.String arg0,[Ljava.lang.Object; arg1) throws android.database.SQLException{__Result__.str+="|execSQL|"; return ;}
public  void execSQL (java.lang.String arg0) throws android.database.SQLException{__Result__.str+="|execSQL|"; return ;}
public  void validateSql (java.lang.String arg0,android.os.CancellationSignal arg1) {__Result__.str+="|validateSql|"; return ;}
public  boolean needUpgrade (int arg0) {__Result__.str+="|needUpgrade|"; return false;}
public  void setMaxSqlCacheSize (int arg0) {__Result__.str+="|setMaxSqlCacheSize|"; return ;}
public  void setForeignKeyConstraintsEnabled (boolean arg0) {__Result__.str+="|setForeignKeyConstraintsEnabled|"; return ;}
public  boolean enableWriteAheadLogging () {__Result__.str+="|enableWriteAheadLogging|"; return false;}
public  void disableWriteAheadLogging () {__Result__.str+="|disableWriteAheadLogging|"; return ;}
public  boolean isWriteAheadLoggingEnabled () {__Result__.str+="|isWriteAheadLoggingEnabled|"; return false;}
public  java.util.List getAttachedDbs () {__Result__.str+="|getAttachedDbs|"; return null;}
public  boolean isDatabaseIntegrityOk () {__Result__.str+="|isDatabaseIntegrityOk|"; return false;}

public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  int update (java.lang.String arg0,android.content.ContentValues arg1,java.lang.String arg2,[Ljava.lang.String; arg3) {__Result__.str+="|update|"; return 0;}
public  long replace (java.lang.String arg0,java.lang.String arg1,android.content.ContentValues arg2) {__Result__.str+="|replace|"; return 0;}
public  int delete (java.lang.String arg0,java.lang.String arg1,[Ljava.lang.String; arg2) {__Result__.str+="|delete|"; return 0;}
public  long insert (java.lang.String arg0,java.lang.String arg1,android.content.ContentValues arg2) {__Result__.str+="|insert|"; return 0;}
public  boolean isReadOnly () {__Result__.str+="|isReadOnly|"; return false;}
public final  java.lang.String getPath () {__Result__.str+="|getPath|"; return null;}
public  boolean isOpen () {__Result__.str+="|isOpen|"; return false;}
public static  android.database.sqlite.SQLiteDatabase create (android.database.sqlite.SQLiteDatabase$CursorFactory arg0) {__Result__.str+="|create|"; return null;}
public  android.database.Cursor query (java.lang.String arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,java.lang.String arg5,java.lang.String arg6,java.lang.String arg7) {__Result__.str+="|query|"; return null;}
public  android.database.Cursor query (boolean arg0,java.lang.String arg1,[Ljava.lang.String; arg2,java.lang.String arg3,[Ljava.lang.String; arg4,java.lang.String arg5,java.lang.String arg6,java.lang.String arg7,java.lang.String arg8) {__Result__.str+="|query|"; return null;}
public  android.database.Cursor query (boolean arg0,java.lang.String arg1,[Ljava.lang.String; arg2,java.lang.String arg3,[Ljava.lang.String; arg4,java.lang.String arg5,java.lang.String arg6,java.lang.String arg7,java.lang.String arg8,android.os.CancellationSignal arg9) {__Result__.str+="|query|"; return null;}
public  android.database.Cursor query (java.lang.String arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,java.lang.String arg5,java.lang.String arg6) {__Result__.str+="|query|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*        CursorFactory              */
/*===================================*/

public abstract static interface CursorFactory {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  android.database.Cursor newCursor (android.database.sqlite.SQLiteDatabase arg0,android.database.sqlite.SQLiteCursorDriver arg1,java.lang.String arg2,android.database.sqlite.SQLiteQuery arg3) ;

/*========inner classes========*/

}
}