package com.hillel.titov.lessons.lesson4;

public class Parallelepiped {
    public static void main(String[] args) {

        int a = 1;
        int b = 4;
        int c = 9;

        int volume = a * b * c;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        int length = (a + b + c) * 4;

        System.out.println("Сума усіх сторін паралелепіпеда = " + length);
    }
}
