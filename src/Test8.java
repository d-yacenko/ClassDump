
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test8 {
	
	
	public static  void createFile(String fileName){
			if(!new File(fileName).exists())
				try {
					new File(fileName).createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public static void main(String[] args) {
		double res=0;
		String fn="testfile_"+(new java.util.Random()).nextInt(10000)+".txt";
		File f=new File(fn);
		try {
//				f.createNewFile();
				__Result__.sysoutOff();
				try{
//				==============================
				createFile(fn);		
//				==============================
				}catch(Exception e){e.printStackTrace();}
				__Result__.sysoutOn();
				res+=f.exists()?1:0;
				} catch (Exception e) {e.printStackTrace();}
				finally{f.delete();}
				res=Math.rint(10.0 * res) / 10.0;
				System.out.println("{\"fraction\":"+res+", \"got\": \""+__Result__.sysout+"\"}");

	}
}
