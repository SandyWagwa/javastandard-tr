package io.github.sandywagwa.loops.nestedoops;

public class Patterns {
    // right half pyramid pattern
    public static void main(String[] args) {
        rightHalfPyramidPattern();
        // squarePattern();

    }

    static void rightHalfPyramidPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void squarePattern() {
        int size = 8;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print star if it's on the border
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}