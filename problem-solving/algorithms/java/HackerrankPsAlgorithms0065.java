import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0065 {
	// HackerRank in a String!
	// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String hackerrankInString(String s) {
		int currentIndex = -1;

		String hackerrankString = "hackerrank";
		for (char charItem : hackerrankString.toCharArray()) {
			currentIndex = s.indexOf(charItem, currentIndex + 1);
			if (currentIndex == -1) {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				String result = hackerrankInString(s);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

}
