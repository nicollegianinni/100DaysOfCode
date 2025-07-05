package polimorfismo;

public class Televisao extends Produto {

    public  static final double IMPOSTO = 0.15;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do televisão...");
        return this.valor * IMPOSTO;
    }

    @Override
    public void InfoAdd() {

    }
}
