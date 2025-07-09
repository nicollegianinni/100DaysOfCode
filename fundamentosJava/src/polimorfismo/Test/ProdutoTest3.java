package polimorfismo.Test;

import polimorfismo.*;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest3 {
    public static void main(String[] args) {
        //2 objetos: um instanciando sua prorpia classe e outro a classe mae 'produto'
        //os 2 modos vai sair a data de validade, pois fizemos o if - intanceOf na classe 'calculaImposto'

        Tomate tomate = new Tomate("tomate Cereja", 20, "14/08/2025");
        CalculadoraImposto.CalculaImposto(tomate);

        Produto tomate2 = new Tomate("tomate manico", 15, "15/08/2025");
        CalculadoraImposto.CalculaImposto(tomate2);

        //observe que computador nao temos essa mesma saida mesmo ele possuindo um atributo proprio 'tela'
        //não foi instanciado na classe calculaImposto então nao saira impresso o atributo proprio, tipo da 'tela'
        Produto tv = new Televisao("Samsung", 3000, "amoled");
        CalculadoraImposto.CalculaImposto(tv);

        //
    }

}
