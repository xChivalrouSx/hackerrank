import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class HackerrankPsAlgorithms0074 {

	// Insertion Sort - Part 1
	// https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true

	static class Result {

		public static void insertionSort1(int n, List<Integer> arr) {
			int last = arr.get(n - 1);
			int i = n - 2;
			while (i >= 0 && arr.get(i) > last) {
				arr.set(i + 1, arr.get(i));
				i--;
				System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
			}
			arr.set(i + 1, last);
			System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
		}
	
	}
	

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }

}