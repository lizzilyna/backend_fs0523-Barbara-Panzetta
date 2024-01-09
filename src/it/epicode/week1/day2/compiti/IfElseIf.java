package it.epicode.week1.day2.compiti;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dammi una parola");
        String x =scanner.nextLine();

     pariDispari(x);

        }

public static String pariDispari (String y){
        if (y.length() % 2 == 0){
        System.out.println("La parola contiene un numero pari di caratteri.");
    }else {
        System.out.println("La parola contiene un numero dispari di caratteri.");
    }

    return y;
}

    }

