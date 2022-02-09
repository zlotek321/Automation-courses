package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.next();
        greet(name);
    }

    private static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }
}
