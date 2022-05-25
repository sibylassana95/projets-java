package com.company;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
class Affiche
{
    public static void main(String[] args)
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
            String user = "root";
            String password = "siby";

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM users";

            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(query);

            String columns[] = { "ID", "Nom", "Age" };
            String data[][] = new String[8][3];

            int i = 0;
            while (res.next()) {
                int id = res.getInt("ID");
                String nom = res.getString("nom");
                String age = res.getString("age");
                data[i][0] = id + "";
                data[i][1] = nom;
                data[i][2] = age;
                i++;
            }

            DefaultTableModel model = new DefaultTableModel(data, columns);
            JTable table = new JTable(model);
            table.setShowGrid(true);
            table.setShowVerticalLines(true);
            JScrollPane pane = new JScrollPane(table);
            JFrame f = new JFrame("Remplir JTable a partir d'une BDD");
            JPanel panel = new JPanel();
            panel.add(pane);
            f.add(panel);
            f.setSize(500, 250);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}