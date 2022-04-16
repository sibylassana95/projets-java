package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nom =new Scanner(System.in);
	    System.out.println("Entrez un nom!");
        String nom1=nom.next();
     
        System.out.println("Entrez un autre nom!");
        String nom2=nom.next();
        System.out.println("Entrez un autre nom!");
        String nom3=nom.next();

        if (nom1 ? nom2:nom3 ){
            System.out.println("ces noms sont clasées alphabetiquement");
        } else System.out.println("Ces noms ne sont pas clasées alphabetiquement");


    }
}
