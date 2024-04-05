import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0006 {
	// Staircase
	// https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - i) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		staircase(n);

		bufferedReader.close();
	}

}