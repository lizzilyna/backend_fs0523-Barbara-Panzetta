package it.epicode.week1.day3;

public class Automobile {

    private int cilindrata;
    private String marca;
    private String nome;
    private String targa;
    private int porte;

    private TipoAutomobile categoria;

public Automobile (String marca, String nome, String targa, int cilindrata, int porte){
    this.marca=marca;
    this.nome=nome;
    this.targa=targa;
    this.cilindrata=cilindrata;
    this.porte=porte;}

    public void accelera (){
        System.out.println("BRUM BRUM");
    }
        public void rallenta () {
            System.out.println("brum");
        }

        public void stampaCaratteristiche () {      System.out.println("cilindrata: "+cilindrata + ", marca: " + marca + ", nome: " + nome + categoria);}

    public String getMarca(){return marca;}
    public int getCilindrata (){return cilindrata;}
    public String getNome (){return nome;}
    public String getTarga (){return targa;}
    public void setNome (String nome) {this.nome=nome;}

    public static boolean confrontaTarghe(Automobile a1, Automobile a2){
    if (a1!=null&&a2!=null) {
        if (a1.getTarga().equals(a2.getTarga())) {
            return true;
        }

    }

    return false;
}
}

