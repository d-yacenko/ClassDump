
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test7 {
	
	
	public static  void deleteFiles(String[] fileNames){
		for(String fn:fileNames)
			if(new File(fn).isFile())
				new File(fn).delete();
	}
	public static void main(String[] args) {
		double res=0;
		String [] fns= new String[2];
		File [] fs=new File[2];
		fns[0]="testfile_"+(new java.util.Random()).nextInt(10000)+".txt";
		fns[1]="testfile_"+(new java.util.Random()).nextInt(10000);
		try {
		fs[0] = new File(fns[0]);fs[0].createNewFile();
		fs[1] = new File(fns[1]);fs[1].mkdir();
		__Result__.sysoutOff();
		try{
//		==============================
		deleteFiles(fns);		
//		==============================
		}catch(Exception e){e.printStackTrace();}
		__Result__.sysoutOn();
		res+=!fs[0].exists()?0.5:0;
		res+=fs[1].exists()?0.5:0;
		} catch (Exception e) {e.printStackTrace();}
		finally{fs[1].delete();fs[0].delete();}
		res=Math.rint(10.0 * res) / 10.0;
		System.out.println("{\"fraction\":"+res+", \"got\": \""+__Result__.sysout+"\"}");

	}
}
