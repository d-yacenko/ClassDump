package android.content.res;
import android.__Result__;


/*===================================*/ 
/*         AssetManager              */
/*===================================*/

public final class AssetManager implements java.lang.AutoCloseable {
/*========fields=========*/
public static final  int ACCESS_BUFFER=0;
public static final  int ACCESS_RANDOM=0;
public static final  int ACCESS_STREAMING=0;
public static final  int ACCESS_UNKNOWN=0;

/*======constructors=====*/


/*========methods========*/
public final native  [Ljava.lang.String; getLocales () {__Result__.str+="|getLocales|"; return null;}
public final  android.content.res.AssetFileDescriptor openFd (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|openFd|"; return null;}
public final  android.content.res.AssetFileDescriptor openNonAssetFd (int arg0,java.lang.String arg1) throws java.io.IOException{__Result__.str+="|openNonAssetFd|"; return null;}
public final  android.content.res.AssetFileDescriptor openNonAssetFd (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|openNonAssetFd|"; return null;}
public final  android.content.res.XmlResourceParser openXmlResourceParser (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|openXmlResourceParser|"; return null;}
public final  android.content.res.XmlResourceParser openXmlResourceParser (int arg0,java.lang.String arg1) throws java.io.IOException{__Result__.str+="|openXmlResourceParser|"; return null;}

public final native  [Ljava.lang.String; list (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|list|"; return null;}
public  void close () {__Result__.str+="|close|"; return ;}
public final  java.io.InputStream open (java.lang.String arg0) throws java.io.IOException{__Result__.str+="|open|"; return null;}
public final  java.io.InputStream open (java.lang.String arg0,int arg1) throws java.io.IOException{__Result__.str+="|open|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*     AssetInputStream              */
/*===================================*/

public final class AssetInputStream extends java.io.InputStream {
/*========fields=========*/


/*======constructors=====*/


/*========methods========*/

public final  int read ([B arg0) throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public final  int read ([B arg0,int arg1,int arg2) throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public final  int read () throws java.io.IOException{__Result__.str+="|read|"; return 0;}
public final  void close () throws java.io.IOException{__Result__.str+="|close|"; return ;}
public final  void mark (int arg0) {__Result__.str+="|mark|"; return ;}
public final  void reset () throws java.io.IOException{__Result__.str+="|reset|"; return ;}
public final  int available () throws java.io.IOException{__Result__.str+="|available|"; return 0;}
public final  long skip (long arg0) throws java.io.IOException{__Result__.str+="|skip|"; return 0;}
public final  boolean markSupported () {__Result__.str+="|markSupported|"; return false;}

/*========inner classes========*/

}
}