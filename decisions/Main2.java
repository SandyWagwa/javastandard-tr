package decisions;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int QUALIFICATION_AGE = 18;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >= QUALIFICATION_AGE) {
            System.out.println("Enter your name");
            String name = scanner.nextLine();

            System.out.println("Enter your location");
            String location = scanner.nextLine();
            System.out.println("You are now registered: " + name + " from " + location);

        } else {
            System.out.println("You are not eligible to register.");
        }
        scanner.close();
    }

}
