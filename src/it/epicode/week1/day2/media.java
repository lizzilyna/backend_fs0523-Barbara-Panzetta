package it.epicode.week1.day2;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        int[] numeri = new int[10];

        int i = 0;

        int somma = 0;

        while (i < numeri.length) {//per ogni posizione dell'array metto un numero che mi dà l'utente
            System.out.println("dammi un numero");
            numeri[i] = scanner.nextInt();
            i++;
        }


        for (int j = 0; j < numeri.length; j++) {
            somma += numeri[j];
        }
double media=(double)somma/numeri.length;
        System.out.println(media);

------------------
Ora senza array:
    */

        int i=0;
        double somma=0;

        while (i<10){
            System.out.println("dammi un numero");
            somma += scanner.nextInt();
            i++;
        }

    double media= somma/10;
        System.out.println(media);

    }
}