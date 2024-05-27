import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HackerrankPsAlgorithms0066 {
	// Pangrams
	// https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static String pangrams(String s) {
		Set<String> resultSet = new HashSet<>();
		for (char charItem : s.toLowerCase().toCharArray()) {
			if (charItem >= 'a' && charItem <= 'z') {
				resultSet.add("" + charItem);
			}
		}
		return resultSet.size() == 26 ? "pangram" : "not pangram";
	}

	public static void main(String[] args) throws IOException {
		pangrams("We promptly judged antique ivory buckles for the next prize");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = pangrams(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
