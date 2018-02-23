package com.company;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserInput {
    //create animal objects

    public static Animals addAnimal() {
        LinkedList<Animals> animals = new LinkedList<>();

        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter the animal name:");
                String name = s.next();
                System.out.println("Please enter its sound:");
                String sound = s.next();
                System.out.println("How many legs does " + name + " have?");
                int nrLegs = s.nextInt();
               /* if(nrLegs == 2){
                    int legs = 2;*/
                System.out.println("What does " + name + " usually eat?");
                String eatingHabit = s.next();
                Animals newAnimal = new Animals(name, nrLegs, sound, eatingHabit);
                animals.add(newAnimal);
                System.out.println(newAnimal);
                addMore();
               /* boolean addMore = addMore();
                if(addMore){
                    s.next();
                    //YesOrNoInput
                    //  String naming = stringInput("what is the name ..");
                }
                break;*/

            } catch (InputMismatchException imme) {
            }
        }


    }


    public void userMessage(String s) {
        System.out.println(s);
    }

    public static boolean addMore() {
        Scanner s = new Scanner (System.in);
        boolean input = true;
        System.out.println("Add more?");
        String y = "yes";
        String answer = s.nextLine();
        if (answer.equalsIgnoreCase(y)) {
            return true;
        }
        return false;
    }

}

