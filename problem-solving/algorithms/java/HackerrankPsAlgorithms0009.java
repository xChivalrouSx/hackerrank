import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	// Time Conversion
	// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String timeConversion(String s) {
		String[] splittedTime = s.split(":");
		String hour = splittedTime[0];
		String minute = splittedTime[1];
		String second = splittedTime[2].substring(0, 2);
		boolean isPm = splittedTime[2].substring(2, 4).equals("PM");

		if (isPm && !hour.equals("12")) {
			hour = String.valueOf(Integer.parseInt(hour) + 12);
		} else if (!isPm && hour.equals("12")) {
			hour = "00";
		}

		return hour + ":" + minute + ":" + second;
	}

}

public class HackerrankPsAlgorithms0009 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = Result.timeConversion(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}