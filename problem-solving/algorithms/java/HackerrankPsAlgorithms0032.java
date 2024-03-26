import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	// Viral Advertising
	// https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int viralAdvertising(int n) {
		int liked = 0;
		int adsReachedPeopleCount = 5;
		for (int i = 0; i < n; i++) {
			int likedCount = adsReachedPeopleCount / 2;
			liked += likedCount;
			adsReachedPeopleCount = (likedCount) * 3;
		}
		return liked;
	}

}

public class HackerrankPsAlgorithms0032 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		int result = Result.viralAdvertising(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}