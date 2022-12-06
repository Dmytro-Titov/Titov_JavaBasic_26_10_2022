package com.hillel.titov.lessons.lesson6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempt = 3;

        int min = 0;
        int max = 10;

        int guess = (int) (Math.floor(Math.random() * (max - min + 1)) + min);

        System.out.format("Try to guess the number in the range of %d to %d. You have %d attempts:\n", min, max, attempt);
        for (int i = 1; i <= attempt; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Use integers only! Try again:");
                scanner.nextLine();
            }
            int userNumber = scanner.nextInt();
            if (userNumber == guess) {
                System.out.println("You have guessed the number! Congratulations!");
                break;
            }
            if (i == attempt) {
                System.out.println("You have wasted all of your attempts!");
                break;
            }
            System.out.format("Nope. Enter the next number. You have %d attempts left:\n", (attempt - i));
        }
    }
}
