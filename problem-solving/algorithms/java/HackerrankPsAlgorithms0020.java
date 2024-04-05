import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0020 {
	// Sales by Match
	// https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int sockMerchant(int n, List<Integer> ar) {
		int totalPair = 0;
		Map<Integer, Long> counted = ar.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Long count : counted.values()) {
			totalPair += Math.floor(count / 2);
		}
		return totalPair;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}