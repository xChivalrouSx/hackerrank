import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class HackerrankJava0060 {

	public static void main(String[] args) {
		// Java Reflection - Attributes
		// https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true

		// --- You need to update this line ---
		Class student = Student.class;
		// --- You need to update this line ---
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		// --- You need to update this line ---
		for (Method method : methods) {
			// --- You need to update this line ---
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}
}

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
