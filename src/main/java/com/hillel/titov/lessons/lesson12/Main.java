package com.hillel.titov.lessons.lesson12;

public class Main {
    public static void main(String[] args) {
        FitnessTrackerUser dima = new FitnessTrackerUser("Dmytro", "Titov", 8, 11,
                1992, "octopusless@gmail.com", "+380633275337",
                93.4, "120/80", 10000);

        FitnessTrackerUser hannah = new FitnessTrackerUser("Hannah", "Lu", 23, 10,
                1996, "hannah96@gmail.com", "+380936275357",
                72.0, "130/85", 7000);

        FitnessTrackerUser yuri = new FitnessTrackerUser("Yuri", "Yurchenko", 16, 1,
                1998, "yuri98@gmail.com", "+380678789530",
                60.1, "110/70", 8500);

        dima.printAccountInfo();
        hannah.printAccountInfo();
        yuri.printAccountInfo();

        dima.setWeight(90.1);
        dima.setStepsPerDay(12500);

        hannah.setWeight(73.0);
        hannah.setBloodPressure("135/90");
        hannah.setSurname("Davies");

        dima.printAccountInfo();
        hannah.printAccountInfo();
    }
}
