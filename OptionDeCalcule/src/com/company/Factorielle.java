package com.company;

import java.util.Scanner;

public class Factorielle {
    public void Factorielle() {
        System.out.println("Entrez un nombre!");
        Scanner nbr = new Scanner(System.in);
        int nombre = nbr.nextInt();
        int factorielle = 1;
        int i;
        for (i = 1; i < nombre; i++) {
            int fac = factorielle * i + factorielle;

            System.out.print(i + "x");
            System.out.println(fac+ " "+"est factorielle de " + nombre);
        }


    }
}
