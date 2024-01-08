package it.epicode.week1.day1;

import java.util.Scanner;

public class areaTriangolo {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi due numeri");
        int x= scanner.nextInt();
        int y= scanner.nextInt();

        int areaTriangolo= areaTriangolo(x, y);

        System.out.println (areaTriangolo);

    }



public static int areaTriangolo (int x, int y)
{int areaTriangolo=(x*y)/2;
return areaTriangolo;

}}