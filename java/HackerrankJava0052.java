import java.util.Scanner;

public class HackerrankJava0052 {

	public static void main(String[] args) {
		// Java Interface
		// https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true

		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

// -------------------------------------------------------------------------------------------------
// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
// -------------------------------------------------------------------------------------------------

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------