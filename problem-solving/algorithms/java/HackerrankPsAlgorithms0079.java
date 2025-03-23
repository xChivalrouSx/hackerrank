import java.io.*;
import java.util.*;
import java.util.stream.*;

public class HackerrankPsAlgorithms0079 {

	// String Construction
	// https://www.hackerrank.com/challenges/string-construction/problem?isFullScreen=true

	static class Result {

		public static int stringConstruction(String s) {
			Set<Character> uniqueChars = new HashSet<>();
			for (char c : s.toCharArray()) {
				uniqueChars.add(c);
			}
			return uniqueChars.size();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				int result = Result.stringConstruction(s);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

}