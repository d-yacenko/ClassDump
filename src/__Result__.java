
public class __Result__ {
	 public static String str="|";
	 public static String sysout="";
	 
	 private static java.io.PrintStream originalStream=System.out;
	 private static java.io.PrintStream interceptStream;
	 static{
		 originalStream=System.out;
		 interceptStream = new java.io.PrintStream(
					new java.io.OutputStream() {
						public void write(int b) {
							__Result__.sysout+=(char)b;
						}
					});
	 }
	 public static void sysoutOff(){System.setOut(interceptStream);}
	 public static void sysoutOn(){System.setOut(originalStream);}
	 
}
