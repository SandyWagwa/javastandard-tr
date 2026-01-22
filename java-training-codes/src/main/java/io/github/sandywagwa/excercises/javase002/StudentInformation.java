package io.github.sandywagwa.excercises.javase002;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your grade");
        double grade = scanner.nextDouble();
        System.out.println("Enter your GPA:");
        double gpa = scanner.nextDouble();

        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
        scanner.close();

    }
}
