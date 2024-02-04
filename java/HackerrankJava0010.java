import java.util.Scanner;

public class HackerrankJava0010 {

	public static void main(String[] args) {
		// Java Int to String
		// https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();

			// ------------------------------------------------------------------------------------------------
			// --- You need to add this line for solution hackerrank provides all other lines for challange ---
			// ------------------------------------------------------------------------------------------------
			String s = String.valueOf(n);
			// ------------------------------------------------------------------------------------------------
			// ------------------------------------------------------------------------------------------------
			// ------------------------------------------------------------------------------------------------

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}

	}

}
