import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerrankPsAlgorithms0061 {
	// Strong Password
	// https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int minimumNumber(int n, String password) {
		int result = 0;
		if (!password.chars().anyMatch(Character::isLowerCase)) {
			result++;
		}
		if (!password.chars().anyMatch(Character::isUpperCase)) {
			result++;
		}
		if (!password.chars().anyMatch(Character::isDigit)) {
			result++;
		}
		if (!password.chars().anyMatch(c -> "!@#$%^&*()-+".indexOf(c) >= 0)) {
			result++;
		}
		return Math.max(result, 6 - n);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String password = bufferedReader.readLine();

		int answer = minimumNumber(n, password);

		bufferedWriter.write(String.valueOf(answer));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
