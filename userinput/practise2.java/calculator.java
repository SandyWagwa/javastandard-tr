
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the third number:");
        double number3 = scanner.nextDouble();
        System.out.println("Results of operations:");
        System.out.println("Adding: " + (number1 + number2 + number3));
        System.out.println("Subtracting: " + (number1 - number2 - number3));
        System.out.println("Multiplying: " + (number1 * number2 * number3));
        System.out.println("Dividing: " + (number1 / number2 / number3));

        scanner.close();
    }
}