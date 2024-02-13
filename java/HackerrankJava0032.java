import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerrankJava0032 {

	public static void main(String[] args) throws IOException {
		// Java List
		// https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		int listSize = scanner.nextInt();
		for (int i = 0; i < listSize; i++) {
			list.add(scanner.nextInt());
		}

		int numberOfOperation = scanner.nextInt();
		for (int i = 0; i < numberOfOperation; i++) {
			switch (scanner.next()) {
			case "Insert":
				list.add(scanner.nextInt(), scanner.nextInt());
				break;
			case "Delete":
				list.remove(scanner.nextInt());
				break;
			}
		}

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}

		scanner.close();
	}

}