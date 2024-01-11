package it.epicode.week1.day4;

public class ContrattoMobile extends ContrattoTelefonico{

    private final double COSTO_ALLA_RISPOSTA;

    public ContrattoMobile (int numeroTel, String utente, double COSTO_AL_SECONDO, double COSTO_ALLA_RISPOSTA) {
        super(numeroTel, utente, COSTO_AL_SECONDO);
        this.COSTO_ALLA_RISPOSTA=COSTO_ALLA_RISPOSTA;}

    //ora devo fare l'override, cioè sovrascrivere un metodo delle superclasse. Dobbiamo aggiungere il costo alla risposta


    @Override //verifica che la firma sia identica
    public void aggiornaBolletta(int secondi) {
        super.aggiornaBolletta(secondi);
        aggiungiCosti(COSTO_ALLA_RISPOSTA);

    }
}
