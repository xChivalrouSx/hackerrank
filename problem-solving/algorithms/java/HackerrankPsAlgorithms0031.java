import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	// Beautiful Days at the Movies
	// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int beautifulDays(int i, int j, int k) {
		int dayCount = 0;
		for (int day = i; day <= j; day++) {
			int reverseDay = Integer.parseInt(new StringBuilder(String.valueOf(day)).reverse().toString());
			if (Math.abs(day - reverseDay) % k == 0) {
				dayCount++;
			}
		}
		return dayCount;
	}

}

public class HackerrankPsAlgorithms0031 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int i = Integer.parseInt(firstMultipleInput[0]);

		int j = Integer.parseInt(firstMultipleInput[1]);

		int k = Integer.parseInt(firstMultipleInput[2]);

		int result = Result.beautifulDays(i, j, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}