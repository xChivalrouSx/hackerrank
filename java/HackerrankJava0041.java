import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HackerrankJava0041 {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		// Java Priority Queue
		// https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true

		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}

	private static class Student {
		private int id;
		private String name;
		private double cgpa;

		public Student(int id, String name, double cgpa) {
			this.id = id;
			this.name = name;
			this.cgpa = cgpa;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public double getCgpa() {
			return cgpa;
		}
	}

	private static class Priorities {

		public List<Student> getStudents(List<String> events) {
			PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getCgpa() != o2.getCgpa()) {
						return Double.compare(o2.getCgpa(), o1.getCgpa());
					} else if (!o1.getName().equals(o2.getName())) {
						return o1.getName().compareTo(o2.getName());
					} else {
						return Integer.compare(o1.getId(), o2.getId());
					}
				}
			});

			for (String event : events) {
				String[] eventDetail = event.split(" ");
				if (eventDetail[0].equals("ENTER")) {
					int id = Integer.parseInt(eventDetail[3]);
					double cgpa = Double.parseDouble(eventDetail[2]);
					priorityQueue.add(new Student(id, eventDetail[1], cgpa));
				} else {
					priorityQueue.poll();
				}
			}

			List<Student> resultList = new ArrayList<>();
			while (!priorityQueue.isEmpty()) {
				resultList.add(priorityQueue.poll());
			}

			return resultList;
		}
	}

}