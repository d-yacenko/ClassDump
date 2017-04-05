package android.content;
import android.__Result__;


/*===================================*/ 
/*      ContentResolver              */
/*===================================*/

public abstract class ContentResolver {
/*========fields=========*/
public static final  java.lang.String ANY_CURSOR_ITEM_TYPE=null;
public static final  java.lang.String CURSOR_DIR_BASE_TYPE=null;
public static final  java.lang.String CURSOR_ITEM_BASE_TYPE=null;
public static final  java.lang.String EXTRA_SIZE=null;
public static final  int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS=0;
public static final  int NOTIFY_SYNC_TO_NETWORK=0;
public static final  java.lang.String SCHEME_ANDROID_RESOURCE=null;
public static final  java.lang.String SCHEME_CONTENT=null;
public static final  java.lang.String SCHEME_FILE=null;
public static final  @java.lang.Deprecated() java.lang.String SYNC_EXTRAS_ACCOUNT=null;
public static final  java.lang.String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS=null;
public static final  java.lang.String SYNC_EXTRAS_DO_NOT_RETRY=null;
public static final  java.lang.String SYNC_EXTRAS_EXPEDITED=null;
public static final  @java.lang.Deprecated() java.lang.String SYNC_EXTRAS_FORCE=null;
public static final  java.lang.String SYNC_EXTRAS_IGNORE_BACKOFF=null;
public static final  java.lang.String SYNC_EXTRAS_IGNORE_SETTINGS=null;
public static final  java.lang.String SYNC_EXTRAS_INITIALIZE=null;
public static final  java.lang.String SYNC_EXTRAS_MANUAL=null;
public static final  java.lang.String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS=null;
public static final  java.lang.String SYNC_EXTRAS_REQUIRE_CHARGING=null;
public static final  java.lang.String SYNC_EXTRAS_UPLOAD=null;
public static final  int SYNC_OBSERVER_TYPE_ACTIVE=0;
public static final  int SYNC_OBSERVER_TYPE_PENDING=0;
public static final  int SYNC_OBSERVER_TYPE_SETTINGS=0;

/*======constructors=====*/
public  ContentResolver (android.content.Context arg0) {__Result__.str+="|ContentResolver|";}

/*========methods========*/
public final  android.net.Uri uncanonicalize (android.net.Uri arg0) {__Result__.str+="|uncanonicalize|"; return null;}
public  [Ljava.lang.String; getStreamTypes (android.net.Uri arg0,java.lang.String arg1) {__Result__.str+="|getStreamTypes|"; return null;}
public static  void requestSync (android.accounts.Account arg0,java.lang.String arg1,android.os.Bundle arg2) {__Result__.str+="|requestSync|"; return ;}
public static  void requestSync (android.content.SyncRequest arg0) {__Result__.str+="|requestSync|"; return ;}
public final  java.io.OutputStream openOutputStream (android.net.Uri arg0) throws java.io.FileNotFoundException{__Result__.str+="|openOutputStream|"; return null;}
public final  java.io.OutputStream openOutputStream (android.net.Uri arg0,java.lang.String arg1) throws java.io.FileNotFoundException{__Result__.str+="|openOutputStream|"; return null;}
public final  java.io.InputStream openInputStream (android.net.Uri arg0) throws java.io.FileNotFoundException{__Result__.str+="|openInputStream|"; return null;}
public  @java.lang.Deprecated() void startSync (android.net.Uri arg0,android.os.Bundle arg1) {__Result__.str+="|startSync|"; return ;}
public  void notifyChange (android.net.Uri arg0,android.database.ContentObserver arg1,int arg2) {__Result__.str+="|notifyChange|"; return ;}
public  void notifyChange (android.net.Uri arg0,android.database.ContentObserver arg1) {__Result__.str+="|notifyChange|"; return ;}
public  void notifyChange (android.net.Uri arg0,android.database.ContentObserver arg1,boolean arg2) {__Result__.str+="|notifyChange|"; return ;}
public  [Landroid.content.ContentProviderResult; applyBatch (java.lang.String arg0,java.util.ArrayList arg1) throws android.os.RemoteException,android.content.OperationApplicationException{__Result__.str+="|applyBatch|"; return null;}
public final  android.os.Bundle call (android.net.Uri arg0,java.lang.String arg1,java.lang.String arg2,android.os.Bundle arg3) {__Result__.str+="|call|"; return null;}
public static  void addPeriodicSync (android.accounts.Account arg0,java.lang.String arg1,android.os.Bundle arg2,long arg3) {__Result__.str+="|addPeriodicSync|"; return ;}
public final  int bulkInsert (android.net.Uri arg0,[Landroid.content.ContentValues; arg1) {__Result__.str+="|bulkInsert|"; return 0;}
public static  void cancelSync (android.content.SyncRequest arg0) {__Result__.str+="|cancelSync|"; return ;}
public static  void cancelSync (android.accounts.Account arg0,java.lang.String arg1) {__Result__.str+="|cancelSync|"; return ;}
public  @java.lang.Deprecated() void cancelSync (android.net.Uri arg0) {__Result__.str+="|cancelSync|"; return ;}
public static  java.util.List getPeriodicSyncs (android.accounts.Account arg0,java.lang.String arg1) {__Result__.str+="|getPeriodicSyncs|"; return null;}
public static  int getIsSyncable (android.accounts.Account arg0,java.lang.String arg1) {__Result__.str+="|getIsSyncable|"; return 0;}
public final  android.os.ParcelFileDescriptor openFileDescriptor (android.net.Uri arg0,java.lang.String arg1) throws java.io.FileNotFoundException{__Result__.str+="|openFileDescriptor|"; return null;}
public final  android.os.ParcelFileDescriptor openFileDescriptor (android.net.Uri arg0,java.lang.String arg1,android.os.CancellationSignal arg2) throws java.io.FileNotFoundException{__Result__.str+="|openFileDescriptor|"; return null;}
public final  android.content.res.AssetFileDescriptor openAssetFileDescriptor (android.net.Uri arg0,java.lang.String arg1,android.os.CancellationSignal arg2) throws java.io.FileNotFoundException{__Result__.str+="|openAssetFileDescriptor|"; return null;}
public final  android.content.res.AssetFileDescriptor openAssetFileDescriptor (android.net.Uri arg0,java.lang.String arg1) throws java.io.FileNotFoundException{__Result__.str+="|openAssetFileDescriptor|"; return null;}
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2) throws java.io.FileNotFoundException{__Result__.str+="|openTypedAssetFileDescriptor|"; return null;}
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2,android.os.CancellationSignal arg3) throws java.io.FileNotFoundException{__Result__.str+="|openTypedAssetFileDescriptor|"; return null;}
public final  android.content.ContentProviderClient acquireContentProviderClient (android.net.Uri arg0) {__Result__.str+="|acquireContentProviderClient|"; return null;}
public final  android.content.ContentProviderClient acquireContentProviderClient (java.lang.String arg0) {__Result__.str+="|acquireContentProviderClient|"; return null;}
public final  android.content.ContentProviderClient acquireUnstableContentProviderClient (java.lang.String arg0) {__Result__.str+="|acquireUnstableContentProviderClient|"; return null;}
public final  android.content.ContentProviderClient acquireUnstableContentProviderClient (android.net.Uri arg0) {__Result__.str+="|acquireUnstableContentProviderClient|"; return null;}
public final  void registerContentObserver (android.net.Uri arg0,boolean arg1,android.database.ContentObserver arg2) {__Result__.str+="|registerContentObserver|"; return ;}
public final  void unregisterContentObserver (android.database.ContentObserver arg0) {__Result__.str+="|unregisterContentObserver|"; return ;}
public  void takePersistableUriPermission (android.net.Uri arg0,int arg1) {__Result__.str+="|takePersistableUriPermission|"; return ;}
public  void releasePersistableUriPermission (android.net.Uri arg0,int arg1) {__Result__.str+="|releasePersistableUriPermission|"; return ;}
public  java.util.List getPersistedUriPermissions () {__Result__.str+="|getPersistedUriPermissions|"; return null;}
public static  @java.lang.Deprecated() android.content.SyncInfo getCurrentSync () {__Result__.str+="|getCurrentSync|"; return null;}
public  java.util.List getOutgoingPersistedUriPermissions () {__Result__.str+="|getOutgoingPersistedUriPermissions|"; return null;}
public static  void validateSyncExtrasBundle (android.os.Bundle arg0) {__Result__.str+="|validateSyncExtrasBundle|"; return ;}
public static  [Landroid.content.SyncAdapterType; getSyncAdapterTypes () {__Result__.str+="|getSyncAdapterTypes|"; return null;}
public static  boolean getSyncAutomatically (android.accounts.Account arg0,java.lang.String arg1) {__Result__.str+="|getSyncAutomatically|"; return false;}
public static  void setSyncAutomatically (android.accounts.Account arg0,java.lang.String arg1,boolean arg2) {__Result__.str+="|setSyncAutomatically|"; return ;}
public static  void removePeriodicSync (android.accounts.Account arg0,java.lang.String arg1,android.os.Bundle arg2) {__Result__.str+="|removePeriodicSync|"; return ;}
public static  boolean getMasterSyncAutomatically () {__Result__.str+="|getMasterSyncAutomatically|"; return false;}
public static  void setMasterSyncAutomatically (boolean arg0) {__Result__.str+="|setMasterSyncAutomatically|"; return ;}
public static  java.util.List getCurrentSyncs () {__Result__.str+="|getCurrentSyncs|"; return null;}
public static  boolean isSyncPending (android.accounts.Account arg0,java.lang.String arg1) {__Result__.str+="|isSyncPending|"; return false;}
public static  java.lang.Object addStatusChangeListener (int arg0,android.content.SyncStatusObserver arg1) {__Result__.str+="|addStatusChangeListener|"; return null;}
public static  void removeStatusChangeListener (java.lang.Object arg0) {__Result__.str+="|removeStatusChangeListener|"; return ;}
public static  void setIsSyncable (android.accounts.Account arg0,java.lang.String arg1,int arg2) {__Result__.str+="|setIsSyncable|"; return ;}
public static  boolean isSyncActive (android.accounts.Account arg0,java.lang.String arg1) {__Result__.str+="|isSyncActive|"; return false;}
public final  int update (android.net.Uri arg0,android.content.ContentValues arg1,java.lang.String arg2,[Ljava.lang.String; arg3) {__Result__.str+="|update|"; return 0;}
public final  int delete (android.net.Uri arg0,java.lang.String arg1,[Ljava.lang.String; arg2) {__Result__.str+="|delete|"; return 0;}
public final  java.lang.String getType (android.net.Uri arg0) {__Result__.str+="|getType|"; return null;}
public final  android.net.Uri canonicalize (android.net.Uri arg0) {__Result__.str+="|canonicalize|"; return null;}
public final  android.net.Uri insert (android.net.Uri arg0,android.content.ContentValues arg1) {__Result__.str+="|insert|"; return null;}
public final  android.database.Cursor query (android.net.Uri arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,android.os.CancellationSignal arg5) {__Result__.str+="|query|"; return null;}
public final  android.database.Cursor query (android.net.Uri arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4) {__Result__.str+="|query|"; return null;}

/*========inner classes========*/

}