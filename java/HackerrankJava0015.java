import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HackerrankJava0015 {

	public static void main(String[] args) throws IOException {
		// Java Primality Test
		// https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String n = bufferedReader.readLine();

		BigInteger bInt = new BigInteger(n);
		if (bInt.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		bufferedReader.close();
	}

}
