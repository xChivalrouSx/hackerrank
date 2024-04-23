import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0064 {
	// Marc's Cakewalk
	// https://www.hackerrank.com/challenges/marcs-cakewalk/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static long marcsCakewalk(List<Integer> calorie) {
		long result = 0;
		Collections.sort(calorie, Collections.reverseOrder());
		for (int i = 0; i < calorie.size(); i++) {
			result += Math.pow(2, i) * calorie.get(i);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> calorie = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		long result = marcsCakewalk(calorie);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
