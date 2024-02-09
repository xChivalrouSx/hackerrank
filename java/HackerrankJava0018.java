import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackerrankJava0018 {

	public static void main(String[] args) {
		// Java Substring Comparisons
		// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// -------------------------------------------------------------------------------------------------
		// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
		// -------------------------------------------------------------------------------------------------

		List<String> subStringList = new ArrayList<>();
		for (int i = 0; i < s.length() - k + 1; i++) {
			subStringList.add(s.substring(i, i + k));
		}
		Collections.sort(subStringList);

		smallest = subStringList.get(0);
		largest = subStringList.get(subStringList.size() - 1);

		// ------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------------------------------------

		return smallest + "\n" + largest;
	}
}
