import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class HackerrankJava0033 {

	public static void main(String[] args) throws IOException {
		// Java Map
		// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		Map<String, String> phoneBook = new java.util.HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			phoneBook.put(scanner.nextLine(), scanner.nextLine());
		}

		String outputFormat = "%s=%s";
		while (scanner.hasNextLine()) {
			String name = scanner.nextLine();
			String phoneNumber = phoneBook.get(name);

			if (phoneNumber == null) {
				System.out.println("Not found");
			} else {
				System.out.println(String.format(outputFormat, name, phoneNumber));
			}
		}

		scanner.close();
	}

}