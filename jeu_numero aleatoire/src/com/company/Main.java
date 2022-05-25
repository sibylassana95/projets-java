package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int nombre_secret, nombre_user;
        Scanner nbr=new Scanner(System.in);
        nombre_secret=(int)(Math.random()*999)+1;//de 1-1000
        do{
            System.out.print("Entrez un nombre(1-1000):");
            nombre_user= nbr.nextInt();
            if(nombre_user==nombre_secret){
                System.out.println("Felicitation!!!");

            }
            else if(nombre_user > nombre_secret){
                System.out.println("Votre nombre est trop grand");
            }
            else{
                System.out.println("Votre nombre est trop petit");
            }
        } while(nombre_user!=nombre_secret);
    }
}
