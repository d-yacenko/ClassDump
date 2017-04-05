import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;


/*===================================*/ 
/*              Scanner              */
/*===================================*/
 class Scanner implements Iterator<String>,Closeable {
/*========fields=========*/
/*======constructors=====*/
  public  Scanner (Path arg0) throws IOException{__Result__.str+="|Scanner|";}
  public  Scanner (Path arg0,String arg1) throws IOException{__Result__.str+="|Scanner|";}
  public  Scanner (ReadableByteChannel arg0,String arg1) {__Result__.str+="|Scanner|";}
  public  Scanner (String arg0) {__Result__.str+="|Scanner|";}
  public  Scanner (ReadableByteChannel arg0) {__Result__.str+="|Scanner|";}
  public  Scanner (InputStream arg0,String arg1) {__Result__.str+="|Scanner|";}
  public  Scanner (InputStream arg0) {__Result__.str+="|Scanner|";}
  public  Scanner (Readable arg0) {__Result__.str+="|Scanner|";}
  public  Scanner (File arg0,String arg1) throws FileNotFoundException{__Result__.str+="|Scanner|";}
  public  Scanner (File arg0) throws FileNotFoundException{__Result__.str+="|Scanner|";}
/*========methods========*/
  public  Pattern delimiter () {__Result__.str+="|delimiter|";return null;}
  public  String findInLine (Pattern arg0) {__Result__.str+="|findInLine|";return null;}
  public  String findInLine (String arg0) {__Result__.str+="|findInLine|";return null;}
  public  String findWithinHorizon (Pattern arg0,int arg1) {__Result__.str+="|findWithinHorizon|";return null;}
  public  String findWithinHorizon (String arg0,int arg1) {__Result__.str+="|findWithinHorizon|";return null;}
  public  boolean hasNextBigDecimal () {__Result__.str+="|hasNextBigDecimal|";return false;}
  public  boolean hasNextBigInteger () {__Result__.str+="|hasNextBigInteger|";return false;}
  public  boolean hasNextBigInteger (int arg0) {__Result__.str+="|hasNextBigInteger|";return false;}
  public  boolean hasNextBoolean () {__Result__.str+="|hasNextBoolean|";return false;}
  public  boolean hasNextByte () {__Result__.str+="|hasNextByte|";return false;}
  public  boolean hasNextByte (int arg0) {__Result__.str+="|hasNextByte|";return false;}
  public  boolean hasNextDouble () {__Result__.str+="|hasNextDouble|";return false;}
  public  boolean hasNextFloat () {__Result__.str+="|hasNextFloat|";return false;}
  public  boolean hasNextInt () {__Result__.str+="|hasNextInt|";return false;}
  public  boolean hasNextInt (int arg0) {__Result__.str+="|hasNextInt|";return false;}
  public  boolean hasNextLine () {__Result__.str+="|hasNextLine|";return false;}
  public  boolean hasNextLong () {__Result__.str+="|hasNextLong|";return false;}
  public  boolean hasNextLong (int arg0) {__Result__.str+="|hasNextLong|";return false;}
  public  boolean hasNextShort (int arg0) {__Result__.str+="|hasNextShort|";return false;}
  public  boolean hasNextShort () {__Result__.str+="|hasNextShort|";return false;}
  public  IOException ioException () {__Result__.str+="|ioException|";return null;}
  public  BigDecimal nextBigDecimal () {__Result__.str+="|nextBigDecimal|";return null;}
  public  BigInteger nextBigInteger (int arg0) {__Result__.str+="|nextBigInteger|";return null;}
  public  BigInteger nextBigInteger () {__Result__.str+="|nextBigInteger|";return null;}
  public  boolean nextBoolean () {__Result__.str+="|nextBoolean|";return false;}
  public  byte nextByte () {__Result__.str+="|nextByte|";return 0;}
  public  byte nextByte (int arg0) {__Result__.str+="|nextByte|";return 0;}
  public  float nextFloat () {__Result__.str+="|nextFloat|";return 0f;}
  public  String nextLine () {__Result__.str+="|nextLine|";return null;}
  public  long nextLong (int arg0) {__Result__.str+="|nextLong|";return 0;}
  public  long nextLong () {__Result__.str+="|nextLong|";return 0;}
  public  short nextShort () {__Result__.str+="|nextShort|";return 0;}
  public  short nextShort (int arg0) {__Result__.str+="|nextShort|";return 0;}
  public  int radix () {__Result__.str+="|radix|";return 0;}
  public  Scanner useDelimiter (String arg0) {__Result__.str+="|useDelimiter|";return null;}
  public  Scanner useDelimiter (Pattern arg0) {__Result__.str+="|useDelimiter|";return null;}
  public  Scanner useLocale (Locale arg0) {__Result__.str+="|useLocale|";return null;}
  public  Scanner useRadix (int arg0) {__Result__.str+="|useRadix|";return null;}
  public  void remove () {__Result__.str+="|remove|";}
  public  String toString () {__Result__.str+="|toString|";return null;}
  public  boolean hasNext () {__Result__.str+="|hasNext|";return false;}
  public  boolean hasNext (Pattern arg0) {__Result__.str+="|hasNext|";return false;}
  public  boolean hasNext (String arg0) {__Result__.str+="|hasNext|";return false;}
  public  String next (Pattern arg0) {__Result__.str+="|next|";return null;}
  public  String next () {__Result__.str+="|next|";return null;}
  public  String next (String arg0) {__Result__.str+="|next|";return null;}
  public  void close () {__Result__.str+="|close|";}
  public  Scanner reset () {__Result__.str+="|reset|";return null;}
  public  double nextDouble () {__Result__.str+="|nextDouble|";return 0;}
  public  int nextInt (int arg0) {__Result__.str+="|nextInt|";return 0;}
  public  int nextInt () {__Result__.str+="|nextInt|";return 0;}
  public  MatchResult match () {__Result__.str+="|match|";return null;}
  public  Scanner skip (Pattern arg0) {__Result__.str+="|skip|";return null;}
  public  Scanner skip (String arg0) {__Result__.str+="|skip|";return null;}
  public  Locale locale () {__Result__.str+="|locale|";return null;}
}
