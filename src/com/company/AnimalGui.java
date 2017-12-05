package com.company;

import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class AnimalGui extends JFrame {
    private JTextField soundTextField;
    private JTextField legsTextField;
    private JTextField eatingHabitTextField;
    private JButton addButton;
    private JList<Animals> list1;
    private JTextField animalNameTextField;
    private JPanel rootPanel;

    DefaultListModel<Animals> listModel;

    AnimalGui() {
        setContentPane((rootPanel));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
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
                listModel.addElement(newAnimal);
                //clear data from all textFiels once the Add button is clicked
                animalNameTextField.setText("");
                soundTextField.setText("");
                legsTextField.setText("");
                eatingHabitTextField.setText("");
            }
                catch(InputMismatchException imme){
                    JOptionPane.showMessageDialog(AnimalGui.this, "Please enter data in the fields");
                }

            }
        });

    }
}


