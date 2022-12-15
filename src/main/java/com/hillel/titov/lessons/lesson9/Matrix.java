package com.hillel.titov.lessons.lesson9;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of array:");
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong data! Use integers only. Try again:");
            scanner.nextLine();
        }
        int height = scanner.nextInt();

        System.out.println("Enter the width of array:");
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong data! Use integers only. Try again:");
            scanner.nextLine();
        }
        int width = scanner.nextInt();

        int[][] array = new int[height][width];

        int min = 0;
        int max = 9;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }

        System.out.println("Array before: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] inversedArray = new int[width][height];

        for (int i = 0; i < inversedArray.length; i++) {
            for (int j = 0; j < inversedArray[i].length; j++) {
                inversedArray[i][j] = array[j][i];
            }
        }

        System.out.println("Array after: ");
        for (int i = 0; i < inversedArray.length; i++) {
            for (int j = 0; j < inversedArray[i].length; j++) {
                System.out.print(inversedArray[i][j] + "\t");
            }
            System.out.println();
        }




    }
}
