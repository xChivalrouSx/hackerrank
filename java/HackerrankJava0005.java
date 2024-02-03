import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankJava0005 {

	public static void main(String[] args) throws IOException {
		// Java Loops I
		// https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		for (int i = 1; i < 11; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}

		bufferedReader.close();
	}

}
