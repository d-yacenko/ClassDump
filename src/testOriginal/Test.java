package testOriginal;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
	
	public long createFile(String fileName) throws IOException{
		 File f=new File(fileName);
		 if(!f.exists()) f.createNewFile();
		 return f.lastModified();
		    
		}
		 
	public void saveToFile(String fileName,String str){
		File f = new File (fileName);
		
		PrintWriter pw=null;
		try {
			pw = new PrintWriter(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.write(str);
		pw.close();

		}
	public static void main(String[] args) {
		new Test().saveToFile("111", "111");
	}
}
