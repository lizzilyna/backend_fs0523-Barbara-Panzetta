package it.epicode.week1.project;

abstract class Multimedia {
protected String titolo;
protected int durata;

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public Multimedia(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;



    }
}


