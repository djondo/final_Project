package com.company;

/*Build an application of your choice, which meets these requirements:

It must be modular, and demonstrate object oriented design
        It must use a database in a substantial way
        It must have a GUI (or an approved reason to not have a GUI)*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
        import java.util.ArrayList;
import java.util.InputMismatchException;

public class AnimalGui extends JFrame {
    private JTextField soundTextField;
    private JTextField legsTextField;
    private JTextField eatingHabitTextField;
    private JButton addButton;
    private JList<String> list1;
    private JTextField animalNameTextField;
    private JPanel rootPanel;
    private JCheckBox twoLegsCheckBox;
    private JCheckBox fourLegsCheckBox;
    private JLabel twoLegs;
    private JLabel fourLegs;
    private JButton DeleteButton;

    DefaultListModel<String> listModel;
    ArrayList<String> fourLegAnimals = new ArrayList<String>();
    ArrayList<String> twoLegAnimals = new ArrayList();

    AnimalGui() {
        setContentPane((rootPanel));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<String>();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // provide data to the textFields
                    String name = animalNameTextField.getText();
                    name = name.trim();
                    String sound = soundTextField.getText();
                    sound = sound.trim();
                    int legs = Integer.parseInt(legsTextField.getText());
                    // legs = legs.trim()
                    String eatingHabit = eatingHabitTextField.getText();
                    eatingHabit = eatingHabit.trim();
                    list1.setModel(listModel);
                    Animals newAnimal = new Animals(name, legs, sound, eatingHabit);
                    listModel.addElement(String.valueOf(newAnimal));
                    //clear data from all textFiels once the Add button is clicked
                    animalNameTextField.setText("");
                    soundTextField.setText("");
                    legsTextField.setText("");
                    eatingHabitTextField.setText("");
                } catch (InputMismatchException imme) {
                    JOptionPane.showMessageDialog(AnimalGui.this, "Please enter data in the fields");
                }

            }
        });

        fourLegsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // array list of animals where types of animals with some characteristics will be saved
                // and use these characteristics to display on the indicated label
                //if we have animal does have 4 legs, then save it into the following ArrayList
                int legs = Integer.parseInt(legsTextField.getText());
                String name = animalNameTextField.getText();
                while (fourLegsCheckBox.isSelected()) {
                    // boolean twoLegs = twoLegs.parseBoolean(legs){// should display the names of all animals with 2 legs
                    if (legs == 4) {
                        fourLegAnimals.add(name);// will add name to the animal list
                        fourLegs.setText(name);// will set the corresponding label to the name of the animal
                        //listModel.add(legs, name);

                        // listModel.add(legs, name);
                    }

                }
                // twoLegs.setText(name);
                //two
                //  twoLegsCheckBox.setText();)

            }
        });
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list1.getSelectedIndex();//use the index to delete the animal data --
                // list1 (initial name of the list before applying it to the listModel class object
                if (index != -1) {
                    listModel.remove(index);
                } else {
                    JOptionPane.showMessageDialog(AnimalGui.this, "Please select an animal to delete");

                }
            }
        });
        twoLegsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int legs = Integer.parseInt(legsTextField.getText());
                String name = animalNameTextField.getText();
                while (twoLegsCheckBox.isSelected()) {
                    // boolean twoLegs = twoLegs.parseBoolean(legs){// should display the names of all animals with 2 legs
                    if (legs == 2) {
                        twoLegAnimals.add(name);// will add name to the animal list
                        twoLegs.setText(name);// will set the corresponding label to the name of the animal
                        //listModel.add(legs, name);*/
                    }
                }
            }
        });
    }
}


