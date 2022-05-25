package com.company;

import java.util.Scanner;

public class condition {

    public void condition(){

        donne1 valeur1=new donne1();
        donne2 valeur2=new donne2();
        donne3 valeur3=new donne3();
        doone4 valeur4=new doone4();
        System.out.println("Entrez un operateur");
        Scanner nbr= new Scanner(System.in);
        String C = nbr.next();
        String Somme="+";
        String Soustraction="-";
        String division="/";
        String multiplication="*";

        //les conditions
        if(C.equals(Somme)){
            valeur1.donne1();
        }
        else if (C.equals(Soustraction)){
            valeur2.donne2();
        }
        if (C.equals(division)){
            valeur3.donne3();
        }
        if(C.equals(multiplication)){
            valeur4.donne4();
        }

    }
}
