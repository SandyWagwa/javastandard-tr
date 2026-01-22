package io.github.sandywagwa.excercises.javase007.rectangleexcercise;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        Rectangle rectangle3 = new Rectangle(4.0);

        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle2 : " + rectangle2.calculateArea());
        System.out.println("Area of rectangle3 (square): " + rectangle3.calculateArea());
    }
}
