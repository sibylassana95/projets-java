package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form  extends JFrame{
    private JPanel pan;
    private JTextField nombre1;
    private JTextField nombre2;
    private JToggleButton  additionButton;
    private JToggleButton soustrationButton;
    private JToggleButton divisionButton;
    private JToggleButton multiplicationButton;
    private JButton CALCULButton;
    private JLabel recup;
    private JToggleButton surfaceButton;
    private JToggleButton racinecarreButton;
    private JToggleButton perimettreButton;

    public Form(){
        setContentPane(pan);
        setTitle("CALCUL AVEC CHOIX DE L'OPERATEUR");
        setLocationRelativeTo(null);
        setSize(600,300);
        setResizable(false);
        CALCULButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nbr1= Integer.parseInt(nombre1.getText());
                int nbr2=Integer.parseInt(nombre2.getText());
                int addition = nbr1+nbr2;
                int soustraction=nbr1-nbr2;
                int division=nbr1/nbr2;
                int multiplication=nbr1*nbr2;
                int surface =nbr1*nbr2;
                int perimetre = (nbr1 + nbr2)*2 ;
                int racine  = (int) Math.sqrt(nbr1);

                if (additionButton.isSelected()) {
                    recup.setText("<html>" + addition + "</html>");

                }
                else if (soustrationButton.isSelected() ){
                    recup.setText("<html>" + soustraction + "</html>");

                }
                else if (divisionButton.isSelected()) {
                    recup.setText("<html>" + division + "</html>");

                }
                else if  (multiplicationButton.isSelected()) {
                    recup.setText("<html>" + multiplication + "</html>");

                }
                else if  (perimettreButton.isSelected()) {
                    recup.setText("<html>" + perimetre + "</html>");

                }
                else if  (surfaceButton.isSelected()) {
                    recup.setText("<html>" + surface + "</html>");

                }
                else if  (racinecarreButton.isSelected()) {
                    recup.setText("<html>" + racine + "</html>");

                }

            }
        });
    }
}
