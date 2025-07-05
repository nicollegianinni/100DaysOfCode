package polimorfismo;

import jdk.swing.interop.SwingInterOpUtils;

public class Tomate extends Produto{
    public  static final double IMPOSTO = 0.06;
    //atributo proprio da classe filha
    private String dataValidade;

    //METODO PADRÃO ABSTRACT DA CLASSE PRODUTO
    public Tomate(String nome, double valor){
        super(nome, valor);
    }
    //METODO CRIADO ESPECIALMENTE PARA INCLUIR O ATRIBUTO 'data de validade' que so existe na classe tomate
    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

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

    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Data de validade: " + dataValidade ;
    }
}
