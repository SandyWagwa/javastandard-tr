package io.github.sandywagwa.loops;

public class Ternary {
    public static void main(String[] args) {
        System.out.println(message());

    }

    public static String message() {
        String status = "pending";
        return status == "active" ? "Your order is in pending state" : "Your order has been placed";

    }
}
