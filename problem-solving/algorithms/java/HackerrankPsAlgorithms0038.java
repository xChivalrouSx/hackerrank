import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0038 {
	// Append and Delete
	// https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String appendAndDelete(String s, String t, int k) {
		String result = appendAndContinue(s, t, k);
		if (result.equals("No")) {
			result = deleteAndContinue(s, t, k);
		}
		return result;
	}

	private static String appendAndContinue(String s, String t, int k) {
		s += "_";
		k -= 1;

		if (k < 0) {
			return "No";
		} else if (k == 0) {
			return s.length() == t.length() && t.startsWith(s.replace("_", "")) ? "Yes" : "No";
		} else if (s.length() < t.length()) {
			return appendAndContinue(s, t, k);
		} else {
			return "No";
		}
	}

	private static String deleteAndContinue(String s, String t, int k) {
		s = s.isEmpty() ? s : s.substring(0, s.length() - 1);
		k -= 1;

		if (k < 0) {
			return "No";
		} else if (k == 0) {
			return s.length() == t.length() && s.startsWith(t) ? "Yes" : "No";
		} else {
			String result = deleteAndContinue(s, t, k);
			if (result.equals("No")) {
				return appendAndContinue(s, t, k);
			}
			return result;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String t = bufferedReader.readLine();

		int k = Integer.parseInt(bufferedReader.readLine().trim());

		String result = appendAndDelete(s, t, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
