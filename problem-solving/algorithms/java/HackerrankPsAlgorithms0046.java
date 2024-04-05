import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class HackerrankPsAlgorithms0046 {
	// Taum and B'day
	// https://www.hackerrank.com/challenges/taum-and-bday/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		long result = 0;
		if (bc > wc + z) {
			result = (long) b * wc + (long) w * wc + (long) b * z;
		} else if (wc > bc + z) {
			result = (long) b * bc + (long) w * bc + (long) w * z;
		} else {
			result = (long) b * bc + (long) w * wc;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int b = Integer.parseInt(firstMultipleInput[0]);

				int w = Integer.parseInt(firstMultipleInput[1]);

				String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int bc = Integer.parseInt(secondMultipleInput[0]);

				int wc = Integer.parseInt(secondMultipleInput[1]);

				int z = Integer.parseInt(secondMultipleInput[2]);

				long result = taumBday(b, w, bc, wc, z);

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
