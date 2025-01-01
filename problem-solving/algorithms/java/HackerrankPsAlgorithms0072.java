import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0072 {
	// Strange Counter
	// https://www.hackerrank.com/challenges/strange-code/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static long strangeCounter(long t) {
		long startValue = 3;
		long maxTime = 3;
		while (true) {
			if(t <= maxTime) {
				return maxTime - t + 1;
			}
			startValue *= 2;
			maxTime += startValue;
		}
	}
	

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}