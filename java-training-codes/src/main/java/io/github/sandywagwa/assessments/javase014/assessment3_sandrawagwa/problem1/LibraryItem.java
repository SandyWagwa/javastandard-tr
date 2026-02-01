package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem1;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 1
 *
 * Key Features:
 * - Encapsulation using private fields and getters/setters
 * - Base class for inheritance
 * - Exception handling in checkout/return
 * - Polymorphic methods
 */

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // setters
    protected void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void checkout() {
        try {
            if (!isAvailable) {
                throw new Exception("Item is already checked out!");
            }
            setAvailable(false);
            System.out.println(title + " checked out successfully.");
        } catch (Exception e) {
            System.out.println("Checkout Error: " + e.getMessage());
        }
    }

    public void returnItem() {
        try {
            if (isAvailable) {
                throw new Exception("Item was not checked out!");
            }
            setAvailable(true);
            System.out.println(title + " returned.");
        } catch (Exception e) {
            System.out.println("Return Error: " + e.getMessage());
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}
