package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Créer le Jframe
        JFrame f = new JFrame("LÉA");
        //Créer le JPanel
        JPanel panel = new JPanel();
        //Spécifier la position et la taille du JPanel
        panel.setBounds(90,90,1100,600);
        //Spécifier la couleur d'arrière-plan du JPanel
        panel.setBackground(Color.lightGray);
        ImageIcon photo =new ImageIcon("img.jpg");
        ImageIcon photo1 =new ImageIcon("img1.jpg");
        ImageIcon photo2 =new ImageIcon("img2.jpg");
        JLabel lab=new JLabel(photo);
        JLabel lab1=new JLabel(photo1);
        JLabel lab2=new JLabel(photo2);
        panel.add(lab);
        panel.add(lab1);
        panel.add(lab2);
        JPanel panel2 = new JPanel();
        //Spécifier la position et la taille du JPanel
        panel2.setBounds(0,0,900,90);
        //Spécifier la couleur d'arrière-plan du JPanel
        panel2.setBackground(Color.gray);
        JPanel panel3 = new JPanel();
        //Spécifier la position et la taille du JPanel
        panel3.setBounds(500,0,900,90);
        //Spécifier la couleur d'arrière-plan du JPanel
        panel3.setBackground(Color.red);



        //Ajouter le JPanel au JFrame
        f.add(panel);
        f.add(panel2);
        f.add(panel3);
        f.setSize(2000,800);
        f.setLayout(null);
        f.setVisible(true);
    }
}
