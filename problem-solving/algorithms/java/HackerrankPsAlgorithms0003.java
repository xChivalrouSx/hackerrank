import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// A Very Big Sum
	// https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

	public static long aVeryBigSum(List<Long> ar) {
		// --- You need to fill this method ---
		return ar.stream().mapToLong(Long::longValue).sum();
	}

}

public class HackerrankPsAlgorithms0003 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Long::parseLong)
				.collect(toList());

		long result = Result.aVeryBigSum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
