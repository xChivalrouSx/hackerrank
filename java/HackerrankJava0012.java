import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HackerrankJava0012 {

	public static void main(String[] args) {
		// Java Currency Formatter
		// https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		System.out.println("US: " + getFormettedResult(payment, Locale.US));
		System.out.println("India: " + getFormettedResult(payment, new Locale("en", "IN")));
		System.out.println("China: " + getFormettedResult(payment, Locale.CHINA));
		System.out.println("France: " + getFormettedResult(payment, Locale.FRANCE));
	}

	private static String getFormettedResult(double payment, Locale locale) {
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(locale);
		return usFormat.format(payment);
	}

}
