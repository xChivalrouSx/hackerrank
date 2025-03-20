import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerrankPsAlgorithms0076 {

	// Quicksort 1 - Partition
	// https://www.hackerrank.com/challenges/quicksort1/problem?isFullScreen=true

	static class Result {

		public static List<Integer> quickSort(List<Integer> arr) {
			int pivot = arr.get(0);
			List<Integer> left = new ArrayList<>();
			List<Integer> right = new ArrayList<>();

			for (int i = 1; i < arr.size(); i++) {
				if (arr.get(i) < pivot) {
					left.add(arr.get(i));
				} else {
					right.add(arr.get(i));
				}
			}

			List<Integer> result = new ArrayList<>(left);
			result.add(pivot);
			result.addAll(right);

			return result;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result.quickSort(arr);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining(" "))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}