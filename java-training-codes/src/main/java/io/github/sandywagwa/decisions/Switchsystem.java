package io.github.sandywagwa.decisions;

public class Switchsystem {
    public static void main(String[] args) {
        String response = "05";
        String result = switch (response) {
            case "01", "05" -> "Do not honour";
            case "03" -> "No Merchant";
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
