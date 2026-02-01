package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem1;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 1
 *
 * Key Features:
 * - Polymorphism using LibraryItem array
 * - Dynamic method dispatch
 */

public class LibraryTest {
    public static void main(String[] args) {

        LibraryItem[] items = {
                new Book("B001", "Java Programming", "John Doe", "123-4567890123", "Education"),
                new DVD("D001", "Java Tutorial", "Jane Smith", 120, "PG"),
                new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-03-01")
        };

        for (LibraryItem item : items) {
            item.displayDetails(); // Polymorphism
            item.checkout(); // Polymorphism
            System.out.println();
        }

        // Test exception
        items[0].checkout(); // Already checked out
    }
}
