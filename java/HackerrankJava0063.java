import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class HackerrankJava0063 {

	public static void main(String[] args) throws Exception {
		// Prime Checker
		// https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

// -------------------------------------------------------------------------------------------------
// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
// -------------------------------------------------------------------------------------------------
class Prime {

	public void checkPrime(int... numbersToCheck) {
		for (int number : numbersToCheck) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}

	private boolean isPrime(int value) {
		if (value < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------