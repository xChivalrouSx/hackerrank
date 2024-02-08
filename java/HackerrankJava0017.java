import java.util.Scanner;

public class HackerrankJava0017 {

	public static void main(String[] args) {
		// Java Substring
		// https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true

		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		System.out.println(S.substring(start, end));

		in.close();
	}

}
