package net.ikilote.calculatrice;

import static net.ikilote.calculatrice.ActionEnum.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Création d'une grille de boutons de calculatrice.
 * 
 * @author Célian Veyssière
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class PanelBoutons extends JPanel {
	
	// lien vers la Frame mère
	private CalculatriceFrame frame;

	// Liste des boutons par action
	private HashMap<ActionEnum, BoutonCalc> boutons;
	
	/**
	 * Création du panel avec la grille de boutons.
	 * @param frame lien vers la frame mère
	 */
	public PanelBoutons(CalculatriceFrame frame) {
		super();
		boutons = new HashMap<ActionEnum, BoutonCalc>();
		
		this.frame = frame;
		GridLayout g = new GridLayout(5, 4);
		//g.setHgap(3);
		//g.setVgap(3);
		this.setLayout(g);
		
		this.add(boutonCalc("CE",CE));
		this.add(boutonCalc("←", BACK));
		this.add(boutonCalc("%", POURCENT));
		this.add(boutonCalc("+", PLUS));
		
		this.add(boutonCalc("7", SEPT));
		this.add(boutonCalc("8", HUIT));
		this.add(boutonCalc("9", NEUF));
		this.add(boutonCalc("-", MOINS));
		
		this.add(boutonCalc("4", QUATRE));
		this.add(boutonCalc("5", CINQ));
		this.add(boutonCalc("6", SIX));
		this.add(boutonCalc("×", MULT));
		
		this.add(boutonCalc("1", UN));
		this.add(boutonCalc("2", DEUX));
		this.add(boutonCalc("3", TROIS));
		this.add(boutonCalc("÷", DIV));
		
		this.add(boutonCalc("0", ZERO));
		this.add(boutonCalc("±", PLUSMOINS));
		this.add(boutonCalc(",", VIRGULE));
		this.add(boutonCalc("=", EGALE));
		
	}
	
	/**
	 * Création du bouton (dans un panel pour le centrer) 
	 * et ajout dans la liste
	 * 
	 * @param string nom affiché sur le bouton
	 * @param action action associée au bouton
	 * @return renvoi un bouton
	 */
	private Component boutonCalc(String string, ActionEnum action) {
		JPanel p = new JPanel();
		BoutonCalc b = new BoutonCalc(string , action, frame);
		boutons.put(action, b);
		p.add(b);
		return p;
	}

	/**
	 * change l'état d'un bouton
	 * @param num identidiant du bouton
	 * @param etat s'il est activé ou non
	 */
	public void setBoutonEtat(ActionEnum num, boolean etat) {
		if (num != null && boutons.containsKey(num)) {
			boutons.get(num).setEnabled(etat);
		}
	}

	/**
	 * Simule le pressage d'un bouton
	 * @param action num du bouton
	 */
	public void pressBouton(ActionEnum num) {
		if (num != null && boutons.containsKey(num)) {
			boutons.get(num).doClick();
		}
	}
}
