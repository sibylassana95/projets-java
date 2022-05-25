package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // creation d un cadre
        JFrame cadre= new JFrame();
        cadre.setTitle("fenettre");
        cadre.setVisible(true);
        cadre.setSize(250,500);
        cadre.setLocationRelativeTo(null);
        JPanel fenettre=new JPanel();
        cadre.add(fenettre);
        // Ajouter une image
        ImageIcon photo =new ImageIcon("img.jpg");
        JLabel lab=new JLabel(photo);
        fenettre.add(lab);
        cadre.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fenettre.setVisible(true);
        JButton bouton1=new JButton("VALIDEZ");
        JButton bouton2=new JButton("OK");
        fenettre.add(bouton1);
        fenettre.add(bouton2);



    }
}