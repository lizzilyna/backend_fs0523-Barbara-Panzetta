package it.epicode.week1.day2;

import java.util.Scanner;

public class sconto {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci prezzo");
    double prezzo=scanner.nextDouble();

    double prezzo_scontato;

    if (prezzo<30) {prezzo_scontato=prezzo-(prezzo*12)/100;}
    else {prezzo_scontato=prezzo-(prezzo*25)/100;}

        System.out.println(prezzo_scontato);

    }
}
