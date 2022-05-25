package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("entrez le 1ere Nom ");
        // recupérer les données saisies au clavier
        Scanner NOM= new Scanner(System.in);
       String nom1 = NOM.next();
        System.out.println("entrez le 2eme Nom ");
      String nom2 = NOM.next();
      if (nom1.length()>nom2.length()){
  System.out.println(nom1+" est plus long");

    }
      else  System.out.println(nom2+" est plus long");
}
}