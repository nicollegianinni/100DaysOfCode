package polimorfismo2;

public class Ave extends Animal{
    private String corPena;

    public Ave(String nome, int peso, int idade, int membros, String corPena) {
        super(nome, peso, idade, membros);
        this.corPena = corPena;
    }

    public Ave() {
    }

    public void fazerNinho(){
        System.out.println("Faz ninho");
    }

    @Override
    public String locomover() {
        System.out.println("Voando");
        return locomover();
    }

    @Override
    public String alimentar() {
        System.out.println("Grãos");
        return alimentar();
    }

    @Override
    public String emitirSom() {
        System.out.println("Emite som de ave");
        return emitirSom();
    }

    public String getCorPena() {
        return corPena;
    }


}
