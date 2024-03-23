import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Picking Numbers
	// https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		int maxCount = 0;
		int lastItemWorkingOn = -1;
		for (Integer currentItem : a) {
			if (lastItemWorkingOn == currentItem) {
				continue;
			}
			long tmpCount = a.stream().filter(item -> item == currentItem || item == currentItem + 1).count();
			if (maxCount < tmpCount) {
				maxCount = (int) tmpCount;
			}
			lastItemWorkingOn = currentItem;
		}
		return maxCount;
	}

}

public class HackerrankPsAlgorithms0025 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result.pickingNumbers(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}