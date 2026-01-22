package io.github.sandywagwa.assessments.javase005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        variableOperationsProblem1();
        gradeCalculatorProblem2();
        numberSequenceProblem3();
        inputValidationProblem4();
        patternPrintingProblem5();

    }

    static void variableOperationsProblem1() {
        int a = 15;
        int b = 4;
        int c = 7;

        System.out.println("Sum: " + (a + b + c));// sum of a and b
        System.out.println("Product: " + (a * b));// product of a and b
        System.out.println("Expression Result:" + ((a + b) * c));// bodmas application of a+b multipy the result by
                                                                 // c
        System.out.println("Remainder:" + (a % b));// remainder after dividing a/b

    }

    static void gradeCalculatorProblem2() {
        Scanner scanner = new Scanner(System.in);// opens the scanner
        System.out.print("Enter student score: ");// prompts the user to enter score
        int marks = scanner.nextInt();// reads the score input
        String grade = "";// initializes the grade variable

        // if statements
        if (marks >= 90 && marks <= 100) {
            grade = "Grade:A";
            System.out.println(grade);
        } else if (marks >= 80 && marks <= 89) {
            grade = "Grade:B";
            System.out.println(grade);
        } else if (marks >= 70 && marks <= 79) {
            grade = "Grade:C";
            System.out.println(grade);
        } else if (marks >= 60 && marks <= 69) {
            grade = "Grade:D";
            System.out.println(grade);
        } else if (marks < 60) {
            grade = "Grade:F";
            System.out.println(grade);
        } else if (marks < 0 || marks > 100) {
            System.out.println("Error:Score must be between 0 and 100");// final condition for invalid scores
        }
        scanner.close();
    }

    static void numberSequenceProblem3() {
        int n = 20;// specifies the range of numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " - ");// prints the number

            if (i % 2 == 0) {
                System.out.print("Even");// checks if the number is even then prints even against it
            } else {
                System.out.print("Odd");// checks if the number is odd then prints odd against it
            }

            if (i % 5 == 0) {
                System.out.print(", Multiple of 5");// checks if the number is multiple of 5 then prints multiple of 5
                                                    // against it
            }

            System.out.println();
        }
    }

    static void inputValidationProblem4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer:");// opens scanner to input a positive integer
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.print("Invalid input. Please enter a positive integer:");// validates the input
            number = scanner.nextInt();// reads the new input
        }
        System.out.print("Invalid input! Please enter a positive integer: " + number);// confirms valid input
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.println("Factorial of " + number + " is: " + factorial);// calculates the factorial of the
                                                                               // number
            // which will be fro example
            // (6*5*4*3*2*1=720)

        }

        scanner.close();// closes the scanner
    }

    static void patternPrintingProblem5() {
        int n = 7;// specifies the number of rows for the pattern which is 7

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");// prints spaces before the stars to create a pyramid
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");// prints the stars in each row
            }

            System.out.println();
        }
    }
}