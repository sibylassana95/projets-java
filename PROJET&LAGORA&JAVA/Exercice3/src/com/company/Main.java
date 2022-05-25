package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // creation cadre
        JFrame cadre= new JFrame();
        cadre.setTitle("Exercice-2");
        cadre.setVisible(true);
        cadre.setBackground(Color.GRAY);
        cadre.setSize(300,300);
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel fenettre=new JPanel();
        fenettre.setBackground(Color.GRAY);
        cadre.add(fenettre);
        //creation du bouton
        JButton bouton3=new JButton("Suivant");
        fenettre.add(bouton3);
        // cadre2
        JFrame cadre2= new JFrame();
        cadre2.setTitle("Exetcice-2");
        cadre2.setSize(300,300);
        cadre2.setLocationRelativeTo(null);
        cadre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel fenettre1=new JPanel();
        cadre2.add(fenettre1);
        // Ajouter une image
        ImageIcon photo =new ImageIcon("img.jpg");
        JLabel lab=new JLabel(photo);
        fenettre1.add(lab);
        cadre2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // condition
        bouton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (bouton3.isValid()){
                    cadre2.setVisible(true);

                }

            }
        });

    }
}

