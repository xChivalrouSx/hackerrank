import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class HackerrankJava0034 {

	public static void main(String[] args) throws IOException {
		// Java Stack
		// https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				System.out.println("true");
			}

			Stack<String> bracketStack = new Stack<>();
			char[] inputCharArray = input.toCharArray();
			for (int i = 0; i < inputCharArray.length; i++) {
				String closeBracketValue = String.valueOf(inputCharArray[i]);
				String openBracketValue = Bracket.findOpenBracket(closeBracketValue);
				if ("".equals(openBracketValue)) {
					bracketStack.push(closeBracketValue);
				} else {
					if (bracketStack.size() == 0) {
						System.out.println("false");
						break;
					}
					String openBracketFromStack = bracketStack.pop();
					if (openBracketFromStack.equals(openBracketValue) &&
							i == inputCharArray.length - 1 &&
							bracketStack.size() == 0) {
						System.out.println("true");
						break;
					} else if (!openBracketFromStack.equals(openBracketValue)) {
						System.out.println("false");
						break;
					}
				}
				if (i == inputCharArray.length - 1) {
					System.out.println("false");
				}
			}
		}

		scanner.close();
	}

	private enum Bracket {
		SQUARE_BRACKET("[", "]"),
		CURLY_BRACKET("{", "}"),
		PARENTHESIS("(", ")");

		private String openSymbolString;
		private String closeSymbolString;

		Bracket(String openSymbolString, String closeSymbolString) {
			this.openSymbolString = openSymbolString;
			this.closeSymbolString = closeSymbolString;
		}

		public String getCloseSymbolString() {
			return closeSymbolString;
		}

		public String getOpenSymbolString() {
			return openSymbolString;
		}

		public static String findOpenBracket(String symbol) {
			for (Bracket bracket : Bracket.values()) {
				if (bracket.getCloseSymbolString().equals(symbol)) {
					return bracket.getOpenSymbolString();
				}
			}
			return "";
		}
	}

}