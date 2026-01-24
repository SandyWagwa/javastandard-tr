package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.classdesignproblem1;

public class Main {
    public static void main(String[] args) {
        // Create a new Book instance
        Book book = new Book("Java Training Notes", "Sandy Wagwa", "7645986509709", 45000.00);

        // Display book details
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Available: " + book.isAvailable());

        // Update book details
        book.setPrice(40.00);
        System.out.println("Updated Price: Kshs" + book.getPrice());
    }
}
