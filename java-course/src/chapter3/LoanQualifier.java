package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsWorked = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your current yearly salary? ");
        int currentSalary = scanner.nextInt();

        if (currentSalary >= requiredSalary){
            System.out.println("How many years have you worked at your current job? ");
            double currentYearsWorked = scanner.nextDouble();
            scanner.close();

            if (currentYearsWorked >= requiredYearsWorked)
                System.out.println("Congratulations! You are eligible for a loan.");
            else
                System.out.println("Unfortunately you are not eligible for a loan.");
        }
        else
            System.out.println("Unfortunately you are not eligible for a loan.");
    }
}
