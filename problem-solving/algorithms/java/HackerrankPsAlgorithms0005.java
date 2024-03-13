import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Plus Minus
	// https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void plusMinus(List<Integer> arr) {
		printFormatted(arr.stream().filter(i -> i > 0).count() / (double) arr.size());
		printFormatted(arr.stream().filter(i -> i < 0).count() / (double) arr.size());
		printFormatted(arr.stream().filter(i -> i == 0).count() / (double) arr.size());
	}

	private static void printFormatted(double value) {
		NumberFormat formatter = new DecimalFormat("#0.000000");
		System.out.println(formatter.format(value));
	}

}

public class HackerrankPsAlgorithms0005 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}

}