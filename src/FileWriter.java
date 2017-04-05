import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*===================================*/ 
/*           FileWriter              */
/*===================================*/
 class FileWriter extends OutputStreamWriter  {
/*========fields=========*/
/*======constructors=====*/
  public  FileWriter (FileDescriptor arg0) {super(System.out);__Result__.str+="|FileWriter|";}
  public  FileWriter (File arg0,boolean arg1) throws IOException{super(System.out);__Result__.str+="|FileWriter|";}
  public  FileWriter (File arg0) throws IOException{super(System.out);__Result__.str+="|FileWriter|";}
  public  FileWriter (String arg0,boolean arg1) throws IOException{super(System.out);__Result__.str+="|FileWriter|";}
  public  FileWriter (String arg0) throws IOException{super(System.out);__Result__.str+="|FileWriter|";}
/*========methods========*/
}
