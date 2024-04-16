import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0054 {
	// Lisa's Workbook
	// https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int workbook(int n, int k, List<Integer> arr) {
		int result = 0;
		int pageNumber = 1;
		for (Integer integer : arr) {
			for (int j = 1; j <= integer; j++) {
				if (j == pageNumber) {
					result++;
				}
				if (j % k == 0 || j == integer) {
					pageNumber++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		int result = workbook(n, k, arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
