package com.hillel.titov.lessons.lesson13.Interfaces;

public class Main {
    public static void main(String[] args) {
        Androids android1 = new Androids();
        IPhones iPhone1 = new IPhones();

        android1.call();
        android1.internet();
        android1.sms();
        android1.linuxOSOperation();

        iPhone1.call();
        iPhone1.internet();
        iPhone1.sms();
        iPhone1.IOSOperation();
    }
}
