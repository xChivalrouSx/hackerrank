import java.util.Scanner;

class UsernameValidator {
	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
}

public class HackerrankJava0025 {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Valid Username Regular Expression
		// https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true

		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}

		scan.close();
	}

}