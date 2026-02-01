package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem1;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 1
 *
 * Key Features:
 * - Inheritance
 * - Encapsulation
 * - Method overriding
 */

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;

    public Magazine(String itemId, String title, String author,
            int issueNumber, String publicationDate) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue No: " + issueNumber);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("----------------------");
    }
}
