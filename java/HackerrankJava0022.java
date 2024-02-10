import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HackerrankJava0022 {

	public static void main(String[] args) {
		// Pattern Syntax Checker
		// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < testCases; i++) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}

		in.close();
	}

}
