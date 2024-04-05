import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0037 {
	// Find Digits
	// https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int findDigits(int n) {
		int totalDivisorCount = 0;
		for (char item : String.valueOf(n).toCharArray()) {
			if (item != '0' && n % Integer.valueOf(String.valueOf(item)) == 0) {
				totalDivisorCount++;
			}
		}
		return totalDivisorCount;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				int result = findDigits(n);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

}
