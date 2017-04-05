import java.lang.annotation.Annotation;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class ClassTools {
	public static String[] banAnnotations={"@android.view.ViewDebug$ExportedProperty"};

	public static String getAnnotations(Annotation[] annotations) {
		String result = "";
		ban:
		for (Annotation a : annotations) {
			for(String b:banAnnotations) {
				if(a.toString().startsWith(b)) continue ban;
			}
			result += " " + a.toString();
		}
		return result;
	}
	
	public static String getThrowsExceptions(Class[] exceptions) {
		String result="";
		for (Class c : exceptions) {
			result += (result.length()!=0?",":"") + c.getName();
		}
		return result;
	}

	public static String getParameters(Parameter[] parameters) {
		String result = "";
		for (Parameter p : parameters) {
			result += (result.length()!=0?",":"") + p.getType().getName() + " " + p.getName();
		}
		return result;
	}

	public static String getInterfaces(Class[] interfaces1, Type[] interfaces2) {
		String result = "";
		for (int i = 0; i < interfaces1.length; i++) {
			if(i!=0) result += ",";
			result += interfaces1[i].getName();
			if (interfaces2[i] instanceof ParameterizedType) {
				result += "<";
				Type[] genericTypes = ((ParameterizedType) interfaces2[i])
						.getActualTypeArguments();
				for (Type genericType : genericTypes) {
					try{
					result += ((Class)genericType).getName() + ",";
					} catch(Exception e){
						System.err.println(e);
					}
				}
				result = result.substring(0, result.length() - 1);
				result += ">";
			}
		}
		return result;
	}

	
	public static String generateConst(String type) {
		switch (type) {
		case "void":
			return "";
		case "boolean":
			return "false";
		case "float":
			return "0f";
		case "short":
		case "int":
		case "long":
		case "double":
		case "char":
		case "byte":
			return "0";
		default:
			return "null";
		}

	}

	public static String createDirs(String cl) {
		cl=cl.substring(0,cl.lastIndexOf('.'));
		String dir=cl.replace('.', '/');
		new java.io.File(dir).mkdirs();
		return dir+"/";
	}


	
}
