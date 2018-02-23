package com.company;

import java.sql.*;
import java.util.ArrayList;

import static com.company.AnimalDB.db_url;

public class Animals {
    // class variables
    private String Name;
    private int Legs;
    private String Sounds;
    private String EatingHabits;

    public Animals(String animalName, String sound, int legs, String eatingHabit) {
        this.Name = animalName;
        this.Legs = legs;
        this.Sounds = sound;
        this.EatingHabits = eatingHabit;

    }

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
    public static ArrayList<Animals> getAll() {
        new ArrayList<>();

        // connect to the database. Use DBConfig.db_url as the URL.
        try {
            Connection conn = DriverManager.getConnection(db_url);
            Statement statement = conn.createStatement();
            {
                // run query to fetch all animals, sort by name
                String fetchAll = "SELECT * FROM inventory";
                ResultSet rs = statement.executeQuery(fetchAll);
                //  rs.sort(name);
                System.out.println(rs);
                // loop over ResultSet
                ArrayList<Animals> animals = new ArrayList<>();

                while (rs.next()) {
                    // Create a Product object for each row in the ResultSet
                    String animalName = rs.getString("Animal Name");
                    String sound = rs.getString("Sound");
                    int legs = rs.getInt("quantity");
                    String eatingHabit = rs.getString("Food");


                    System.out.println("Animal name = " + animalName + " and sound = " + sound + "," +
                            " Number of Legs = " + legs + " Food = " + eatingHabit);
                    // Add each product to an arrayList
                    Animals newAnimal = new Animals(animalName, sound, legs, eatingHabit);
                    animals.add(newAnimal);
                    // return the arrayList.
                }
                rs.close();

                return animals;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
   /* public static Animals addNewAnimal(String name, int legs, String sounds, String eatingHabits) {
        try {
            Connection c = DriverManager.getConnection(db_url);
            //add the new product using the PreparedStatement statement
            String newAnimal = "INSERT INTO Animals VALUES(?, ?)";
            PreparedStatement preparedStatement = c.prepareStatement(newAnimal);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, legs);// replace the ? ?
            preparedStatement.setString(3, sounds);
            preparedStatement.setString(4, eatingHabits);
            // preparedStatement.executeQuery();//execute the query in the table
            preparedStatement.executeUpdate();
            newAnimal = new String(name,legs, sounds, eatingHabits);
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return null;*/
    }
