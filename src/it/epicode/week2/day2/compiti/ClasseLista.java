package it.epicode.week2.day2.compiti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClasseLista {

    public static List<Integer>metodoLista(int N){
        ArrayList<Integer>listaCasuale=new ArrayList<>();
        Random random= new Random();

        for (int i=0; i<N; i++) {
            listaCasuale.add(random.nextInt(101));
        }

        return listaCasuale;
    }
}
