import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");

        double amountToDeposit = scanner.nextDouble();
        balance += amountToDeposit;
        System.out.println("Balance after deposit: " + balance);

        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        System.out.println("Amount to withdraw: " + amountToWithdraw);

        System.out.print("Enter withdrawal charges: ");

        double withdrawalcharges = scanner.nextDouble();
        System.out.println("Withdrawal charges: " + withdrawalcharges);

        scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Customer Name: " + customerName);

        System.out.print("Enter customer age: ");
        int customerAge = scanner.nextInt();
        System.out.println("Customer Age: " + customerAge);

        System.out.print("Your ATM at service for " + customerName);
        balance = (amountToWithdraw + withdrawalcharges);
        System.out.println("Balance after withdrawal: " + balance);

        scanner.close();

    }

}