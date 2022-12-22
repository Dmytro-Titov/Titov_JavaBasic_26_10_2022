package com.hillel.titov.lessons.lesson11;

public class BurgerMain {
    static String bun = "bun";
    static String meat = "meat";
    static String cheese = "cheese";
    static String salad = "salad";
    static String mayonnaise = "mayonnaise";
    static String extraMeat = "extra meat";

    public static void main(String[] args) {
        Burger classicBurger = new Burger(bun, meat, cheese, salad, mayonnaise);
        Burger lightBurger = new Burger(bun, meat, cheese, salad);
        Burger doubleMeatBurger = new Burger(bun, meat, cheese, extraMeat, salad, mayonnaise);
    }
}
