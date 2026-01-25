package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountinheritanceproblem4;

public class SavingsAccount extends BankAccount {// subclass for savings account
    private double interestRate;// interest rate
    private static final double MIN_BALANCE = 100.0;// minimum balance

    public SavingsAccount(String accountNumber, String accountHolder,
            double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        if (interestRate < 0)
            throw new IllegalArgumentException("Interest rate cannot be negative");// validation
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {// overridden withdraw method with minimum balance check
        if (amount <= 0)
            throw new IllegalArgumentException("Withdraw amount must be positive");// validation
        if (balance - amount < MIN_BALANCE)
            throw new IllegalArgumentException("Minimum balance of $100 must be maintained");// minimum balance check
        balance -= amount;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }
}
