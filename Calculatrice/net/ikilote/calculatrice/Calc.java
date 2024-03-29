package net.ikilote.calculatrice;

import net.ikilote.calculatrice.CalculatriceFrame;

import static net.ikilote.calculatrice.ActionEnum.*;

/**
 * Traitement des donn�es de la calculatrice en fonction des actions envoy�s par la vue
 * 
 * @author C�lian Veyssi�re
 * @version 0.0.6
 * @since 2011.02.04
 * @license : <a href="http://www.gnu.org/licenses/gpl-3.0.html">GPL3</a>
 */
public class Calc {

	private CalculatriceFrame frame;
	private boolean virgule;
	private boolean pourcent;
	private boolean signe;
	private boolean egale;
	private boolean resultat;
	
	private String val;
	private double calc;
	private ActionEnum operateur;
	
	/**
	 * Initalise la calculatrice
	 * @param calculatriceFrame
	 */
	public Calc(CalculatriceFrame calculatriceFrame) {
		this.frame = calculatriceFrame;
		initialise();
		etat();
	}
	
	/**
	 * R�-initalise toutes les informations
	 */
	private void initialise() {
		effacerInfos();
		this.calc = 0.0;
		this.val = "0";
		this.operateur = RIEN;
		afficher();
		this.resultat = false;
	}
	
	/**
	 * Efface juste les informations n�cessaires pour une valeur courante
	 */
	private void effacerInfos() {
		this.signe = false;
		this.virgule = false;
		this.pourcent = false;
		this.egale = false;
	}
	
	/**
	 * Distribue les actions en fonction de l'action envoy�e
	 * @param action action effectu�e
	 */
	public void action(ActionEnum action) {
		if (action.ordinal() < 10) {
			if (egale) {
				initialise();
			}
			if (resultat) {
				effacerInfos();
				val = "0";
				resultat = false;
			}
			ajout(String.valueOf(action.ordinal()));
			resultat = false;
		} else {
			switch(action) {
				case EGALE : 
					egale (); 
					break;
				case CE :
					initialise();
					break;
				case BACK : 
					backsuppr();
					break;
				case PLUS :
				case DIV :
				case MULT : 
				case MOINS : 
					operation(action);
					//afficher();
					break;
				case VIRGULE : 
					if (egale) {
						initialise();
					}					
					if(!virgule) {
						effacerInfos();
						virgule = true;
						if (resultat) ajout("0");
						ajout(",");
					} 
					break;
				case PLUSMOINS : 
					if(!egale) {
						signe = !signe;
						afficher();
					}
					break;
				case POURCENT :
					if(!egale) {
						pourcent = !pourcent;
						afficher();
					}
					break;
				default : ;
			}
		}
		etat();
	}

	
	/**
	 * calcule le r�sulat et l'affiche
	 */
	private void egale() {
		//if (!egale) {
			calculer();
			//effacerInfos();
			virgule = false;
			afficher(calc);
			egale = true;
		//}
	}

	/**
	 * retourne la chaine en valeur num�rique
	 * @return la valeur affich�e
	 */
	private double courant() {
		return Double.valueOf(val.replace(",", "."));
	}
	
	
	/**
	 * �ffecter la demande d'operation, si c'est possible
	 * @param action  
	 */
	private void operation(ActionEnum action) {
		/*if(egale) {
			effacerInfos();
			operateur = action;
			egale = false;
		} else {*/
			if(resultat == false) {
				if (operateur != null) {
					calculer();
				} else {
					calc = courant();
				}
				//effacerInfos();
				operateur = action;
			} else {
				operateur = action;
				egale = false;
			}
		//}
	}
	
	
	/**
	 * effectue le calcule suivant l'op�rateur
	 */
	private void calculer() {
		double negatif = signe ? -1.0 : 1.0;
		double facteur = pourcent ? 100.0 : 1.0;
		
		double valeur = !pourcent ? courant() : calc * courant();
		
		switch (operateur) {
			case PLUS :
				calc += negatif * valeur/ facteur;
				break;
			case MOINS :
				calc -= negatif * valeur/ facteur;
				break;
			case MULT :
				calc *= negatif * valeur/ facteur;
				break;
			case DIV :
				calc /= negatif * valeur/ facteur;
				break;
			default :
				calc = negatif * valeur / facteur;
		}
		resultat = true;
		afficher(calc);
	}

	
	/**
	 * suppression arri�re, et affichage
	 */
	private void backsuppr() {
		if(!egale) {
			if ( val.length() == 1) {		
				val = "0";
			} else {
				int pos = val.length()-1;
				
				if (val.charAt(pos) == ',') {
					virgule = false;
				}
				val = val.substring(0, pos);
			}
			afficher();
		}
	}

	
	/**
	 * Ajout la valeur, et affichage
	 * @param num une cha�ne � ajouter � l'affichage
	 */
	private void ajout(String num) {
		
		// supprimer le premier z�ro si n�cessaire
		if (resultat || val.equals("0") && !num.equals(",")) { 
			val = "";
			resultat = false;
		}
		// ajouter la valeur en fin
		val = val + num;
		afficher();
		
	}

	/* ************** retour cadran ************** */
	
	/**
	 * Envoie l'affichage � la vue de la valeur en m�moire
	 */
	private void afficher() {
		frame.affiche(
			(signe ? "-" : "") + 
			val.replace(".", ",") + 
			(pourcent ? ("% ("+ pourcent() + ")") : "")
		);
	}
	
	/**
	 * Affichage de la partie des poucentages
	 * @return le calcule en pourcent part rapport � la valeur pr�c�dente
	 */
	private double pourcent() {
		double negatif = signe ? -1.0 : 1.0;
		double facteur = pourcent ? 100.0 : 1.0;
		return negatif * calc * courant() / facteur;
	}

	/**
	 * Envoie l'affichage � la vue 
	 * @param r
	 */
	private void afficher(double r) {
		frame.affiche(String.valueOf(r).replace(".", ","));
	}
	
	/* ************** retour bouton ************** */
	
	/**
	 * Change l'�tat des boutons en fonction de l'�tat de diff�rents param�tres
	 */
	private void etat() {
		etatBouton(VIRGULE, !virgule );
		etatBouton(PLUSMOINS, !egale && !resultat);
		etatBouton(POURCENT, !egale && !resultat);
		etatBouton(BACK, !egale && !val.equals("0") && !resultat);
		etatBouton(CE, !(calc == 0 && val.equals("0") && !signe && !virgule));
		
		// si on veut que les boutons ne soit pas reclicable, vu que �a ne fait rien
		
		//etatBouton(MOINS, !resultat || operateur != MOINS);
		//etatBouton(PLUS,  !resultat || operateur != PLUS);
		//etatBouton(MULT,  !resultat || operateur != MULT);
		//etatBouton(DIV,   !resultat || operateur != DIV);
	}
	
	/**
	 * Change l'�tat d'un bouton
	 * @param num le bouton
	 * @param etat l'�tat (activ� ou non)
	 */
	private void etatBouton(ActionEnum num, boolean etat) {
		frame.changer(num, etat);
	}
	
}
