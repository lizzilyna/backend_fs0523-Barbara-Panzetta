package it.epicode.week1.day3;

public class UsaAutomobile {
    public static void main(String[] args) {
        Automobile auto = new Automobile("Fiat", "500", "TA288587", 1500, 3);

       /*
       auto.cilindrata=1500;
        auto.marca="Fiat";
        auto.nome="500";
        auto.porte=3;
        auto.targa="TA288587";

        */


/*auto.categoria=TipoAutomobile.SUV;

        System.out.println("cilindrata: "+auto.cilindrata + ", marca: " + auto.marca + ", nome: " + auto.nome + auto.categoria);
*/
        auto.accelera();
        auto.rallenta();

        Automobile auto2 = new Automobile("Fiat", "500", "TA288587", 1500, 5);

       /* System.out.println("cilindrata: " +auto2.cilindrata);

        Automobile auto3 = auto;
        auto3.cilindrata=1300;

        System.out.println(auto.cilindrata);
        System.out.println(auto==auto2);
        System.out.println(auto==auto3);*/
        System.out.println(auto.equals(auto2));

        auto.stampaCaratteristiche();
        auto2.stampaCaratteristiche();
        auto.setNome("Ford");
        System.out.println(auto.getNome());

    }
}
