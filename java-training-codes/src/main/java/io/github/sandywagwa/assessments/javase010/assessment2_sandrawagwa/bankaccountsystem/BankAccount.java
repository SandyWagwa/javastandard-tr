package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystem;

/**
 * Basic Bank Account System
 * Student: Sandra Wagwa
 * Date: 25th January 2026
 *
 * Base class representing a bank account.
 */
public abstract class BankAccount {// Fields

    private String accountNumber;// private filed
    private String accountHolder;// private field
    protected double balance;// private field

    public BankAccount(String accountNumber, String accountHolder, double balance)
            throws InvalidAmountException {

        if (accountNumber == null || accountNumber.isEmpty())
            throw new IllegalArgumentException("Account number cannot be empty");// Validation
        if (accountHolder == null || accountHolder.isEmpty())
            throw new IllegalArgumentException("Account holder cannot be empty");// Validation
        if (balance < 0)
            throw new InvalidAmountException("Initial balance cannot be negative");// Validation

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Deposit amount must be positive");
        balance += amount;
    }

    public abstract void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException;

    @Override // toString
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: $" + balance;
    }// toString
}

/*
 * Bonus Features Included
 * 1. Account Transfers:
 * - Bank.findAccount can be used to locate an account.
 * - This allows the transfer of funds safely across the types of accounts.
 * (e.g., Savings to Checking) without losing polymorphic behaviour.
 * 
 * 2. Interest Scheduling (Manual Batch Processing):
 * - Bank.applyInterestToSavingsAccounts is used to apply interest to accounts
 * in batches.
 * - This is a simulation of periodic (e.g., monthly) interest processing of
 * all the SavingsAccount objects will not have an impact on other account
 * types.
 * 
 * 3. Polymorphic Reporting:
 * - toString() method is overridden in SavingsAccount and CheckingAccount.
 * - In cases where the accounts are held as references to BankAccounts, the
 * correct
 * Implementation of toaststring is called at runtime (polymorphism).
 */
