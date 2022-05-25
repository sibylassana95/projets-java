package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Calculatrice simple ou scientifique
 * @author K.Ramesh ramesh_cdm [at] hotmail.com
 */
public class Main extends JFrame implements ActionListener {

    private JTextField consol;
    private double temp, temp1, result, a;
    private static double m1;
    private int k = 1, x = 0, y = 0, z = 0;
    private char operation;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, clr, pow2, pow3, exp;
    private JButton plus, min, div, lg, rec, mul, eq, plmi, poin, mr, mc, mp, mm, sqrt, sin, cos, tan;
    private JMenuBar bar;
    private JMenu view;
    private JMenuItem exit;
    private JRadioButtonMenuItem standard, scientific;
    private JSeparator jp;
    private ButtonGroup bg;
    private Container container;
    private JPanel syntpanel, buttonpanel;

    /**
     * Constructeur
     * Initialisation des boutons sur le JFrame
     */
    public Main() {
        container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        Font font = new Font("Arial", Font.PLAIN, 18);
        consol = new JTextField(25);
        consol.setFont(font);
        consol.setHorizontalAlignment(SwingConstants.RIGHT);
        consol.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textpanel.add(consol);
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(5, 4, 2, 2));
        boolean t = true;
        syntpanel = new JPanel();
        syntpanel.setLayout(new GridLayout(5, 1));
        bar = new JMenuBar();
        view = new JMenu("MODE");

        standard = new JRadioButtonMenuItem("Simple", true);
        standard.setMnemonic('S');
        standard.addItemListener(new radiohandler());
        scientific = new JRadioButtonMenuItem("Scientifique");
        standard.setMnemonic('c');
        scientific.addItemListener(new radiohandler());
        jp = new JSeparator();
        exit = new JMenuItem("Quitter");
        standard.setMnemonic('E');
        exit.addActionListener(this);
        bg = new ButtonGroup();
        bg.add(standard);
        bg.add(scientific);
        view.add(standard);
        view.add(scientific);
        view.add(jp);
        view.add(exit);
        bar.add(view);
        setJMenuBar(bar);

        mr = new JButton("MR");
        buttonpanel.add(mr);
        mr.addActionListener(this);
        seven = new JButton("7");
        buttonpanel.add(seven);
        seven.addActionListener(this);
        eight = new JButton("8");
        buttonpanel.add(eight);
        eight.addActionListener(this);
        nine = new JButton("9");
        buttonpanel.add(nine);
        nine.addActionListener(this);
        clr = new JButton("AC");
        buttonpanel.add(clr);
        clr.addActionListener(this);

        mc = new JButton("MC");
        buttonpanel.add(mc);
        mc.addActionListener(this);
        four = new JButton("4");
        buttonpanel.add(four);
        four.addActionListener(this);
        five = new JButton("5");
        buttonpanel.add(five);
        five.addActionListener(this);
        six = new JButton("6");
        buttonpanel.add(six);
        six.addActionListener(this);
        mul = new JButton("*");
        buttonpanel.add(mul);
        mul.addActionListener(this);

        mp = new JButton("M+");
        buttonpanel.add(mp);
        mp.addActionListener(this);
        one = new JButton("1");
        buttonpanel.add(one);
        one.addActionListener(this);
        two = new JButton("2");
        buttonpanel.add(two);
        two.addActionListener(this);
        three = new JButton("3");
        buttonpanel.add(three);
        three.addActionListener(this);
        min = new JButton("-");
        buttonpanel.add(min);
        min.addActionListener(this);

        mm = new JButton("M-");
        buttonpanel.add(mm);
        mm.addActionListener(this);
        zero = new JButton("0");
        buttonpanel.add(zero);
        zero.addActionListener(this);
        plmi = new JButton("+/-");
        buttonpanel.add(plmi);
        plmi.addActionListener(this);
        poin = new JButton(".");
        buttonpanel.add(poin);
        poin.addActionListener(this);
        plus = new JButton("+");
        buttonpanel.add(plus);
        plus.addActionListener(this);


        rec = new JButton("1/x");
        buttonpanel.add(rec);
        rec.addActionListener(this);
        sqrt = new JButton("Sqrt");
        buttonpanel.add(sqrt);
        sqrt.addActionListener(this);
        lg = new JButton("log");
        buttonpanel.add(lg);
        lg.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        buttonpanel.add(div);
        eq = new JButton("=");
        buttonpanel.add(eq);
        eq.addActionListener(this);

        sin = new JButton("SIN");
        syntpanel.add(sin);
        sin.addActionListener(this);
        cos = new JButton("COS");
        syntpanel.add(cos);
        cos.addActionListener(this);
        tan = new JButton("TAN");
        syntpanel.add(tan);
        tan.addActionListener(this);
        pow2 = new JButton("x^2");
        syntpanel.add(pow2);
        pow2.addActionListener(this);
        pow3 = new JButton("x^3");
        syntpanel.add(pow3);
        pow3.addActionListener(this);
        exp = new JButton("Exp");
        exp.addActionListener(this);

