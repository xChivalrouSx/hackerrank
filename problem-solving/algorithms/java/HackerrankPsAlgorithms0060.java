import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0060 {
	// CamelCase
	// https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int camelcase(String s) {
		return (int) s.chars().filter(Character::isUpperCase).count() + 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int result = camelcase(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
