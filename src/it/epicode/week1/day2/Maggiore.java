package it.epicode.week1.day2;

import java.util.Scanner;

public class Maggiore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("primo valore");
        int a = scanner.nextInt();
        System.out.println("secondo valore");
        int b = scanner.nextInt();
        System.out.println("terzo5 valore");
        int c = scanner.nextInt();

        int maggiore = maggiore(a, b, c);

        System.out.println(maggiore);

    }


    public static int maggiore (int n1, int n2, int n3){
       /* if
        (n1>=n2 && n1>=n3){
            return n1;
        } else if
        (n2>=n1 && n2>=n3) {
            return n2;
        }
        else {return n3;}

        questo era bello ma quello dopo (che non ho capito) funziona meglio

        */


        int max;
        if (n1>n2){max=n1;
        }else {
            max=n2;
        }
        if (max<n3){
            max=n3;}
        return max;
    }
}


