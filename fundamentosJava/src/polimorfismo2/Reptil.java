package polimorfismo2;

public class Reptil extends Animal{
    private String corEscama;

    public Reptil(String nome, int peso, int idade, int membros, String corEscama) {
        super(nome, peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String locomover() {
        System.out.println("Rastejando");
        return locomover();
    }

    @Override
    public String alimentar() {
        System.out.println("Mastigando");
        return alimentar();
    }

    @Override
    public String emitirSom() {
        System.out.println("Emite som de Reptil");
        return emitirSom();
    }

    public String getCorEscama() {
        return corEscama;
    }
}
