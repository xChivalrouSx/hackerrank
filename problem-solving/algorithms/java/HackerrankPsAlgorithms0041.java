import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0041 {
	// Cut the sticks
	// https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> cutTheSticks(List<Integer> arr) {
		List<Integer> resultList = new ArrayList<>();
		while (arr.size() > 0) {
			resultList.add(arr.size());
			int minSize = arr.stream().min(Integer::compare).get();
			arr = arr.stream().map(x -> x - minSize).filter(x -> x > 0).collect(Collectors.toList());
		}
		return resultList;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> result = cutTheSticks(arr);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(Collectors.joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}
