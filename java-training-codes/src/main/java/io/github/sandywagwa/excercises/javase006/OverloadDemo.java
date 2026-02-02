package io.github.sandywagwa.excercises.javase006;

public class OverloadDemo {

    // Add two ints
    public static int add(int a, int b) {
        return a + b;
    }

    // Add three ints
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Print message
    public static void print(String msg) {
        System.out.println(msg);
    }

    // Print message multiple times
    public static void print(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
