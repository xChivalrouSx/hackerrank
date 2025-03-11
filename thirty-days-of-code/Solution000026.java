import java.util.*;

public class Solution000026 {

    // Day 25: Running Time and Complexity
    // https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem?isFullScreen=true

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();
        for (int i = numberOfTest; i > 0; i--) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}