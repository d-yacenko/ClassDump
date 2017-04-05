package android.content;
import android.__Result__;


/*===================================*/ 
/*      ContentProvider              */
/*===================================*/

public abstract class ContentProvider implements android.content.ComponentCallbacks2 {
/*========fields=========*/

/*======constructors=====*/
public  ContentProvider () {__Result__.str+="|ContentProvider|";}

/*========methods========*/
public  void dump (java.io.FileDescriptor arg0,java.io.PrintWriter arg1,[Ljava.lang.String; arg2) {__Result__.str+="|dump|"; return ;}
public  android.net.Uri uncanonicalize (android.net.Uri arg0) {__Result__.str+="|uncanonicalize|"; return null;}
public  void onConfigurationChanged (android.content.res.Configuration arg0) {__Result__.str+="|onConfigurationChanged|"; return ;}
public  [Ljava.lang.String; getStreamTypes (android.net.Uri arg0,java.lang.String arg1) {__Result__.str+="|getStreamTypes|"; return null;}
public  [Landroid.content.ContentProviderResult; applyBatch (java.util.ArrayList arg0) throws android.content.OperationApplicationException{__Result__.str+="|applyBatch|"; return null;}
public  android.os.Bundle call (java.lang.String arg0,java.lang.String arg1,android.os.Bundle arg2) {__Result__.str+="|call|"; return null;}
public  int bulkInsert (android.net.Uri arg0,[Landroid.content.ContentValues; arg1) {__Result__.str+="|bulkInsert|"; return 0;}
public  void onLowMemory () {__Result__.str+="|onLowMemory|"; return ;}
public final  java.lang.String getReadPermission () {__Result__.str+="|getReadPermission|"; return null;}
public final  java.lang.String getWritePermission () {__Result__.str+="|getWritePermission|"; return null;}
public  android.os.ParcelFileDescriptor openFile (android.net.Uri arg0,java.lang.String arg1,android.os.CancellationSignal arg2) throws java.io.FileNotFoundException{__Result__.str+="|openFile|"; return null;}
public  android.os.ParcelFileDescriptor openFile (android.net.Uri arg0,java.lang.String arg1) throws java.io.FileNotFoundException{__Result__.str+="|openFile|"; return null;}
public  android.content.res.AssetFileDescriptor openAssetFile (android.net.Uri arg0,java.lang.String arg1) throws java.io.FileNotFoundException{__Result__.str+="|openAssetFile|"; return null;}
public  android.content.res.AssetFileDescriptor openAssetFile (android.net.Uri arg0,java.lang.String arg1,android.os.CancellationSignal arg2) throws java.io.FileNotFoundException{__Result__.str+="|openAssetFile|"; return null;}
public final  java.lang.String getCallingPackage () {__Result__.str+="|getCallingPackage|"; return null;}



public final  [Landroid.content.pm.PathPermission; getPathPermissions () {__Result__.str+="|getPathPermissions|"; return null;}
public abstract  boolean onCreate () ;
public  void onTrimMemory (int arg0) {__Result__.str+="|onTrimMemory|"; return ;}

public  android.content.res.AssetFileDescriptor openTypedAssetFile (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2) throws java.io.FileNotFoundException{__Result__.str+="|openTypedAssetFile|"; return null;}
public  android.content.res.AssetFileDescriptor openTypedAssetFile (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2,android.os.CancellationSignal arg3) throws java.io.FileNotFoundException{__Result__.str+="|openTypedAssetFile|"; return null;}
public  android.os.ParcelFileDescriptor openPipeHelper (android.net.Uri arg0,java.lang.String arg1,android.os.Bundle arg2,java.lang.Object arg3,android.content.ContentProvider$PipeDataWriter arg4) throws java.io.FileNotFoundException{__Result__.str+="|openPipeHelper|"; return null;}

public  void attachInfo (android.content.Context arg0,android.content.pm.ProviderInfo arg1) {__Result__.str+="|attachInfo|"; return ;}
public  void shutdown () {__Result__.str+="|shutdown|"; return ;}
public abstract  int update (android.net.Uri arg0,android.content.ContentValues arg1,java.lang.String arg2,[Ljava.lang.String; arg3) ;
public abstract  int delete (android.net.Uri arg0,java.lang.String arg1,[Ljava.lang.String; arg2) ;
public final  android.content.Context getContext () {__Result__.str+="|getContext|"; return null;}
public abstract  java.lang.String getType (android.net.Uri arg0) ;
public  android.net.Uri canonicalize (android.net.Uri arg0) {__Result__.str+="|canonicalize|"; return null;}
public abstract  android.net.Uri insert (android.net.Uri arg0,android.content.ContentValues arg1) ;
public abstract  android.database.Cursor query (android.net.Uri arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4) ;
public  android.database.Cursor query (android.net.Uri arg0,[Ljava.lang.String; arg1,java.lang.String arg2,[Ljava.lang.String; arg3,java.lang.String arg4,android.os.CancellationSignal arg5) {__Result__.str+="|query|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*       PipeDataWriter              */
/*===================================*/

public abstract static interface PipeDataWriter {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void writeDataToPipe (android.os.ParcelFileDescriptor arg0,android.net.Uri arg1,java.lang.String arg2,android.os.Bundle arg3,java.lang.Object arg4) ;

/*========inner classes========*/

}
}