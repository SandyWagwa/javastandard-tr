package io.github.sandywagwa.variables;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integer types
        int age = 25;
        long bigNumber = 123456789L;

        // Decimal types
        float price = 19.99f;
        double precise = 3.141592653;

        // Character and boolean
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);
        System.out.println("Precise: " + precise);
        System.out.println("Is Java Fun: " + isJavaFun);

        // constants
        int score = 100;
        score = 95; // Allowed
        System.out.println("Score: " + score);

        // Constant (cannot change)
        final double PI = 3.14159;
        // PI = 3.14; // COMPILER ERROR!

        final int MAX_USERS = 100;
        final String COMPANY_NAME = "Tech Corp";

        // Print constants
        System.out.println("PI: " + PI);
        System.out.println("Max Users: " + MAX_USERS);
        System.out.println("Company Name: " + COMPANY_NAME);
    }
}
