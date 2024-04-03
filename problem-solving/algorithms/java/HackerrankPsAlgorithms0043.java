import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Jumping on the Clouds
	// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int jumpingOnClouds(List<Integer> c) {
		int result = 0;
		for (int i = 0; i < c.size(); i++) {
			if (c.size() > i + 2 && c.get(i + 2).equals(0)) {
				i++;
			}
			result++;
		}
		return result - 1;
	}

}

public class HackerrankPsAlgorithms0043 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result.jumpingOnClouds(c);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
