package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem3;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 3
 *
 * Key Features:
 * - Inheritance
 * - Encapsulation
 * - Overridden discount logic
 */

public class Clothing extends Product {

    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price,
            int stockQuantity)
            throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.size = "M";
        this.material = "Cotton";
        this.color = "Black";
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }
}
