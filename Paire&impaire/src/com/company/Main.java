package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("veuillez entrez un autre nombre ");
        Scanner nbr= new Scanner(System.in);
        int nombre = nbr.nextInt();
        if (nombre % 2 ==0  ) {
            System.out.println("le nombre est paire ");
        }
        else  System.out.println("le nombre est impaire ");






    }
}
