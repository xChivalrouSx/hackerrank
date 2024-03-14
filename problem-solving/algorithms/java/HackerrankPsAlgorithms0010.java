import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

	// Grading Students
	// https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> gradingStudents(List<Integer> grades) {
		return grades.stream().map(p -> {
			int tmpValue = p % 5;
			if (p >= 38 && tmpValue >= 3) {
				return p + (5 - tmpValue);
			} else {
				return p;
			}
		}).collect(Collectors.toList());
	}

}

public class HackerrankPsAlgorithms0010 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result.gradingStudents(grades);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}