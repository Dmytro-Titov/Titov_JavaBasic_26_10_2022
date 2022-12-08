package com.hillel.titov.lessons.lesson7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int minAge = 18;
        int maxAge = 40;

        int team1Members = 25;
        int team2Members = 25;

        int[] team1 = new int[team1Members];
        int[] team2 = new int[team2Members];


        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) Math.floor(Math.random()*(maxAge - minAge + 1) + minAge);
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) Math.floor(Math.random()*(maxAge - minAge + 1) + minAge);
        }

        System.out.println("Team 1 players age: " + Arrays.toString(team1));
        System.out.println("Team 2 players age: " + Arrays.toString(team2));

        double team1TotalAge = 0.0;
        double team2TotalAge = 0.0;

        for (int i = 0; i < team1.length; i++) {
            team1TotalAge += team1[i];
        }
        for (int i = 0; i < team2.length; i++) {
            team2TotalAge += team2[i];
        }
        System.out.format("Average age of Team 1 is %.2f years.\n", (team1TotalAge/team1Members));
        System.out.format("Average age of Team 2 is %.2f years.\n", (team2TotalAge/team2Members));
    }
}
