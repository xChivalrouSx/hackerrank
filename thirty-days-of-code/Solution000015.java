import java.util.*;

public class Solution000015 {

    // Day 14: Scope
    // https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=true

    static class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {
            int min = Arrays.stream(elements).min().orElse(0);
            int max = Arrays.stream(elements).max().orElse(0);
            maximumDifference = max - min;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}