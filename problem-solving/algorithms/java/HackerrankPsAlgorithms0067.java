import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0067 {
	// Weighted Uniform Strings
	// https://www.hackerrank.com/challenges/weighted-uniform-string/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
		List<Integer> weights = new ArrayList<>();

		int currentSum = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			int numericValue = currentChar - 96;
			currentSum = currentSum + numericValue;
			weights.add(currentSum);
			if (s.length() - 1 != i && s.charAt(i + 1) != currentChar) {
				currentSum = 0;
			}
		}
		return queries.stream().map(p -> weights.contains(p) ? "Yes" : "No").collect(Collectors.toList());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<String> result = weightedUniformStrings(s, queries);

		bufferedWriter.write(
				result.stream()
						.collect(Collectors.joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}
