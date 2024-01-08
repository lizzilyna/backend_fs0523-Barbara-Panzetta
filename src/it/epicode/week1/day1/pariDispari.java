package it.epicode.week1.day1;

import java.util.Scanner;

public class pariDispari {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero");
        int x = scanner.nextInt();
pariDispari(x);
    }

    public static void pariDispari(int x) {
        if (x % 2 == 0) {
            System.out.println("il numero è pari");
        } else {
            System.out.println("il numero è dispari");
        }
    }
}