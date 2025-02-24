import java.io.*;

public class Solution000003 {

    // Day 2: Operators
    // https://www.hackerrank.com/challenges/30-operators/problem?isFullScreen=true

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double total_cost = meal_cost + tip + tax;

        System.out.println(Math.round(total_cost));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }

}