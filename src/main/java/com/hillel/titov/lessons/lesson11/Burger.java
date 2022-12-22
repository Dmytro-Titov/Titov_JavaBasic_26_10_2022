package com.hillel.titov.lessons.lesson11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String salad;
    String mayonnaise;
    String extraMeat;

    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        if (!bun.equals("bun") || !meat.equals("meat") || !cheese.equals("cheese") || !salad.equals("salad") || !mayonnaise.equals("mayonnaise")) {
            System.out.println("This burger is failed. Remake it using proper ingredients and according to the order: bun, meat, cheese, salad, mayonnaise");
        } else {
            System.out.println("This burger consists of a bun, a meat, a cheese, a salad and a mayonnaise.");
        }
    }

    public Burger(String bun, String meat, String cheese, String extraMeat, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        this.extraMeat = extraMeat;
        if (!bun.equals("bun") || !meat.equals("meat") || !cheese.equals("cheese") || !extraMeat.equals("extra meat") || !salad.equals("salad") || !mayonnaise.equals("mayonnaise")) {
            System.out.println("This burger is failed. Remake it using proper ingredients and according to the order: bun, meat, cheese, extra meat, salad, mayonnaise");
        } else {
            System.out.println("This burger consists of a bun, a meat, a cheese, an extra meat, a salad and a mayonnaise.");
        }
    }

    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        if (!bun.equals("bun") || !meat.equals("meat") || !cheese.equals("cheese") || !salad.equals("salad")) {
            System.out.println("This burger is failed. Remake it using proper ingredients and according to the order: bun, meat, cheese, salad");
        } else {
            System.out.println("This burger consists of a bun, a meat, a cheese and a salad");
        }
    }
}
