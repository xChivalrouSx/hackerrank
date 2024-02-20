import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HackerrankJava0049 {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// Java Iterator
		// https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=true

		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			// --- You need to update this line ---
			Object element = it.next();
			// --- You need to update this line ---
			if (element instanceof String)
				break;
		}
		return it;

	}

}