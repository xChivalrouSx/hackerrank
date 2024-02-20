public class HackerrankJava0053 {

	public static void main(String[] args) {
		// Java Method Overriding
		// https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true

		Sports c1 = new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}

}

class Sports {

	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}

	// -------------------------------------------------------------------------------------------------
	// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
	// -------------------------------------------------------------------------------------------------

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}

	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------

}
