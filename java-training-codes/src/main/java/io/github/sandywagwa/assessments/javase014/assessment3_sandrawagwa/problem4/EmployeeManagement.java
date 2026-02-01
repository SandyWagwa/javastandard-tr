package io.github.sandywagwa.assessments.javase014.assessment3_sandrawagwa.problem4;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sandra Wagwa
 * Date: 01/02/2026
 * Problem: 4
 *
 * Key Features:
 * - Encapsulation using private fields and getters/setters
 * - Proper static usage
 * - Exception handling for invalid salary
 * - Correct method return types
 * - Improved constructor and validation
 */

public class EmployeeManagement {

    private static String companyName = "ABC Corp"; // static shared field

    private String employeeName;
    private double salary;

    public EmployeeManagement(String name, double salary) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty.");
        }
        this.employeeName = name;
        setSalary(salary);
    }

    // Static setter/getter for the company
    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    // Encapsulated salary setter
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Correct return type
    public double calculateBonus() {
        return salary * 0.10;
    }

    public void displayInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    // Demo usage
    public static void main(String[] args) {
        try {
            EmployeeManagement emp = new EmployeeManagement("Alice", 5000);
            emp.displayInfo();

            // Test exception
            emp.setSalary(-200);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
