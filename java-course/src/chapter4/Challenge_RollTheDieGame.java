package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Challenge_RollTheDieGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int boardSpaces = 20;
        int rollLimit = 5;
        int dieRoll;
        int total;
        int currentRoll;
        boolean gameIsOn;
        String decision;

        do {

            total = 0;
            currentRoll = 0;
            System.out.println();
            System.out.println("Your objective is to get to the end of the board within 5 rolls. " +
                    "If you advance to a spot outside of the board you are disqualified. " +
                    "The board has 20 spaces. Good luck!");

            while (total < boardSpaces && currentRoll < rollLimit){


                if(total > 0) {
                    System.out.println("You need " + (boardSpaces - total) + " more spaces to win.");
                }

                System.out.println("Press Enter to roll the dice...");
                scanner.nextLine();

                dieRoll = random.nextInt(1, 7);
                total += dieRoll;
                currentRoll++;

                System.out.println("You rolled " + dieRoll + " and advanced to space " + total);
            }

            if (total == boardSpaces){
                System.out.println("You won!");
            }
            else if (total > boardSpaces) {
                System.out.println("You went " + (total - boardSpaces) + " spaces too far.");
            }
            else {
                System.out.println("You ran out of rolls. Try again.");
            }

            System.out.println("Do you want to play again? Enter y/n ");
            // Alternative: use scanner.next() to get the string, then call scanner.nextLine()
            // to consume the new line, so it doesn't interfere with the scanner.nextLine() in the loop
            decision = scanner.nextLine().toLowerCase().strip();
            gameIsOn = decision.equals("y");

        }while (gameIsOn);

        System.out.println("Thanks for playing!");
    }
}
