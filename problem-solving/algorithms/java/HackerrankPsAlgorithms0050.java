import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0050 {
	// Halloween Sale
	// https://www.hackerrank.com/challenges/halloween-sale/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int howManyGames(int p, int d, int m, int s) {
		int count = 0;
		while (0 <= s - p) {
			s -= p;
			p = Math.max(p - d, m);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int p = Integer.parseInt(firstMultipleInput[0]);

		int d = Integer.parseInt(firstMultipleInput[1]);

		int m = Integer.parseInt(firstMultipleInput[2]);

		int s = Integer.parseInt(firstMultipleInput[3]);

		int answer = howManyGames(p, d, m, s);

		bufferedWriter.write(String.valueOf(answer));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
