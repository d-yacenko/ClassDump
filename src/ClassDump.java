import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ClassDump {
	public static final String dumpedPackage="android";
	TreeSet<String> dumpedClasses;

	public ClassDump() {
		dumpedClasses = new TreeSet<String>();
	}

	public void checkNewClass(Class cl){
		if (cl.getName() != null && !cl.getName().contains("$") 
				&& !dumpedClasses.contains(cl.getName())) {
			// check package
			if (cl.getName().contains(".")) {
				String pkg = cl.getName()
						.substring(0, cl.getName().lastIndexOf('.'));
				if (pkg.startsWith("android")) {
					dumpedClasses.add(cl.getName());
					dump(cl.getName());
				}
			}
		}
	}

	private String getMethod(Method m) {
		String res = "";
		if (!m.isSynthetic() && Modifier.isPublic(m.getModifiers())) {
			String exceptions = ClassTools.getThrowsExceptions(this,m
					.getExceptionTypes());
			if (exceptions.length() != 0)
				exceptions = "throws " + exceptions;
			res = Modifier.toString(m.getModifiers()).replace("transient", "")
					+ " "
					+ ClassTools.getAnnotations(this,m.getAnnotations())
					+ " "
					+ ClassTools.getTypeName(this,m.getReturnType())
					+ " "
					+ m.getName()
					+ " ("
					+ ClassTools.getParameters(this,m.getParameters())
					+ ") "
					+ exceptions;
			if(!Modifier.isAbstract(m.getModifiers()))		
					res+= "{"
					+ "__Result__.str+=\"|"
					+ m.getName()
					+ "|\"; return "
					+ ClassTools.generateConst(m.getReturnType()
							.getName())+";}";
			else res+=";";
		}
		checkNewClass(m.getReturnType());
		return res;
	}

	private String getConstructor(Constructor c) {
		String res = "";
		if (Modifier.isPublic(c.getModifiers())) {
			String exceptions = ClassTools.getThrowsExceptions(this,c
					.getExceptionTypes());
			if (exceptions.length() != 0)
				exceptions = "throws " + exceptions;
			res = Modifier.toString(c.getModifiers()).replace("transient", "") + " "
					+ ClassTools.getAnnotations(this,c.getAnnotations()) + " "
					+ c.getDeclaringClass().getSimpleName() + " ("
					+ ClassTools.getParameters(this,c.getParameters()) + ") "
					+ exceptions + "{" + "__Result__.str+=\"|"
					+ c.getDeclaringClass().getSimpleName() + "|\";" + "}";
		}
		return res;
	}

	private String getField(Field f) {
		String res = "";
		if (Modifier.isPublic(f.getModifiers())) {
			res += Modifier.toString(f.getModifiers()) + " "
					+ ClassTools.getAnnotations(this,f.getAnnotations()) + " "
					+ ClassTools.getTypeName(this,f.getType())+" " + f.getName();
			if (Modifier.isFinal(f.getModifiers()))
				res += "="
						+ ClassTools.generateConst(f.getType().getName());
			res += ";";
		}
		checkNewClass(f.getType());
		return res.replace('$', '.');
	}

	public void dump(StringBuffer sdump, Class original) {
		sdump.append("\n/*===================================*/");
		sdump.append(String.format("%1$4s %2$20s %3$15s", "\n/*",
				original.getSimpleName(), "     */"));
		sdump.append("\n/*===================================*/\n");
		sdump.append(ClassTools.getAnnotations(this,original.getAnnotations()));
		sdump.append("\n" + Modifier.toString(original.getModifiers()) );
		// !!!
		if (!original.isInterface())
			sdump.append(" class");
//		else
//			sdump.append(" interface ");
		sdump.append(" "+original.getSimpleName());
		// !!!
		if (original.getSuperclass() != null
				&& original.getSuperclass() != Object.class){
			sdump.append(" extends " + original.getSuperclass().getName().replace('$', '.'));
			checkNewClass(original.getSuperclass());
		}
		String interfaces=ClassTools.getInterfaces(this,original.getInterfaces(),
				original.getGenericInterfaces());
		if(interfaces.length()>0)
			if(!original.isInterface()) 
				sdump.append(" implements "+interfaces);
			else sdump.append(" extends "+interfaces);
		sdump.append(" {");
		sdump.append("\n/*========fields=========*/\n");
		 for (Field f : original.getDeclaredFields()) {
//		for (Field f : original.getFields()) {
			sdump.append(getField(f));
			sdump.append("\n");
		}
		sdump.append("\n/*======constructors=====*/\n");
		 for (Constructor c : original.getDeclaredConstructors()) {
//		for (Constructor c : original.getConstructors()) {
			sdump.append(getConstructor(c));
			sdump.append("\n");
		}
		sdump.append("\n/*========methods========*/\n");
		 for (Method m : original.getDeclaredMethods()) {
//		for (Method m : original.getMethods()) {
			sdump.append(getMethod(m));
			sdump.append("\n");
		}
		sdump.append("\n/*========inner classes========*/\n");
		for (Class cl : original.getClasses()) {
			if (cl != original)
				dump(sdump, cl);
		}
		sdump.append("\n}");
	}

	public String dump(String className) {
		StringBuffer sdump = new StringBuffer();
		Class original;
		if (className == null) {
			System.err.println("Class not present");
			return null;
		}
		try {
			original = Class.forName(className);
		} catch (ClassNotFoundException e) {
			System.err.println("Class not present");
			return null;
		}
		sdump.append(original.getPackage() + ";\n");
		sdump.append("import android.__Result__;\n\n");
		dump(sdump, original);
		
		String dir=ClassTools.createDirs(className);
		try {
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(dir+original.getSimpleName() + ".java"),
					"utf-8"))) {
				writer.write(sdump.toString());
				writer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sdump.toString();
	}

	public static void main(String[] args) {
		ClassDump cd = new ClassDump();
		cd.dumpedClasses.add("android.widget.Button");
		cd.dump("android.view.View");
		cd.dump("android.view.ViewDebug");
		cd.dump("android.animation.ValueAnimator");
		cd.dump("android.content.res");
		cd.dump("android.graphics.PorterDuff");
		// System.out.println(cd.dump("android.view.View"));
	}

}
