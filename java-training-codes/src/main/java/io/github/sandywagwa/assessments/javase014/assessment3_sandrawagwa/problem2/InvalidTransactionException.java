package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem2;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 1/02/2026
 * Problem: 2
 *
 * Key Features:
 * - Custom Unchecked Exception
 * - Extends RuntimeException
 * - Used for negative or invalid amounts
 */

public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);// superclass utilization
    }
}
