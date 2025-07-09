package polimorfismo.Test;

import polimorfismo.CalculadoraImposto;
import polimorfismo.Computador;
import polimorfismo.Produto;
import polimorfismo.Tomate;
//POLIMORFISMO
public class ProdutoTest01 {
    public static void main(String[] args) {
        // CLASSE MAE        // CLASSE FILHA
        Produto produto1 = new Computador("Ryzen 7", 3800);
        Produto produto2 = new Tomate("Tomate cereja", 20);

        //SAIDA: METODO TO STRING DA CLASSE MAE
        System.out.println(produto1);
        produto1.InfoAdd();
        System.out.println();

        System.out.println(produto2);
        produto2.InfoAdd();
        System.out.println();

        //instanciando as classes para imprimir o relatorio dos produtos
        Computador computador = new Computador("Lenovo", 3500);
        Tomate tomate = new Tomate("Tomate Red", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println();
        //chamando pelo metodo mais desacoplado e mais generico da classe calculadora de imposto
        CalculadoraImposto.CalculaImposto(computador);
        CalculadoraImposto.CalculaImposto(tomate);

    }
}
