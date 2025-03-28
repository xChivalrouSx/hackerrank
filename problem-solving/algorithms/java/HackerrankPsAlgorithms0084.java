import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class HackerrankPsAlgorithms0084 {

	// Running Time of Algorithms
	// https://www.hackerrank.com/challenges/runningtime/problem?isFullScreen=true

	static class Result {

		public static int runningTime(List<Integer> arr) {
			int shifts = 0;
			for (int i = 1; i < arr.size(); i++) {
				int key = arr.get(i);
				int j = i - 1;

				while (j >= 0 && arr.get(j) > key) {
					arr.set(j + 1, arr.get(j));
					j--;
					shifts++;
				}
				arr.set(j + 1, key);
			}
			return shifts;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result.runningTime(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}