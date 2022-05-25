package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calcul {
   private int nbr1;
   private int nbr2;

    private JTextField nombre1;
    private JTextField nombre2;
    private JButton valider;
    private JTextField resultat;
    private JPanel calcul;
    public void getOperator (String btnText){
     



    }

    public calcul() {
        nombre1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });

        nombre2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        resultat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                System.out.println();

            }
        });
    }

    // fenettre
    public static void main(String[] args) {
        JFrame fenettre = new JFrame("CALCULATRICE LASSANA");
        fenettre.setContentPane(new calcul().calcul);
        fenettre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenettre.pack();
        fenettre.setSize(600,500);//taille
        fenettre.setLocationRelativeTo(null);
        fenettre.setResizable(false);//enlever le bouton agrandir
        fenettre.setVisible(true);

    }

    private void createUIComponents() {

    }
}
