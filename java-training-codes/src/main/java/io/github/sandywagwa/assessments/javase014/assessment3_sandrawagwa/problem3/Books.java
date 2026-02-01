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
 * - Specialized product attributes
 */

public class Books extends Product {

    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price,
            int stockQuantity)
            throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        this.author = "Unknown";
        this.publisher = "N/A";
        this.isbn = "000-0000000000";
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }

    @Override
    public String getProductType() {
        return "Books";
    }
}
