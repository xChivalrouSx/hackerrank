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

public class HackerrankPsAlgorithms0077 {

	// Counting Sort 1
	// https://www.hackerrank.com/challenges/countingsort1/problem?isFullScreen=true

	static class Result {

		public static List<Integer> countingSort(List<Integer> arr) {
			int[] count = new int[100];
			for (int i = 0; i < arr.size(); i++) {
				count[arr.get(i)]++;
			}
			List<Integer> result = new ArrayList<>();
			for (int i = 0; i < count.length; i++) {
				result.add(count[i]);
			}
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

		List<Integer> result = Result.countingSort(arr);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining(" "))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}