import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Between Two Sets
	// https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int count = 0;
		for (int i = a.get(a.size() - 1); i <= b.get(0); i++) {
			final int finalI = i;
			if (a.stream().allMatch(x -> finalI % x == 0) &&
					b.stream().allMatch(x -> x % finalI == 0)) {
				count++;
			}
		}
		return count;
	}

}

public class HackerrankPsAlgorithms0013 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int total = Result.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}