package com.company;

import java.util.Scanner;

class Exercice3 {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombre de Chevaux partants : ");
        int n = clavier.nextInt();
        System.out.print("Entrez le nombre de Chevaux joués : ");
        int p = clavier.nextInt();
        int fn = 1;
        for (int i=1 ; i <= n ;i++){
            fn = fn * i;
        }
        System.out.println("Le factorielle de n  est " + fn);
        int fp= 1;
        for (int i=1 ; i <= p ;i++){
            fp = fp * i;
        }
        System.out.println("Le factorielle de p est " + fp);

        int fnp = 1;
        int fnp2 = n-p;
        for (int i=1 ; i <= fnp2 ;i++){
            fnp = fnp * i;
        }
        System.out.println("Le factorielle de (n - p)  est " + fnp);

        int x = fn/fnp;
        int y = fn/(fp*fnp);
        System.out.println("Dans l'ordre : une chance  sur " + x + " de ganger");
        System.out.println("Dans désordre : une chance  sur " + y + " de ganger");
    }
}
