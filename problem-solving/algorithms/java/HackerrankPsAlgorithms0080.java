import java.io.*;
import java.util.stream.*;

public class HackerrankPsAlgorithms0080 {

	// Separate the Numbers
	// https://www.hackerrank.com/challenges/separate-the-numbers/problem?isFullScreen=true

	static class Result {

		public static void separateNumbers(String s) {
			int n = s.length();
			boolean found = false;

			for (int i = 1; i <= n / 2; i++) {
				String prefix = s.substring(0, i);
				long firstNum = Long.parseLong(prefix);
				StringBuilder generatedString = new StringBuilder(prefix);

				while (generatedString.length() < n) {
					firstNum++;
					generatedString.append(firstNum);
				}

				if (generatedString.toString().equals(s)) {
					System.out.println("YES " + prefix);
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("NO");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				Result.separateNumbers(s);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}

}