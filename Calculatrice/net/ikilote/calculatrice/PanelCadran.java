package net.ikilote.calculatrice;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Cr�ation du cadran affichant les informations envoy�es par les actions de l'utilisateur 
 * suite au calcul de l'objet de calcul.
 * 
 * @author C�lian Veyssi�re
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class PanelCadran extends JPanel {

	// Lien vers la frame principal
	private CalculatriceFrame frame;
	
	// Zone d'affichage du texte du cadran
	private JTextField texte;

	/**
	 * Cr�ation du cadran avec la zone d'affichage
	 * @param calculatriceFrame
	 */
	public PanelCadran(CalculatriceFrame calculatriceFrame) {
		this.frame = calculatriceFrame;
		
		// Cr�action d'une zone de texte
		texte = new JTextField("0");
		// elle prendre la largeur de la frame - 25px
		Dimension d = new Dimension(frame.getWidth()-25, 20);
		texte.setPreferredSize(d);
		// Son texte est align� � droite
		texte.setHorizontalAlignment(JTextField.RIGHT);
		// Elle n'est pas �ditable
		texte.setEditable(false);
		
		this.add(texte);
		
	}

	/** Retour de la zone de texte
	 * @return the texte
	 */
	public JTextField getTexte() {
		return texte;
	}


}
