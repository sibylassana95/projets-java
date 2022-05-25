package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Essai extends JFrame {
    private JPanel pan;
    private JTextField fiche;
    private JCheckBox checkBoxDisponible;
    private JTextField titre;
    private JTextField auteur;
    private JComboBox categorie;
    private JComboBox ville;
    private JTextField prixdevente;
    private JTextArea couverture;
    private JTextField prixdachat;
    private JTextField codecategorie;
    private JRadioButton enfantsRadioButton;
    private JRadioButton adolescentsRadioButton;
    private JRadioButton adultesRadioButton;
    private JTextField nbrepage;
    private JButton ENREGISTRERButton;
    private ButtonGroup group;


    public Essai(){
        setContentPane(pan);
        setSize(900,500);
        setTitle("Création des formulaire");
        setLocationRelativeTo(null);
        setResizable(false);


        //recuperation des radio
        enfantsRadioButton.setActionCommand("Enfants");
        adolescentsRadioButton.setActionCommand("Adolescents");
        adultesRadioButton.setActionCommand("Adultes");
        enfantsRadioButton.setSelected(true);
        group = new ButtonGroup();
        group.add(enfantsRadioButton);
        group.add(adolescentsRadioButton);
        group.add(adultesRadioButton);
        ENREGISTRERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame Valid= new JFrame();
                Valid.setTitle("Recuperation des donnes");
                Valid.setVisible(true);
                Valid.setSize(500,500);
                Valid.setLocationRelativeTo(null);
                Valid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel recup=new JLabel();
                Valid.add(recup);
                recup.setText("<html>" +
                        fiche.getText() +"     "+"    "+checkBoxDisponible.getText()+titre.getText()+
                        "<br> <br> <br>"+auteur.getText()+"<br> <br> <br>"+
                        categorie.getSelectedItem()+"<br> <br> <br>"+codecategorie.getText()+ "<br> <br> <br>"+
                        couverture.getText()+"<br> <br> <br>"+nbrepage.getText()+
                        "<br> <br> <br>"+"<br> <br> <br>"+
                        ville.getSelectedItem()+"<br> <br> <br>"+prixdachat.getText()+"<br> <br> <br>"+
                        prixdachat.getText()+"<br> <br> <br>"+prixdevente.getText() +"<br> <br> <br>"+
                        group.getSelection().getActionCommand()+
                        "</html>");






            }
        });

}

}
