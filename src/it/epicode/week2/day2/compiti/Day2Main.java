package it.epicode.week2.day2.compiti;

import java.util.HashSet;
import java.util.Scanner;

public class Day2Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci un numero intero N");
        int N = scanner.nextInt();
        scanner.nextLine();


        HashSet<String>parole=new HashSet<>();
        HashSet<String>paroleduplicate=new HashSet<>();


        for (int i=0; i<N; i++){
            System.out.println("inserisci la parola #" + (i+1) + ": ");
            String parola = scanner.nextLine();
            if (!parole.add(parola))
            {paroleduplicate.add(parola);
                System.out.println("Parola duplicata: "+parola);}
                    }

        System.out.println("Parole duplicate: " + paroleduplicate);
        System.out.println("Numero di parole distinte: "+parole.size());
        System.out.println("Elenco delle paroledistinte: "+parole);

    }
}
