import java.io.FileNotFoundException;
import java.io.IOException;


public class Test6 {

	public static void main(String[] args) {
		__Result__.sysoutOff();
		//====================================
			try {
			File file = new File("d:/a.txt");
			Scanner scanner = new Scanner(file);
			System.out.println(scanner.next());
			scanner.close();
			} catch (FileNotFoundException e) {
					 e.printStackTrace();
			}
		//====================================
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
