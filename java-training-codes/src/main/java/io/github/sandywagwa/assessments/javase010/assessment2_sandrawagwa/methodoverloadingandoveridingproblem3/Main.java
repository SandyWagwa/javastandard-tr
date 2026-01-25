package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.methodoverloadingandoveridingproblem3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Adding two integers: " + calculator.add(7, 13));// Method overloading
        System.out.println("Adding two doubles: " + calculator.add(10.7, 120.2));// Method overloading
        System.out.println("Adding three integers: " + calculator.add(6, 11, 17));// Method overloading
        System.out.println("Adding two strings: " + calculator.add("Sandra, ", "Wagwa")); // Method overloading

        Calculator.ScientificCalculator scientificCalculator = new Calculator().new ScientificCalculator();
        System.out.println(
                "Overridden addition of two integers in ScientificCalculator: " + scientificCalculator.add(5, 10));// Method
                                                                                                                   // overriding

        System.out.println("Power of 2^3: " + calculator.power(2, 3));// New method in subclass
        System.out.println("Square root of 16: " + calculator.squareRoot(16));//
    }
}