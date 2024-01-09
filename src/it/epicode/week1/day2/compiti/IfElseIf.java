package it.epicode.week1.day2.compiti;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dammi una parola");
        String x =scanner.nextLine();

     pariDispari(x);
        System.out.println(true?"pari":"dispari");

        }

public static boolean pariDispari (String y){
        if (y.length() % 2 == 0){return true;

    }else {return false;

    }


}

    }

