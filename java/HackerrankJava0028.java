import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HackerrankJava0028 {

	public static void main(String[] args) throws IOException {
		// Java 2D Array
		// https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		// -------------------------------------------------------------------------------------------------
		// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
		// -------------------------------------------------------------------------------------------------
		printResult(arr);
		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------

		bufferedReader.close();

	}

	public static void printResult(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.get(i).size() - 2; j++) {
				int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
						arr.get(i + 1).get(j + 1) +
						arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				if (maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
	}

}