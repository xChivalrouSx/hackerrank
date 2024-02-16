import java.util.Scanner;

public class HackerrankJava0031 {

	public static void main(String[] args) {
		// Java 1D Array (Part 2)
		// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
		}
		scan.close();
	}

	public static boolean canWin(int leap, int[] game, int currentIndex) {
		if (currentIndex < 0 || game[currentIndex] == 1) {
			return false;
		}
		if ((currentIndex == game.length - 1) || currentIndex + leap > game.length - 1) {
			return true;
		}

		game[currentIndex] = 1;
		return canWin(leap, game, currentIndex + 1) ||
				canWin(leap, game, currentIndex - 1) ||
				canWin(leap, game, currentIndex + leap);
	}

}