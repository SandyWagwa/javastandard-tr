package io.github.sandywagwa.excercises.javase006;

public class TemperatureConverter {

    public static void main(String[] args) {

        // Test conversions
        System.out.println("70°C = " + celsiusToFahrenheit(70) + "°F");
        System.out.println("88°F = " + fahrenheitToCelsius(88) + "°C");

        // Using double precision
        System.out.println("40.6°C = " + celsiusToFahrenheit(40.6) + "°F");

        // Print table
        printTemperatureTable();
    }

    // -------- Celsius to Fahrenheit (double precision) --------
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // -------- Celsius to Fahrenheit (int overloaded) --------
    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    // -------- Fahrenheit to Celsius (double precision) --------
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // -------- Fahrenheit to Celsius (int overloaded) --------
    public static double fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    // -------- Print Conversion Table --------
    public static void printTemperatureTable() {
        System.out.println("\nTemperature Conversion Table");
        System.out.println("°C\t°F");

        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%d\t%.1f%n", celsius, fahrenheit);
        }
    }
}
