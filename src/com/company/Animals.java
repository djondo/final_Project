package com.company;

public class Animals {
    // class variables
    private String Name;
    private int Legs;
    private String Sounds;
    private String EatingHabits;
    @Override
    public String toString() {
        return "Animals{" +
                "Name='" + Name + '\'' +
                ", Legs=" + Legs +
                ", Sounds='" + Sounds + '\'' +
                ", EatingHabits='" + EatingHabits + '\'' +
                '}';
    }
    //constructor for all animals
    public Animals(String name, int legs, String sounds, String eatingHabits) {
        this.Name = name;
        this.Legs = legs;
        this.Sounds = sounds;
        this.EatingHabits = eatingHabits;
    }
        //constructor for animals with their particularities
         public Animals(String name, int legs, String sounds,
                        String eatingHabits, boolean eatHerbs, boolean drinkMilk, String eatMeat, String eatOtherAnimals){
            this.Name = name;
            this.Legs = legs;
            this.Sounds = sounds;
            this.EatingHabits = eatingHabits;

        }
        public void Data(){

        }
}
