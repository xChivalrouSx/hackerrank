import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HackerrankJava0039 {

	public static void main(String[] args) {
		// Java Dequeue
		// https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true

		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int maxResult = 0;
		Set<Integer> setForCount = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			deque.addLast(num);
			setForCount.add(num);

			if (deque.size() == m) {
				int tmpResult = setForCount.size();
				if (maxResult < tmpResult) {
					maxResult = tmpResult;
				}

				int removeTmp = (int) deque.removeFirst();
				if (!deque.contains(removeTmp)) {
					setForCount.remove(removeTmp);
				}
			}
		}

		System.out.println(maxResult);
		in.close();
	}

}