package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // creation cadre
        JFrame cadre= new JFrame();
        cadre.setTitle("Exercice_1");
        cadre.setVisible(true);
        cadre.setSize(250,500);
        cadre.setLocationRelativeTo(null);
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel fenettre=new JPanel();
        fenettre.setBackground(Color.GRAY);
        cadre.add(fenettre);



    }
}

