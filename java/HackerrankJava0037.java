import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HackerrankJava0037 {

	public static void main(String[] args) {
		// Java Comparator
		// https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}

	// -------------------------------------------------------------------------------------------------
	// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
	// -------------------------------------------------------------------------------------------------
	private static class Checker implements Comparator<Player> {

		@Override
		public int compare(HackerrankJava0037.Player o1, HackerrankJava0037.Player o2) {
			if (o1.score > o2.score) {
				return -1;
			} else if (o1.score < o2.score) {
				return 1;
			} else {
				return o1.name.compareTo(o2.name);
			}
		}

	}
	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------

	private static class Player {
		String name;
		int score;

		Player(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

}