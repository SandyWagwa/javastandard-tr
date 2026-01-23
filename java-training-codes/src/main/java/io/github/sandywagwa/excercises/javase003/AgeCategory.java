package io.github.sandywagwa.excercises.javase003;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        String category;
        if (age >= 0 && age <= 12) {
            category = "Child";
        } else if (age >= 13 && age <= 19) {
            category = "Teenager";
        } else if (age >= 20 && age <= 64) {
            category = "Adult";
        } else if (age >= 65) {
            category = "Senior";
        } else {
            category = "Invalid age";
        }
        scanner.close();
        System.out.println("Age:" + age);
        System.out.println("category: " + category);
    }

}
