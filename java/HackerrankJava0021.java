import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HackerrankJava0021 {

	public static void main(String[] args) {
		// Java String Tokens
		// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		s = s.replaceAll("[!,?._'@]", " ");
		List<String> splitList = Arrays.asList(s.split(" "));
		splitList = splitList.stream().filter(x -> !"".equals(x)).collect(Collectors.toList());

		System.out.println(splitList.size());
		for (String string : splitList) {
			System.out.println(string);
		}

		scan.close();
	}

}
