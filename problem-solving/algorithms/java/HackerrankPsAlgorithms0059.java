import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0059 {
	// Super Reduced String
	// https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String superReducedString(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (result.length() > 0 && result.charAt(result.length() - 1) == s.charAt(i)) {
				result = result.substring(0, result.length() - 1);
			} else {
				result += s.charAt(i);
			}
		}
		return result.length() == 0 ? "Empty String" : result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = superReducedString(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
