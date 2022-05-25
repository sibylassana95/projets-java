package net.ikilote.calculatrice;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * G?n?ration des boutons de calculatrice. 
 * 
 * @author C?lian Veyssi?re
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class BoutonCalc extends JButton implements ActionListener {

	// taille des boutons
	private static Dimension d = new Dimension(50, 25);
	
	// frame du programme
	private CalculatriceFrame frame;
	
	// action du bouton
	private ActionEnum action;

	/**
	 * Cr?ation du bouton
	 * @param string le nom du bouton
	 * @param action l'action definit pour le bouton
	 * @param frame lien vers la frame m?re
	 */
	public BoutonCalc(String string, ActionEnum action, CalculatriceFrame frame) {
		super(string);
		this.frame = frame;
		this.action = action;
		
		// le bouton s'?coute
		this.addActionListener(this);
		
		// d?fini la taille du du bouton
		this.setPreferredSize(d);
	}

	/**
	 * Envoie l'action au controleur
	 * @param e evenement
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.calc(action);
	}
	
}
