package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem2;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 1/02/2026
 * Problem: 2
 *
 * Key Features:
 * - Custom Checked Exception
 * - Thrown when account does not exist
 */

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
