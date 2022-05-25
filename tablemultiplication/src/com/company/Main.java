package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("veuillez entrez un nombre");
        Scanner nbr = new Scanner(System.in);
        int A = nbr.nextInt();
        int i ;
        for (i=1; i<=10; i++){
            int B = A * i;
            System.out.println(A+"x"+i+"="+B);
        }
    }
}
