package com.company;

import java.awt.*;
//import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class fen {
    private JFrame frame;

    private JTextField text_1;
    private JTextField text_2;
    private JTextField text_3;
    private JTextField text_4;
    String situation;
   boolean c1;
   boolean c2;
   boolean c3;


//	        lancement de du fennetre

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    fen window = new fen();
                    window.frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }




    public fen() {
        initialize();
    }




    private void initialize() {
        frame = new JFrame("Assurance  ");
        frame.setBounds(100, 100, 900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        //TEXT valeurs
        JLabel Label = new JLabel("Entrer vos valeurs");
        Label.setBounds(36, 48, 400, 16);
        frame.getContentPane().add(Label);
        //auteur du programme
        JLabel Label_0 = new JLabel("Créer par :LASSANA SIBY"+" "+"email:sibyamara95@gmail.com");
        Label_0.setBounds(34, 0, 700, 16);
        frame.getContentPane().add(Label_0);
        //TEXT A
        JLabel Label_1 = new JLabel("Entrez votre age");
        Label_1.setBounds(34, 79, 300, 16);
        frame.getContentPane().add(Label_1);
        //TEXT B
        JLabel Label_2 = new JLabel("Entrez le nombre d'annes de permis");
        Label_2.setBounds(34, 108, 300, 16);
        frame.getContentPane().add(Label_2);
        //TEXT C
        JLabel Label_3 = new JLabel("Entrez le nombre d'accident");
        Label_3.setBounds(34, 138, 300, 16);
        frame.getContentPane().add(Label_3);
        JLabel Label_4 = new JLabel("Entrez le nombre d'annes d'assurance");
        Label_4.setBounds(34, 178, 300, 16);
        frame.getContentPane().add(Label_4);
        JLabel resultat = new JLabel();
        resultat.setBounds(18, 160, 450, 500);

        frame.getContentPane().add(resultat);



        //Saisie age
        text_1 = new JTextField();
        text_1.setBounds(310, 77, 116, 22);
        frame.getContentPane().add(text_1);
        text_1.setColumns(10);
        //Saisie permis
        text_2 = new JTextField();
        text_2.setBounds(310, 108, 116, 22);
        frame.getContentPane().add(text_2);
        text_2.setColumns(10);
        //Saisie accident
        text_3 = new JTextField();
        text_3.setBounds(310, 138, 116, 22);
        frame.getContentPane().add(text_3);
        text_3.setColumns(10);
          //Saisie assurance
       text_4 = new JTextField();
       text_4.setBounds(310, 178, 116, 22);
        frame.getContentPane().add(text_4);
        text_4.setColumns(10);
        // les conditions de calculs
                JButton calclulez = new JButton("Calculer");
                calclulez.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                  String a = text_1.getText();
                   int age=Integer.parseInt(a);
                   String b =  text_2.getText();
                   int permis=Integer.parseInt(b);
                   String c = text_3.getText();
                    int accident=Integer.parseInt(c);
                    String d = text_3.getText();
                     int assurance=Integer.parseInt(c);
                        c1 = age>=25;
                        c2=permis>=2;
                        c3= assurance>1;
                        if (c1 && c2) {
              if (accident == 0){
                  situation="rouge";
                  frame.getContentPane().setBackground(Color.RED);
              }
              else situation="refusé";
          }
          else if ((c1 && c2 )||(c1 && c2)){
              if (accident==0){
                  situation="orange";
                  frame.getContentPane().setBackground(Color.ORANGE);
              }else if (accident==1){
                  situation="rouge";
                  frame.getContentPane().setBackground(Color.RED);
              }
              else situation="refugé";

          }
          if (accident==0) {
              situation="vert";
              frame.getContentPane().setBackground(Color.GREEN);
          }
          else if (accident==1){
              situation="orange";
              frame.getContentPane().setBackground(Color.ORANGE);
          }
          else if (accident==2){
              situation="rouge";
              frame.getContentPane().setBackground(Color.RED);
          }
          else situation="refugé";

          if (c3){
              if (situation=="rouge"){
                  situation="orange";
                  frame.getContentPane().setBackground(Color.ORANGE);
              }
              else if (situation=="orange"){
                  situation="vert";
                  frame.getContentPane().setBackground(Color.GREEN);
              }
              else if (situation=="vert"){
                  situation="bleu";
                  frame.getContentPane().setBackground(Color.BLUE);
              }
          }
          resultat.setText("<html><H1>votre situation est :</H1>"+"<br>"+"<H2>"+ situation +"</H2>"+"</html>");


          }
         });

    JButton reset = new JButton("Actualisez");
           reset.setBackground(Color.red);
           reset.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent arg0) {

                   if (reset.isValid()){
                       resultat.setText(null);
                       text_1.setText(null);
                       text_2.setText(null);
                       text_3.setText(null);
                       text_4.setText(null);
                   }


               }
           });

        calclulez.setBounds(560, 108, 97, 25);
        frame.getContentPane().add(calclulez);

        reset.setBounds(560, 138, 110, 25);
        frame.getContentPane().add(reset);













       }
       }