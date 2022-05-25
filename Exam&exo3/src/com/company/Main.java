package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Entrez un nombre de chevaux partant");
        Scanner nbr = new Scanner(System.in);
        int nombre1 = nbr.nextInt();
        System.out.println("Entrez le nombre de cheveau jouer");
        int nombre2 = nbr.nextInt();
        int X = 0;
        int Y=0;
        int factorielle=1;
        int i;
        for (i=1;i<=nombre1 ;i++) {
            int fac=factorielle*i+factorielle;

            X = nombre1 / (nombre1 - nombre2);
            Y =nombre1/ (nombre2*nombre1*(nombre1 - nombre2));
        }
        System.out.println("une chance sur"+X+"de gagner");
            System.out.println("une chance sur"+Y+"de gagner");
    }
}
