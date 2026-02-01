package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem3;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 3
 *
 * Key Features:
 * - Inheritance
 * - Method overriding
 * - Product-specific discount
 */

public class Electronics extends Product {

    private int warrantyPeriod;
    private int powerConsumption;

    public Electronics(String productId, String name, double price,
            int stockQuantity)
            throws InvalidProductException {// error handling
        super(productId, name, price, stockQuantity);
        this.warrantyPeriod = 24;
        this.powerConsumption = 65;
    }

    @Override // overriding function
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override // overriding function
    public String getProductType() {
        return "Electronics";
    }
}
