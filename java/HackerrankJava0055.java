import java.util.Scanner;

public class HackerrankJava0055 {

	public static void main(String[] args) {
		// Java Exception Handling (Try-catch)
		// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getClass().getName());

		}

		scanner.close();
	}

}