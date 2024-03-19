import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Bill Division
	// https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int sharedItemPricePerPerson = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k)) / 2;
		if (sharedItemPricePerPerson == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - sharedItemPricePerPerson);
		}
	}

}

public class HackerrankPsAlgorithms0019 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int b = Integer.parseInt(bufferedReader.readLine().trim());

		Result.bonAppetit(bill, k, b);

		bufferedReader.close();
	}

}