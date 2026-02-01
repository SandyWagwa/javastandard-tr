package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem3;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 3
 *
 * Key Features:
 * - Polymorphism
 * - Multiple exception handling
 * - System completeness demonstration
 */

public class ECommerceTest {// main class

    public static void main(String[] args) {

        try {
            // Invalid price scenario
            Product laptop = new Electronics("E001", "Laptop", -999.99, 10);

            // Out of stock scenario
            laptop.reduceStock(15);

        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("System execution completed.");
    }
}
