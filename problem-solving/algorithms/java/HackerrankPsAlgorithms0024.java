import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HackerrankPsAlgorithms0024 {
	// Cats and a Mouse
	// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true

	// --- You need to fill this method ---
	static String catAndMouse(int x, int y, int z) {
		int catAToMouseDistance = Math.abs(x - z);
		int catBToMouseDista = Math.abs(y - z);
		if (catAToMouseDistance < catBToMouseDista) {
			return "Cat A";
		} else if (catAToMouseDistance > catBToMouseDista) {
			return "Cat B";
		}
		return "Mouse C";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scanner.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}

}