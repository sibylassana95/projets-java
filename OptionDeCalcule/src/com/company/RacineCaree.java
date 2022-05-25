package com.company;

import java.util.Scanner;

public class RacineCaree {
    public void RacineCaree (){
        System.out.println("Entrez un nombre");
        Scanner nbr= new Scanner(System.in);
        int A = nbr.nextInt();

        int racine  = (int) Math.sqrt(A);
        System.out.println("La racine carre est:"+racine);
    }
}
