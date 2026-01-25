package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.inheritancehierachyproblem2;

public class Employee {// base class Employee
    private String name;
    private String Id;
    private double salary;

    public Employee(String name, String Id, double salary) {// constructor
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }

    // getter functions
    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public double getSalary() {
        return salary;
    }

    // setter functions
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateBonus(double percentage) {
        double bonus = (5 / 100) * salary;
        System.out.println("Bonus for " + name + " is: " + bonus);
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + Id);
        System.out.println("Employee Salary: " + salary);
    }

    public class Manager extends Employee {
        private String department;

        public Manager(String name, String Id, double salary, String department) {
            super(name, Id, salary);
            this.department = department;
        }

        @Override // override displayInfo method
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department);
        }

        @Override // override calculateBonus method
        public void calculateBonus(double percentage) {
            double bonus = (15 / 100) * getSalary() + 1000; // Managers get an additional fixed bonus
            System.out.println("Bonus for Manager " + getName() + " is: " + bonus);
        }
    }

    public class Developer extends Employee {// subclass Developer
        private String programmingLanguage;

        public Developer(String name, String Id, double salary, String programmingLanguage) {
            super(name, Id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override // override displayInfo method
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Programming Language: " + programmingLanguage);
        }

        @Override
        public void calculateBonus(double percentage) {
            double bonus = (10 / 100) * getSalary() + 1000; // Developers get an additional fixed bonus
            System.out.println("Bonus for Developer " + getName() + " is: " + bonus);
        }
    }

}