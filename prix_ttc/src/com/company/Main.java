package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nbr=new Scanner(System.in);
	System.out.println("Entrez le prix hors taxe");
	int prixhorstaxes=nbr.nextInt();
	System.out.println("Entrez le nombre d'article");
	int articles=nbr.nextInt();
	System.out.println("Entrez le taux de TVA");
	int taux=nbr.nextInt();
	int prix_ttc=prixhorstaxes*articles*(1+taux);
	System.out.println("le prix TTC est:"+prix_ttc);
    }
}
