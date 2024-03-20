import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	// Counting Valleys
	// https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int countingValleys(int steps, String path) {
		int valleyCount = 0;
		int currentLevel = 0;
		for (char item : path.toCharArray()) {
			if (item == 'U') {
				currentLevel++;
			} else {
				currentLevel--;
			}
			if (currentLevel == 0 && item == 'U') {
				valleyCount++;
			}
		}
		return valleyCount;
	}

}

public class HackerrankPsAlgorithms0022 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = Result.countingValleys(steps, path);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}