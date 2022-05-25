package com.company;

import java.util.Scanner;

public class surface {
    public void surface(){

        System.out.println("veuillez entrez une longeur");
        Scanner nbr = new Scanner(System.in);
        int longueur = nbr.nextInt();
        System.out.println("veuillez entrez une largeur");
        int largeur = nbr.nextInt();
        int surface = longueur * largeur;
        System.out.println("la surface du rectangle est :"+surface);
    }
}
