import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Breaking the Records
	// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> breakingRecords(List<Integer> scores) {
		int minScore = scores.get(0);
		int maxScore = scores.get(0);
		int minScoreChange = 0;
		int maxScoreChange = 0;
		for (Integer score : scores) {
			if (score < minScore) {
				minScore = score;
				minScoreChange++;
			}
			if (score > maxScore) {
				maxScore = score;
				maxScoreChange++;
			}
		}
		return Arrays.asList(maxScoreChange, minScoreChange);
	}

}

public class HackerrankPsAlgorithms0014 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result.breakingRecords(scores);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining(" "))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}