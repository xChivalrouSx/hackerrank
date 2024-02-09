import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerrankJava0020 {

	public static void main(String[] args) {
		// Java Anagrams
		// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagram(String a, String b) {
		// -------------------------------------------------------------------------------------------------
		// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
		// -------------------------------------------------------------------------------------------------

		int maxLength = a.length() > b.length() ? a.length() : b.length();

		Map<String, Integer> anagramMap = new HashMap<>();
		for (int i = 0; i < maxLength; i++) {
			if (a.length() > i) {
				String letterFirst = a.substring(i, i + 1).toLowerCase();
				if (anagramMap.containsKey(letterFirst)) {
					anagramMap.put(letterFirst, anagramMap.get(letterFirst) + 1);
				} else {
					anagramMap.put(letterFirst, 1);
				}
			}

			if (b.length() > i) {
				String letterSecond = b.substring(i, i + 1).toLowerCase();
				if (anagramMap.containsKey(letterSecond)) {
					anagramMap.put(letterSecond, anagramMap.get(letterSecond) - 1);
				} else {
					anagramMap.put(letterSecond, -1);
				}
			}
		}

		return anagramMap.values().stream().allMatch(x -> x == 0);

		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------
	}

}
