package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountinheritanceproblem4;

public class BankAccount {// base class
    private String accountNumber;
    private String accountHolder;
    protected double balance; // protected so subclasses can access safely

    public BankAccount(String accountNumber, String accountHolder, double balance) {// constructor with validations
        if (accountNumber == null || accountNumber.isEmpty())
            throw new IllegalArgumentException("Account number cannot be empty");
        if (accountHolder == null || accountHolder.isEmpty())
            throw new IllegalArgumentException("Account holder cannot be empty");
        if (balance < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative");

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {// common deposit logic
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {// default withdraw logic
        if (amount <= 0)
            throw new IllegalArgumentException("Withdraw amount must be positive");
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
