import java.util.*;

public class Solution000027 {

    // Day 26: Nested Logic
    // https://www.hackerrank.com/challenges/30-nested-logic/problem?isFullScreen=true

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        sc.close();

        int fine = 0;
        if (actualYear > expectedYear) {
            fine = 10000;
        } else if (actualYear == expectedYear) {
            if (actualMonth > expectedMonth) {
                fine = 500 * (actualMonth - expectedMonth);
            } else if (actualMonth == expectedMonth) {
                if (actualDay > expectedDay) {
                    fine = 15 * (actualDay - expectedDay);
                }
            }
        }
        System.out.println(fine);
    }

}