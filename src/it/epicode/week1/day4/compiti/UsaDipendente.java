package it.epicode.week1.day4.compiti;

public class UsaDipendente {
    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente(1000.00, 1200.00, "TA288587", 30.00, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);


            dipendente.StampaDatiDipendente();
            dipendente.Promuovi();
    }
}
