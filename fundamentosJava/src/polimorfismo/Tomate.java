package polimorfismo;

import jdk.swing.interop.SwingInterOpUtils;

public class Tomate extends Produto{
    public  static final double IMPOSTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
//METODO ABSTRACT DA CLASSE PRODUTO
    @Override
    public void InfoAdd() {
        System.out.println("Tamanho mini");
    }

// METODO ABSTARCT DA INTERFACE
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO;
    }
}