        container.add("Center", buttonpanel);
        container.add("North", textpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Evenement sur la sélection d'un element dans le menu
     */
    class radiohandler implements ItemListener {

        public void itemStateChanged(ItemEvent ie) {
            AbstractButton button = (AbstractButton) ie.getItem();
            String label = button.getText();
            {
                if (label.equals("Simple")) {
                    container.remove(syntpanel);
                    validate();
                }
                if (label.equals("Scientifique")) {
                    container.add("West", syntpanel);
                    validate();
                }
            }
        }
    }

    /**
     * Action générée sur l'appui d'une touche
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Quitter")) {
            System.exit(0);
        }
        if (s.equals("1")) {
            if (z == 0) {
                consol.setText(consol.getText() + "1");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                consol.setText(consol.getText() + "2");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                consol.setText(consol.getText() + "3");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                consol.setText(consol.getText() + "4");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                consol.setText(consol.getText() + "5");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                consol.setText(consol.getText() + "6");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                consol.setText(consol.getText() + "7");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                consol.setText(consol.getText() + "8");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                consol.setText(consol.getText() + "9");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                consol.setText(consol.getText() + "0");
            } else {
                consol.setText("");
                consol.setText(consol.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("AC")) {
            consol.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("log")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.log(Double.parseDouble(consol.getText()));
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("1/x")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = 1 / Double.parseDouble(consol.getText());
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("Exp")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.exp(Double.parseDouble(consol.getText()));
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("x^2")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.pow(Double.parseDouble(consol.getText()), 2);
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("x^3")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.pow(Double.parseDouble(consol.getText()), 3);
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("+/-")) {
            if (x == 0) {
                consol.setText("-" + consol.getText());
                x = 1;
            } else {
                consol.setText(consol.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                consol.setText(consol.getText() + ".");
                y = 1;
            } else {
                consol.setText(consol.getText());
            }
        }
        if (s.equals("+")) {
            if (consol.getText().equals("")) {
                consol.setText("");
                temp = 0;
                operation = '+';
            } else {
                temp = Double.parseDouble(consol.getText());
                consol.setText("");
                operation = '+';
                y = 0;
                x = 0;
            }
            consol.requestFocus();
        }
        if (s.equals("-")) {
            if (consol.getText().equals("")) {
                consol.setText("");
                temp = 0;
                operation = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(consol.getText());
                consol.setText("");
                operation = '-';
            }
            consol.requestFocus();
        }
        if (s.equals("/")) {
            if (consol.getText().equals("")) {
                consol.setText("");
                temp = 1;
                operation = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(consol.getText());
                operation = '/';
                consol.setText("");
            }
            consol.requestFocus();
        }
        if (s.equals("*")) {
            if (consol.getText().equals("")) {
                consol.setText("");
                temp = 1;
                operation = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(consol.getText());
                operation = '*';
                consol.setText("");
            }
            consol.requestFocus();
        }
        if (s.equals("MC")) {
            m1 = 0;
            consol.setText("");
        }
        if (s.equals("MR")) {
            consol.setText("");
            consol.setText(consol.getText() + m1);
        }
        if (s.equals("M+")) {
            if (k == 1) {
                m1 = Double.parseDouble(consol.getText());
                k++;
            } else {
                m1 += Double.parseDouble(consol.getText());
                consol.setText("" + m1);
            }
        }
        if (s.equals("M-")) {
            if (k == 1) {
                m1 = Double.parseDouble(consol.getText());
                k++;
            } else {
                m1 -= Double.parseDouble(consol.getText());
                consol.setText("" + m1);
            }
        }
        if (s.equals("Sqrt")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(consol.getText()));
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("SIN")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.sin(Double.parseDouble(consol.getText()));
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("COS")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.cos(Double.parseDouble(consol.getText()));
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("TAN")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                a = Math.tan(Double.parseDouble(consol.getText()));
                consol.setText("");
                consol.setText(consol.getText() + a);
            }
        }
        if (s.equals("=")) {
            if (consol.getText().equals("")) {
                consol.setText("");
            } else {
                temp1 = Double.parseDouble(consol.getText());
                switch (operation) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '/':
                        result = temp / temp1;
                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                consol.setText("");
                consol.setText(consol.getText() + result);
                z = 1;
            }
        }
        consol.requestFocus();
    }

    /**
     * Exemple
     * @param args
     */
    public static void main(String args[]) {
        Main n = new Main();
        n.setTitle("Calculatrice scientifique");
        n.setSize(470, 250);
        n.setResizable(false);
        n.setVisible(true);
    }
}