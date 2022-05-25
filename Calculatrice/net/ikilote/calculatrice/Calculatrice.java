package net.ikilote.calculatrice;

/**
 * Lance l'application et son interface graphique.
 * 
 * @author C?lian Veyssi?re
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class Calculatrice {

	/**
	 * lanceur de l'appication
	 * @param args param?tres
	 */
	public static void main(String[] args) {
		
		// lance swing dans un thread ? part
		javax.swing.SwingUtilities.invokeLater(
			new Runnable() {
				public void run () {
					new CalculatriceFrame();
				}
			}
		);
	}
}
