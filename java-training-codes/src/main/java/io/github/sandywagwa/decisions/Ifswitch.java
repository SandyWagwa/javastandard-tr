package io.github.sandywagwa.decisions;

import java.util.Scanner;

public class Ifswitch {
    public static void main(String[] args) {
        int number = 10;

        // if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // switch statement
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is: " + dayName);

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

        // int number = 10;

        // // Simple if statement
        // if (number > 0) {
        // System.out.println("The number is positive.");
        // }

        // // if-else statement
        // if (number % 2 == 0) {
        // System.out.println("The number is even.");
        // } else {
        // System.out.println("The number is odd.");
        // }

        // // if-else-if ladder
        // if (number > 0) {
        // System.out.println("The number is positive.");
        // } else if (number < 0) {
        // System.out.println("The number is negative.");
        // } else {
        // System.out.println("The number is zero.");
        // }

        // int age = 25;
        // if (age >= 18) {
        // System.out.println("You can vote.");
        // } else {
        // System.out.println("You cannot vote.");
        // }

        int ageofp = 20;
        boolean hasID = true;
        if (ageofp >= 18) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("You cannot enter the club.");
        }
    }
}
