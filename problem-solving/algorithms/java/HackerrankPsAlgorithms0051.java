import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0051 {
	// Chocolate Feast
	// https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int chocolateFeast(int n, int c, int m) {
		int totalChocolate = n / c;
		int wrappers = totalChocolate;
		while (wrappers >= m) {
			int newChocolates = wrappers / m;
			totalChocolate += newChocolates;
			wrappers = (wrappers - (newChocolates * m)) + newChocolates;
		}
		return totalChocolate;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int n = Integer.parseInt(firstMultipleInput[0]);

				int c = Integer.parseInt(firstMultipleInput[1]);

				int m = Integer.parseInt(firstMultipleInput[2]);

				int result = chocolateFeast(n, c, m);

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
