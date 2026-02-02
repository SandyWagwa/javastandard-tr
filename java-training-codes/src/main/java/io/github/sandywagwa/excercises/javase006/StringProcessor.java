package io.github.sandywagwa.excercises.javase006;

public class StringProcessor {

    // Reverse a string
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Count vowels
    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Convert to uppercase
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    // Remove spaces
    public static String removeSpaces(String text) {
        return text.replace(" ", "");
    }
}
