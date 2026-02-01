package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem2;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 1/02/2026
 * Problem: 2
 *
 * Key Features:
 * - Encapsulation
 * - Custom exception throwing
 * - Transfer logic with validation
 * - Static registry of accounts
 */

import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Registry to simulate database
    private static Map<String, BankAccount> accounts = new HashMap<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        accounts.put(accountNumber, this);
    }

    // getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountHolder);
    }

    // Withdraw function
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from " + accountHolder);
    }

    // Transfer function
    public void transfer(String toAccountNumber, double amount)
            throws InsufficientFundsException, AccountNotFoundException {

        if (amount <= 0) {
            throw new InvalidTransactionException("Transfer amount must be positive.");
        }

        BankAccount toAccount = accounts.get(toAccountNumber);

        if (toAccount == null) {
            throw new AccountNotFoundException("Target account has not been found.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for transfer.");
        }

        this.balance -= amount;
        toAccount.balance += amount;

        System.out.println("Transferred " + amount + " from "
                + accountHolder + " to " + toAccount.accountHolder);
    }
}
