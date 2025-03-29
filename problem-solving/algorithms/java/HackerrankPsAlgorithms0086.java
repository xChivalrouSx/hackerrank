import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class HackerrankPsAlgorithms0086 {

	// Find the Median
	// https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=true

	class Result {

		public static int findMedian(List<Integer> arr) {
			Collections.sort(arr);
			int size = arr.size();
			if (size % 2 == 0) {
				return arr.get(size / 2 - 1);
			} else {
				return arr.get(size / 2);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result.findMedian(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}