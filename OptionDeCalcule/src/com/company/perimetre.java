package com.company;

import java.util.Scanner;

public class perimetre {
    public void perimetre(){

        System.out.println("veuillez entrez une longeur");
        Scanner nbr = new Scanner(System.in);
        int longueur = nbr.nextInt();
        System.out.println("veuillez entrez une largeur");
        int largeur = nbr.nextInt();
        int perimetre = (longueur + largeur)*2 ;
        System.out.println("le perimetre du rectangle est :"+perimetre);
    }
}
