package com.hillel.titov.lessons.lesson6;

import java.util.Arrays;

public class Shuttles {
    public static void main(String[] args) {

        int quantityOfShuttles = 100;

        int[] shuttles = new int[quantityOfShuttles];
        int count = 0;

        String unluckyNumber1 = String.valueOf(4);
        String unluckyNumber2 = String.valueOf(9);

        for (int i = 1; count < shuttles.length; i++) {
            String number = String.valueOf(i);
            if (!(number.contains(unluckyNumber1)) && !(number.contains(unluckyNumber2))) {
                shuttles[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(shuttles));
    }
}
