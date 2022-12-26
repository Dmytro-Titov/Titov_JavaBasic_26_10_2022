package com.hillel.titov.lessons.lesson12;

public class FitnessTrackerUser {
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phoneNumber;
    private String surname;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;

    private int currentYear = 2020;
    private int age;

    public FitnessTrackerUser(String name, String surname, int dayOfBirth, int monthOfBirth,
                              int yearOfBirth, String email, String phoneNumber,
                              double weight, String bloodPressure, int stepsPerDay) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
        this.age = this.currentYear - this.yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.format("User's name: %s %s\n", this.getName(), this.getSurname());
        System.out.format("Birthdate: %d-%d-%d, years: %d\n", this.getDayOfBirth(), this.getMonthOfBirth(), this.getYearOfBirth(), this.getAge());
        System.out.format("Email: %s\n", this.getEmail());
        System.out.format("Phone number: %s\n", this.getPhoneNumber());
        System.out.format("Weight: %.1f\n", this.getWeight());
        System.out.format("Blood pressure: %s\n", this.getBloodPressure());
        System.out.format("Steps per day: %d\n", this.getStepsPerDay());
        System.out.println();
    }
}
