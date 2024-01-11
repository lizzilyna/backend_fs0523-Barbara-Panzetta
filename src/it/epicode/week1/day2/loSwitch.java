package it.epicode.week1.day2;

import java.util.Scanner;

public class loSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("Scegli un'opzione tra 1 e 5");
        int scelta = scanner.nextInt();

        /*
if (scelta==1){
    System.out.println("costo biglietto 0£");
} else if (scelta==2)
    System.out.println("costo biglietto 8£");
    }else if (scelta==3)
    */

        switch (scelta){
            case 1:
                System.out.println("biglietto gratuito");
                break;
            case 2:
                System.out.println("costo biglietto 8£");
                break;
            case 3:
                System.out.println("costo biglietto 10£");
                break;
            case 4, 5:
                System.out.println("costo biglietto 15£");
                break;
            default:
                System.out.println("scelta errata");
}



    }
}
