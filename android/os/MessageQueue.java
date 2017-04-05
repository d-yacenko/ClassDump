package android.os;
import android.__Result__;


/*===================================*/ 
/*         MessageQueue              */
/*===================================*/

public final class MessageQueue {
/*========fields=========*/

/*======constructors=====*/


/*========methods========*/
public  boolean isIdle () {__Result__.str+="|isIdle|"; return false;}
public  void addIdleHandler (android.os.MessageQueue$IdleHandler arg0) {__Result__.str+="|addIdleHandler|"; return ;}
public  void removeIdleHandler (android.os.MessageQueue$IdleHandler arg0) {__Result__.str+="|removeIdleHandler|"; return ;}
public  void addOnFileDescriptorEventListener (java.io.FileDescriptor arg0,int arg1,android.os.MessageQueue$OnFileDescriptorEventListener arg2) {__Result__.str+="|addOnFileDescriptorEventListener|"; return ;}
public  void removeOnFileDescriptorEventListener (java.io.FileDescriptor arg0) {__Result__.str+="|removeOnFileDescriptorEventListener|"; return ;}


/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/* OnFileDescriptorEventListener              */
/*===================================*/

public abstract static interface OnFileDescriptorEventListener {
/*========fields=========*/
public static final  int EVENT_ERROR=0;
public static final  int EVENT_INPUT=0;
public static final  int EVENT_OUTPUT=0;

/*======constructors=====*/

/*========methods========*/
public abstract  int onFileDescriptorEvents (java.io.FileDescriptor arg0,int arg1) ;

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/*          IdleHandler              */
/*===================================*/

public abstract static interface IdleHandler {
/*========fields=========*/

/*======constructors=====*/

/*========methods========*/
public abstract  boolean queueIdle () ;

/*========inner classes========*/

}
}