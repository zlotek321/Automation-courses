package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("Please enter the number of sales this week: ");
        Scanner scanner = new Scanner(System.in);
        int salesCount = scanner.nextInt();
        scanner.close();

        if (salesCount >= quota) {
            System.out.println("Congratulations! You've met the sales expectation.");
        }
        else {
            int missingSales = quota - salesCount;

            if (missingSales == 1) {
                System.out.println("You were " + missingSales + " sale short of your goal.");
            }
            else {
                System.out.println("You were " + missingSales + " sales short of your goal.");
            }
        }
    }
}
