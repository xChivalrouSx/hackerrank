import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0026 {
	// Compare the Triplets
	// https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = Arrays.asList(0, 0);
		for (int i = 0; i < a.size(); i++) {
			int aliceScore = a.get(i);
			int bobScore = b.get(i);
			if (aliceScore > bobScore) {
				result.set(0, result.get(0) + 1);
			} else if (aliceScore < bobScore) {
				result.set(1, result.get(1) + 1);
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining(" "))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}