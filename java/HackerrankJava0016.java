import java.util.Scanner;

public class HackerrankJava0016 {

	public static void main(String[] args) {
		// Java Strings Introduction
		// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 1 ? "Yes" : "No");
		System.out.println(capitalizeFirstLatter(A) + " " + capitalizeFirstLatter(B));

		sc.close();
	}

	private static String capitalizeFirstLatter(String value) {
		return value.substring(0, 1).toUpperCase().concat(value.substring(1, value.length()));
	}

}
