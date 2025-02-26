import java.util.Scanner;

public class Solution000007 {

    // Day 6: Let's Review
    // https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    evenChars.append(s.charAt(j));
                } else {
                    oddChars.append(s.charAt(j));
                }
            }

            System.out.println(evenChars + " " + oddChars);
        }

        scanner.close();
    }

}