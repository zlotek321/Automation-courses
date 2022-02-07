package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        // 1. Get the number of hours worked
        System.out.println("Enter number of hours worked: ");
        double workHours = scanner.nextDouble();

        // 2. Get the hourly pay rate
        System.out.println("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();
        scanner.close();

        // 3. Multiply the hours worked by the hourly pay rate
        double grossPay = workHours * payRate;

        // 4. Print the information
        System.out.println("Your gross pay is: " + grossPay);

    }
}
