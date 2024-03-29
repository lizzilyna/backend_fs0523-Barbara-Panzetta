package it.epicode.week1.project;

public class Video extends Multimedia implements Player{


    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita=luminosita;
    }


    public void alzaVolume (int volume) {
        if (this.volume + volume <= 100) {
            this.volume += volume;
        } else {
            System.out.println("Il volume è già al massimo!");
        }

    }
    public void abbassaVolume (int volume) {
        if (this.volume - volume>=0 ) {
            this.volume -= volume;
        }else {
            System.out.println("Il volume è già al minimo!");
        }

    }

            public void play () {
                for (int i = 0; i < durata; i++) {
                    System.out.print(titolo);
                for (int j = 0; j < volume; j++) {
                     System.out.print("!");}
                for (int x=0; x<luminosita; x++) {
                     System.out.print("*");
                }
                    System.out.println();
            }



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

}}}

