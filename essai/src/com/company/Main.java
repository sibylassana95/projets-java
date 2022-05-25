package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JFrame cadre =new JFrame();
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setSize(500, 200);
        cadre.setVisible(true);
        cadre.setLocationRelativeTo(null);
        JPanel fenetre =new JPanel();
        cadre.add(fenetre);
        JButton bouton1= new JButton("Quitter");
        JButton bouton2=new JButton("Formulaire");
        JButton boutton3=new JButton("Suivant");
        fenetre.add(bouton1);
        fenetre.add(bouton2);
        fenetre.add(boutton3);

        JFrame cadre2=new JFrame();
        cadre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre2.setTitle("formulaire");
        cadre2.setSize(250, 300);
        cadre2.setLocationRelativeTo(null);



        JTextField noms = new JTextField(10);
        JTextField prenoms = new JTextField(10);
        JTextField adresses = new JTextField(10);

        JLabel nom= new JLabel("Nom",JLabel.LEFT);
        nom.setDisplayedMnemonic('N');
        nom.setLabelFor(noms);

        JLabel prenom= new JLabel("Prenom",JLabel.LEFT);
        prenom.setDisplayedMnemonic('P');
        prenom.setLabelFor(prenoms);
        JLabel adresse= new JLabel("Adresse",JLabel.LEFT);
        adresse.setDisplayedMnemonic('P');
        adresse.setLabelFor(adresses);
        JButton button4=new JButton("Precedent");
        JButton button5=new JButton("Suivant");
        JPanel fenetre2=new JPanel();
        fenetre2.setLayout(new GridLayout(5,6,10,7));
        fenetre2.add(nom);
        fenetre2.add(noms);
        fenetre2.add(prenom);
        fenetre2.add(prenoms);
        fenetre2.add(adresse);
        fenetre2.add(adresses);
        fenetre2.add(button4);
        fenetre2.add(button5);
        cadre2.setContentPane(fenetre2);

        JFrame cadre3 =new JFrame();
        cadre3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre3.setSize(500, 200);

        cadre3.setLocationRelativeTo(null);
        JPanel fenetre3 =new JPanel();
        cadre3.add(fenetre3);
        // Ajouter une image
        ImageIcon photo =new ImageIcon("img.jpg");
        ImageIcon photo1 =new ImageIcon("img.jpg");
        JLabel lab=new JLabel(photo);
        JLabel lab1=new JLabel(photo1);
        JButton button6=new JButton("Precedent");
        JButton button7=new JButton("Suivant");
        fenetre3.add(lab);
        fenetre3.add(lab1);
        fenetre3.add(button6);
        fenetre3.add(button7);
        cadre2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);





        boutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (boutton3.isValid()){
                    cadre2.setVisible(true);

                }

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (button5.isValid()){
                    cadre3.setVisible(true);

                }

            }
        });




    }
}
