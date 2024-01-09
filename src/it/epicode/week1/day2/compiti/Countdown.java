package it.epicode.week1.day2.compiti;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dammi un numero");
        int numero = scanner.nextInt();
        countdown(numero);

    }

    public static void countdown (int cifra) {
        for (int i=cifra; i>=0; i--)
        {
            System.out.println(i);
        }
    }

        }

