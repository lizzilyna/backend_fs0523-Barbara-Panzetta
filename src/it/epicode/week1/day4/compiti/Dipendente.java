package it.epicode.week1.day4.compiti;

public class Dipendente {
    private double stipendioBase;
    private double stipendio;
    private String matricola;
    private double ImportoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;


    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        this.stipendio=stipendioBase;
        this.ImportoOrarioStraordinario=30;
        this.livello=Livello.OPERAIO;

    }

    public Dipendente(double stipendioBase, double stipendio, String matricola, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.stipendioBase = stipendioBase;
        this.stipendio = stipendio;
        this.matricola = matricola;
        ImportoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getImportoOrarioStraordinario() {
        return ImportoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        ImportoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public static void StampaDatiDipendente(Dipendente datiOperaio)     {
        System.out.println("Stipendio base: "+datiOperaio.stipendioBase);
        System.out.println("Matricola: "+datiOperaio.matricola);
        System.out.println("Stipendio:"+datiOperaio.stipendio);
        System.out.println("Importo orario straordinario: "+datiOperaio.ImportoOrarioStraordinario);
        System.out.println("Livello: "+datiOperaio.livello);
        System.out.println("Dipartimento: "+datiOperaio.dipartimento);
    }

    public Livello Promuovi () {
        if (Livello.OPERAIO == livello) {
            livello = Livello.OPERAIO;
            System.out.println("Sei stato promosso a impiegato!");
        }
        return livello;
    }

}



