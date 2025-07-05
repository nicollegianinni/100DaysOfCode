package polimorfismo2;

public class Ave extends Animal{
    private String corPena;

    public Ave(String nome, int peso, int idade, int membros, String corPena) {
        super(nome, peso, idade, membros);
        this.corPena = corPena;
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

    public String getCorPena() {
        return corPena;
    }


}
