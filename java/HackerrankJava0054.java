public class HackerrankJava0054 {

	public static void main(String[] args) {
		// Java Inheritance I
		// https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	// -------------------------------------------------------------------------------------------------
	// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
	// -------------------------------------------------------------------------------------------------
	void sing() {
		System.out.println("I am singing");
	}
	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------
}