package com.hillel.titov.lessons.lesson4;

public class ChineseDynasties {

    public static void main(String[] args) {

        int LyInfantryIndex = 13;
        int LyArcherIndex = 24;
        int LyCavalryIndex = 46;

        int LyNumberOfInfantry = 860;
        int LyNumberOfArchers = 860;
        int LyNumberOfCavalry = 860;

        int LySummaryAttack = (LyInfantryIndex * LyNumberOfInfantry) + (LyArcherIndex * LyNumberOfArchers) + (LyCavalryIndex * LyNumberOfCavalry);

        System.out.println("Summary attack potential of Ly army is " + LySummaryAttack);


        int MingInfantryIndex = 9;
        int MingArcherIndex = 35;
        int MingCavalryIndex = 12;

        int MingNumberOfInfantry = (int) (LyNumberOfInfantry * 1.5);
        int MingNumberOfArchers = (int) (LyNumberOfArchers * 1.5);
        int MingNumberOfCavalry = (int) (LyNumberOfCavalry * 1.5);

        int MingSummaryAttack = (MingInfantryIndex * MingNumberOfInfantry) + (MingArcherIndex * MingNumberOfArchers) + (MingCavalryIndex * MingNumberOfCavalry);

        System.out.println("Summary attack potential of Ming army is " + MingSummaryAttack);
    }
}
