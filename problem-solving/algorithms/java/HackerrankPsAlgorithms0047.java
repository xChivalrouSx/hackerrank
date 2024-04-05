import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0047 {
	// Modified Kaprekar Numbers
	// https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void kaprekarNumbers(int p, int q) {
		boolean found = false;
		for (int i = p; i <= q; i++) {
			if (isKaprekar(i)) {
				System.out.print(i + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.println("INVALID RANGE");
		}
	}

	private static boolean isKaprekar(int number) {
		long squareOfNumber = (long) number * number;
		String squareString = String.valueOf(squareOfNumber);
		int numberOfDigit = String.valueOf(number).length();
		int rightHandSide = Integer.parseInt(squareString.substring(squareString.length() - numberOfDigit));
		int leftHandSide = squareString.length() - numberOfDigit == 0 ? 0 : Integer.parseInt(squareString.substring(0, squareString.length() - numberOfDigit));
		return leftHandSide + rightHandSide == number;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int p = Integer.parseInt(bufferedReader.readLine().trim());

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		kaprekarNumbers(p, q);

		bufferedReader.close();
	}

}
