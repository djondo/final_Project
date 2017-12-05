package com.company;

public class Pets extends Animals {
    boolean drinkMilk;
    boolean eatHerbs;

    //Pets constructor
    public Pets(String name, int legs, String sounds, String eatingHabit, boolean drinkMilk, boolean eatHerbs) {
        // don't need data types for super
        super(name, legs, sounds, eatingHabit);
        this.drinkMilk = drinkMilk;
        this.eatHerbs = eatHerbs;

    }

    public boolean isDrinkMilk() {
        return drinkMilk;
    }

    public void setDrinkMilk(boolean drinkMilk) {
        this.drinkMilk = drinkMilk;
    }

    public boolean isEatHerbs() {
        return eatHerbs;
    }

    public void setEatHerbs(boolean eatHerbs) {
        this.eatHerbs = eatHerbs;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "drinkMilk=" + drinkMilk +
                ", eatHerbs=" + eatHerbs +
                '}';



    }
}