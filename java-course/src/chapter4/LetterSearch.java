package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        char letter = 'a';

        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toLowerCase();
        scanner.close();
        boolean containsLetter = false;

        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == letter){
                containsLetter = true;
                break;
            }
        }
        if (containsLetter){
            System.out.println("Your text contains the letter '"+ letter + "'.");
        }
        else {
            System.out.println("Your text does not contain the letter '"+ letter + "'.");
        }
    }
}
