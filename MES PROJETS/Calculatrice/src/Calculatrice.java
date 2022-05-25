import java.awt.BorderLayout; // placements (nord, sud ...)
import java.awt.Color;	// couleurs
import java.awt.Dimension;	// dimensions
import java.awt.Font;	// police
import java.awt.event.ActionEvent;	
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; // affichage
import javax.swing.JPanel;


public class Calculatrice extends JFrame {

        private JPanel container = new JPanel(); //panneau
    //Tableau stockant les �l�ments � afficher dans la calculatrice
    String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "0", "=", "C", "+", "-", "*", "/"};
        JButton[] tab_button = new JButton[tab_string.length]; // long tab-1
        
        private JLabel ecran = new JLabel(); // affichage
        private Dimension dim = new Dimension(50, 40); // (Largeur chiffre, hauteur chiffre)
        private Dimension dim2 = new Dimension(50, 31); // (Largeur symbole, hauteur symbole)
        private double chiffre1;
        private boolean clicOperateur = false, update = false;
        private String operateur = "";
        
        public Calculatrice(){
                
                this.setSize(350, 300); //(Largeur, Hauteur)
                this.setTitle("Calculatrice"); //Nom programme
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLocationRelativeTo(null);//possition
                this.setResizable(false);//enlever le bouton agrandir
                initComposant();
                
                this.setContentPane(container);
                this.setVisible(true);
        }
        
        private void initComposant(){

                Font police = new Font("Calibri", Font.BOLD, 15);//pollice des ecritures
                ecran = new JLabel("0");
                ecran.setFont(police);
                ecran.setHorizontalAlignment(JLabel.CENTER); //Alignement dans le cadre
                ecran.setPreferredSize(new Dimension(220, 20));
                
                JPanel operateur = new JPanel(); //paneau des operateur
                operateur.setPreferredSize(new Dimension(55, 225));//dimmension
                JPanel chiffre = new JPanel();//paneau des chiffre
                chiffre.setPreferredSize(new Dimension(165, 225));//dimmension
                JPanel panEcran = new JPanel(); //paneau ecran
                panEcran.setBackground(Color.yellow);
                panEcran.setPreferredSize(new Dimension(220, 30)); //(Largeur, Hauteur cadre)

                
                for(int i = 0; i < tab_string.length; i++)
                {
                    tab_button[i] = new JButton(tab_string[i]);		// creation des boutons
                    tab_button[i].setPreferredSize(dim);
                    
                    switch(i){
	                
                    	case 11 :
                    		tab_button[i].setForeground(Color.red);
                    		tab_button[i].addActionListener(new EgalListener());
                    		chiffre.add(tab_button[i]); // bouton egale
                    		break;
                    	
                    	case 12 :
                    		tab_button[i].setForeground(Color.blue);
	                        tab_button[i].addActionListener(new ResetListener());
	                        tab_button[i].setPreferredSize(dim2);
	                        operateur.add(tab_button[i]); // bouton C
                    		break;
                    	    
                    	case 13 :
                    		tab_button[i].setForeground(Color.GREEN);
                    		tab_button[i].addActionListener(new PlusListener());
                    		tab_button[i].setPreferredSize(dim2);//bouton +
                    		operateur.add(tab_button[i]);
                    		break;
                    	
                    	case 14 :
                    		tab_button[i].setForeground(Color.MAGENTA);
                    		tab_button[i].addActionListener(new MoinsListener());
                    		tab_button[i].setPreferredSize(dim2);//bouton -
                    		operateur.add(tab_button[i]);
                    		break;	
                    	
                    	case 15 :	
                    		tab_button[i].setForeground(Color.PINK);
                    		tab_button[i].addActionListener(new MultiListener());
                    		tab_button[i].setPreferredSize(dim2);//bouton X
                    		operateur.add(tab_button[i]);
                    		break;
	                    
                    	case 16 :
                    		tab_button[i].setForeground(Color.GREEN);
                    		tab_button[i].addActionListener(new DivListener());
                    		tab_button[i].setPreferredSize(dim2);//bouton /
                    		operateur.add(tab_button[i]);
                    		break;
                    		
                    	case 17 :
                    		tab_button[i].setForeground(Color.RED);
                    		tab_button[i].addActionListener(new DivListener());
                    		tab_button[i].setPreferredSize(dim2);
                    		operateur.add(tab_button[i]);
                    		break;	
                    	                    	
                    	default :
                    		tab_button[i].addActionListener(new ChiffreListener());
                    		chiffre.add(tab_button[i]); // chiffre
                    		break;
                    }
                }
                
                panEcran.add(ecran);
                panEcran.setBorder(BorderFactory.createLineBorder(Color.black)); // bordure affichage
 
                container.add(panEcran, BorderLayout.NORTH); // affichage
                container.add(chiffre, BorderLayout.CENTER); // corps chiffre
                container.add(operateur, BorderLayout.EAST); // operateur
        }
        
        
        private void calcul(){
            //condition sur l'appuie des touches
                if(operateur.equals("+"))
                {
                        chiffre1 = chiffre1 + Double.valueOf(ecran.getText()).doubleValue();
                        ecran.setText(String.valueOf(chiffre1));
                }
                        
                if(operateur.equals("-"))
                {
                        chiffre1 = chiffre1 - Double.valueOf(ecran.getText()).doubleValue();
                        ecran.setText(String.valueOf(chiffre1));
                }               
                
                if(operateur.equals("*"))
                {
                        chiffre1 = chiffre1 * Double.valueOf(ecran.getText()).doubleValue();
                        ecran.setText(String.valueOf(chiffre1));
                }       
                        
                if(operateur.equals("/"))
                {
                        try{
                                chiffre1 = chiffre1 / Double.valueOf(ecran.getText()).doubleValue();
                                ecran.setText(String.valueOf(chiffre1));
                        } catch (ArithmeticException e){
                                ecran.setText("0");
                        }
                }
        }
        
        class ChiffreListener implements ActionListener{
                public void actionPerformed(ActionEvent e) {
                        //On affiche le chiffre en plus dans le label
                        String str = ((JButton)e.getSource()).getText();
                        
                        if(update)
                        {
                                update = false;
                        }
                        else
                        {
                                if(!ecran.getText().equals("0")) // si ecran = 0
                                        str = ecran.getText() + str;
                        }
                        
                        ecran.setText(str);
                }
        }
 
        
        class EgalListener implements ActionListener{
                public void actionPerformed(ActionEvent arg0) {
                        calcul();
                        update = true;
                        clicOperateur = false;
                }    
        }
        
        // condition pour l'appuie des touches
        class PlusListener implements ActionListener{
                public void actionPerformed(ActionEvent arg0) {
                        
                        if(clicOperateur)
                        {
                                calcul();
                                ecran.setText(String.valueOf(chiffre1));
                        }
                        else
                        {
                                chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                                clicOperateur = true;
                        }
                        operateur = "+";
                        update = true;
                }
        }
        
        class MoinsListener implements ActionListener{
                public void actionPerformed(ActionEvent arg0) {
                        if(clicOperateur)
                        {
                                calcul();
                                ecran.setText(String.valueOf(chiffre1));
                        }
                        else
                        {
                                chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                                clicOperateur = true;
                        }
                        operateur = "-";
                        update = true;
                }
        }
        
        class MultiListener implements ActionListener{
                public void actionPerformed(ActionEvent arg0) {
                        if(clicOperateur)
                        {
                                calcul();
                                ecran.setText(String.valueOf(chiffre1));
                        }
                        else
                        {
                                chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                                clicOperateur = true;
                        }
                        operateur = "*";
                        update = true;
                }
        }
        
        class DivListener implements ActionListener{
                public void actionPerformed(ActionEvent arg0) {
                        if(clicOperateur)
                        {
                                calcul();
                                ecran.setText(String.valueOf(chiffre1));
                        }
                        else
                        {
                                chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                                clicOperateur = true;
                        }
                        operateur = "/";
                        update = true;
                }
        }
        
        class ResetListener implements ActionListener{ // boutton reset
                public void actionPerformed(ActionEvent arg0) {
                        clicOperateur = false;
                        update = true;
                        chiffre1 = 0;
                        operateur = "";
                        ecran.setText(""); // vide quand on clic sur reset
                }
        }
        
}
