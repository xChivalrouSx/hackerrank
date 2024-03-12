import java.util.Scanner;

public class HackerrankPsAlgorithms0001 {

	// Solve Me First
	// https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

	static int solveMeFirst(int a, int b) {
		// --- You need to fill this method ---
		return a + b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
