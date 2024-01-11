package it.epicode.week1.day4;

public class UsaContrattoTelefonico {

    public static void main(String[] args) {


        ContrattoTelefonico cm = new ContrattoMobile(325475426, "Edoardo Conte", 0.01, 0.02 );

        ContrattoTelefonico cm2 = new ContrattoMobile(325475426, "Edoardo Conte", 0.01, 0.02 );

        ContrattoMobile cm3 = (ContrattoMobile) cm2; //ho fatto un downcast



        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        cm.aggiornaBolletta(60);


    }
}
