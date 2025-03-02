import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution000012 {

    // Day 11: 2D Arrays
    // https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                List<Integer> firstLine = arr.get(i);
                List<Integer> secondLine = arr.get(i + 1);
                List<Integer> thirdLine = arr.get(i + 2);
                int sum = firstLine.get(j) + firstLine.get(j + 1) + firstLine.get(j + 2)
                        + secondLine.get(j + 1)
                        + thirdLine.get(j) + thirdLine.get(j + 1) + thirdLine.get(j + 2);
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);

        bufferedReader.close();
    }

}