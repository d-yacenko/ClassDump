import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Locale;


/*===================================*/ 
/*          PrintWriter              */
/*===================================*/
 class PrintWriter extends Writer  {
/*========fields=========*/
/*======constructors=====*/
  public  PrintWriter (OutputStream arg0,boolean arg1) {__Result__.str+="|PrintWriter|";}
  public  PrintWriter (String arg0) throws FileNotFoundException{__Result__.str+="|PrintWriter|";}
  public  PrintWriter (File arg0) throws FileNotFoundException{__Result__.str+="|PrintWriter|";}
  public  PrintWriter (File arg0,String arg1) throws FileNotFoundException,UnsupportedEncodingException{__Result__.str+="|PrintWriter|";}
  public  PrintWriter (String arg0,String arg1) throws FileNotFoundException,UnsupportedEncodingException{__Result__.str+="|PrintWriter|";}
  public  PrintWriter (Writer arg0) {__Result__.str+="|PrintWriter|";}
  public  PrintWriter (OutputStream arg0) {__Result__.str+="|PrintWriter|";}
  public  PrintWriter (Writer arg0,boolean arg1) {__Result__.str+="|PrintWriter|";}
/*========methods========*/
  public  void println (double arg0) {__Result__.str+="|println|";}
  public  void println (char[] arg0) {__Result__.str+="|println|";}
  public  void println (float arg0) {__Result__.str+="|println|";}
  public  void println (String arg0) {__Result__.str+="|println|";}
  public  void println (Object arg0) {__Result__.str+="|println|";}
  public  void println (int arg0) {__Result__.str+="|println|";}
  public  void println (char arg0) {__Result__.str+="|println|";}
  public  void println (boolean arg0) {__Result__.str+="|println|";}
  public  void println () {__Result__.str+="|println|";}
  public  void println (long arg0) {__Result__.str+="|println|";}
  public  PrintWriter append (CharSequence arg0,int arg1,int arg2) {__Result__.str+="|append|";return null;}
  public  PrintWriter append (CharSequence arg0) {__Result__.str+="|append|";return null;}
  public  PrintWriter append (char arg0) {__Result__.str+="|append|";return null;}
  public   PrintWriter format (Locale arg0,String arg1,Object[] arg2) {__Result__.str+="|format|";return null;}
  public   PrintWriter format (String arg0,Object[] arg1) {__Result__.str+="|format|";return null;}
  public  void write (char[] arg0,int arg1,int arg2) {__Result__.str+="|write|";}
  public  void write (String arg0,int arg1,int arg2) {__Result__.str+="|write|";}
  public  void write (char[] arg0) {__Result__.str+="|write|";}
  public  void write (int arg0) {__Result__.str+="|write|";}
  public  void write (String arg0) {__Result__.str+="|write|";}
  public  void print (float arg0) {__Result__.str+="|print|";}
  public  void print (long arg0) {__Result__.str+="|print|";}
  public  void print (int arg0) {__Result__.str+="|print|";}
  public  void print (char arg0) {__Result__.str+="|print|";}
  public  void print (boolean arg0) {__Result__.str+="|print|";}
  public  void print (Object arg0) {__Result__.str+="|print|";}
  public  void print (String arg0) {__Result__.str+="|print|";}
  public  void print (char[] arg0) {__Result__.str+="|print|";}
  public  void print (double arg0) {__Result__.str+="|print|";}
  public  void close () {__Result__.str+="|close|";}
  public  void flush () {__Result__.str+="|flush|";}
  public  boolean checkError () {__Result__.str+="|checkError|";return false;}
  public   PrintWriter printf (String arg0,Object[] arg1) {__Result__.str+="|printf|";return null;}
  public   PrintWriter printf (Locale arg0,String arg1,Object[] arg2) {__Result__.str+="|printf|";return null;}
}
