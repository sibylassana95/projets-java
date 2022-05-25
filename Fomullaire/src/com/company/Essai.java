package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Essai extends JFrame{
    private JPanel pan;
    private JTextField nomcomplet;
    private JLabel NomComplet;
    private JTextField adresse;
    private JLabel Adresse;
    private JTextField Ville;
    private JLabel ville;
    private JLabel pays;
    private JTextField Pays;
    private JLabel email;
    private JTextField Email;
    private JButton enregistrerButton;


    public Essai(){
        setContentPane(pan);
        setSize(500,500);
        setTitle("Création des formulaire");
        setLocationRelativeTo(null);
        setResizable(false);

        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // creation du deuxieme fennetre
                JFrame Valid= new JFrame();
                Valid.setTitle("Recuperation des donnes");
                Valid.setVisible(true);
                Valid.setSize(300,300);
                Valid.setLocationRelativeTo(null);
                Valid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel recup=new JLabel();
                recup.setBounds(0,0,100,200);
                Valid.add(recup);
                //affichages des donnees
                recup.setText("<html>"
                        +nomcomplet.getText()+ "<br> <br> <br>" +adresse.getText()+ "<br> <br> <br>"+Ville.getText()+
                        "<br> <br> <br>"+ Pays.getText()+"<br> <br> <br>"+Email.getText()+
                         "</html>");




            }
        });
                           

    }
}