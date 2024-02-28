public class HackerrankJava0058 {

	// Java Singleton Pattern
	// https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true

	// -------------------------------------------------------------------------------------------------
	// You need to replace all HackerrankJava0058 as Singleton.
	// -------------------------------------------------------------------------------------------------

	public String str;

	private static HackerrankJava0058 instance;

	private HackerrankJava0058() {
	}

	public static HackerrankJava0058 getSingleInstance() {
		if (instance == null) {
			instance = new HackerrankJava0058();
		}
		return instance;
	}

}