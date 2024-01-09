package it.epicode.week1.day2.compiti;

import java.util.Scanner;

public class spezzettare {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
       ;
        String parola;


                do{
                    System.out.println("Dammi una parola");
                parola =scanner.nextLine();

               for (int i=0; i<parola.length(); i++)

               {
                   System.out.print(parola.charAt(i));
                   if (i!=parola.length()-1)
                       System.out.println(",");

               }
                }
        while (!parola.equals(":q"));}}
/*
    }
public static void spezzettare (String vocabolo)
{do {
    vocabolo.split("," );
}while (vocabolo.indexOf("!q"));

    System.out.println();}

}
*/