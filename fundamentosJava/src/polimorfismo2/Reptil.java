package polimorfismo2;

public class Reptil extends Animal{
    private String corEscama;

    public Reptil(String nome, int peso, int idade, int membros, String corEscama) {
        super(nome, peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String locomover() {
        return null;
    }

    @Override
    public String alimentar() {
        return null;
    }

    @Override
    public String emitirSom() {
        return null;
    }

    public String getCorEscama() {
        return corEscama;
    }
}
