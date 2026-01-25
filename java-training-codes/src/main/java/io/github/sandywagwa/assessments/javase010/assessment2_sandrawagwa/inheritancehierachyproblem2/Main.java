package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.inheritancehierachyproblem2;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "E001", 50000);// base class object
        emp.displayInfo();
        emp.calculateBonus(5);

        System.out.println();

        Employee.Manager mgr = emp.new Manager("Bob", "M001", 80000, "Sales");// subclass Manager object
        mgr.displayInfo();
        mgr.calculateBonus(15);
    }
}