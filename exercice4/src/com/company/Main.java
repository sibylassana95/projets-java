package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	System.out.println("Veuillez entrez un nombre");
        Scanner nbr= new Scanner(System.in);
        int nombre = 0;
        do {
            System.out.println("plus petit");
            if (nombre>20){
                System.out.println("Entrez un notre nombre");
            }
            nombre=nbr.nextInt();
        }
        while (nombre>20);
        do {
            System.out.println("plus grand");
            if (nombre<10){
                System.out.println("Entrez un notre nombre");
            }
            nombre=nbr.nextInt();
        }  while (nombre<10);







    }
}
