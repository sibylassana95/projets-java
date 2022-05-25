package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Entrer le nombre de phocophie");
        Scanner nbr = new Scanner(System.in);
        int nombre = nbr.nextInt();

     float PrixTotal;
        if (nombre <= 10){
            PrixTotal = (float) (nombre*0.10);
            System.out.println(" le prix est :"+PrixTotal );
        }
        else if (nombre <=30){
            PrixTotal = (float) ((10*0.10)+(nombre-10)* (0.09));
            System.out.println(" le prix est :"+ PrixTotal);
        }
        else {
            PrixTotal = (float) ((10*0.10+20*0.09)+(nombre-30)* (0.08));
            System.out.println(" le prix est :"+ PrixTotal);
        }
    }
}
