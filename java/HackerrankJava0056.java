import java.util.Scanner;

public class HackerrankJava0056 {

	public static void main(String[] args) {
		// Java Exception Handling
		// https://www.hackerrank.com/challenges/java-exception-handling/problem?isFullScreen=true

		MyCalculator0056 my_calculator = new MyCalculator0056();
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		in.close();
	}

}

class MyCalculator0056 {

	// -------------------------------------------------------------------------------------------------
	// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
	// -------------------------------------------------------------------------------------------------

	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		} else {
			return (int) Math.pow(n, p);
		}
	}

	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------
}