package polimorfismo;

public class Computador extends Produto {
    public  static final double IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

//METODO ABSTRACT DA CLASSE PRODUTO
    @Override
    public void InfoAdd() {
        System.out.println("Cor prata");
    }

// METODO ABSTARCT DA INTERFACE
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * IMPOSTO;
    }

}
