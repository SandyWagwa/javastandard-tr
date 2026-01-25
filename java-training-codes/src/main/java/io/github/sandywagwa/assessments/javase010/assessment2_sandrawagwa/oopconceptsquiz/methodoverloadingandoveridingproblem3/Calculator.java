//Sandra Wagwa
package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.oopconceptsquiz.methodoverloadingandoveridingproblem3;

public class Calculator {// Base class
    public int add(int a, int b) {// Method overloading
        return a + b;
    }

    public double add(double a, double b) {// Method overloading
        return a + b;
    }

    public int add(int a, int b, int c) {// Method overloading
        return a + b + c;
    }

    public String add(String a, String b) {// Method overloading,concatenation
        return a + b;
    }

    public class ScientificCalculator extends Calculator {// Subclass
        @Override // Method overriding
        public int add(int a, int b) {
            return super.add(a, b) + 10; // Adds 10 to the result of the base class method
        }
    }

    public double power(double base, double exponent) {// New method in subclass
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {// New method in subclass
        return Math.sqrt(number);
    }

}