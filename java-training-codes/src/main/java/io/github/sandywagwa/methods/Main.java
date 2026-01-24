package io.github.sandywagwa.methods;

public class Main {
    public static void main(String[] args) {
        calculateArea(5);
        calculateArea(7.5);
        calculateArea(6);
    }

    public static void calculateArea(double radius) {
        double area = Math.PI * radius * radius;// 3.142
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }
}
