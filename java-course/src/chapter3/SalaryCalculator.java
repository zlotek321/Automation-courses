package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("Please enter the number of sales this week: ");
        Scanner scanner = new Scanner(System.in);
        int salesCount = scanner.nextInt();
        scanner.close();

        if (salesCount > quota){
            salary += bonus;
        }
        System.out.println("Your salary is: $" + salary + ".");
    }
}
