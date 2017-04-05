import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		__Result__.sysoutOff();
		//====================================
		java.io.File file = new java.io.File("333");
		System.out.println("File size: "+file.length());
		System.out.println("File path: "+file.getAbsolutePath());
		//====================================
		__Result__.sysoutOn();
		double res=0;
		if(__Result__.str.contains("File")){
			res+=__Result__.str.contains("length")?0.5:0;
			res+=__Result__.str.contains("getAbsolutePath")?0.5:0;
		} 
		System.out.println("{\"fraction\":"+res+", \"got\": \"-\"}");
		System.out.println("Out: "+__Result__.sysout);
		

	}
}
