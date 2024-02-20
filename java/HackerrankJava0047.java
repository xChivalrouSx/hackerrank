public class HackerrankJava0047 {

	public static void main(String[] args) {
		// Java Method Overriding 2 (Super Keyword)
		// https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true

		MotorCycle M = new MotorCycle();
	}

}

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());

		// --- You need to update this line ---
		String temp = super.define_me();

		System.out.println("My ancestor is a cycle who is " + temp);
	}

}