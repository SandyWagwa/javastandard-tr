package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem3;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: [Your Name]
 * Date: [Submission Date]
 * Problem: 3
 *
 * Key Features:
 * - Custom checked exception
 * - Used when stock is insufficient
 */

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);// superclass implementation
    }
}
