import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HackerrankJava0035 {

	public static void main(String[] args) throws IOException {
		// Java Hashset
		// https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		Set<String> resultSet = new HashSet<>();
		for (int i = 0; i < t; i++) {
			resultSet.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(resultSet.size());
		}

		s.close();
	}

}