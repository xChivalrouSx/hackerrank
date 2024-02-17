import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerrankJava0038 {

	public static void main(String[] args) {
		// Java Sort
		// https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		// -------------------------------------------------------------------------------------------------
		// --- You need to add this lines for solution hackerrank provides all other lines for challange ---
		// -------------------------------------------------------------------------------------------------
		studentList.sort((firstStudent, secondStudent) -> {
			if (firstStudent.getCgpa() != secondStudent.getCgpa()) {
				return Double.compare(secondStudent.getCgpa(), firstStudent.getCgpa());
			} else if (!firstStudent.getFname().equals(secondStudent.getFname())) {
				return firstStudent.getFname().compareTo(secondStudent.getFname());
			} else {
				return Integer.compare(firstStudent.getId(), secondStudent.getId());
			}
		});
		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}

		in.close();
	}

	private static class Student {
		private int id;
		private String fname;
		private double cgpa;

		public Student(int id, String fname, double cgpa) {
			super();
			this.id = id;
			this.fname = fname;
			this.cgpa = cgpa;
		}

		public int getId() {
			return id;
		}

		public String getFname() {
			return fname;
		}

		public double getCgpa() {
			return cgpa;
		}
	}

}