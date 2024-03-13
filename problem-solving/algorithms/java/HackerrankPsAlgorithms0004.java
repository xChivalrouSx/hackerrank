import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

	// Diagonal Difference
	// https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftToRightDiagonalSum = 0;
		int rightToLeftDiagonalSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			leftToRightDiagonalSum += arr.get(i).get(i);
			rightToLeftDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
		}
		return Math.abs(leftToRightDiagonalSum - rightToLeftDiagonalSum);
	}

}

public class HackerrankPsAlgorithms0004 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}