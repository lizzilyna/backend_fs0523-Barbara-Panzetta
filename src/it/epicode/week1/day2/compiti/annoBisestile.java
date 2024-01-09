package it.epicode.week1.day2.compiti;

import java.util.Scanner;

public class annoBisestile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dammi un anno");
        int anno= scanner.nextInt();

        annoBisestile(anno);
    }

    public static int annoBisestile (int year) {
        if ((year%4==0) || (year%100==0&&year%400==0)) {
            System.out.println("anno bisestile");}

        else {
                System.out.println("anno non bisestile");
            }

    return year;
}}
