package io.github.sandywagwa.excercises.javase007.bankaccountexcercise;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Sandra Wagwa");
        account.deposit(1000000.0);
        account.withdraw(23500.0);
        account.displayBalance();
    }
}