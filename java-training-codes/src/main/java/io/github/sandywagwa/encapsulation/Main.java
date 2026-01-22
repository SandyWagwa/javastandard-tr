package io.github.sandywagwa.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("001", 1000.0);

        bankAccount.balance = -1000.0;
        bankAccount.printInfo();
        ;

    }

}
