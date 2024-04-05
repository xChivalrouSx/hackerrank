import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0042 {
	// Repeated String
	// https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static long repeatedString(String s, long n) {
		long repeatCount = n / s.length();
		long remainCharCount = n % s.length();

		long aCountInS = s.chars().filter(ch -> ch == 'a').count();
		long aCountInRemain = s.substring(0, (int) remainCharCount).chars().filter(ch -> ch == 'a').count();

		return (aCountInS * repeatCount) + aCountInRemain;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		long n = Long.parseLong(bufferedReader.readLine().trim());

		long result = repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
