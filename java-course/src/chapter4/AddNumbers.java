package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        boolean invalid;

        // Will run at least once
        do {
            //Get the firs number
            System.out.println("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            // Get the second number
            System.out.println("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            // Calculate the result
            double result = firstNumber + secondNumber;
            System.out.println("The sum is: " + result);

            // Ask the user if they want to go again
            System.out.println("Do you want to calculate again? Enter Y/N");
            do {
                String decision = scanner.next().toLowerCase();
                invalid = false;
                switch (decision) {
                    case "y" -> again = true;
                    case "n" -> {
                        System.out.println("Bye.");
                        again = false;
                    }
                    default -> {
                        System.out.println("Invalid input. Try again.");
                        invalid = true;
                    }
                }
            } while (invalid);
        } while(again);
        scanner.close();
    }
}
