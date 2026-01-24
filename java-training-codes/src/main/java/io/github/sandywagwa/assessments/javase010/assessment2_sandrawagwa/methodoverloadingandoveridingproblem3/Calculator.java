package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.methodoverloadingandoveridingproblem3;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public class ScientificCalculator extends Calculator {
        @Override
        public int add(int a, int b) {
            return super.add(a, b) + 10; // Adds 10 to the result of the base class method
        }
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

}