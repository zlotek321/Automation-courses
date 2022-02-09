package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        int numberOfStudents = 4;
        int numberOfTests = 4;
        double totalAllStudents = 0;

        for (int student = 0; student < numberOfStudents; student++){

            System.out.println("Student nr " + (student+1) + ".");
            double totalPerStudent = 0;
            for (int test = 0; test < numberOfTests; test++) {
                System.out.println("Enter the score for test #" + (test+1) + ": ");
                Scanner scanner = new Scanner(System.in);
                scanner.close();
                totalPerStudent += scanner.nextDouble();
            }
            totalAllStudents += totalPerStudent;
            double averagePerStudent = totalPerStudent / numberOfTests;
            System.out.println("Average score for Student nr " + (student+1) + " is: " + averagePerStudent);
        }
        double averageAllStudents = totalAllStudents / numberOfTests / numberOfTests;
        System.out.println("Average for all Students is: " + averageAllStudents);
    }
}
