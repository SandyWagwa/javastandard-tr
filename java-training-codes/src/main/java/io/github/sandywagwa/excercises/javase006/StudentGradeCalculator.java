package io.github.sandywagwa.excercises.javase006;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        String studentName = "Sandra Wagwa";
        double[] grades = { 78, 85, 92, 67, 88 };

        printGradeReport(studentName, grades);
    }

    // -------- Calculate Average --------
    public static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    // -------- Find Highest Grade --------
    public static double findHighestGrade(double[] grades) {
        double highest = grades[0];
        for (double g : grades) {
            if (g > highest) {
                highest = g;
            }
        }
        return highest;
    }

    // -------- Find Lowest Grade --------
    public static double findLowestGrade(double[] grades) {
        double lowest = grades[0];
        for (double g : grades) {
            if (g < lowest) {
                lowest = g;
            }
        }
        return lowest;
    }

    // -------- Convert Score to Letter Grade --------
    public static char getGradeLetter(double score) {
        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 70)
            return 'C';
        else if (score >= 60)
            return 'D';
        else
            return 'F';
    }

    // -------- Print Grade Report --------
    public static void printGradeReport(String name, double[] grades) {

        double avg = calculateAverage(grades);
        double high = findHighestGrade(grades);
        double low = findLowestGrade(grades);
        char letter = getGradeLetter(avg);

        System.out.println("Student Grade Report");
        System.out.println("Name: " + name);

        System.out.print("Grades: ");
        for (double g : grades) {
            System.out.print(g + " ");
        }

        System.out.println("\nAverage: " + String.format("%.2f", avg));
        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
        System.out.println("Final Grade: " + letter);

    }
}
