package net.ikilote.calculatrice;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Création de la Frame de la calculatrice
 * 
 * @author Célian Veyssière
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
	 * Génère la fenêtre
	 */
	public CalculatriceFrame() {
		super();	
		// initialise la fenêtre de l'application
		this.initialise();
		this.setTitle("Calculatrice");
		
		// ajout de la barre de menu
		menu = CalculatriceMenu.getMenu(this);
		this.setJMenuBar(menu);
		
		// groupe pour panels
		JPanel j = new JPanel();
		j.setLayout(new BorderLayout());

		// génère les panels cadrant et boutons
		c = new PanelCadran(this);
		j.add(c, BorderLayout.NORTH);
		panelBoutons = new PanelBoutons(this);
		j.add(panelBoutons, BorderLayout.CENTER);
		
		// ajout à la frame
		this.setContentPane(j);
		
		calc = new Calc(this);
	}


	/**
	 * Initualise la fenêtre de l'application
	 */
	public void initialise() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // fermeture
		this.setSize(250, 250);                       // taille de la fenêtre
		this.setLocationRelativeTo(null);             // centrée
		this.setVisible(true);                        // affichée
		this.setResizable(false);                     // non redimensionnable
		
		Toolkit.getDefaultToolkit().addAWTEventListener(new ClavierAWT(this), AWTEvent.KEY_EVENT_MASK);
	}


	/**
	 * répercute l'action vers le calculateur
	 * @param action action défini par un bouton pressé
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
	 * renvoie l'état d'un bouton
	 * @param bouton l'identifiant du bouton
	 * @param etat état du bouton
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
