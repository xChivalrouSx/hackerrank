import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0056 {
	// Fair Rations
	// https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String fairRations(List<Integer> B) {
		if (B.stream().mapToInt(Integer::intValue).sum() % 2 != 0) {
			return "NO";
		}

		int result = 0;
		for (int i = 0; i < B.size(); i++) {
			if (B.get(i) % 2 != 0) {
				int nextIndex = i + 1;
				B.set(i, B.get(i) + 1);
				B.set(nextIndex, B.get(nextIndex) + 1);
				result += 2;
			}
		}
		return String.valueOf(result);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		String result = fairRations(B);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
