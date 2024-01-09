package it.epicode.week1.day2.compiti;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Traslittera {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dammi una cifra da zero a tre");
        int cifra = scanner.nextInt();

        traslittera(cifra);
    }

    public static void traslittera (int numero) {
        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("risposta non valida");
        }

    }

}
