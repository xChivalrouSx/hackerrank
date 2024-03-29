import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HackerrankJava0014 {

	public static void main(String[] args) {
		// Java BigDecimal
		// https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true

		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		// -------------------------------------------------------------------------------------------------
		// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
		// -------------------------------------------------------------------------------------------------
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o2 == null) {
					return -1;
				}
				if (o1 == null) {
					return 1;
				}
				BigDecimal a = new BigDecimal(o1);
				BigDecimal b = new BigDecimal(o2);
				return b.compareTo(a);
			}
		});
		// ------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------------------------------------

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}

}
