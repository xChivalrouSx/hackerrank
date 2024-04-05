import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0018 {
	// Day of the Programmer
	// https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String dayOfProgrammer(int year) {
		String result = "26.09.";
		if (year < 1918) {
			if (year % 4 == 0) {
				result = "12.09.";
			} else {
				result = "13.09.";
			}
		} else if (year > 1918) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				result = "12.09.";
			} else {
				result = "13.09.";
			}
		}
		return result + year;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}