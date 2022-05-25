package net.ikilote.calculatrice;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import static net.ikilote.calculatrice.ActionEnum.*;

/**
 * Liste des actions récupéré à la volé. Ici, les actions au clavier.
 * 
 * @author Célian Veyssière
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class ClavierAWT implements AWTEventListener {

	// lien vers la frame mère
	private CalculatriceFrame frame;
	
	/**
	 * Constructeur de l'écouteur
	 * @param calculatriceFrame frame mère
	 */
	public ClavierAWT(CalculatriceFrame calculatriceFrame) {
		this.frame = calculatriceFrame;
	}

	/**
	 * Redistribue l'évènement récupéré en fonctin de son identifiant
	 * @param event un événement
	 */
	@Override
	public void eventDispatched(AWTEvent event) {
		KeyEvent ke = (KeyEvent)event;
        switch (ke.getID()) {
        	//case KEY_RELEASED : released(ke); break;
        	case KEY_PRESSED  : pressed(ke);  break;
        	//case KEY_TYPED    : typed(ke);    break;
        }
	}
	
	/**
	 * distribute l'action en fonction de la touche pressée
	 * @param e un événement de touche
	 */
	private void pressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case VK_0: pressBouton(ZERO); break;
			case VK_1: pressBouton(UN); break;
			case VK_2: pressBouton(DEUX); break;
			case VK_3: pressBouton(TROIS); break;
			case VK_4: pressBouton(QUATRE); break;
			case VK_5: pressBouton(CINQ); break;
			case VK_6: pressBouton(SIX); break;
			case VK_7: pressBouton(SEPT); break;
			case VK_8: pressBouton(HUIT); break;
			case VK_9: pressBouton(NEUF); break;
			case VK_BACK_SPACE: pressBouton(BACK); break;
			case VK_COMMA: pressBouton(VIRGULE); break;
			case VK_PLUS: pressBouton(PLUS); break;
			case VK_MINUS: pressBouton(MOINS); break;
			case VK_SLASH: pressBouton(DIV); break;
			case VK_ASTERISK: pressBouton(MULT); break;
			case VK_ENTER: pressBouton(EGALE);break;
			case VK_P: pressBouton(POURCENT); break;
			case VK_M: pressBouton(PLUSMOINS); break;
			//case VK_ALT : ;
			default:
				break;
		}
	}
	
	/**
	 * revoie l'action vers le bouton
	 * @param action
	 */
	private void pressBouton(ActionEnum action) {
		frame.boutonPress(action);
	}

}
