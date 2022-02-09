package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean isEligible = approveCredit(salary, creditScore);

        notifyUser(isEligible);
    }

    private static void notifyUser(boolean isEligible) {
        if (isEligible)
            System.out.print("Congrats! You are eligible for the loan.");
        else
            System.out.print("Unfortunately, you are not eligible for the loan.");
    }

    private static double getSalary() {
        System.out.print("What's your salary? ");
        return scanner.nextDouble();
    }

    private static int getCreditScore() {
        System.out.print("What's your credit score? ");
        return scanner.nextInt();
    }

    private static boolean approveCredit(double currentSalary, int currentCreditScore) {
        return currentSalary >= requiredSalary && currentCreditScore >= requiredCreditScore;
    }
}
