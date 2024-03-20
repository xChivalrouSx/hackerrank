import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HackerrankPsAlgorithms0023 {

	// Electronics Shop
	// https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

	// --- You need to fill this method ---
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int maxPriceCanSpent = -1;
		for (int keyboardItem : keyboards) {
			for (int driveItem : drives) {
				if (keyboardItem + driveItem <= b) {
					maxPriceCanSpent = Math.max(maxPriceCanSpent, keyboardItem + driveItem);
				}
			}
		}
		return maxPriceCanSpent;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] bnm = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);

		bufferedWriter.write(String.valueOf(moneySpent));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}