package android.content;
import android.__Result__;


/*===================================*/ 
/* ContentProviderClient              */
/*===================================*/

public class ContentProviderClient implements java.lang.AutoCloseable {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public final  android.net.Uri uncanonicalize (android.net.Uri arg0) throws android.os.RemoteException{__Result__.str+="|uncanonicalize|"; return null;}
public  [Ljava.lang.String; getStreamTypes (android.net.Uri arg0,java.lang.String arg1) throws android.os.RemoteException{__Result__.str+="|getStreamTypes|"; return null;}
public  [Landroid.content.ContentProviderResult; applyBatch (java.util.ArrayList arg0) throws android.os.RemoteException,android.content.OperationApplicationException{__Result__.str+="|applyBatch|"; return null;}
public  android.os.Bundle call (java.lang.String arg0,java.lang.String arg1,android.os.Bundle arg2) throws android.os.RemoteException{__Result__.str+="|call|"; return null;}
public  int bulkInsert (android.net.Uri arg0,[Landroid.content.ContentValues; arg1) throws android.os.RemoteException{__Result__.str+="|bulkInsert|"; return 0;}
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2,android.os.CancellationSignal arg3) throws android.os.RemoteException,java.io.FileNotFoundException{__Result__.str+="|openTypedAssetFileDescriptor|"; return null;}
public final  android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2) throws android.os.RemoteException,java.io.FileNotFoundException{__Result__.str+="|openTypedAssetFileDescriptor|"; return null;}
public  android.os.ParcelFileDescriptor openFile (android.net.Uri arg0,java.lang.String arg1,android.os.CancellationSignal arg2) throws android.os.RemoteException,java.io.FileNotFoundException{__Result__.str+="|openFile|"; return null;}
public  android.os.ParcelFileDescriptor openFile (android.net.Uri arg0,java.lang.String arg1) throws android.os.RemoteException,java.io.FileNotFoundException{__Result__.str+="|openFile|"; return null;}
public  android.content.res.AssetFileDescriptor openAssetFile (android.net.Uri arg0,java.lang.String arg1,android.os.CancellationSignal arg2) throws android.os.RemoteException,java.io.FileNotFoundException{__Result__.str+="|openAssetFile|"; return null;}
public  android.content.res.AssetFileDescriptor openAssetFile (android.net.Uri arg0,java.lang.String arg1) throws android.os.RemoteException,java.io.FileNotFoundException{__Result__.str+="|openAssetFile|"; return null;}
public  android.content.ContentProvider getLocalContentProvider () {__Result__.str+="|getLocalContentProvider|"; return null;}

public  int update (android.net.Uri arg0,android.content.ContentValues arg1,java.lang.String arg2,[Ljava.lang.String; arg3) throws android.os.RemoteException{__Result__.str+="|update|"; return 0;}
public  int delete (android.net.Uri arg0,java.lang.String arg1,[Ljava.lang.String; arg2) throws android.os.RemoteException{__Result__.str+="|delete|"; return 0;}
public  void close () {__Result__.str+="|close|"; return ;}
public  java.lang.String getType (android.net.Uri arg0) throws android.os.RemoteException{__Result__.str+="|getType|"; return null;}
public final  android.net.Uri canonicalize (android.net.Uri arg0) throws android.os.RemoteException{__Result__.str+="|canonicalize|"; return null;}
public  android.net.Uri insert (android.net.Uri arg0,android.content.ContentValues arg1) throws android.os.RemoteException{__Result__.str+="|insert|"; return null;}
public  android.database.Cursor query (android.net.Uri arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,android.os.CancellationSignal arg5) throws android.os.RemoteException{__Result__.str+="|query|"; return null;}
public  android.database.Cursor query (android.net.Uri arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4) throws android.os.RemoteException{__Result__.str+="|query|"; return null;}
public  @java.lang.Deprecated() boolean release () {__Result__.str+="|release|"; return false;}

/*========inner classes========*/

}