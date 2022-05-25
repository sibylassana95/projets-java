import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculatrice {
    private double nombre1 = 0.0;//une variable appelée nombre1 Sa valeur par défaut est 0,0.
    private double nombre2 = 0.0;//Pour stocker la sortie du calcul,
    private char math_operator;//savoir sur quel bouton d'opérateur a été cliqué est de stocker le texte du bouton
    private JPanel JavaCalculatrice;
    private JTextField textDisplay;
    private JButton btnMultiply;
    private JButton btnDeux;
    private JButton btnTrois;
    private JButton btnCinq;
    private JButton btnHuite;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNeuf;
    private JButton btnClear;
    private JButton btnMoin;
    private JButton btnDivision;
    private JButton btnEguals;
    private JButton btnQuatre;
    private JButton btnSept;
    private JButton btnZero;
    private JButton btnUn;


    public void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        nombre1 = nombre1 + Double.parseDouble(textDisplay.getText( ) );
        textDisplay.setText("");



    }

    public JavaCalculatrice() {
        btnUn.addActionListener(new ActionListener() { //ajouter le bouton 1 dans la zone text
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
             String btnUnText= textDisplay.getText() + btnUn.getText();//repetter le bouton 1
             textDisplay.setText(btnUnText);
            }
        });

        btnDeux.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnDeuxText= textDisplay.getText() + btnDeux.getText();//repetter le bouton 2
                textDisplay.setText(btnDeuxText);

            }
        });
        btnTrois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTroisText= textDisplay.getText() + btnTrois.getText();//repetter le bouton 3
                textDisplay.setText(btnTroisText);

            }
        });
        btnQuatre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
             String btnQuatreText=textDisplay.getText() + btnQuatre.getText();//repetter le bouton4
             textDisplay.setText(btnQuatreText);
            }
        });
        btnCinq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnCinqText= textDisplay.getText() + btnCinq.getText();//repetter le bouton 5
                textDisplay.setText(btnCinqText);

            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText= textDisplay.getText() +btnSix.getText();//repetter le bouton 6
                textDisplay.setText(btnSixText);

            }
        });
        btnSept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSeptText= textDisplay.getText() + btnSept.getText();//repetter le bouton 7
                textDisplay.setText(btnSeptText);

            }
        });
        btnHuite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnHuiteText= textDisplay.getText() + btnHuite.getText();//repetter le bouton 8
                textDisplay.setText(btnHuiteText);

            }
        });
        btnNeuf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNeufText= textDisplay.getText() + btnNeuf.getText();//repetter le bouton 9
                textDisplay.setText(btnNeufText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText= textDisplay.getText() +btnZero.getText();//repetter le bouton 9
                textDisplay.setText(btnZeroText);

            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent ) {
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0. ");
                }
                else if (textDisplay.getText().contains(" .")){
                    btnPoint.setEnabled(false);
                }
                else {
                    String btnPointText= textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Pour stocker la valeur du champ de texte, nous devons obtenir le texte. Mais nous devrons le
                // convertir d'une chaîne à un double.
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnEguals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // récupère le texte du champ de texte et convertit la chaîne en un double
                switch ( math_operator ) {
                    case '+':
                        nombre2 = nombre1 + Double.parseDouble(textDisplay.getText( ) );
                        break;
                    case '-':
                        nombre2 = nombre1 -Double.parseDouble(textDisplay.getText( ) );
                        break;
                    case '/':
                        nombre2 = nombre1 /Double.parseDouble(textDisplay.getText( ) );
                        break;
                    case '*':
                        nombre2 = nombre1 * Double.parseDouble(textDisplay.getText( ) );
                        break;


                }
                textDisplay.setText( Double.toString(nombre2) ); // convertir un double en texte
                nombre1 = 0;//effacer la variable total1
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                nombre2 = 0; //effacer la variable total2
                textDisplay.setText ("");//définir le texte du champ de texte sur une chaîne vide
            }
        });
        btnMoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnMoin.getText();
                getOperator(button_text);
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnDivision.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });


    }
// fenettre
    public static void main(String[] args) {
        JFrame fenettre = new JFrame("CALCULATRICE LASSANA");
        fenettre.setContentPane(new JavaCalculatrice().JavaCalculatrice);
        fenettre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenettre.pack();
        fenettre.setSize(300,310);//taille
        fenettre.setLocationRelativeTo(null);
        fenettre.setResizable(false);//enlever le bouton agrandir
        fenettre.setVisible(true);

    }

    private void createUIComponents() {

    }
}
