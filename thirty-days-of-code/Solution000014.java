import java.util.*;

public class Solution000014 {

    // Day 13: Abstract Classes
    // https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=true

    abstract static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook extends Book {
        int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }

}