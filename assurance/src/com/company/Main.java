package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
String situation;
boolean c1;
        boolean c2;
        boolean c3;
        Scanner nbr=new Scanner(System.in);
        System.out.println("Entrez votre age");
        int age =nbr.nextInt();
        System.out.println("Entrez le nombre d'annes de permis ");
        int permis =nbr.nextInt();
        System.out.println("Entrez le nombre d'accident");
        int accident =nbr.nextInt();
        System.out.println("Entrez le nombre d'annes d'assurance");
        int assurance =nbr.nextInt();
        c1 = age>=25;
        c2=permis>=2;
        c3= assurance>5;
        if (c1 && c2) {
            if (accident == 0){
                situation="rouge";

            }
            else situation="refusé";
        }
        else if ((c1 && c2 )||(c1 && c2)){
            if (accident==0){
                situation="orange";
            }else if (accident==1){
                situation="rouge";
            }
            else situation="refugé";
        }
        if (accident==0) {
            situation="vert";
        }
        else if (accident==1){
            situation="orange";
        }
        else if (accident==2){
            situation="rouge";
        }
        else situation="refugé";
        if (c3){
            if (situation=="rouge"){
                situation="orange";
            }
            else if (situation=="orange"){
                situation="vert";
            }
            else if (situation=="vert"){
                situation="bleu";
            }
        }
        System.out.println("votre situation:"+ situation);
    }

}
