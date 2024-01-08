package it.epicode.week1.day1;

import java.util.Scanner;

public class perimetroRettangolo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi due numeri");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int perimetroRettangolo=perimetroRettangolo(x, y);

        System.out.println(perimetroRettangolo);


    }




public static int perimetroRettangolo (int x, int y) {
    int perimetroRettangolo=(x+y)*2;
    return perimetroRettangolo;
}


}



