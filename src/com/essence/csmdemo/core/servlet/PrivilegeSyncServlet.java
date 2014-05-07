package com.essence.csmdemo.core.servlet;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.essence.csmdemo.privilege.aop.OperationSource;

/**
 * 权限同步类 
 * @author zhaochenggang
 *
 */
@WebServlet("/privilegeSyncServlet")
public class PrivilegeSyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrivilegeSyncServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-----------------------------");
		List<Class> classes=null;
		try {
			classes = getClassesByPackageName("com.essence");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		for (Class clas : classes) {
			OperationSource operationSourcea = (OperationSource) clas.getAnnotation(OperationSource.class);
			if (operationSourcea != null){
				System.out.println(operationSourcea.code() + "------------>"
						+ operationSourcea.operation());
			}
			
			Method[] methods = clas.getMethods();
			for (Method method : methods) {

				OperationSource operationSource = method
						.getAnnotation(OperationSource.class);
				if (operationSource != null){
					System.out.println(operationSource.code() + "------------>"
							+ operationSource.operation());
				}
			}
		}
		
	}

	@SuppressWarnings("rawtypes")
	private static List<Class> getClassesByPackageName(String packageName)
			throws IOException, ClassNotFoundException {

		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes;
	}

	@SuppressWarnings("rawtypes")
	private static List<Class> findClasses(File directory, String packageName)
			throws ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + '.' + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(Class.forName(packageName
						+ "."
						+ file.getName().substring(0,
								file.getName().length() - 6)));
			}
		}
		return classes;
	}
}
