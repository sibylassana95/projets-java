package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nbr=new Scanner(System.in);
	System.out.println("Entrez le score du candidat 1");
	    int candidat1=nbr.nextInt();
        System.out.println("Entrez le score du candidat 2");
        int candidat2=nbr.nextInt();
        System.out.println("Entrez le score du candidat 3");
        int candidat3=nbr.nextInt();
        System.out.println("Entrez le score du candidat 4");
        int candidat4=nbr.nextInt();
        System.out.println("candidat1:"+candidat1 +" candidat2 "+candidat2+" candidat3 "+candidat3+" candidat4 "+candidat4);
        boolean C1= candidat1 >50;
        boolean C2=candidat2 >50 || candidat3>50 ||candidat4>50;
        boolean C3=candidat1 >=candidat2 && candidat1>=candidat3 && candidat1>=candidat4;
        boolean C4=candidat1>=12.5;
        if (C1){ System.out.println("Elu au premier tour");}
        else if(C2 || C4){System.out.println("Battu , elimine , sortie");}
        else if(C3){System.out.println("Ballotage favorable");}
        else System.out.println("Ballotage défavorable");
    }
}
