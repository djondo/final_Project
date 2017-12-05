package com.company;

import java.util.ArrayList;


// this class collects all pets, can also select types of pets according to criteria
public class PetGroup {

    ArrayList<Pets> petGroup = new ArrayList<>();
// create addPet() method to add pet to the petGroup
    public void addPet(Pets newPet) {
        petGroup.add(newPet);
    }
}
