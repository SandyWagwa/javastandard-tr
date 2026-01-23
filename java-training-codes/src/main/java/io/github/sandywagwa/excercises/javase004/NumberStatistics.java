package io.github.sandywagwa.excercises.javase004;

import java.util.Scanner;

public class NumberStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
        scanner.close();
    }
}