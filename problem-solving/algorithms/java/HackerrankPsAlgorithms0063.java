import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0063 {
	// Mars Exploration
	// https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int marsExploration(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i += 3) {
			if (s.charAt(i) != 'S') {
				count++;
			}
			if (s.charAt(i + 1) != 'O') {
				count++;
			}
			if (s.charAt(i + 2) != 'S') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int result = marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
