import java.io.*;
import java.util.*;

public class Solution000002 {

    // Day 1: Data Types
    // https://www.hackerrank.com/challenges/30-data-types/problem?isFullScreen=true

    public static void main(String[] args) {
        int firstValue = 4;
        Double secondValue = 4.0;
        String thirdValue = "HackerRank ";

        Scanner scanner = new Scanner(System.in);
        
        System.out.println(firstValue + scanner.nextInt());
        System.out.println(secondValue + scanner.nextDouble());
        scanner.nextLine();
        System.out.println(thirdValue + scanner.nextLine());
        
        scanner.close();
    }

}