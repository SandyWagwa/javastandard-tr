package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.conceptualquestionsproblem4;

public class Main {
    // question 1: What is the difference between method overloading and method
    // overriding?
    // answer: Method overloading is when multiple methods in the same class have
    // the same name but different parameters (different type or number).
    class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }
    }

    // Method overriding is when a subclass provides a specific implementation of a
    // method that is already defined in its superclass.
    class ScientificCalculator extends Calculator {
        @Override
        public int add(int a, int b) {
            System.out.println("Overridden add method in the ScientificCalculator");
            return a + b;
        }
    }

    // question 2: Why should fields be declared private in a class?
    // answer: Fields should be declared private to implement encapsulation, which
    // protects the internal state of the object from unintended interference and
    // misuse.
    class PersonDetails {
        private String name;
        private int age;

        public PersonDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
    }

    // question 3: What is the purpose of the 'super' keyword in Java?
    // answer: The 'super' keyword is used to refer to the immediate parent class
    // object.
    // Base class vehicle
    class Vehicle {
        int maxSpeed = 120;
    }

    // sub class Car extending vehicle
    class Car extends Vehicle {
        int maxSpeed = 180;

        void display() {
            // print maxSpeed from the vehicle class
            // using super
            System.out.println("Maximum Speed: "
                    + super.maxSpeed);
        }
    }

    // question 4: What is the purpose of the @Override annotation?
    // answer: The @Override annotation indicates that a method is intended to
    // override a method in a superclass.
    public class MainOverrideExample {
        static class Parent {
            public void greet() {
                System.out.println("Hello from Parent");
            }
        }

        static class Child extends Parent {
            @Override
            public void greet() {
                System.out.println("Hello from Child");
            }
        }

        public static void main(String[] args) {
            Parent p = new Child();
            p.greet();
        }
    }

    // question 5: How does encapsulation improve code maintainability?
    // answer: Encapsulation improves code maintainability by restricting direct
    // access to an object's data and methods, allowing controlled interaction
    // through public methods.
    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Invalid withdraw amount");
            }
        }
    }
}