import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

public class HackerrankJava0062 {

	public static void main(String[] args) throws Exception {
		// Can You Access?
		// https://www.hackerrank.com/challenges/can-you-access/problem?isFullScreen=true

		DoNotTerminate.forbidExit();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

			// -------------------------------------------------------------------------------------------------
			// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
			// -------------------------------------------------------------------------------------------------
			o = new Inner().new Private();
			System.out.println(num + " is " + ((Inner.Private) o).powerof2(num));
			// -------------------------------------------------------------------------------------------------
			// -------------------------------------------------------------------------------------------------
			// -------------------------------------------------------------------------------------------------

			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		}

		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}
}

class DoNotTerminate { // This class prevents exit(0)

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}