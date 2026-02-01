package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem2;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: [Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 2
 *
 * Key Features:
 * - Try–Catch–Finally
 * - Multiple custom exception handling
 * - Demonstrates all error scenarios
 */

public class BankTest {// main class

    public static void main(String[] args) {

        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);

            // Scenario 1 – Invalid deposit
            account1.deposit(-100);

            // Scenario 2 – Insufficient funds
            account1.withdraw(2000);

            // Scenario 3 – Invalid transfer account
            account1.transfer("INVALID", 100);

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());

        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());

        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());

        } finally {
            System.out.println("Transaction processing completed successfully");
        }
    }
}
