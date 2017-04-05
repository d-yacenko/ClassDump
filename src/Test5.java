import java.io.IOException;


public class Test5 {

	public static void main(String[] args) {
		__Result__.sysoutOff();
		//====================================
				 try {
					 File file = new File("222");
					 PrintWriter writer = new PrintWriter(new FileWriter(file));
					 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					 writer.print("333"); 
					 writer.close();
					 } catch (IOException e) {
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
