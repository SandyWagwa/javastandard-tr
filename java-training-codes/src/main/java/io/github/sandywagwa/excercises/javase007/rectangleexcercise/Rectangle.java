package io.github.sandywagwa.excercises.javase007.rectangleexcercise;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public double calculateArea() {
        return length * width;
    }

}