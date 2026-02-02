package io.github.sandywagwa.excercises.javase006;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Addition 5+3=" + add(5, 3));
        System.out.println("Subtraction 5-3= " + subtract(5, 3));
        System.out.println("Multiplication 5*3= " + multiply(6, 7));

    }

    static int add(int a, int b) {
        return (a + b);

    }

    static int subtract(int a, int b) {
        return (a - b);
    }

    static int multiply(int a, int b) {
        return (a * b);
    }

}
