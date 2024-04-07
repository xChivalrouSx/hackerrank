import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HackerrankPsAlgorithms0052 {
	// Service Lane
	// https://www.hackerrank.com/challenges/service-lane/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> serviceLane(List<Integer> widths, List<List<Integer>> cases) {
		List<Integer> result = new ArrayList<>();
		for (List<Integer> caseItem : cases) {
			widths.subList(caseItem.get(0), caseItem.get(1) + 1)
					.stream().min(Integer::compare).ifPresent(result::add);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int t = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> width = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<List<Integer>> cases = new ArrayList<>();

		IntStream.range(0, t).forEach(i -> {
			try {
				cases.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = serviceLane(width, cases);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(Collectors.joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}
