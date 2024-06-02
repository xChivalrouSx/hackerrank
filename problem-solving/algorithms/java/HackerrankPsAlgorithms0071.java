import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HackerrankPsAlgorithms0071 {
	// Extra Long Factorials
	// https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void extraLongFactorials(int n) {
		System.out.println(extraLongFactorialsRecursive(BigInteger.valueOf(n)));
	}

	private static BigInteger extraLongFactorialsRecursive(BigInteger n) {
		if (n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return n.multiply(extraLongFactorialsRecursive(n.subtract(BigInteger.ONE)));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		extraLongFactorials(n);

		bufferedReader.close();
	}

}