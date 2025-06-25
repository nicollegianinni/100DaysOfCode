package arrays;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        //Vetores conhecidos como arrays; Estrutura de dados: Lista ordenada de dados

        // exemplo
        // 1) armazenar temperatura do ano/ mes inteiro

        // para digitar/entrada de dados
        Scanner teclado = new Scanner(System.in);

        //exemplo erroneo
        double tempDiaria001 = 31.5;
        double tempDiaria002 = 32;
        double tempDiaria003 = 30;
        double tempDiaria004 = 29;
        double tempDiaria005 = 30;
        //... nao é correto fazer assim pois imagina fazer isso 365 ou 366 vezes, Um ano! então usamos arrays

        //ARRAY DE VETOR onde guarda informações numa "fila unica ordenada"
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.5; // a posição incial é o zero.
        temperaturas[1] = 32;
        temperaturas[2] = 30;
        temperaturas[3] = 29;
        temperaturas[4] = 28;

        // instanciando e adicionando um array/vetor em uma linha
        // foram add 5 valores (começando sempre da posição zero)
        int[] temp = {10, 11, 12, 13, 14};
        System.out.println("A 1º temperatura registrada no modo resumido de instanciar array é : " + temp[0]);

        System.out.println(temperaturas); // assim sai o endereço salvo na mamoria
        System.out.println("No 1º primeiro dia a temperatura é: " + temperaturas[0]); // so trocar o indice que encontra o valor que queira
        System.out.println("Temperatura do 5 dia: " + temperaturas[4]);
        System.out.println(temperaturas.length); // saber o tamanho do array

        // para saber quais sados tem no array
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("A temperatura do dia " + (i + 1) + " é " + temperaturas[i] + " graus.");
            // observe que as posições que foram preenchidas mostrara os numeros adicionados, mas as posições vazias com numero zero aguardando add de algum dado.

        }
        //outra forma de usar o for para ver as temperaturas
        for (double temp1 : temperaturas) {
            System.out.println(temp1);
        }

        System.out.println();
        int[] n = {10, 20, 30, 40, 50, 60};
        System.out.println("Total de casas do vetor/array: " + n.length);
        for (int l = 1; l < n.length - 1; l++) {
            System.out.println("Na posição " + l + " temos o valor de " + n[l]);
        }
        System.out.println();
        System.out.println("Mostrando a posição 'correta' começando em 1 em vez de 0");

        for (int l = 1; l <= n.length -1; l++) {
            System.out.println("Na posição " + l + " temos o valor de " + n[l-1]);
        }
    }
}
