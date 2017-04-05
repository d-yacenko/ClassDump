package android.content;
import android.__Result__;


/*===================================*/ 
/*               Intent              */
/*===================================*/

public class Intent implements android.os.Parcelable,java.lang.Cloneable {
/*========fields=========*/
public static final  java.lang.String ACTION_AIRPLANE_MODE_CHANGED=null;
public static final  java.lang.String ACTION_ALL_APPS=null;
public static final  java.lang.String ACTION_ANSWER=null;
public static final  java.lang.String ACTION_APPLICATION_PREFERENCES=null;
public static final  java.lang.String ACTION_APPLICATION_RESTRICTIONS_CHANGED=null;
public static final  java.lang.String ACTION_APP_ERROR=null;
public static final  java.lang.String ACTION_ASSIST=null;
public static final  java.lang.String ACTION_ATTACH_DATA=null;
public static final  java.lang.String ACTION_BATTERY_CHANGED=null;
public static final  java.lang.String ACTION_BATTERY_LOW=null;
public static final  java.lang.String ACTION_BATTERY_OKAY=null;
public static final  java.lang.String ACTION_BOOT_COMPLETED=null;
public static final  java.lang.String ACTION_BUG_REPORT=null;
public static final  java.lang.String ACTION_CALL=null;
public static final  java.lang.String ACTION_CALL_BUTTON=null;
public static final  java.lang.String ACTION_CAMERA_BUTTON=null;
public static final  java.lang.String ACTION_CHOOSER=null;
public static final  java.lang.String ACTION_CLOSE_SYSTEM_DIALOGS=null;
public static final  java.lang.String ACTION_CONFIGURATION_CHANGED=null;
public static final  java.lang.String ACTION_CREATE_DOCUMENT=null;
public static final  java.lang.String ACTION_CREATE_SHORTCUT=null;
public static final  java.lang.String ACTION_DATE_CHANGED=null;
public static final  java.lang.String ACTION_DEFAULT=null;
public static final  java.lang.String ACTION_DELETE=null;
public static final  java.lang.String ACTION_DEVICE_STORAGE_LOW=null;
public static final  java.lang.String ACTION_DEVICE_STORAGE_OK=null;
public static final  java.lang.String ACTION_DIAL=null;
public static final  java.lang.String ACTION_DOCK_EVENT=null;
public static final  java.lang.String ACTION_DREAMING_STARTED=null;
public static final  java.lang.String ACTION_DREAMING_STOPPED=null;
public static final  java.lang.String ACTION_EDIT=null;
public static final  java.lang.String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE=null;
public static final  java.lang.String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE=null;
public static final  java.lang.String ACTION_FACTORY_TEST=null;
public static final  java.lang.String ACTION_GET_CONTENT=null;
public static final  java.lang.String ACTION_GET_RESTRICTION_ENTRIES=null;
public static final  java.lang.String ACTION_GTALK_SERVICE_CONNECTED=null;
public static final  java.lang.String ACTION_GTALK_SERVICE_DISCONNECTED=null;
public static final  java.lang.String ACTION_HEADSET_PLUG=null;
public static final  java.lang.String ACTION_INPUT_METHOD_CHANGED=null;
public static final  java.lang.String ACTION_INSERT=null;
public static final  java.lang.String ACTION_INSERT_OR_EDIT=null;
public static final  java.lang.String ACTION_INSTALL_PACKAGE=null;
public static final  java.lang.String ACTION_LOCALE_CHANGED=null;
public static final  java.lang.String ACTION_LOCKED_BOOT_COMPLETED=null;
public static final  java.lang.String ACTION_MAIN=null;
public static final  java.lang.String ACTION_MANAGED_PROFILE_ADDED=null;
public static final  java.lang.String ACTION_MANAGED_PROFILE_AVAILABLE=null;
public static final  java.lang.String ACTION_MANAGED_PROFILE_REMOVED=null;
public static final  java.lang.String ACTION_MANAGED_PROFILE_UNAVAILABLE=null;
public static final  java.lang.String ACTION_MANAGED_PROFILE_UNLOCKED=null;
public static final  java.lang.String ACTION_MANAGE_NETWORK_USAGE=null;
public static final  java.lang.String ACTION_MANAGE_PACKAGE_STORAGE=null;
public static final  java.lang.String ACTION_MEDIA_BAD_REMOVAL=null;
public static final  java.lang.String ACTION_MEDIA_BUTTON=null;
public static final  java.lang.String ACTION_MEDIA_CHECKING=null;
public static final  java.lang.String ACTION_MEDIA_EJECT=null;
public static final  java.lang.String ACTION_MEDIA_MOUNTED=null;
public static final  java.lang.String ACTION_MEDIA_NOFS=null;
public static final  java.lang.String ACTION_MEDIA_REMOVED=null;
public static final  java.lang.String ACTION_MEDIA_SCANNER_FINISHED=null;
public static final  java.lang.String ACTION_MEDIA_SCANNER_SCAN_FILE=null;
public static final  java.lang.String ACTION_MEDIA_SCANNER_STARTED=null;
public static final  java.lang.String ACTION_MEDIA_SHARED=null;
public static final  java.lang.String ACTION_MEDIA_UNMOUNTABLE=null;
public static final  java.lang.String ACTION_MEDIA_UNMOUNTED=null;
public static final  java.lang.String ACTION_MY_PACKAGE_REPLACED=null;
public static final  java.lang.String ACTION_NEW_OUTGOING_CALL=null;
public static final  java.lang.String ACTION_OPEN_DOCUMENT=null;
public static final  java.lang.String ACTION_OPEN_DOCUMENT_TREE=null;
public static final  java.lang.String ACTION_PACKAGES_SUSPENDED=null;
public static final  java.lang.String ACTION_PACKAGES_UNSUSPENDED=null;
public static final  java.lang.String ACTION_PACKAGE_ADDED=null;
public static final  java.lang.String ACTION_PACKAGE_CHANGED=null;
public static final  java.lang.String ACTION_PACKAGE_DATA_CLEARED=null;
public static final  java.lang.String ACTION_PACKAGE_FIRST_LAUNCH=null;
public static final  java.lang.String ACTION_PACKAGE_FULLY_REMOVED=null;
public static final  @java.lang.Deprecated() java.lang.String ACTION_PACKAGE_INSTALL=null;
public static final  java.lang.String ACTION_PACKAGE_NEEDS_VERIFICATION=null;
public static final  java.lang.String ACTION_PACKAGE_REMOVED=null;
public static final  java.lang.String ACTION_PACKAGE_REPLACED=null;
public static final  java.lang.String ACTION_PACKAGE_RESTARTED=null;
public static final  java.lang.String ACTION_PACKAGE_VERIFIED=null;
public static final  java.lang.String ACTION_PASTE=null;
public static final  java.lang.String ACTION_PICK=null;
public static final  java.lang.String ACTION_PICK_ACTIVITY=null;
public static final  java.lang.String ACTION_POWER_CONNECTED=null;
public static final  java.lang.String ACTION_POWER_DISCONNECTED=null;
public static final  java.lang.String ACTION_POWER_USAGE_SUMMARY=null;
public static final  java.lang.String ACTION_PROCESS_TEXT=null;
public static final  java.lang.String ACTION_PROVIDER_CHANGED=null;
public static final  java.lang.String ACTION_QUICK_CLOCK=null;
public static final  java.lang.String ACTION_QUICK_VIEW=null;
public static final  java.lang.String ACTION_REBOOT=null;
public static final  java.lang.String ACTION_RUN=null;
public static final  java.lang.String ACTION_SCREEN_OFF=null;
public static final  java.lang.String ACTION_SCREEN_ON=null;
public static final  java.lang.String ACTION_SEARCH=null;
public static final  java.lang.String ACTION_SEARCH_LONG_PRESS=null;
public static final  java.lang.String ACTION_SEND=null;
public static final  java.lang.String ACTION_SENDTO=null;
public static final  java.lang.String ACTION_SEND_MULTIPLE=null;
public static final  java.lang.String ACTION_SET_WALLPAPER=null;
public static final  java.lang.String ACTION_SHOW_APP_INFO=null;
public static final  java.lang.String ACTION_SHUTDOWN=null;
public static final  java.lang.String ACTION_SYNC=null;
public static final  java.lang.String ACTION_SYSTEM_TUTORIAL=null;
public static final  java.lang.String ACTION_TIMEZONE_CHANGED=null;
public static final  java.lang.String ACTION_TIME_CHANGED=null;
public static final  java.lang.String ACTION_TIME_TICK=null;
public static final  java.lang.String ACTION_UID_REMOVED=null;
public static final  @java.lang.Deprecated() java.lang.String ACTION_UMS_CONNECTED=null;
public static final  @java.lang.Deprecated() java.lang.String ACTION_UMS_DISCONNECTED=null;
public static final  java.lang.String ACTION_UNINSTALL_PACKAGE=null;
public static final  java.lang.String ACTION_USER_BACKGROUND=null;
public static final  java.lang.String ACTION_USER_FOREGROUND=null;
public static final  java.lang.String ACTION_USER_INITIALIZE=null;
public static final  java.lang.String ACTION_USER_PRESENT=null;
public static final  java.lang.String ACTION_USER_UNLOCKED=null;
public static final  java.lang.String ACTION_VIEW=null;
public static final  java.lang.String ACTION_VOICE_COMMAND=null;
public static final  @java.lang.Deprecated() java.lang.String ACTION_WALLPAPER_CHANGED=null;
public static final  java.lang.String ACTION_WEB_SEARCH=null;
public static final  java.lang.String CATEGORY_ALTERNATIVE=null;
public static final  java.lang.String CATEGORY_APP_BROWSER=null;
public static final  java.lang.String CATEGORY_APP_CALCULATOR=null;
public static final  java.lang.String CATEGORY_APP_CALENDAR=null;
public static final  java.lang.String CATEGORY_APP_CONTACTS=null;
public static final  java.lang.String CATEGORY_APP_EMAIL=null;
public static final  java.lang.String CATEGORY_APP_GALLERY=null;
public static final  java.lang.String CATEGORY_APP_MAPS=null;
public static final  java.lang.String CATEGORY_APP_MARKET=null;
public static final  java.lang.String CATEGORY_APP_MESSAGING=null;
public static final  java.lang.String CATEGORY_APP_MUSIC=null;
public static final  java.lang.String CATEGORY_BROWSABLE=null;
public static final  java.lang.String CATEGORY_CAR_DOCK=null;
public static final  java.lang.String CATEGORY_CAR_MODE=null;
public static final  java.lang.String CATEGORY_DEFAULT=null;
public static final  java.lang.String CATEGORY_DESK_DOCK=null;
public static final  java.lang.String CATEGORY_DEVELOPMENT_PREFERENCE=null;
public static final  java.lang.String CATEGORY_EMBED=null;
public static final  java.lang.String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST=null;
public static final  java.lang.String CATEGORY_HE_DESK_DOCK=null;
public static final  java.lang.String CATEGORY_HOME=null;
public static final  java.lang.String CATEGORY_INFO=null;
public static final  java.lang.String CATEGORY_LAUNCHER=null;
public static final  java.lang.String CATEGORY_LEANBACK_LAUNCHER=null;
public static final  java.lang.String CATEGORY_LE_DESK_DOCK=null;
public static final  java.lang.String CATEGORY_MONKEY=null;
public static final  java.lang.String CATEGORY_OPENABLE=null;
public static final  java.lang.String CATEGORY_PREFERENCE=null;
public static final  java.lang.String CATEGORY_SAMPLE_CODE=null;
public static final  java.lang.String CATEGORY_SELECTED_ALTERNATIVE=null;
public static final  java.lang.String CATEGORY_TAB=null;
public static final  java.lang.String CATEGORY_TEST=null;
public static final  java.lang.String CATEGORY_UNIT_TEST=null;
public static final  java.lang.String CATEGORY_VOICE=null;
public static final  android.os.Parcelable$Creator CREATOR=null;
public static final  java.lang.String EXTRA_ALARM_COUNT=null;
public static final  java.lang.String EXTRA_ALLOW_MULTIPLE=null;
public static final  @java.lang.Deprecated() java.lang.String EXTRA_ALLOW_REPLACE=null;
public static final  java.lang.String EXTRA_ALTERNATE_INTENTS=null;
public static final  java.lang.String EXTRA_ASSIST_CONTEXT=null;
public static final  java.lang.String EXTRA_ASSIST_INPUT_DEVICE_ID=null;
public static final  java.lang.String EXTRA_ASSIST_INPUT_HINT_KEYBOARD=null;
public static final  java.lang.String EXTRA_ASSIST_PACKAGE=null;
public static final  java.lang.String EXTRA_ASSIST_UID=null;
public static final  java.lang.String EXTRA_BCC=null;
public static final  java.lang.String EXTRA_BUG_REPORT=null;
public static final  java.lang.String EXTRA_CC=null;
public static final  @java.lang.Deprecated() java.lang.String EXTRA_CHANGED_COMPONENT_NAME=null;
public static final  java.lang.String EXTRA_CHANGED_COMPONENT_NAME_LIST=null;
public static final  java.lang.String EXTRA_CHANGED_PACKAGE_LIST=null;
public static final  java.lang.String EXTRA_CHANGED_UID_LIST=null;
public static final  java.lang.String EXTRA_CHOOSER_REFINEMENT_INTENT_SENDER=null;
public static final  java.lang.String EXTRA_CHOOSER_TARGETS=null;
public static final  java.lang.String EXTRA_CHOSEN_COMPONENT=null;
public static final  java.lang.String EXTRA_CHOSEN_COMPONENT_INTENT_SENDER=null;
public static final  java.lang.String EXTRA_DATA_REMOVED=null;
public static final  java.lang.String EXTRA_DOCK_STATE=null;
public static final  int EXTRA_DOCK_STATE_CAR=0;
public static final  int EXTRA_DOCK_STATE_DESK=0;
public static final  int EXTRA_DOCK_STATE_HE_DESK=0;
public static final  int EXTRA_DOCK_STATE_LE_DESK=0;
public static final  int EXTRA_DOCK_STATE_UNDOCKED=0;
public static final  java.lang.String EXTRA_DONT_KILL_APP=null;
public static final  java.lang.String EXTRA_EMAIL=null;
public static final  java.lang.String EXTRA_EXCLUDE_COMPONENTS=null;
public static final  java.lang.String EXTRA_HTML_TEXT=null;
public static final  java.lang.String EXTRA_INDEX=null;
public static final  java.lang.String EXTRA_INITIAL_INTENTS=null;
public static final  java.lang.String EXTRA_INSTALLER_PACKAGE_NAME=null;
public static final  java.lang.String EXTRA_INTENT=null;
public static final  java.lang.String EXTRA_KEY_EVENT=null;
public static final  java.lang.String EXTRA_LOCAL_ONLY=null;
public static final  java.lang.String EXTRA_MIME_TYPES=null;
public static final  java.lang.String EXTRA_NOT_UNKNOWN_SOURCE=null;
public static final  java.lang.String EXTRA_ORIGINATING_URI=null;
public static final  java.lang.String EXTRA_PACKAGE_NAME=null;
public static final  java.lang.String EXTRA_PHONE_NUMBER=null;
public static final  java.lang.String EXTRA_PROCESS_TEXT=null;
public static final  java.lang.String EXTRA_PROCESS_TEXT_READONLY=null;
public static final  java.lang.String EXTRA_QUIET_MODE=null;
public static final  java.lang.String EXTRA_REFERRER=null;
public static final  java.lang.String EXTRA_REFERRER_NAME=null;
public static final  java.lang.String EXTRA_REMOTE_INTENT_TOKEN=null;
public static final  java.lang.String EXTRA_REPLACEMENT_EXTRAS=null;
public static final  java.lang.String EXTRA_REPLACING=null;
public static final  java.lang.String EXTRA_RESTRICTIONS_BUNDLE=null;
public static final  java.lang.String EXTRA_RESTRICTIONS_INTENT=null;
public static final  java.lang.String EXTRA_RESTRICTIONS_LIST=null;
public static final  java.lang.String EXTRA_RESULT_RECEIVER=null;
public static final  java.lang.String EXTRA_RETURN_RESULT=null;
public static final  java.lang.String EXTRA_SHORTCUT_ICON=null;
public static final  java.lang.String EXTRA_SHORTCUT_ICON_RESOURCE=null;
public static final  java.lang.String EXTRA_SHORTCUT_INTENT=null;
public static final  java.lang.String EXTRA_SHORTCUT_NAME=null;
public static final  java.lang.String EXTRA_SHUTDOWN_USERSPACE_ONLY=null;
public static final  java.lang.String EXTRA_STREAM=null;
public static final  java.lang.String EXTRA_SUBJECT=null;
public static final  java.lang.String EXTRA_TEMPLATE=null;
public static final  java.lang.String EXTRA_TEXT=null;
public static final  java.lang.String EXTRA_TITLE=null;
public static final  java.lang.String EXTRA_UID=null;
public static final  java.lang.String EXTRA_USER=null;
public static final  int FILL_IN_ACTION=0;
public static final  int FILL_IN_CATEGORIES=0;
public static final  int FILL_IN_CLIP_DATA=0;
public static final  int FILL_IN_COMPONENT=0;
public static final  int FILL_IN_DATA=0;
public static final  int FILL_IN_PACKAGE=0;
public static final  int FILL_IN_SELECTOR=0;
public static final  int FILL_IN_SOURCE_BOUNDS=0;
public static final  int FLAG_ACTIVITY_BROUGHT_TO_FRONT=0;
public static final  int FLAG_ACTIVITY_CLEAR_TASK=0;
public static final  int FLAG_ACTIVITY_CLEAR_TOP=0;
public static final  @java.lang.Deprecated() int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET=0;
public static final  int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS=0;
public static final  int FLAG_ACTIVITY_FORWARD_RESULT=0;
public static final  int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY=0;
public static final  int FLAG_ACTIVITY_LAUNCH_ADJACENT=0;
public static final  int FLAG_ACTIVITY_MULTIPLE_TASK=0;
public static final  int FLAG_ACTIVITY_NEW_DOCUMENT=0;
public static final  int FLAG_ACTIVITY_NEW_TASK=0;
public static final  int FLAG_ACTIVITY_NO_ANIMATION=0;
public static final  int FLAG_ACTIVITY_NO_HISTORY=0;
public static final  int FLAG_ACTIVITY_NO_USER_ACTION=0;
public static final  int FLAG_ACTIVITY_PREVIOUS_IS_TOP=0;
public static final  int FLAG_ACTIVITY_REORDER_TO_FRONT=0;
public static final  int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED=0;
public static final  int FLAG_ACTIVITY_RETAIN_IN_RECENTS=0;
public static final  int FLAG_ACTIVITY_SINGLE_TOP=0;
public static final  int FLAG_ACTIVITY_TASK_ON_HOME=0;
public static final  int FLAG_DEBUG_LOG_RESOLUTION=0;
public static final  int FLAG_EXCLUDE_STOPPED_PACKAGES=0;
public static final  int FLAG_FROM_BACKGROUND=0;
public static final  int FLAG_GRANT_PERSISTABLE_URI_PERMISSION=0;
public static final  int FLAG_GRANT_PREFIX_URI_PERMISSION=0;
public static final  int FLAG_GRANT_READ_URI_PERMISSION=0;
public static final  int FLAG_GRANT_WRITE_URI_PERMISSION=0;
public static final  int FLAG_INCLUDE_STOPPED_PACKAGES=0;
public static final  int FLAG_RECEIVER_FOREGROUND=0;
public static final  int FLAG_RECEIVER_NO_ABORT=0;
public static final  int FLAG_RECEIVER_REGISTERED_ONLY=0;
public static final  int FLAG_RECEIVER_REPLACE_PENDING=0;
public static final  java.lang.String METADATA_DOCK_HOME=null;
public static final  int URI_ALLOW_UNSAFE=0;
public static final  int URI_ANDROID_APP_SCHEME=0;
public static final  int URI_INTENT_SCHEME=0;

/*======constructors=====*/
public  Intent (java.lang.String arg0,android.net.Uri arg1,android.content.Context arg2,java.lang.Class arg3) {__Result__.str+="|Intent|";}
public  Intent (android.content.Context arg0,java.lang.Class arg1) {__Result__.str+="|Intent|";}
public  Intent (java.lang.String arg0,android.net.Uri arg1) {__Result__.str+="|Intent|";}
public  Intent () {__Result__.str+="|Intent|";}
public  Intent (android.content.Intent arg0) {__Result__.str+="|Intent|";}
public  Intent (java.lang.String arg0) {__Result__.str+="|Intent|";}

/*========methods========*/
public  android.net.Uri getData () {__Result__.str+="|getData|"; return null;}
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public  boolean hasFileDescriptors () {__Result__.str+="|hasFileDescriptors|"; return false;}
public  android.content.Intent setAction (java.lang.String arg0) {__Result__.str+="|setAction|"; return null;}
public  void readFromParcel (android.os.Parcel arg0) {__Result__.str+="|readFromParcel|"; return ;}
public  android.content.Intent setClassName (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|setClassName|"; return null;}
public  android.content.Intent setClassName (android.content.Context arg0,java.lang.String arg1) {__Result__.str+="|setClassName|"; return null;}
public  android.os.Bundle getExtras () {__Result__.str+="|getExtras|"; return null;}
public  int getFlags () {__Result__.str+="|getFlags|"; return 0;}
public  java.lang.String getAction () {__Result__.str+="|getAction|"; return null;}
public  android.content.ClipData getClipData () {__Result__.str+="|getClipData|"; return null;}
public  android.content.Intent setType (java.lang.String arg0) {__Result__.str+="|setType|"; return null;}
public  android.content.Intent setFlags (int arg0) {__Result__.str+="|setFlags|"; return null;}
public  android.content.Intent setData (android.net.Uri arg0) {__Result__.str+="|setData|"; return null;}
public static  android.content.Intent createChooser (android.content.Intent arg0,java.lang.CharSequence arg1) {__Result__.str+="|createChooser|"; return null;}
public static  android.content.Intent createChooser (android.content.Intent arg0,java.lang.CharSequence arg1,android.content.IntentSender arg2) {__Result__.str+="|createChooser|"; return null;}
public  android.content.Intent cloneFilter () {__Result__.str+="|cloneFilter|"; return null;}
public static  android.content.Intent makeMainActivity (android.content.ComponentName arg0) {__Result__.str+="|makeMainActivity|"; return null;}
public static  android.content.Intent makeMainSelectorActivity (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|makeMainSelectorActivity|"; return null;}
public static  android.content.Intent makeRestartActivityTask (android.content.ComponentName arg0) {__Result__.str+="|makeRestartActivityTask|"; return null;}
public static  @java.lang.Deprecated() android.content.Intent getIntent (java.lang.String arg0) throws java.net.URISyntaxException{__Result__.str+="|getIntent|"; return null;}
public static  android.content.Intent parseUri (java.lang.String arg0,int arg1) throws java.net.URISyntaxException{__Result__.str+="|parseUri|"; return null;}
public static  android.content.Intent getIntentOld (java.lang.String arg0) throws java.net.URISyntaxException{__Result__.str+="|getIntentOld|"; return null;}
public  java.lang.String getDataString () {__Result__.str+="|getDataString|"; return null;}
public  java.lang.String resolveType (android.content.ContentResolver arg0) {__Result__.str+="|resolveType|"; return null;}
public  java.lang.String resolveType (android.content.Context arg0) {__Result__.str+="|resolveType|"; return null;}
public  java.lang.String resolveTypeIfNeeded (android.content.ContentResolver arg0) {__Result__.str+="|resolveTypeIfNeeded|"; return null;}
public  boolean hasCategory (java.lang.String arg0) {__Result__.str+="|hasCategory|"; return false;}
public  java.util.Set getCategories () {__Result__.str+="|getCategories|"; return null;}
public  android.content.Intent getSelector () {__Result__.str+="|getSelector|"; return null;}
public  void setExtrasClassLoader (java.lang.ClassLoader arg0) {__Result__.str+="|setExtrasClassLoader|"; return ;}
public  boolean hasExtra (java.lang.String arg0) {__Result__.str+="|hasExtra|"; return false;}
public  boolean getBooleanExtra (java.lang.String arg0,boolean arg1) {__Result__.str+="|getBooleanExtra|"; return false;}
public  byte getByteExtra (java.lang.String arg0,byte arg1) {__Result__.str+="|getByteExtra|"; return 0;}
public  short getShortExtra (java.lang.String arg0,short arg1) {__Result__.str+="|getShortExtra|"; return 0;}
public  char getCharExtra (java.lang.String arg0,char arg1) {__Result__.str+="|getCharExtra|"; return 0;}
public  int getIntExtra (java.lang.String arg0,int arg1) {__Result__.str+="|getIntExtra|"; return 0;}
public  long getLongExtra (java.lang.String arg0,long arg1) {__Result__.str+="|getLongExtra|"; return 0;}
public  float getFloatExtra (java.lang.String arg0,float arg1) {__Result__.str+="|getFloatExtra|"; return 0f;}
public  double getDoubleExtra (java.lang.String arg0,double arg1) {__Result__.str+="|getDoubleExtra|"; return 0;}
public  java.lang.String getStringExtra (java.lang.String arg0) {__Result__.str+="|getStringExtra|"; return null;}
public  java.lang.CharSequence getCharSequenceExtra (java.lang.String arg0) {__Result__.str+="|getCharSequenceExtra|"; return null;}
public  android.os.Parcelable getParcelableExtra (java.lang.String arg0) {__Result__.str+="|getParcelableExtra|"; return null;}
public  [Landroid.os.Parcelable; getParcelableArrayExtra (java.lang.String arg0) {__Result__.str+="|getParcelableArrayExtra|"; return null;}
public  java.util.ArrayList getParcelableArrayListExtra (java.lang.String arg0) {__Result__.str+="|getParcelableArrayListExtra|"; return null;}
public  java.io.Serializable getSerializableExtra (java.lang.String arg0) {__Result__.str+="|getSerializableExtra|"; return null;}
public  java.util.ArrayList getIntegerArrayListExtra (java.lang.String arg0) {__Result__.str+="|getIntegerArrayListExtra|"; return null;}
public  java.util.ArrayList getStringArrayListExtra (java.lang.String arg0) {__Result__.str+="|getStringArrayListExtra|"; return null;}
public  java.util.ArrayList getCharSequenceArrayListExtra (java.lang.String arg0) {__Result__.str+="|getCharSequenceArrayListExtra|"; return null;}
public  [Z getBooleanArrayExtra (java.lang.String arg0) {__Result__.str+="|getBooleanArrayExtra|"; return null;}
public  [B getByteArrayExtra (java.lang.String arg0) {__Result__.str+="|getByteArrayExtra|"; return null;}
public  [S getShortArrayExtra (java.lang.String arg0) {__Result__.str+="|getShortArrayExtra|"; return null;}
public  [C getCharArrayExtra (java.lang.String arg0) {__Result__.str+="|getCharArrayExtra|"; return null;}
public  [I getIntArrayExtra (java.lang.String arg0) {__Result__.str+="|getIntArrayExtra|"; return null;}
public  [J getLongArrayExtra (java.lang.String arg0) {__Result__.str+="|getLongArrayExtra|"; return null;}
public  [F getFloatArrayExtra (java.lang.String arg0) {__Result__.str+="|getFloatArrayExtra|"; return null;}
public  [D getDoubleArrayExtra (java.lang.String arg0) {__Result__.str+="|getDoubleArrayExtra|"; return null;}
public  [Ljava.lang.String; getStringArrayExtra (java.lang.String arg0) {__Result__.str+="|getStringArrayExtra|"; return null;}
public  [Ljava.lang.CharSequence; getCharSequenceArrayExtra (java.lang.String arg0) {__Result__.str+="|getCharSequenceArrayExtra|"; return null;}
public  android.os.Bundle getBundleExtra (java.lang.String arg0) {__Result__.str+="|getBundleExtra|"; return null;}
public  android.content.ComponentName getComponent () {__Result__.str+="|getComponent|"; return null;}
public  android.graphics.Rect getSourceBounds () {__Result__.str+="|getSourceBounds|"; return null;}
public  android.content.ComponentName resolveActivity (android.content.pm.PackageManager arg0) {__Result__.str+="|resolveActivity|"; return null;}
public  android.content.pm.ActivityInfo resolveActivityInfo (android.content.pm.PackageManager arg0,int arg1) {__Result__.str+="|resolveActivityInfo|"; return null;}
public  android.content.Intent setDataAndNormalize (android.net.Uri arg0) {__Result__.str+="|setDataAndNormalize|"; return null;}
public  android.content.Intent setTypeAndNormalize (java.lang.String arg0) {__Result__.str+="|setTypeAndNormalize|"; return null;}
public  android.content.Intent setDataAndType (android.net.Uri arg0,java.lang.String arg1) {__Result__.str+="|setDataAndType|"; return null;}
public  android.content.Intent setDataAndTypeAndNormalize (android.net.Uri arg0,java.lang.String arg1) {__Result__.str+="|setDataAndTypeAndNormalize|"; return null;}
public  android.content.Intent addCategory (java.lang.String arg0) {__Result__.str+="|addCategory|"; return null;}
public  void removeCategory (java.lang.String arg0) {__Result__.str+="|removeCategory|"; return ;}
public  void setSelector (android.content.Intent arg0) {__Result__.str+="|setSelector|"; return ;}
public  void setClipData (android.content.ClipData arg0) {__Result__.str+="|setClipData|"; return ;}
public  android.content.Intent putExtra (java.lang.String arg0,[D arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[J arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[F arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,java.lang.String arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,java.lang.CharSequence arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,android.os.Parcelable arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[S arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[B arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[Z arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[C arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,java.io.Serializable arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[I arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[Ljava.lang.String; arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,boolean arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,byte arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,char arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[Ljava.lang.CharSequence; arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,android.os.Bundle arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,[Landroid.os.Parcelable; arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,double arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,float arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,long arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,int arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putExtra (java.lang.String arg0,short arg1) {__Result__.str+="|putExtra|"; return null;}
public  android.content.Intent putParcelableArrayListExtra (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putParcelableArrayListExtra|"; return null;}
public  android.content.Intent putIntegerArrayListExtra (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putIntegerArrayListExtra|"; return null;}
public  android.content.Intent putStringArrayListExtra (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putStringArrayListExtra|"; return null;}
public  android.content.Intent putCharSequenceArrayListExtra (java.lang.String arg0,java.util.ArrayList arg1) {__Result__.str+="|putCharSequenceArrayListExtra|"; return null;}
public  android.content.Intent putExtras (android.os.Bundle arg0) {__Result__.str+="|putExtras|"; return null;}
public  android.content.Intent putExtras (android.content.Intent arg0) {__Result__.str+="|putExtras|"; return null;}
public  android.content.Intent replaceExtras (android.content.Intent arg0) {__Result__.str+="|replaceExtras|"; return null;}
public  android.content.Intent replaceExtras (android.os.Bundle arg0) {__Result__.str+="|replaceExtras|"; return null;}
public  void removeExtra (java.lang.String arg0) {__Result__.str+="|removeExtra|"; return ;}
public  android.content.Intent addFlags (int arg0) {__Result__.str+="|addFlags|"; return null;}
public  android.content.Intent setPackage (java.lang.String arg0) {__Result__.str+="|setPackage|"; return null;}
public  android.content.Intent setComponent (android.content.ComponentName arg0) {__Result__.str+="|setComponent|"; return null;}
public  android.content.Intent setClass (android.content.Context arg0,java.lang.Class arg1) {__Result__.str+="|setClass|"; return null;}
public  void setSourceBounds (android.graphics.Rect arg0) {__Result__.str+="|setSourceBounds|"; return ;}
public  int fillIn (android.content.Intent arg0,int arg1) {__Result__.str+="|fillIn|"; return 0;}
public  boolean filterEquals (android.content.Intent arg0) {__Result__.str+="|filterEquals|"; return false;}
public  int filterHashCode () {__Result__.str+="|filterHashCode|"; return 0;}
public static  android.content.Intent parseIntent (android.content.res.Resources arg0,org.xmlpull.v1.XmlPullParser arg1,android.util.AttributeSet arg2) throws org.xmlpull.v1.XmlPullParserException,java.io.IOException{__Result__.str+="|parseIntent|"; return null;}
public static  java.lang.String normalizeMimeType (java.lang.String arg0) {__Result__.str+="|normalizeMimeType|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}
public  java.lang.Object clone () {__Result__.str+="|clone|"; return null;}
public  java.lang.String getPackage () {__Result__.str+="|getPackage|"; return null;}
public  java.lang.String getType () {__Result__.str+="|getType|"; return null;}
public  java.lang.String getScheme () {__Result__.str+="|getScheme|"; return null;}
public  @java.lang.Deprecated() java.lang.String toURI () {__Result__.str+="|toURI|"; return null;}
public  java.lang.String toUri (int arg0) {__Result__.str+="|toUri|"; return null;}

/*========inner classes========*/
import android.__Result__;


/*===================================*/ 
/*     FilterComparison              */
/*===================================*/

public static final class FilterComparison {
/*========fields=========*/

/*======constructors=====*/
public  FilterComparison (android.content.Intent arg0) {__Result__.str+="|FilterComparison|";}

/*========methods========*/
public  android.content.Intent getIntent () {__Result__.str+="|getIntent|"; return null;}
public  boolean equals (java.lang.Object arg0) {__Result__.str+="|equals|"; return false;}
public  int hashCode () {__Result__.str+="|hashCode|"; return 0;}

/*========inner classes========*/

}import android.__Result__;


/*===================================*/ 
/* ShortcutIconResource              */
/*===================================*/

public static class ShortcutIconResource implements android.os.Parcelable {
/*========fields=========*/
public static final  android.os.Parcelable$Creator CREATOR=null;
public  java.lang.String packageName;
public  java.lang.String resourceName;

/*======constructors=====*/
public  ShortcutIconResource () {__Result__.str+="|ShortcutIconResource|";}

/*========methods========*/
public  void writeToParcel (android.os.Parcel arg0,int arg1) {__Result__.str+="|writeToParcel|"; return ;}
public  int describeContents () {__Result__.str+="|describeContents|"; return 0;}
public static  android.content.Intent$ShortcutIconResource fromContext (android.content.Context arg0,int arg1) {__Result__.str+="|fromContext|"; return null;}
public  java.lang.String toString () {__Result__.str+="|toString|"; return null;}

/*========inner classes========*/

}
}