import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0035 {
	// Sequence Equation
	// https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> permutationEquation(List<Integer> p) {
		List<Integer> resultList = new ArrayList<>();
		p.add(p.get(0));
		for (int i = 1; i < p.size(); i++) {
			resultList.add(p.indexOf(p.indexOf(i) + 1) + 1);
		}
		return resultList;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> result = permutationEquation(p);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(Collectors.joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}