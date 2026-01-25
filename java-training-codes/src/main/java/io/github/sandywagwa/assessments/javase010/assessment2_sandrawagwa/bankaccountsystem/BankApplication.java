package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountsystem;

// Main Functionality to run the Bank Application System

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// scanner for input
        Bank bank = new Bank();
        boolean running = true;

        while (running) {// Menu Driven Interface
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {// swtich statement

                    case 1: // Create Savings Account
                        System.out.print("Account Number: ");
                        String saNum = scanner.nextLine();

                        System.out.print("Account Holder: ");
                        String saHolder = scanner.nextLine();

                        System.out.print("Initial Balance: ");
                        double saBalance = scanner.nextDouble();

                        System.out.print("Interest Rate (For example input a value like 0.05): ");
                        double rate = scanner.nextDouble();

                        bank.addAccount(new SavingsAccount(
                                saNum, saHolder, saBalance, rate));
                        System.out.println("Savings account created successfully.");// success output
                        break;

                    case 2: // Create Checking Account
                        System.out.print("Account Number: ");
                        String caNum = scanner.nextLine();

                        System.out.print("Account Holder: ");
                        String caHolder = scanner.nextLine();

                        System.out.print("Initial Balance: ");
                        double caBalance = scanner.nextDouble();

                        System.out.print("Overdraft Limit: ");
                        double limit = scanner.nextDouble();

                        bank.addAccount(new CheckingAccount(
                                caNum, caHolder, caBalance, limit));
                        System.out.println("Checking account created successfully. Well Done.");
                        break;

                    case 3: // Deposit
                        System.out.print("Account Number: ");
                        String depAcc = scanner.nextLine();

                        BankAccount depAccount = bank.findAccount(depAcc);
                        if (depAccount == null) {
                            System.out.println("Account not found.");
                            break;
                        }

                        System.out.print("Deposit Amount: ");
                        double depAmount = scanner.nextDouble();
                        depAccount.deposit(depAmount);

                        System.out.println("Deposit successful.");
                        break;

                    case 4: // Withdraw
                        System.out.print("Account Number: ");
                        String wAcc = scanner.nextLine();

                        BankAccount wAccount = bank.findAccount(wAcc);
                        if (wAccount == null) {
                            System.out.println("Account not found.");
                            break;
                        }

                        System.out.print("Withdrawal Amount: ");
                        double wAmount = scanner.nextDouble();
                        wAccount.withdraw(wAmount);

                        System.out.println("Withdrawal successful.");
                        break;

                    case 5: // Check Balance
                        System.out.print("Account Number: ");
                        String balAcc = scanner.nextLine();

                        BankAccount balAccount = bank.findAccount(balAcc);
                        if (balAccount == null) {
                            System.out.println("Account not found.");
                        } else {
                            System.out.println("Balance: Kshs" +
                                    balAccount.getBalance());
                        }
                        break;

                    case 6: // Apply Interest
                        bank.applyInterestToSavingsAccounts();
                        System.out.println("Interest applied to all the savings accounts.");
                        break;

                    case 7: // Display All Accounts
                        bank.displayAllAccounts();
                        break;

                    case 8: // Exit
                        running = false;
                        System.out.println("Thank you for using sandra Wagwa's Bank Account System.");
                        break;

                    default:
                        System.out.println("Invalid option, please try again.");
                }

            } catch (Exception e) {// exception handling
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // clear input buffer
            } // try catch handling with the switch case functionality
        }

        scanner.close();// closing the scanner
    }
}
