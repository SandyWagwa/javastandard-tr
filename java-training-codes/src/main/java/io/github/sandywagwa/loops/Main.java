package io.github.sandywagwa.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // iLoveYouMumAndDad();
        // whileLoop();
        // whileLoopsWithCounter();
        // doWhileLoop();
        breakingstatement();

    }

    static void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    static void breakingstatement() {

        int[] numbers = { 1, 25, 85, 96, 36, 78, 12, 8 };

        for (int counter = 0; counter < numbers.length; counter++) {
            int number = numbers[counter];
            if (number == 96) {
                System.out.println("Found the number: " + number);
                break;
            }
        }
    }

    static void doWhileLoop() {
        // // int x = 10;
        // // do {
        // // System.out.println("This excecutes once: ");
        // // x++;
        // }while(x<5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===========Sandra Hotels===========");
            System.out.println("1. Tea");
            System.out.println("2. Coffee");
            System.out.println("3. Mandazi");
            System.out.println("4. Juice");
            System.out.println("5. Exit");
            System.out.println("Enter your pick:");
            choice = scanner.nextInt();

            if (choice != 5) {
                System.out.print(("You have been served with " + choice));
            }

        } while (choice != 5);
        System.out.println("Thank you for visiting Sandra Hotels. Goodbye!");

        scanner.close();
    }

    static void iLoveYouMumAndDad() {
        for (int counter = 1; counter <= 100; counter++) {
            System.out.println("I love you dad and mum");
        }

        // static void iLoveYouMumAndDad() {
        // for (int counter = 1; counter <= 100; counter += 2) {
        // System.out.println("I love you dad and mum" + counter);
        // }
    }

    static void whileLoopsWithCounter() {
        int counter = 1;
        while (counter <= 5) {
            System.out.println("I love you mum and dad");
            counter++;

        }
    }

    static void whileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========Sandra Hotels===========");
        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.println("3. Mandazi");
        System.out.println("4. Juice");
        System.out.println("5. Exit");
        System.out.println("Enter your pick:");
        int choice = scanner.nextInt();

        System.out.print(("You have been served with " + choice));

        while (choice != 5) {
            System.out.println("Enter your pick:");
            choice = scanner.nextInt();
            System.out.print(("You have been served with " + choice));
        }

        scanner.close();

    }
}
