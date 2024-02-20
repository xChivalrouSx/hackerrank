import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HackerrankJava0044 {

	public static void main(String[] args) throws IOException {
		// Java Lambda Expressions
		// https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true

		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}

}

interface PerformOperation {
	boolean check(int a);
}

// -------------------------------------------------------------------------------------------------
// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
// -------------------------------------------------------------------------------------------------

class PerformOperationIsOdd implements PerformOperation {
	@Override
	public boolean check(int a) {
		return a % 2 != 0;
	}
}

class PerformOperationIsPrime implements PerformOperation {
	@Override
	public boolean check(int a) {
		return java.math.BigInteger.valueOf(a).isProbablePrime(1);
	}
}

class PerformOperationIsPalindrome implements PerformOperation {
	@Override
	public boolean check(int a) {
		return Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
	}
}

class MyMath {

	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return new PerformOperationIsOdd();
	}

	public PerformOperation isPrime() {
		return new PerformOperationIsPrime();
	}

	public PerformOperation isPalindrome() {
		return new PerformOperationIsPalindrome();
	}

}

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
