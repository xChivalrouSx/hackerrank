import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution000008 {

    // Day 7: Arrays
    // https://www.hackerrank.com/challenges/30-arrays/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Collections.reverse(arr);
        System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        bufferedReader.close();
    }

}