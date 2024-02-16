import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerrankJava0030 {

	public static void main(String[] args) {
		// Java Arraylist
		// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		List<List<Integer>> intList = new ArrayList<>();
		int numberOfList = scanner.nextInt();
		for (int i = 0; i < numberOfList; i++) {
			int tmpListSize = scanner.nextInt();
			List<Integer> tmpList = new ArrayList<>();
			for (int j = 0; j < tmpListSize; j++) {
				tmpList.add(scanner.nextInt());
			}
			intList.add(tmpList);
		}

		int numberOfQuery = scanner.nextInt();
		for (int i = 0; i < numberOfQuery; i++) {
			int x = scanner.nextInt() - 1;
			int y = scanner.nextInt() - 1;

			try {
				System.out.println(intList.get(x).get(y));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

		scanner.close();
	}

}