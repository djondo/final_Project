package com.company;

import java.util.ArrayList;


// this class collects all pets, can also select types of pets according to criteria
public class WildAnimalGroup {
   private ArrayList<WildAnimals> wdAnimGroup = new ArrayList<>();
//add
    public void addWild(WildAnimals newWildAnimal) {
        wdAnimGroup.add(newWildAnimal);
    }
}
