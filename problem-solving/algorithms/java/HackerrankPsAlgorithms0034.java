import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0034 {
	// Circular Array Rotation
	// https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		for (int i = 0; i < k; i++) {
			a.add(0, a.remove(a.size() - 1));
		}
		return queries.stream().map(index -> a.get(index)).collect(Collectors.toList());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		int q = Integer.parseInt(firstMultipleInput[2]);

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> queries = IntStream.range(0, q).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> result = circularArrayRotation(a, k, queries);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(Collectors.joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}