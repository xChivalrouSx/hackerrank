import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0017 {
	// Migratory Birds
	// https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int migratoryBirds(List<Integer> arr) {
		int maxCount = 0;
		int maxType = 0;

		int tmpCount = 0;
		int currentType = 0;

		arr.sort(Integer::compareTo);
		for (int i = 0; i < arr.size(); i++) {
			int item = arr.get(i);
			if (currentType != item || i == arr.size() - 1) {
				if (maxCount < tmpCount) {
					maxCount = tmpCount;
					maxType = currentType;
				}
				currentType = item;
				tmpCount = 1;
			} else {
				tmpCount++;
			}
		}
		return maxType;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		int result = migratoryBirds(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}