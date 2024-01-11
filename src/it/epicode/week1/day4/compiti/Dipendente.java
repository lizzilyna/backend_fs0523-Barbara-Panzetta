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

    public void StampaDatiDipendente()     {
        System.out.println("Stipendio base: "+stipendioBase);
        System.out.println("Matricola: "+matricola);
        System.out.println("Stipendio:"+stipendio);
        System.out.println("Importo orario straordinario: "+ImportoOrarioStraordinario);
        System.out.println("Livello: "+livello);
        System.out.println("Dipartimento: "+dipartimento);
    }




    public Livello Promuovi () {
        if (Livello.OPERAIO == livello)
        {
            livello = Livello.IMPIEGATO;
            stipendio*=1.2;
            System.out.println("Sei stato promosso a impiegato!");
        } else if
        (Livello.IMPIEGATO==livello) {
            livello = Livello.QUADRO;
            stipendio *= 1.5;
            System.out.println("Sei stato promosso a quadro!");
        } else if
        (Livello.QUADRO==livello) {
            livello = Livello.DIRIGENTE;
            stipendio *= 2;
            System.out.println("Sei stato promosso a dirigente!");
        }else
        {
            System.out.println("Non ci sono più promozioni");
        }



        return livello;
    }

}



