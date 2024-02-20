import java.util.Scanner;

public class HackerrankJava0051 {

	public static void main(String[] args) {
		// Java Abstract Class
		// https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true

		// Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();
	}

}

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

// -------------------------------------------------------------------------------------------------
// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
// -------------------------------------------------------------------------------------------------

class MyBook extends Book {
	void setTitle(String title) {
		super.title = title;
	}
}

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------