package polimorfismo2;

public class Peixe extends Animal{
    private String corEscama;

    public Peixe(String nome, int peso, int idade, int membros, String corEscama) {
        super(nome, peso, idade, membros);
        this.corEscama = corEscama;
    }

//METODO PROPRIO
    public void soltaBolha(){
        System.out.println("Solta bolha");
    }

    @Override
    public String locomover() {
        System.out.println("Nadando");
        return locomover();
    }

    @Override
    public String alimentar() {
        System.out.println("Substancias");
        return alimentar();
    }

    @Override
    public String emitirSom() {
        System.out.println("Não emite som aparente");
        return emitirSom();
    }

    public String getCorEscama() {
        return corEscama;
    }
}

