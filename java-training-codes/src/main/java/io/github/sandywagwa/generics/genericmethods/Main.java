package io.github.sandywagwa.generics.genericmethods;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3 };
        String[] words = { "Java", "Generics" };

        Utils.printArray(nums); // 1 2 3
        Utils.printArray(words); // Java Generics
    }

}
