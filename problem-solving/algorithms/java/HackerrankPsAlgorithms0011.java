import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0011 {
	// Apple and Orange
	// https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int totalAppleCount = 0;
		int totalOrangeCount = 0;

		int maxLoopCount = apples.size() > oranges.size() ? apples.size() : oranges.size();
		for (int i = 0; i < maxLoopCount; i++) {
			if (i < apples.size()) {
				int appleHitPoint = a + apples.get(i);
				if (appleHitPoint >= s && appleHitPoint <= t) {
					totalAppleCount++;
				}
			}

			if (i < oranges.size()) {
				int orangeHitPoint = b + oranges.get(i);
				if (orangeHitPoint >= s && orangeHitPoint <= t) {
					totalOrangeCount++;
				}
			}
		}

		System.out.println(totalAppleCount);
		System.out.println(totalOrangeCount);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int s = Integer.parseInt(firstMultipleInput[0]);

		int t = Integer.parseInt(firstMultipleInput[1]);

		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int a = Integer.parseInt(secondMultipleInput[0]);

		int b = Integer.parseInt(secondMultipleInput[1]);

		String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int m = Integer.parseInt(thirdMultipleInput[0]);

		int n = Integer.parseInt(thirdMultipleInput[1]);

		List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		countApplesAndOranges(s, t, a, b, apples, oranges);

		bufferedReader.close();
	}

}