package io.github.sandywagwa.generics.genericmethods;

class Utils {
    // Generic method
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
