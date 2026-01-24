package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.methodoverloadingandoveridingproblem3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Adding two integers: " + calculator.add(7, 13));
        System.out.println("Adding two doubles: " + calculator.add(10.7, 120.2));
        System.out.println("Adding three integers: " + calculator.add(6, 11, 17));
        System.out.println("Adding two strings: " + calculator.add("Sandra, ", "Wagwa"));

        Calculator.ScientificCalculator scientificCalculator = new Calculator().new ScientificCalculator();
        System.out.println(
                "Overridden addition of two integers in ScientificCalculator: " + scientificCalculator.add(5, 10));

        System.out.println("Power of 2^3: " + calculator.power(2, 3));
        System.out.println("Square root of 16: " + calculator.squareRoot(16));
    }
}