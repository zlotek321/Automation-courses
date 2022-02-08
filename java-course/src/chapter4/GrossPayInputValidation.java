package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;
        int minHours = 1;

        System.out.println("How many hours have you worked this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < minHours){
            System.out.println("The amount of hours worked must be between 1 and 40, please enter a valid value.");
            System.out.println("How many hours have you worked this week? ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double pay = hoursWorked * rate;
        System.out.println("Your pay is: $" + pay);
    }
}
