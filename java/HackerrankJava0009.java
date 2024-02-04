import java.util.Scanner;

public class HackerrankJava0009 {

	private static final String ERROR_MESSAGE = "java.lang.Exception: Breadth and height must be positive";

	public static void main(String[] args) {
		// Java Static Initializer Block
		// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		int b = scanner.nextInt();
		int h = scanner.nextInt();

		if (b > 0 && h > 0) {
			System.out.println(b * h);
		} else {
			System.out.println(ERROR_MESSAGE);
		}

		scanner.close();
	}

}
