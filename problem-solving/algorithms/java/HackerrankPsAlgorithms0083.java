import java.io.*;
import java.util.*;

public class HackerrankPsAlgorithms0083 {

	// Game of Thrones - I
	// https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true

	static class Result {

		public static String gameOfThrones(String s) {
			Map<Character, Integer> charCountMap = new HashMap<>();
			for (char c : s.toCharArray()) {
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}

			long oddCount = charCountMap.values().stream().filter(p -> p % 2 != 0).count();
			return oddCount <= 1 ? "YES" : "NO";
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = Result.gameOfThrones(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}