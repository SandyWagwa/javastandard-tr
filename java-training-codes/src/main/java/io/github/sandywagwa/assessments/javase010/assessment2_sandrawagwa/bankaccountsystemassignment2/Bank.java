package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystemassignment2;

import java.util.ArrayList;//Importing ArrayList from Java util

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        if (findAccount(account.getAccountNumber()) != null)
            throw new IllegalArgumentException("Account number already exists");
        accounts.add(account);
    }// add account method

    public BankAccount findAccount(String accountNumber) {// finding account method
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber))
                return acc;
        }
        return null;
    }//

    public void displayAllAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        } // displays all the accounts
    }

    public double calculateTotalBalance() {
        double total = 0;
        for (BankAccount acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }// calculating total balance getbalance from the account and add to the total to
     // get the total balance

    public void applyInterestToSavingsAccounts() {
        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
            }
        } // applying interest method to the savings account
    }
}
