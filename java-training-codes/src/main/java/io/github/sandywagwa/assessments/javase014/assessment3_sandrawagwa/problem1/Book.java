package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem1;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: [Your Name]
 * Date: [Submission Date]
 * Problem: 1
 *
 * Key Features:
 * - Inheritance from LibraryItem
 * - Method overriding
 * - Encapsulation
 */

public class Book extends LibraryItem {
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
        System.out.println("----------------------");
    }
}
