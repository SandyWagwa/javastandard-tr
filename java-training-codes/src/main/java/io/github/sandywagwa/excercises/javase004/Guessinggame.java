package io.github.sandywagwa.excercises.javase004;

import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        int target = 30;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        while (guess != target) {

            System.out.print("Guess the number: ");

            guess = scanner.nextInt();

            if (guess < target) {

                System.out.println("Too low!");

            } else if (guess > target) {

                System.out.println("Too high!");

            }

        }

        System.out.println("Correct!");

        scanner.close();

    }

}
