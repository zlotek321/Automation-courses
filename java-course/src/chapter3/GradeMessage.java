package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toLowerCase();
        scanner.close();
        //Enhanced switch expression
//        String message = switch (grade) {
//            case "a" -> "Excellent job!";
//            case "b" -> "Great job!";
//            case "c" -> "Good job!";
//            case "d" -> "You need to work a bit harder.";
//            case "f" -> "Uh oh!";
//            default -> "Please enter a valid grade.";
//        };
        String message;
        switch (grade){
            case "a":
                message = "Excellent job!";
                break;
            case "b":
                message = "Great job!";
                break;
            case "c":
                message = "Good job!";
                break;
            case "d":
                message = "You need to work a bit harder.";
                break;
            case "f":
                message = "Uh oh!";
                break;
            default:
                message = "Please enter a valid grade.";
                break;
        }

        System.out.println(message);
    }
}
