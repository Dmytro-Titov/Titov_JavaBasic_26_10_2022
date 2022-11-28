package com.hillel.titov.lessons.lesson5;

import java.util.Scanner;

public class CounterStrike {
    public static final int teammates = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                                                    //TEAM 1

        System.out.println("Enter Team 1 name:");
        String team1Name = scanner.nextLine();

        System.out.println("Enter Team 1 Player 1 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 1 Player 2 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 1 Player 3 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 1 Player 4 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 1 Player 5 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player5 = scanner.nextInt();
        scanner.nextLine();

                                                    //TEAM 2

        System.out.println("Enter Team 2 name:");
        String team2Name = scanner.nextLine();

        System.out.println("Enter Team 2 Player 1 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player6 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 2 Player 2 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player7 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 2 Player 3 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player8 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 2 Player 4 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player9 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Team 2 Player 5 frags:");
        while (!scanner.hasNextInt()) {
            System.out.println("Use integers only! Try again:");
            scanner.nextLine();
        }
        int player10 = scanner.nextInt();
        scanner.nextLine();

                                                    //RESULTS

        double team1Average = (double) (player1 + player2 + player3 + player4 + player5) / teammates;
        double team2Average = (double) (player6 + player7 + player8 + player9 + player10) / teammates;

        if (team1Average > team2Average) {
            System.out.format("%s has won with the result of %.2f points!", team1Name, team1Average);
        } else if (team1Average < team2Average) {
            System.out.format("%s has won with the result of %.2f points!", team2Name, team2Average);
        } else {
            System.out.format("%s and %s both have %.2f points! It's a draw!", team1Name, team2Name, team1Average);
        }

    }
}
