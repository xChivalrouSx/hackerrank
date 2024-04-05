import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0045 {
	// ACM ICPC Team
	// https://www.hackerrank.com/challenges/acm-icpc-team/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<Integer> acmTeam(List<String> topic) {
		int maxKnownTopic = 0;
		int maxTeams = 0;
		for (int i = 0; i < topic.size() - 1; i++) {
			for (int j = i + 1; j < topic.size(); j++) {
				int currentKnownTopic = 0;
				for (int k = 0; k < topic.get(i).length(); k++) {
					if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
						currentKnownTopic++;
					}
				}
				if (currentKnownTopic > maxKnownTopic) {
					maxKnownTopic = currentKnownTopic;
					maxTeams = 1;
				} else if (currentKnownTopic == maxKnownTopic) {
					maxTeams++;
				}
			}
		}
		return Arrays.asList(maxKnownTopic, maxTeams);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<String> topic = IntStream.range(0, n).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.collect(Collectors.toList());

		List<Integer> result = acmTeam(topic);

		bufferedWriter.write(
				result.stream()
						.map(Object::toString)
						.collect(joining("\n"))
						+ "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}
