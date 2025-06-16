package tests;

import orientacaoobjeto.ObjetoCarro;

public class ObjetoCarroTest {
    public static void main(String[] args) {
        ObjetoCarro carro1 = new ObjetoCarro();
        ObjetoCarro carro2 = new ObjetoCarro();

        carro1.nome = "Mustang";
        carro1.ano = 1968;
        carro1.modelo = "GT 500";

        carro1.nome = "Fusca";
        carro1.ano = 1969;
        carro1.modelo = "Sport";

        System.out.println();
        System.out.println("carro 1");
        System.out.println("Nome: " + carro1.nome +"| Modelo: " + carro1.modelo + "| Ano: " + carro1.ano);

        System.out.println();
        System.out.println("carro 2");
        System.out.println("Nome: " + carro2.nome +"| Modelo: " + carro2.modelo + "| Ano: " + carro2.ano);


    }
}
