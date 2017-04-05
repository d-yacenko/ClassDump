import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {
		__Result__.sysoutOff();
		java.io.File file=new java.io.File("444");
		 if(!file.exists() )
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println(file.lastModified());
			__Result__.sysoutOn();
			__Result__.str="|"+__Result__.str;
			double res=0;
			if(__Result__.str.contains("|File|")){
				res+=__Result__.str.contains("|exists|")?0.33333:0;
				res+=__Result__.str.contains("|createNewFile|")?0.33333:0;
				res+=__Result__.str.contains("|delete|")?0.33333:0;
			} 
			
			System.out.println("{\"fraction\":"+Math.rint(10.0 * res) / 10.0+", \"got\": \""+__Result__.str+"\"}");
		

	}
}
