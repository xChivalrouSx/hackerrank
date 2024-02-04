import java.util.Calendar;
import java.util.Locale;

public class HackerrankJava0011 {

	public static void main(String[] args) {
		// Java Date and Time
		// https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true

		String dayOfTheWeek = findDay(8, 5, 2015);
		System.out.println(dayOfTheWeek);
	}

	public static String findDay(int month, int day, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
	}

}
