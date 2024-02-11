import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {
	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
}

public class HackerrankJava0026 {

	public static void main(String[] args) {
		// Tag Content Extractor
		// https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true

		String tagRegex = "<(.+)>([^<]+)<\\/\\1>";
		Pattern pattern = Pattern.compile(tagRegex);

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			boolean found = false;
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				found = true;
				System.out.println(matcher.group(2));
			}

			if (!found) {
				System.out.println("None");
			}

			testCases--;
		}

		in.close();
	}

}