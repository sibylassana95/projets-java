package net.ikilote.calculatrice;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Cr�ation de la Frame de la calculatrice
 * 
 * @author C�lian Veyssi�re
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class CalculatriceFrame extends JFrame {

	// panneau cadran
	private PanelCadran c;
	// panneau bouton
	private PanelBoutons panelBoutons;
	
	// calculateur
	private Calc calc;
	//menu
	private CalculatriceMenu menu;
	

	/**
	 * G�n�re la fen�tre
	 */
	public CalculatriceFrame() {
		super();	
		// initialise la fen�tre de l'application
		this.initialise();
		this.setTitle("Calculatrice");
		
		// ajout de la barre de menu
		menu = CalculatriceMenu.getMenu(this);
		this.setJMenuBar(menu);
		
		// groupe pour panels
		JPanel j = new JPanel();
		j.setLayout(new BorderLayout());

		// g�n�re les panels cadrant et boutons
		c = new PanelCadran(this);
		j.add(c, BorderLayout.NORTH);
		panelBoutons = new PanelBoutons(this);
		j.add(panelBoutons, BorderLayout.CENTER);
		
		// ajout � la frame
		this.setContentPane(j);
		
		calc = new Calc(this);
	}


	/**
	 * Initualise la fen�tre de l'application
	 */
	public void initialise() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // fermeture
		this.setSize(250, 250);                       // taille de la fen�tre
		this.setLocationRelativeTo(null);             // centr�e
		this.setVisible(true);                        // affich�e
		this.setResizable(false);                     // non redimensionnable
		
		Toolkit.getDefaultToolkit().addAWTEventListener(new ClavierAWT(this), AWTEvent.KEY_EVENT_MASK);
	}


	/**
	 * r�percute l'action vers le calculateur
	 * @param action action d�fini par un bouton press�
	 */
	public void calc(ActionEnum action) {
		calc.action(action);
	}

	/**
	 * renvoie l'affichage au cadran
	 * @param val la chaine a afficher dans le cadran
	 */
	public void affiche(String val) {
		this.c.getTexte().setText(val);
	}

	/**
	 * renvoie l'�tat d'un bouton
	 * @param bouton l'identifiant du bouton
	 * @param etat �tat du bouton
	 */
	public void changer(ActionEnum bouton, boolean etat) {
		this.panelBoutons.setBoutonEtat(bouton, etat);		
	}

	/**
	 * Envoie aux boutons lequel est a presser
	 * @param bouton l'identifiant du bouton
	 */
	public void boutonPress(ActionEnum bouton) {
		this.panelBoutons.pressBouton(bouton);
		
	}
	
}
