package com.company;

public class WildAnimals extends Animals{
        boolean EatMeat;
        boolean EatOtherAnimals;


        //toString() method printing out animal's particularities
    @Override
    public String toString() {
        return "WildAnimals{" +
                "EatMeat=" + EatMeat +
                ", EatOtherAnimals=" + EatOtherAnimals +
                '}';
    }

    public boolean isEatMeat() {
        return EatMeat;
    }

    public void setEatMeat(boolean eatMeat) {
        EatMeat = eatMeat;
    }

    public boolean isEatOtherAnimals() {
        return EatOtherAnimals;
    }

    public void setEatOtherAnimals(boolean eatOtherAnimals) {
        EatOtherAnimals = eatOtherAnimals;
    }

    public WildAnimals(String name, int legs, String sounds, String eatingHabit, boolean eatMeat, boolean eatOtherAnimals){
            // don't need data types for super
            super(name, legs, sounds, eatingHabit);
            this.EatMeat = eatMeat;
            this.EatOtherAnimals = eatOtherAnimals;






        }
}
