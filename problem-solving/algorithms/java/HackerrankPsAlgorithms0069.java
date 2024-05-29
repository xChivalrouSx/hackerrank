import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0069 {
	// Funny String
	// https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String funnyString(String s) {
		for (int i = 0; i < (s.length() / 2) + 1; i++) {
			int startResult = Math.abs(s.charAt(i) - s.charAt(i + 1));
			int endResult = Math.abs(s.charAt(s.length() - 1 - i) - s.charAt(s.length() - 2 - i));
			if (startResult != endResult) {
				return "Not Funny";
			}
		}
		return "Funny";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				String result = funnyString(s);

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
