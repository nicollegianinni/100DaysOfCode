package polimorfismo2;

public class Mamifero extends Animal{

    //Atributo proprio
    private String corPelo;


    //METODO CONSTRUTOR OBRIGATORIO DA 'CLASSE MAE: Animal'
    public Mamifero(String nome, int peso, int idade, int membros, String corPelo) {
        super(nome, peso, idade, membros);
        this.corPelo = corPelo;
    }

    //METODO ABSTRACT OBRIGATORIO NAS 'CLASSES FILHAS'
    @Override
    public String locomover() {
        System.out.println("Andando");
        return locomover();
    }

    @Override
    public String alimentar() {
        System.out.println("Mamando");
        return alimentar();
    }

    @Override
    public String emitirSom() {
        System.out.println("Emite som de mamifero");
        return emitirSom();
    }

    //gat do atrubuto proprio 'cor de pelo'
    public String getCorPelo() {
        return corPelo;
    }
}
