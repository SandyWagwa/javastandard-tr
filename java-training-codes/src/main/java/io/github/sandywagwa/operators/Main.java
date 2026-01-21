package io.github.sandywagwa.operators;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperators();
        RelationalOperators();
        LogicalOperators();
        AssignmentOperators();
        UnaryOperators();
    }

    public static void ArithmeticOperators() {
        int a = 20;
        int b = 8;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    public static void RelationalOperators() {
        int x = 15;
        int y = 30;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }

    public static void LogicalOperators() {
        int balance = 1000;
        int charges = 43;
        int withdrawalAmount = 400;
        boolean isAbleToWithdraw = (balance >= withdrawalAmount) && ((balance - withdrawalAmount) >= charges);
        System.out.println("Is able to withdraw: " + isAbleToWithdraw);
    }

    public static void AssignmentOperators() {
        int num = 18;
        System.out.println("Initial value: " + num);
        num += 5;
        System.out.println("After += 5: " + num);
        num -= 3;
        System.out.println("After -= 3: " + num);
        num *= 2;
        System.out.println("After *= 2: " + num);
        num /= 4;
        System.out.println("After /= 4: " + num);
        num %= 3;
        System.out.println("After %= 3: " + num);
    }

    public static void UnaryOperators() {
        int n = 9;
        System.out.println("Original n: " + n);
        System.out.println("Post-increment n++: " + (n++));
        System.out.println("After post-increment, n: " + n);
        System.out.println("Pre-increment ++n: " + (++n));
        System.out.println("After pre-increment, n: " + n);
        System.out.println("Post-decrement n--: " + (n--));
        System.out.println("After post-decrement, n: " + n);
        System.out.println("Pre-decrement --n: " + (--n));
        System.out.println("After pre-decrement, n: " + n);
    }
}
