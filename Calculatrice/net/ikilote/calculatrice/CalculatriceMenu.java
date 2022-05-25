package net.ikilote.calculatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Création du menu
 * 
 * @author Célian Veyssière
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class CalculatriceMenu extends JMenuBar {
	
	/* *********** SINGLETON DU MENU ************************* */
	
	private static CalculatriceMenu menu;
	
	public static CalculatriceMenu getMenu(CalculatriceFrame frame) {
		if (menu == null) {
			menu = new CalculatriceMenu(frame);
		}
		return menu;
	}
	
	/* *********** MENU ************************************** */
	
	private final CalculatriceFrame frame;

	private CalculatriceMenu(CalculatriceFrame frame) {
		super();
		this.frame = frame;
		
		
		/* *********************** Calculatrice ************************* */
		JMenu menuFichier = new JMenu("Calculatrice");
		menuFichier.setMnemonic('C');
		
		// Item : À propos...
		JMenuItem menuItemQuitter = new JMenuItem("Quitter");
		menuItemQuitter.setMnemonic('Q');
		menuItemQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { System.exit(0);}
		});
		
		menuFichier.add(menuItemQuitter);
		
		this.add(menuFichier);		
		
		
		/* *************************       ?     ************************* */
		JMenu menuAide = new JMenu("?");
		menuAide.setMnemonic('?');

		// Item : Raccourcis Clavier
		JMenuItem menuItemCalvier = new JMenuItem("Raccourcis Clavier");
		menuItemCalvier.setMnemonic('R');
		menuItemCalvier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { CalculatriceMenu.this.clavier();}
		});
		
		menuAide.add(menuItemCalvier);
		
		// Item : À propos...
		JMenuItem menuItemVersion = new JMenuItem("À propos...");
		menuItemVersion.setMnemonic('P');
		menuItemVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { CalculatriceMenu.this.apropos();}
		});
		
		menuAide.add(menuItemVersion);
		
		this.add(menuAide);	
		
	}
	
	/**
	 * Affiche les « Raccourcis Clavier » du logiciel
	 */
	protected void clavier() {
		JOptionPane.showMessageDialog(
				frame, 
				"0 à 9 pour les chiffres\n" +
				"+ : Touche +        * : Touche ×\n" +
				"- : Touche -           / : Touche ÷\n" +
				"P : Touche %        M : Touche ±\n" +
				"Échap : Touche CE", 
				"Raccoucis Clavier", 
				JOptionPane.INFORMATION_MESSAGE
			);
		
	}

	/**
	 * Affiche le « À propos » du logiciel
	 */
	protected void apropos() {
		JOptionPane.showMessageDialog(
				frame, 
				"Ma Calculatrice\n" +
				"Version 0.0.6.20110204\n" +
				"Par Célian Veyssière", 
				"À propos...", 
				JOptionPane.INFORMATION_MESSAGE
			);
		
	}

}
