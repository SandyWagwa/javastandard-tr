package io.github.sandywagwa.variables;

public class ReferenceTypes {
    public static void main(String[] args) {
        // String reference types
        String name = "John Doe";
        String message = new String("Hello");

        // Arrays are reference types
        int[] scores = { 90, 85, 95 };
        String[] names = { "Alice", "Bob", "Charlie" };

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        System.out.println("First score: " + scores[0]);
        System.out.println("First name: " + names[0]);
        System.out.println("Second score: " + scores[1]);
        System.out.println("Second name: " + names[1]);
    }
}
