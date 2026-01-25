package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountinheritanceproblem4;

public class CheckingAccount extends BankAccount {// subclass for checking account
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
            double balance, double overdraftLimit) {// constructor with validations
        super(accountNumber, accountHolder, balance);
        if (overdraftLimit < 0)
            throw new IllegalArgumentException("Overdraft limit cannot be negative");// validation
        this.overdraftLimit = overdraftLimit;
    }

    @Override // override withdraw method
    public void withdraw(double amount) {// overridden withdraw method with overdraft logic
        if (amount <= 0)
            throw new IllegalArgumentException("Withdraw amount must be positive");// validation
        if (amount > balance + overdraftLimit)
            throw new IllegalArgumentException("Overdraft limit exceeded");// overdraft check
        balance -= amount;
    }
}
