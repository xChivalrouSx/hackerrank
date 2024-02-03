import java.io.IOException;
import java.util.Scanner;

public class HackerrankJava0007 {

	public static void main(String[] args) throws IOException {
		// Java Loops II
		// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int lastValue = 0;
			for (int j = 0; j < n; j++) {
				int powerOfTwo = (int) Math.pow(2, j);
				if (j == 0) {
					lastValue = a + powerOfTwo * b;
					System.out.print(lastValue);
				} else {
					lastValue += powerOfTwo * b;
					System.out.print(" " + lastValue);
				}
			}
			System.out.println();
		}

		in.close();
	}

}
