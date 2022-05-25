package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Entrez un nombre");
        Scanner nbr=new Scanner(System.in);
        int nombre= nbr.nextInt();
        int i ;
        int somme = 0;

        for (i=1;i <=nombre;i++){
            somme=somme+i;

        }System.out.println("le resultat est:"+somme);

    }
}
