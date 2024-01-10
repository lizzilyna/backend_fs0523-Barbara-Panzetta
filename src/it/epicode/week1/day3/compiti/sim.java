package it.epicode.week1.day3.compiti;

public class sim {

    private int numero;
    private double costo;
    private double credit;
    private String[] registro;


    public sim(int numero, double costo, double credit, String[] registro) {
        this.numero = numero;
        this.costo = costo;
        this.credit = credit;
        this.registro = registro;
    }

    public int getNumero() {
        return numero;
    }

    public double getCosto() {
        return costo;
    }

    public double getCredit() {
        return credit;
    }

    public String[] getRegistro() {
        return registro;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public static void StampaDati () {}

}
