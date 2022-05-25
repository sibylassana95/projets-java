package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double delta,X1,X2;
        X1=X2=0;
        System.out.println("Vous aller resoudre une equation de 2 degré sous la forme(ax²+bx+c)!!");
        System.out.println("veuillez entrer un nombre A");
        Scanner nbr=new Scanner(System.in);
         double a =nbr.nextInt();
        System.out.println("veuillez entrer un nombre B");
        double b =nbr.nextInt();
        System.out.println("veuillez entrer un nombre C");
        double c =nbr.nextInt();
        System.out.println("vous avez choisie:"+a+ " " +b+ " " + c);

        delta=(b*b)-4*(a*c);
        System.out.println("Delta egale à :" + delta);
        if(delta<0)
        {
            System.out.println("impossible de resoudre cette equation");
        }
        else if(delta==0)
        {
            X1=X2=(-b)/(2*a);
            System.out.println("X1 = X2 egale à :" + X1 + "  " + X2);
        }
        if(delta>0)
        {
            System.out.println("La racine Carrée de Delta egale à :" + Math.sqrt(delta));
            System.out.println("tout vas bien");
            X1=((-b+Math.sqrt(delta))/(2*a));
            X2=((-b-Math.sqrt(delta))/(2*a));
            System.out.println("X1 et X2 egale à :" + X1 + "  " + X2);
        }
        System.out.println("**Fin de Programme***");

    }
}
