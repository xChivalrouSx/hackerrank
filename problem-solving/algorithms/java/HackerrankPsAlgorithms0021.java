import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0021 {
	// Drawing Book
	// https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int pageCount(int n, int p) {
		int totalPageTurn = 0;
		if (p <= n / 2) {
			totalPageTurn = p / 2;
		} else {
			totalPageTurn = (n / 2) - (p / 2);
		}
		return totalPageTurn;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		int p = Integer.parseInt(bufferedReader.readLine().trim());

		int result = pageCount(n, p);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}