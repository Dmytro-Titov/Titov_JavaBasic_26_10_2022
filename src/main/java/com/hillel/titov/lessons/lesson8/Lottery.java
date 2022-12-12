package com.hillel.titov.lessons.lesson8;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int lotteryRange = 7;

        int[] lotteryNumbers = new int[lotteryRange];
        int[] userNumbers = new int[lotteryRange];

        int min = 0;
        int max = 9;

        for (int i = 0; i < lotteryRange; i++) {
            lotteryNumbers[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            userNumbers[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }

        Arrays.sort(lotteryNumbers);
        Arrays.sort(userNumbers);

        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(userNumbers));

        int counter = 0;
        String luckyIndexes = "";

        for (int i = 0; i < lotteryRange; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                counter++;
                luckyIndexes += i + ", ";
            }
        }
        if (luckyIndexes.length() > 0) {
            luckyIndexes = luckyIndexes.substring(0, luckyIndexes.length() - 2);
        }


        if (counter == 0) {
            System.out.println("No matches, sorry!");
        } else if (counter == 1) {
            System.out.format("There is only one match. The lucky number's index is %s.", luckyIndexes);
        } else {
            System.out.format("There are %d matches. Indexes of lucky numbers are %s.", counter, luckyIndexes);
        }

    }
}
