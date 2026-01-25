package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystem;

/**
 * Checking account {child class} with overdraft facility.
 */
public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
            double balance, double overdraftLimit)
            throws InvalidAmountException {
        super(accountNumber, accountHolder, balance);

        if (overdraftLimit < 0)
            throw new InvalidAmountException("Overdraft limit cannot be negative");

        this.overdraftLimit = overdraftLimit;
    }// Checking account method with validations

    @Override // overiding method
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0)
            throw new InvalidAmountException("Withdrawal amount must be positive");

        if (amount > balance + overdraftLimit)
            throw new InsufficientFundsException("Overdraft limit exceeded");

        balance -= amount;
    }

    @Override // overidden method
    public String toString() {
        return "[Checking] " + super.toString() +
                ", Overdraft Limit: $" + overdraftLimit;
    }
}
