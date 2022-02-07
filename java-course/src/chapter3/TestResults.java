package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);

        double testScore = scanner.nextDouble();
        char grade;

        if (testScore < 60){
            grade = 'F';
        }
        else if (testScore <70){
            grade = 'D';
        }
        else if (testScore < 80){
            grade = 'C';
        }
        else if (testScore < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("You got a " + grade + "!");
    }
}
