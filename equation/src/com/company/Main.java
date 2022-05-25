package com.company;

import java.awt.EventQueue;
//import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class fen {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

//	 * Launch the application.

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


//	 * Create the application.

    public fen() {
        initialize();
    }


// * Initialize the contents of the frame.

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        //TEXT A
        JLabel lblNewLabel = new JLabel("Entrer A");
        lblNewLabel.setBounds(36, 48, 78, 16);
        frame.getContentPane().add(lblNewLabel);
        //TEXT B
        JLabel lblNewLabel_1 = new JLabel("Entrer B");
        lblNewLabel_1.setBounds(34, 79, 56, 16);
        frame.getContentPane().add(lblNewLabel_1);
        //TEXT C
        JLabel lblNewLabel_2 = new JLabel("Entrer C");
        lblNewLabel_2.setBounds(34, 108, 56, 16);
        frame.getContentPane().add(lblNewLabel_2);

        //TEXT DELTA
        JLabel lblNewLabel_3 = new JLabel("DELTA");
        lblNewLabel_3.setBounds(34, 137, 56, 16);
        frame.getContentPane().add(lblNewLabel_3);

        //Affiche "X1 ="
        JLabel lblNewLabel_4 = new JLabel("X1");
        lblNewLabel_4.setBounds(36, 167, 56, 16);
        frame.getContentPane().add(lblNewLabel_4);
        //Affiche "X2 ="
        JLabel lblNewLabel_5 = new JLabel("X2");
        lblNewLabel_5.setBounds(36, 196, 56, 16);
        frame.getContentPane().add(lblNewLabel_5);

        //Saisie A
        textField = new JTextField();
        textField.setBounds(98, 45, 116, 22);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        //Saisie B
        textField_1 = new JTextField();
        textField_1.setBounds(98, 77, 116, 22);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        //Saisie C
        textField_2 = new JTextField();
        textField_2.setBounds(98, 108, 116, 22);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
        //Affiche DELTA
        textField_3 = new JTextField();
        textField_3.setBounds(98, 134, 116, 22);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);
        // X1
        textField_4 = new JTextField();
        textField_4.setBounds(98, 164, 116, 22);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);
        // X2
        textField_5 = new JTextField();
        textField_5.setBounds(98, 193, 116, 22);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);

        JButton btnNewButton = new JButton("Calcul");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = 0;
                double b = 0;
                double c = 0;
                double X1 = 0;
                double X2 = 0;

                //	Scanner sc=new  Scanner(System.in);

                double delta=(b*b)-4*(a*c);
                if (delta < 0) {
                    System.err.println("NO solution");
                    System.exit(-1);
                }
                if (delta == 0) {
                    X1=X2=(-b)/(2*a);
                }

                if (delta > 0) {
                    delta= Math.sqrt(delta);
                    X1=((-b+Math.sqrt(delta))/(2*a));
                    X2=((-b-Math.sqrt(delta))/(2*a));



                }


                textField_3.setText("" + delta);
                textField_4.setText("" + X1);
                textField_5.setText("" + X2);

            }

        });
        btnNewButton.setBounds(226, 108, 97, 25);
        frame.getContentPane().add(btnNewButton);


    }
}
