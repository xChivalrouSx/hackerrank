import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerrankJava0029 {

	public static void main(String[] args) {
		// Java Subarray
		// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);
		int numberOfValue = scanner.nextInt();

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < numberOfValue; i++) {
			arr.add(scanner.nextInt());
		}

		printResult(arr);

		scanner.close();
	}

	public static void printResult(List<Integer> arr) {
		int numberOfNegative = 0;

		for (int i = 0; i < arr.size(); i++) {
			for (int j = 1; j <= arr.size(); j++) {
				int toIndex = i + j;
				if (toIndex > arr.size()) {
					break;
				}
				if (arr.subList(i, toIndex).stream().reduce(0, (a, b) -> a + b) < 0) {
					numberOfNegative++;
				}
			}
		}

		System.out.println(numberOfNegative);
	}

}