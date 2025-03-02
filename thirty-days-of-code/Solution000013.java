import java.util.*;

public class Solution000013 {

    // Day 12: Inheritance
    // https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true

    public static class Student extends Person {
        private int[] testScores;

        public Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            this.testScores = testScores;
        }

        public char calculate() {
            int sum = Arrays.stream(testScores).sum();
            double average = (double) sum / testScores.length;

            if (average >= 90 && average <= 100) {
                return 'O';
            } else if (average >= 80 && average < 90) {
                return 'E';
            } else if (average >= 70 && average < 80) {
                return 'A';
            } else if (average >= 55 && average < 70) {
                return 'P';
            } else if (average >= 40 && average < 55) {
                return 'D';
            } else {
                return 'T';
            }
        }

    }

    public static class Person {

        protected String firstName;
        protected String lastName;
        protected int idNumber;

        public Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

}