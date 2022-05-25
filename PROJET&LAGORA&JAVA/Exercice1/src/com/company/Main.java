package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*un programme qui multiplie deux entiers possitif a et b selon
        le principe recrusif suivant
        a*b=a*(b-1)+a si b est impaire
        a*b=(2*a)*(b/2) si b est pair et different de O
         */
     System.out.println("veuillez entrez un nombre ");
        Scanner nbr= new Scanner(System.in);
        int a = nbr.nextInt();
        System.out.println("veuillez entrez un autre nombre ");
        int b = nbr.nextInt();
         int C = a * (b - 1) + a;
         int D= (2*a)*(b/2);
        if (b % 2 ==0  ) {
        System.out.println("le nombre est paire "+D);
        }
        else if(b % 2 !=0  )  {
            System.out.println("le nombre est impaire= "+C);

        }




    }
}
