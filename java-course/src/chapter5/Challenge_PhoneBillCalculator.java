package chapter5;

import java.util.Scanner;

public class Challenge_PhoneBillCalculator {

    static double overageRate = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double planFee = getPlan();
        double overageMinutes = getOverageMinutes();
        scanner.close();

        double overageFees = calculateOverageFee(overageMinutes);
        double appliedTax = calculateTax(planFee, overageFees);
        double finalTotal = calculateTotal(planFee, overageFees, appliedTax);
        printBill(planFee, overageFees, finalTotal, appliedTax);

    }

    private static void printBill(double planFee, double overageFees, double finalTotal, double appliedTax) {
        System.out.println();
        System.out.println("Phone Bill Statement: ");
        System.out.println();
        System.out.println("Plan fee: $" + planFee);
        System.out.println("Overage minutes fee: $" + overageFees);
        System.out.println("Tax: $" + String.format("%.2f", appliedTax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }

    private static double calculateTax(double planFee, double overageFees) {
        return (planFee + overageFees) * tax;
    }

    private static double calculateTotal(double planFee, double overageFees, double appliedTax) {
        return planFee + overageFees + appliedTax;
    }

    private static double calculateOverageFee(double overageMinutes) {
        return overageMinutes * overageRate;
    }

    private static double getOverageMinutes() {
        System.out.print("Enter overage minutes: ");
        return scanner.nextDouble();
    }

    private static double getPlan() {
        System.out.print("Enter plan fee: ");
        return scanner.nextDouble();
    }


}
