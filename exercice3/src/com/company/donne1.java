package com.company;

import java.util.Scanner;

public class donne1 {
    public void donne1 (){
        System.out.println("Entrez un nombre");
        Scanner nbr= new Scanner(System.in);
        int A = nbr.nextInt();
        System.out.println("Entrez un nombre");
        int B = nbr.nextInt();
        System.out.println(A+B);
    }
}
