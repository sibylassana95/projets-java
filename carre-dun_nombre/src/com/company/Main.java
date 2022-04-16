package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Entrez un nombre!");
        Scanner nbr=new Scanner(System.in);
        int nombre= nbr.nextInt();
        int carre=nombre*nombre;
        System.out.println("Le carre de ce nombre est:"+carre);
    }
}
