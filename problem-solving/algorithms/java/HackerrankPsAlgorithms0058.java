import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0058 {
	// Big Sorting
	// https://www.hackerrank.com/challenges/big-sorting/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<String> bigSorting(List<String> unsorted) {
		unsorted.sort((s1, s2) -> {
			if (s1.length() == s2.length()) {
				return new BigInteger(s1).compareTo(new BigInteger(s2));
			}
			return s1.length() - s2.length();
		});
		return unsorted;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.collect(Collectors.toList());

		List<String> result = bigSorting(unsorted);

		bufferedWriter.write(
				result.stream()
						.collect(Collectors.joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}
