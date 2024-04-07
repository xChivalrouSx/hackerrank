import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0053 {
	// Manasa and Stones
	// https://www.hackerrank.com/challenges/manasa-and-stones/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> stones(int n, int a, int b) {
		List<Integer> result = new ArrayList<>();

		int bigNumber = Math.max(a, b);
		int smallNumber = Math.min(a, b);
		result.add(smallNumber * (n - 1));
		result.add(bigNumber * (n - 1));

		int diff = bigNumber - smallNumber;
		int tmpValue = result.get(0);
		while (result.get(1) > tmpValue + diff) {
			tmpValue += diff;
			result.add(tmpValue);
		}
		return result.stream().distinct().sorted().collect(Collectors.toList());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int T = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, T).forEach(TItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				int a = Integer.parseInt(bufferedReader.readLine().trim());

				int b = Integer.parseInt(bufferedReader.readLine().trim());

				List<Integer> result = stones(n, a, b);

				bufferedWriter.write(
						result.stream()
								.map(Object::toString)
								.collect(Collectors.joining(" "))
								+ "\n");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

}
