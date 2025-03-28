import java.util.Scanner;

public class Solution000005 {

    // Day 4: Class vs. Instance
    // https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true

    public static class Person {
    
        private int age;	
  
        public Person(int initialAge) {
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            } else {
                this.age = initialAge;
            }
        }

        public void amIOld() {
            String output;
            if (age < 13) {
                output = "You are young.";
            } else if (age >= 13 && age < 18) {
                output = "You are a teenager.";
            } else {
                output = "You are old.";
            }
            System.out.println(output);
        }

        public void yearPasses() {
            age++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}