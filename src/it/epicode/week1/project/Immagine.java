package it.epicode.week1.project;

public class Immagine {
    private int luminosita;
    private String titolo;


    public Immagine(String titolo, int luminosita) {
        this.luminosita = luminosita;
        this.titolo = titolo;
    }

    public void aumentaLuminosita (int luminosita) {
        if (this.luminosita + luminosita <= 100) {
            this.luminosita += luminosita;
        } else {
            System.out.println("La luminosità è già al massimo!");
        }

    }
    public void diminuisciLuminosita (int luminosita) {
        if (this.luminosita - luminosita>=0 ) {
            this.luminosita -= luminosita;
        }else {
            System.out.println("La luminosità è già al minimo!");

        }
}
    public void show ()
    {
        System.out.print(titolo);
        for (int i=0; i<luminosita; i++){
            System.out.print("*");
        }
        System.out.println();
    }



}
