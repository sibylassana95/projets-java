package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("veillez entrer un age de l'enfant  ");
        Scanner nbr =new Scanner(System.in);
        int age = nbr.nextInt();
        if (age >=12){
            System.out.println("Cadet");
        }
        else if (age >=10){
            System.out.println("minime");
        }
        else if (age >=8){
            System.out.println("pupille");
        }
        else if (age >=6){
            System.out.println("poussin");
        }

    }
}
