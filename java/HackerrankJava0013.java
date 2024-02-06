import java.math.BigInteger;
import java.util.Scanner;

public class HackerrankJava0013 {

	public static void main(String[] args) {
		// Java BigInteger
		// https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		BigInteger firstValue = scanner.nextBigInteger();
		BigInteger secondValue = scanner.nextBigInteger();

		scanner.close();

		System.out.println(firstValue.add(secondValue));
		System.out.println(firstValue.multiply(secondValue));
	}

}
