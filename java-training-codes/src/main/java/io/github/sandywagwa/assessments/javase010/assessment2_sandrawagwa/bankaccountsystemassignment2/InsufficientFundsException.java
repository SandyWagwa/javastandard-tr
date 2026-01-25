package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystemassignment2;

// exception handling with superclass reference to the Exception Class to output the message
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
