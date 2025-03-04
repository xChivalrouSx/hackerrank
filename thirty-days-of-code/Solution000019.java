import java.util.Scanner;

public class Solution000019 {

    // Day 18: Queues and Stacks
    // https://www.hackerrank.com/challenges/30-queues-stacks/problem?isFullScreen=true

    char[] stack = new char[100];
    int top = -1;

    char[] queue = new char[100];
    int front = 0;
    int end = 0;

    void pushCharacter(char c) {
        stack[++top] = c;
    }

    void enqueueCharacter(char c) {
        queue[end++] = c;
    }

    char popCharacter() {
        return stack[top--];
    }

    char dequeueCharacter() {
        return queue[front++];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution000019 p = new Solution000019();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

}