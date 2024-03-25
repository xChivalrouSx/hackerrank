import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result {

	// Utopian Tree
	// https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int utopianTree(int n) {
		int height = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				height++;
			} else {
				height *= 2;
			}
		}
		return height;
	}

}

public class HackerrankPsAlgorithms0029 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				int result = Result.utopianTree(n);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

}