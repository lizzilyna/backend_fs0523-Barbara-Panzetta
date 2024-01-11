package it.epicode.week1.day2;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class bolletta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci consumo");
        int consumo = scanner.nextInt();

        double bolletta = 20;

        if (consumo <= 100) {
            bolletta = bolletta + consumo * 2.5;
        } else {
            bolletta += 250 + (consumo - 100) * 4;
        }


        System.out.println(bolletta);
    }
}
