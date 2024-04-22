import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0062 {
	// Caesar Cipher
	// https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String caesarCipher(String s, int k) {
		StringBuilder result = new StringBuilder();
		for (char charracter : s.toCharArray()) {
			if (Character.isLetter(charracter)) {
				char start = Character.isLowerCase(charracter) ? 'a' : 'A';
				result.append((char) (start + (charracter - start + k) % 26));
			} else {
				result.append(charracter);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String s = bufferedReader.readLine();

		int k = Integer.parseInt(bufferedReader.readLine().trim());

		String result = caesarCipher(s, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
