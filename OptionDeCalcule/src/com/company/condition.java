package com.company;

import java.util.Scanner;

public class condition {
    public void condition(){

       RacineCaree valeur1=new RacineCaree();
        Factorielle valeur2=new Factorielle();
        surface valeur3=new surface();
        perimetre valeur4= new perimetre();

         String racine= "1:Racine carre";
         String fact="2:factorielle ";
         String surf="3:surface";
         String peri="4:Perimettre";
        String ligne= System.getProperty("line.separator");
        String resultat= racine+ligne+fact+ligne+surf+ligne+peri;

         System.out.println("Entrer un opererateur:");

         System.out.println(resultat);
        Scanner nbr= new Scanner(System.in);
        String C = nbr.next();
        String racinecarre="1";
        String factorielle="2";
        String surface="3";
        String perimettre="4";

        //les conditions
        if(C.equals(racinecarre)){
            System.out.println("Vous avez choisi la calcule du Racine Carrée");
            valeur1.RacineCaree();
        }
        else if (C.equals(factorielle)){
            System.out.println("Vous avez choisi la calcul du factorielle");
            valeur2.Factorielle();
        }
       else if (C.equals(surface)){
            System.out.println("Vous avez choisi la calcul du surface" );
            valeur3.surface();
        }
        else if(C.equals(perimettre)){
            System.out.println("Vous avez choisi la calcul du perimettre");
            valeur4.perimetre();
        }



    }
}
