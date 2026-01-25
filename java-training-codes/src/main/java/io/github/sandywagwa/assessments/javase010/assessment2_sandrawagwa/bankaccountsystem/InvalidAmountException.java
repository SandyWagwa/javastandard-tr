package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystem;

// super class linking to the bankaccount class where the IvalidAmountException
// is thrown
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
