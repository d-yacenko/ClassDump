import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;


/*===================================*/ 
/*                 File              */
/*===================================*/
 class File implements Serializable,Comparable<File> {
/*========fields=========*/
  public static final  char separatorChar='/';
  public static final  String separator="/";
  public static final  char pathSeparatorChar='/';
  public static final  String pathSeparator="/";
/*======constructors=====*/
  public  File (String arg0,String arg1) {__Result__.str+="|File|";}
  public  File (String arg0) {__Result__.str+="|File|";}
  public  File (File arg0,String arg1) {__Result__.str+="|File|";}
  public  File (URI arg0) {__Result__.str+="|File|";}
/*========methods========*/
  public  boolean equals (Object arg0) {__Result__.str+="|equals|";return false;}
  public  String toString () {__Result__.str+="|toString|";return null;}
  public  int hashCode () {__Result__.str+="|hashCode|";return 0;}
  public  int compareTo (File arg0) {__Result__.str+="|compareTo|";return 0;}
  public  String getName () {__Result__.str+="|getName|";return null;}
  public  long length () {__Result__.str+="|length|";return 0;}
  public  String getCanonicalPath () throws IOException{__Result__.str+="|getCanonicalPath|";return null;}
  public  String getParent () {__Result__.str+="|getParent|";return null;}
  public  boolean isAbsolute () {__Result__.str+="|isAbsolute|";return false;}
  public  boolean delete () {__Result__.str+="|delete|";return false;}
  public  boolean setReadOnly () {__Result__.str+="|setReadOnly|";return false;}
  public  String[] list () {__Result__.str+="|list|";return null;}
  public  String[] list (FilenameFilter arg0) {__Result__.str+="|list|";return null;}
  public  String getPath () {__Result__.str+="|getPath|";return null;}
  public  boolean canExecute () {__Result__.str+="|canExecute|";return false;}
  public  boolean canRead () {__Result__.str+="|canRead|";return false;}
  public  boolean canWrite () {__Result__.str+="|canWrite|";return false;}
  public  boolean createNewFile () throws IOException{__Result__.str+="|createNewFile|";return false;}
  public static  File createTempFile (String arg0,String arg1,File arg2) throws IOException{__Result__.str+="|createTempFile|";return null;}
  public static  File createTempFile (String arg0,String arg1) throws IOException{__Result__.str+="|createTempFile|";return null;}
  public  void deleteOnExit () {__Result__.str+="|deleteOnExit|";}
  public  boolean exists () {__Result__.str+="|exists|";return false;}
  public  File getAbsoluteFile () {__Result__.str+="|getAbsoluteFile|";return null;}
  public  String getAbsolutePath () {__Result__.str+="|getAbsolutePath|";return null;}
  public  File getCanonicalFile () throws IOException{__Result__.str+="|getCanonicalFile|";return null;}
  public  long getFreeSpace () {__Result__.str+="|getFreeSpace|";return 0;}
  public  File getParentFile () {__Result__.str+="|getParentFile|";return null;}
  public  long getTotalSpace () {__Result__.str+="|getTotalSpace|";return 0;}
  public  long getUsableSpace () {__Result__.str+="|getUsableSpace|";return 0;}
  public  boolean isDirectory () {__Result__.str+="|isDirectory|";return false;}
  public  boolean isFile () {__Result__.str+="|isFile|";return false;}
  public  boolean isHidden () {__Result__.str+="|isHidden|";return false;}
  public  long lastModified () {__Result__.str+="|lastModified|";return 0;}
  public  File[] listFiles () {__Result__.str+="|listFiles|";return null;}
  public  File[] listFiles (FileFilter arg0) {__Result__.str+="|listFiles|";return null;}
  public  File[] listFiles (FilenameFilter arg0) {__Result__.str+="|listFiles|";return null;}
  public static  File[] listRoots () {__Result__.str+="|listRoots|";return null;}
  public  boolean mkdir () {__Result__.str+="|mkdir|";return false;}
  public  boolean mkdirs () {__Result__.str+="|mkdirs|";return false;}
  public  boolean renameTo (File arg0) {__Result__.str+="|renameTo|";return false;}
  public  boolean setExecutable (boolean arg0,boolean arg1) {__Result__.str+="|setExecutable|";return false;}
  public  boolean setExecutable (boolean arg0) {__Result__.str+="|setExecutable|";return false;}
  public  boolean setLastModified (long arg0) {__Result__.str+="|setLastModified|";return false;}
  public  boolean setReadable (boolean arg0) {__Result__.str+="|setReadable|";return false;}
  public  boolean setReadable (boolean arg0,boolean arg1) {__Result__.str+="|setReadable|";return false;}
  public  boolean setWritable (boolean arg0) {__Result__.str+="|setWritable|";return false;}
  public  boolean setWritable (boolean arg0,boolean arg1) {__Result__.str+="|setWritable|";return false;}
  public  Path toPath () {__Result__.str+="|toPath|";return null;}
  public  URI toURI () {__Result__.str+="|toURI|";return null;}
  public  @java.lang.Deprecated() URL toURL () throws MalformedURLException{__Result__.str+="|toURL|";return null;}
}
