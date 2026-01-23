package io.github.sandywagwa.excercises.javase004;

public class Factorial {
    public static void main(String[] args) {
        // int number = 12;
        // long factorial = computeFactorial(number);
        // System.out.println("The factorial of " + number + " is: " + factorial);
        // }

        // static long computeFactorial(int num) {
        // long result = 1;
        // for (int i = 1; i <= num; i++) {
        // result *= i;
        // }
        // return result;
        int number = 6;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
