package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.classdesignproblem1;

public class Main {
    public static void main(String[] args) {
        // Create a new Book instance with the necesarry details
        Book book = new Book("Java Training Notes", "Sandy Wagwa", "7645986509709", 45000.00);

        // Display book details informations, in the console
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Available: " + book.isAvailable());

        // Update book price details
        book.setPrice(40.00);
        System.out.println("Updated Price: Kshs" + book.getPrice());
    }
}
