package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem1;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 1
 *
 * Key Features:
 * - Inheritance
 * - Polymorphism
 * - Overridden checkout logic
 */

public class DVD extends LibraryItem {
    private int duration;
    private String rating;

    public DVD(String itemId, String title, String author, int duration, String rating) {
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void checkout() {
        System.out.println("Checking age restriction for DVD...");
        super.checkout();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Rating: " + rating);
        System.out.println("----------------------");
    }
}
