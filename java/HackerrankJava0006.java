import java.util.Scanner;

public class HackerrankJava0006 {

	public static void main(String[] args) {
		// Java Stdin and Stdout II
		// https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.nextLine();
		s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		scan.close();
	}

}
