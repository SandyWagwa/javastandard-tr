package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountinheritanceproblem4;

public class Main {
    public static void main(String[] args) {// main method to demonstrate functionality

        BankAccount savings = new SavingsAccount(
                "SA001", "Sandra", 1000000, 0.08);// upcasting

        BankAccount checking = new CheckingAccount(
                "CA001", "Wagwa", 2000000, 700);// upcasting

        savings.withdraw(200); // Uses SavingsAccount logic
        checking.withdraw(400); // Uses CheckingAccount overdraft logic

        ((SavingsAccount) savings).applyInterest();

        System.out.println("Savings Balance: $" + savings.getBalance());// downcasting to access subclass-specific
                                                                        // method
        System.out.println("Checking Balance: $" + checking.getBalance());// display balances
    }
}
