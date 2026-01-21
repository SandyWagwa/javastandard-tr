package io.github.sandywagwa.variables;

public class Main {

    public static void main(String[] args) {
        int age;
        String name;
        double salary;

        age = 25;
        name = "Sandy Wagwa";
        salary = 55000.50;

        // Declaration+ Assignment
        int score = 100;
        String message = "Hello";

        String $name = "Sandy Wagwa";
        String _firstName = "Sandy";
        String lastName = "Wagwa";

        boolean isActive = true;
        boolean isClosed = false;

        // data types
        // Primitive data types
        int number = 10;
        byte b = 108;
        short s = 30000;
        long l = 100000L;
        char letter = 'A';
        float f = 5.75f;

        System.out.println((Integer.MAX_VALUE));
        System.out.println((Long.MIN_VALUE));

        int years = Integer.MAX_VALUE;

        Long numberOfYears = (long) years;
        short numbOfYears = (short) years;
        System.out.println(numbOfYears);

        Double.parseDouble(lastName);
        Float.parseFloat(lastName);

    }
}
