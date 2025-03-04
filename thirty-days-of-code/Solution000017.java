import java.io.*;

public class Solution000017 {

    // Day 16: Exceptions - String to Integer
    // https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();

        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        } finally {
            bufferedReader.close();
        }
    }

}