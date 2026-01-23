package io.github.sandywagwa.excercises.javase002;

public class BmiCalculator {
    public static void main(String[] args) {
        double massInKg = 120.0;
        double heightInMeters = 3.45;

        double bmi = massInKg / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);
    }

}
