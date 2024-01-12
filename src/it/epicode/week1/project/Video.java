package it.epicode.week1.project;

public class Video extends Multimedia implements Player{


    private int volume;

    public Video(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
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
        for (int i=0; i<durata; i++) {
            System.out.print(titolo);
        for (int j=0; j<volume; j++) {
            System.out.print("!");
        }
        }

    }

}

