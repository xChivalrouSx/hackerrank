import java.util.Scanner;

public class HackerrankJava0023 {

	public static void main(String[] args) {
		// Java Regex
		// https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}

}

class MyRegex {
	public final String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
