package chapter3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Challenge_ChangeDollarGame {

    // round method from stackoverflow, could be also achieved with String.format("%.2f", value)
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void main(String[] args) {

        double pennyValue = 0.01;
        double nickelValue = 0.05;
        double dimeValue = 0.10;
        double quarterValue = 0.25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies would you like? ");
        int pennyCount = scanner.nextInt();

        System.out.println("How many nickels would you like? ");
        int nickelCount = scanner.nextInt();

        System.out.println("How many dimes would you like? ");
        int dimeCount = scanner.nextInt();

        System.out.println("How many quarters would you like? ");
        int quarterCount = scanner.nextInt();
        scanner.close();

        double sum = (pennyCount * pennyValue) + (nickelCount * nickelValue) +
                (dimeCount * dimeValue) + (quarterCount * quarterValue);

        if (sum == dollar){
            System.out.println("Congrats! Your change is exactly 1 dollar.");
        }
        else if (sum < dollar){
            double under = dollar - sum;
            System.out.println("You were $" + round(under, 2) + " short of 1 dollar. Try again.");
        }
        else{
            double over = sum - dollar;
            System.out.println("You were $" + round(over, 2) + " over 1 dollar. Try again.");

            // Alternative solution for rounding the value:
            // System.out.println("You were $" + String.format("%.2f", over) + " over 1 dollar. Try again.");
        }

    }
}
