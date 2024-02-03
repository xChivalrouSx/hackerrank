import java.util.Scanner;

public class HackerrankJava0004 {

	public static void main(String[] args) {
		// Java Output Formatting
		// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true

		Scanner sc = new Scanner(System.in);

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-15s%03d\n", sc.next(), sc.nextInt());
		}
		System.out.println("================================");

		sc.close();
	}

}
