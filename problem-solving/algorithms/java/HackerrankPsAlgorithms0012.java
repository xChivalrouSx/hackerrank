import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	// Number Line Jumps
	// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		boolean isFirstOneFaster = v1 > v2;
		while (isFirstOneFaster ? x1 < x2 : x1 > x2) {
			x1 += v1;
			x2 += v2;

			if (x1 == x2) {
				return "YES";
			}
		}
		return "NO";
	}

}

public class HackerrankPsAlgorithms0012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int x1 = Integer.parseInt(firstMultipleInput[0]);

		int v1 = Integer.parseInt(firstMultipleInput[1]);

		int x2 = Integer.parseInt(firstMultipleInput[2]);

		int v2 = Integer.parseInt(firstMultipleInput[3]);

		String result = Result.kangaroo(x1, v1, x2, v2);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}