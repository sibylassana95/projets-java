package com.company;

import javax.swing.*;
import java.awt.*;

class Affiche {

    public static void main(String[] args) {
        //crée un frame
        final JFrame frame = new JFrame("Exemple de JTable");

        //En-têtes pour JTable
        String[] columns = new String[] {
                "Id", "Nom", "Adresse", "Taux horaire", "A temps partiel"
        };

        //données pour JTable dans un tableau 2D
        Object[][] data = new Object[][] {
                {1, "lassana", "Diourbel", 20.0, true },
                {2, "oumar", "Matam", 50.0, false },
                {3, "amy", "Thies", 30.0, true },
                {4, "seydou", "Fatick", 60.0, false },
                {5, "khady", "Dakar", 10.0, false },
                {6, "Mounass", "Kaolack", 10.0, false },
        };

        //crée un JTable avec des données
        JTable table = new JTable(data, columns);

        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        JLabel labelHead = new JLabel("Liste des employes");
        labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));

        frame.getContentPane().add(labelHead,BorderLayout.PAGE_START);
        //ajouter la table au frame
        frame.getContentPane().add(scroll,BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
