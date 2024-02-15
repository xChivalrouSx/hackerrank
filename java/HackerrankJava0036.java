import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HackerrankJava0036 {

	public static void main(String[] args) throws IOException {
		// Java Generics
		// https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true

		printList(Arrays.asList(1, 2, 3));
		printList(Arrays.asList("Hello", "World"));
	}

	public static <T> void printList(List<T> a) {
		a.stream().forEach(p -> System.out.println(p));
	}

}