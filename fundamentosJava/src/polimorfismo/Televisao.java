package polimorfismo;

public class Televisao extends Produto {

    public static final double IMPOSTO = 0.15;
    //atributo prorpio que foi inserido na sobreposição do metodo construtor
    private String tela;

    public Televisao(String nome, double valor, String tela) {
        super(nome, valor);
        this.tela = tela;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do televisão...");
        return this.valor * IMPOSTO;
    }

    @Override
    public void InfoAdd() {
        System.out.println("4K");
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Televisao{" +
                "tela='" + tela + '\'' +
                '}';
    }
}
