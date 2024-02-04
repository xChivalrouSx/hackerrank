import java.util.Scanner;

public class HackerrankJava0008 {

	public static void main(String[] args) {
		// Java End-of-file
		// https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		int lineNumber = 0;
		while (scanner.hasNextLine()) {
			System.out.println(++lineNumber + " " + scanner.nextLine());
		}

		scanner.close();
	}

}
