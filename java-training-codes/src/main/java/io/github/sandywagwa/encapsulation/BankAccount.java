package io.github.sandywagwa.encapsulation;

public class BankAccount {
    public String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println(accountNumber + "->" + balance);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new RuntimeException("Balance cannot be negative.");
        }
    }

}