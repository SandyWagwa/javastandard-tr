package io.github.sandywagwa.excercises.javase007.studentmanagementexcercise;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem("Alice", 20, new String[] { "A", "B", "A" }, 4);
        sms.addStudent();
        sms.displayStudentInfo();
    }
}
