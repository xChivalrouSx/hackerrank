import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0049 {
	// Minimum Distances
	// https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int minimumDistances(List<Integer> a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.size(); i++) {
			Integer firstValue = a.get(i);
			for (int j = i + 1; j < a.size(); j++) {
				if (firstValue.equals(a.get(j))) {
					min = Math.min(min, j - i);
				}
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		int result = minimumDistances(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
