package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioButtonValue extends JFrame implements ActionListener
{
    private ButtonGroup group;

    private static void init()
    {
        //créer un frame
        JFrame frame = new RadioButtonValue();

        //Affichez le frame.
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //créer et afficher l'interface graphique
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                init();
            }
        });
    }

    public RadioButtonValue()
    {
        // définir la disposition du flux pour le frame
        this.getContentPane().setLayout(new FlowLayout());

        JRadioButton bleu = new JRadioButton("Bleu");
        bleu.setActionCommand("Bleu");

        JRadioButton rouge = new JRadioButton("Rouge");
        rouge.setActionCommand("Rouge");

        JRadioButton vert = new JRadioButton("Vert");
        vert.setActionCommand("Vert");

        bleu.setSelected(true);

        JButton btn = new JButton("Cliquez ici");
        btn.addActionListener(this);
        group = new ButtonGroup();

        //ajouter des boutons radio
        group.add(bleu);
        group.add(rouge);
        group.add(vert);

        add(bleu);
        add(rouge);
        add(vert);
        add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cliquez ici")) {
            System.out.println("Le radio bouton sélectionné est: " +
                    group.getSelection().getActionCommand());
        }
    }
}