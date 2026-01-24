package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.bankaccountinheritanceproblem4;

class BankAccount {

    // Private fields (encapsulation)
    private String accountNumber;
    private String accountHolder;
    protected double balance; // protected so subclasses can access safely

    // Constructor with validation
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    // Withdraw method (to be overridden)
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolder,
            double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        this.interestRate = interestRate;
    }

    // Override withdraw to maintain minimum balance
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalArgumentException(
                    "Withdrawal denied. Minimum balance of $100 must be maintained.");
        }
        balance -= amount;
    }

    // Apply interest
    public void applyInterest() {
        balance += balance * interestRate;
    }
}

class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
            double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative");
        }
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance + overdraftLimit) {
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }
        balance -= amount;
    }
}

// Main class to demonstrate polymorphism
public class BankDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA001", "Alice", 500, 0.05);
        BankAccount checking = new CheckingAccount("CA001", "Bob", 200, 300);

        // Polymorphic behavior
        savings.withdraw(200);
        checking.withdraw(400);

        System.out.println("Savings balance: $" + savings.getBalance());
        System.out.println("Checking balance: $" + checking.getBalance());

        // Access subclass-specific method
        if (savings instanceof SavingsAccount) {
            ((SavingsAccount) savings).applyInterest();
            System.out.println("Savings after interest: $" + savings.getBalance());
        }
    }
}
