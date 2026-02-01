package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem3;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 3
 *
 * Key Features:
 * - Custom checked exception
 * - Used for invalid product data validation
 */

public class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}
