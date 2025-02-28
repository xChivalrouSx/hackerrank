import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution000011 {

    // Day 10: Binary Numbers
    // https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binary = Integer.toBinaryString(n);
        int max = Arrays.asList(binary.split("0")).stream().map(String::length).max(Integer::compare).orElse(0);
        System.out.println(max);

        bufferedReader.close();
    }

}