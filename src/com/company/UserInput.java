package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserInput {
    Scanner s = new Scanner(System.in);
    //create animal objects
    LinkedList<Animals> animals = new LinkedList<>();

    public Animals addAnimal() {

        while (true) {
            try {
                System.out.println("Please enter the animal name:");
                String name = s.nextLine();
                System.out.println("Please enter its sound:");
                String sound = s.nextLine();
                System.out.println("How many legs does " + name + " have?");
                int nrLegs = s.nextInt();
                System.out.println("What does " + name + " usually eat?");
                String eatingHabit = s.nextLine();

                Animals newAnimal = new Animals(name, nrLegs, sound, eatingHabit);
                animals.add(newAnimal);
                System.out.println(newAnimal);
            } catch (InputMismatchException imme) {
            }
        }
    }
                public void userMessage (String s){
                    System.out.println(s);
                }
            }

