import java.util.Scanner;

public class HackerrankJava0019 {

	public static void main(String[] args) {
		// Java String Reverse
		// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		StringBuilder sb = new StringBuilder(A);
		sb.reverse();
		if (sb.toString().equals(A)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
