package polimorfismo2;
//Essa classe extendeu a classe abstract Animal em vez de Reptil
public class Tartaruga extends Animal {

    //atributo proprio
    private String tipoAgua;

    public Tartaruga(String nome, int peso, int idade, int membros, String tipoAgua) {
        super(nome, peso, idade, membros);
        this.tipoAgua = tipoAgua;
    }

    public Tartaruga() {
        super();
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

    public String getTipoAgua() {
        return tipoAgua;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + this.getNome() + '\'' +
                ", peso=" + this.getPeso() +
                ", idade=" + this.getIdade() +
                ", membros=" + this.getMembros() +
                ", tipo de Agua=" + this.getTipoAgua() +
                '}';
    }
}

