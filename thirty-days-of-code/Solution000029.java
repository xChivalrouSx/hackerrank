import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Solution000029 {

    // Day 28: RegEx, Patterns, and Intro to Databases
    // https://www.hackerrank.com/challenges/30-regex-patterns/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> names = new ArrayList<>();
        IntStream.range(0, N).forEach(nitr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                if (emailID.endsWith("@gmail.com")) {
                    names.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        names.stream().sorted().forEach(System.out::println);
        bufferedReader.close();
    }

}