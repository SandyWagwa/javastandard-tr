package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem3;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 3
 *
 * Key Features:
 * - Abstraction (abstract class + methods)
 * - Encapsulation
 * - Input validation with exceptions
 * - Inventory management
 */

public abstract class Product {

    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity)
            throws InvalidProductException {

        if (productId == null || productId.isEmpty())// error handling
            throw new InvalidProductException("Product ID cannot be empty.");

        if (name == null || name.isEmpty())
            throw new InvalidProductException("Product name cannot be empty.");

        if (price <= 0)
            throw new InvalidProductException("Price must be positive.");

        if (stockQuantity < 0)
            throw new InvalidProductException("Stock cannot be negative.");

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Abstract methods
    public abstract double calculateDiscount();

    public abstract String getProductType();

    // Concrete method
    public double applyTax() {
        return price * 1.16; // 16% tax example
    }

    public void displayProductInfo() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + getProductType());
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stockQuantity);
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity <= 0)
            throw new OutOfStockException("Quantity must be positive.");

        if (quantity > stockQuantity)
            throw new OutOfStockException("Not enough stock available.");

        stockQuantity -= quantity;
        System.out.println("Stock reduced. Remaining: " + stockQuantity);
    }
}
