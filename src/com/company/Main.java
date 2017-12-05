package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //create, as reference class objects to work with
    protected ArrayList<Animals> animals;
    static final int DISPLAY_ALL = 1;
    static final int ADD_ANIMAL = 2;
    static final int SEARCH_FOR_ANIMAL = 3;
    static final int DELETE_ANIMAL = 4;
    static final int QUIT = 5;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> printMethod = options();
        AnimalGui gui = new AnimalGui();
        System.out.println(printMethod);
        boolean quit = false;
        int choice = s.nextInt();
            while (!quit) {
            switch (choice){
                case DISPLAY_ALL:
                    displayAll();
                    break;
                case ADD_ANIMAL:
                    deleteAnimal();
                    break;
                    //other working methods
                case QUIT:
                    quitProgram();
                    quit = true;
            }
        }
    }
    protected static void displayAll() {
    }
public static void deleteAnimal(){

        // Get animal information from user interface
        UserInput userEntries = new UserInput();// get information from UserInput object(userEntries)
        ArrayList<Animals> animals = new ArrayList<>();
        Animals newAnimal = userEntries.addAnimal();
        // Add to the Animal array list
        animals.add(newAnimal);
    System.out.println(newAnimal);
        userEntries.userMessage("Animal added to the list");
    }
    private static void quitProgram(){
    }

    public static HashMap<Integer, String> options(){
        HashMap<Integer, String> allOptions = new HashMap<>();
        allOptions.put(DISPLAY_ALL, "Display all animals");
        allOptions.put(ADD_ANIMAL, "Add animal");
        allOptions.put(SEARCH_FOR_ANIMAL, "Search for an animal");
        allOptions.put(DELETE_ANIMAL, "Delete an animal");
        allOptions.put(QUIT, "Quit program");
        return allOptions;
    }
}

