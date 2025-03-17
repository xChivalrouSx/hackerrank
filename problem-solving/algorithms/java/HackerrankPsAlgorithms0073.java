import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class HackerrankPsAlgorithms0073 {

	// Intro to Tutorial Challenges
	// https://www.hackerrank.com/challenges/tutorial-intro/problem?isFullScreen=true

	static class Result {

		public static int introTutorial(int V, List<Integer> arr) {
			return IntStream.range(0, arr.size())
					.filter(i -> arr.get(i) == V)
					.findFirst()
					.orElse(-1);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int V = Integer.parseInt(bufferedReader.readLine().trim());

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result.introTutorial(V, arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}