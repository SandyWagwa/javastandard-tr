package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystemassignment2;

/**
 * Savings account {child class} with interest and minimum balance enforcement.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolder,
            double balance, double interestRate)
            throws InvalidAmountException {
        super(accountNumber, accountHolder, balance);

        if (interestRate < 0)
            throw new InvalidAmountException("Interest rate cannot be negative");

        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0)
            throw new InvalidAmountException("Withdrawal amount must be positive");

        if (balance - amount < MIN_BALANCE)
            throw new InsufficientFundsException(
                    "Minimum balance of $100 must be maintained");

        balance -= amount;
    }// withdraw method with validations

    public void applyInterest() {
        balance += balance * interestRate;
    }// claculating the balance after interest rates is applied

    @Override
    public String toString() {
        return "[Savings] " + super.toString() +
                ", Interest Rate: " + (interestRate * 100) + "%";
    }// to string
}
