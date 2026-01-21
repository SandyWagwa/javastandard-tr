package io.github.sandywagwa.loops;

public class Main {
    public static void main(String[] args) {
        iLoveYouMumAndDad();

    }

    static void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    static void iLoveYouMumAndDad() {
        for (int counter = 1; counter <= 100; counter++) {
            System.out.println("I love you dad and mum");
        }

        // static void iLoveYouMumAndDad() {
        // for (int counter = 1; counter <= 100; counter += 2) {
        // System.out.println("I love you dad and mum" + counter);
        // }
    }
}
