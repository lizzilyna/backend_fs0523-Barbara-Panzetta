package it.epicode.week1.day3.compiti;

public class UsaRettangolo {
    public static void main(String[] args) {
        rettangolo rettangolo=new rettangolo();
        rettangolo rettangolo1=new rettangolo();

    int x= rettangolo.setLatoLungo(19);
    int y= rettangolo.setLatoCorto(10);
    int z= rettangolo1.setLatoCorto1(15);
    int w= rettangolo1.setLatoLungo1(21);


    rettangolo.stampaRettangolo(x,y);
    rettangolo.stampa2Rettangoli(x, y, z, w);



    }

}
