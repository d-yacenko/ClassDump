package android.os;
import android.__Result__;


/*===================================*/ 
/*              IBinder              */
/*===================================*/

public abstract interface IBinder {
/*========fields=========*/
public static final  int DUMP_TRANSACTION=0;
public static final  int FIRST_CALL_TRANSACTION=0;
public static final  int FLAG_ONEWAY=0;
public static final  int INTERFACE_TRANSACTION=0;
public static final  int LAST_CALL_TRANSACTION=0;
public static final  int LIKE_TRANSACTION=0;
public static final  int PING_TRANSACTION=0;
public static final  int TWEET_TRANSACTION=0;

/*======constructors=====*/

/*========methods========*/
public abstract  boolean pingBinder () ;
public abstract  void dump (java.io.FileDescriptor arg0,[Ljava.lang.String; arg1) throws android.os.RemoteException;
public abstract  java.lang.String getInterfaceDescriptor () throws android.os.RemoteException;
public abstract  boolean isBinderAlive () ;
public abstract  android.os.IInterface queryLocalInterface (java.lang.String arg0) ;
public abstract  void dumpAsync (java.io.FileDescriptor arg0,[Ljava.lang.String; arg1) throws android.os.RemoteException;
public abstract  boolean transact (int arg0,android.os.Parcel arg1,android.os.Parcel arg2,int arg3) throws android.os.RemoteException;
public abstract  void linkToDeath (android.os.IBinder$DeathRecipient arg0,int arg1) throws android.os.RemoteException;
public abstract  boolean unlinkToDeath (android.os.IBinder$DeathRecipient arg0,int arg1) ;

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*       DeathRecipient              */
/*===================================*/

public abstract static interface DeathRecipient {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  void binderDied () ;

/*========inner classes========*/

}
}