package it.epicode.week1.day3.compiti;

public class rettangolo {

    private int latoLungo;
    private int latoCorto;


   /* public rettangolo (int latoLungo, int latoCorto)
    {
        this.latoCorto=latoCorto;
        this.latoLungo=latoLungo;
    }
*/
    public int getLatoLungo ()
    {
        return latoLungo;
    }

    public int getLatoCorto ()
    {
        return latoCorto;
    }

    public int setLatoLungo (int latoLungo)
    {
        this.latoLungo=latoLungo;
        return latoLungo;
    }

    public int setLatoCorto (int latoCorto)
    {
        this.latoCorto=latoCorto;
        return latoCorto;
    }

    public int setLatoLungo1 (int latoLungo1)
    {
        this.latoLungo=latoLungo1;
        return latoLungo1;
    }

    public int setLatoCorto1 (int latoCorto1)
    {
        this.latoCorto=latoCorto;
        return latoCorto;
    }





    public void stampaRettangolo (int latoCorto, int latoLungo)
    {
        System.out.println("l'area è pari a " + (latoCorto*latoLungo)+ " mentre il perimetro è pari a "+ (latoCorto+latoLungo)*2);}


    public void stampa2Rettangoli (int latocorto, int latoLungo, int latoCorto1, int latoLungo1)
    {
        System.out.println("l'area del primo rettangolo è pari a " + (latoCorto*latoLungo)+ " mentre il suo perimetro è pari a "+ (latoCorto+latoLungo)*2);
        System.out.println("l'area del secondo rettangolo è pari a " + (latoCorto1*latoLungo1)+ " mentre il suo perimetro è pari a "+ (latoCorto1+latoLungo1)*2);
        System.out.println("le due aree sommate sono pari a " + ((latocorto*latoLungo)+(latoCorto1*latoLungo1))+ ". I due perimetri sommati sono pari a " + ((latoCorto+latoLungo)*2)+(latoCorto1+latoLungo1)*2);;
    }



}
