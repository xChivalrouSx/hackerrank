import java.util.Scanner;

public class HackerrankJava0027 {

	public static void main(String[] args) {
		// Java 1D Array
		// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// -------------------------------------------------------------------------------------------------
		// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
		// -------------------------------------------------------------------------------------------------

		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------

		scan.close();

		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}