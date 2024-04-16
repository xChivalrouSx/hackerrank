import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HackerrankPsAlgorithms0055 {
	// Flatland Space Stations
	// https://www.hackerrank.com/challenges/flatland-space-stations/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int flatlandSpaceStations(int n, int[] c) {
		int maxDistanceResult = 0;
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (Integer itemIndex : c) {
				min = Math.min(min, Math.abs(i - itemIndex));
			}
			maxDistanceResult = Math.max(maxDistanceResult, min);
		}
		return maxDistanceResult;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		Scanner scanner = new Scanner(System.in);

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[] c = new int[m];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = flatlandSpaceStations(n, c);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
