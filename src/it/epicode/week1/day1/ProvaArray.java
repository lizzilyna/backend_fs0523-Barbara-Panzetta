package it.epicode.week1.day1;

import java.util.Scanner;

public class ProvaArray {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];
        numeri[0]=1;
        numeri[3]=5;

        for (int i=0; i<numeri.length; i++)
        {
            System.out.println("dammi un numero");
            numeri[i]=scanner.nextInt();
        }


        for (int i=0; i<numeri.length; i++){
            System.out.println(numeri[i]);
        }

String [] giorniSettimana = {"lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato", "domenica"};

    }
}
