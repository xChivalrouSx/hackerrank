import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0007 {
	// Mini-Max Sum
	// https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void miniMaxSum(List<Integer> arr) {
		long minSum = Long.MAX_VALUE;
		long maxSum = Long.MIN_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			long currentSum = arr.stream().mapToLong(Integer::longValue).sum() - arr.get(i);

			if (currentSum < minSum) {
				minSum = currentSum;
			}
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		System.out.println(minSum + " " + maxSum);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		miniMaxSum(arr);

		bufferedReader.close();
	}

}