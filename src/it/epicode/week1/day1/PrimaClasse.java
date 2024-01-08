package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("dammi un numero");
        int j = scanner.nextInt();

        System.out.println(j);

        scanner.nextLine();//serve per prevenire un errore tra nextInt e nextLine;
        System.out.println("dammi una parola");
        String gn=scanner.nextLine();
        System.out.println(gn.length());

        System.out.println(gn);


        //commento monoriga

        /*commento su
        più righe
         */

        /**
        commento javadoc,
        estraibile
        */

        int x;

        x=8;

        short s=9;
        float n=3.5f;
        double d=3.5;

        String frase = "corso Java";
        String frase2= "Epicode";
        String fraseConcatenata=frase+frase2;

        System.out.println (fraseConcatenata);
        System.out.print ("ciao");

        int z =s;
        float f2=z;

        System.out.println(z);
        System.out.println(f2);

        z=z/6;
        z++;

        //darà sempre il tipo originario, cioè un intero; 9/6 viene 1

        System.out.println(z);


       double somma= somma( 4, 5);

       System.out.println(somma);

       benvenuto("Antonio");
       benvenuto("Vincenzo");


    }

    public static double somma(double x, double y) {
        double somma = x + y;
        return somma;
    }

    public static void benvenuto (String nome) {
        System.out.println("Benvenuto "+ nome);
    }


}
