package arrays;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        //Vetores conhecidos como arrays; Estrutura de dados: Lista ordenada de dados

        // exemplo
        // 1) armazenar temperatura do ano/ mes inteiro

        // para digitar/entrada de dados
        Scanner teclado = new Scanner(System.in);

        //exemplo :
        double tempDiaria001 = 31.5;
        double tempDiaria002 = 32;
        double tempDiaria003 = 30;
        double tempDiaria004 = 29;
        double tempDiaria005 = 30;
        //... nao é correto fazer assim pois imagina fazer isso 365 ou 366 vezes, Um ano! então usamos arrays

        //ARRAY DE VETOR onde guarda informações numa "fila unica ordenada"
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.5;
        temperaturas[1] = 32;
        temperaturas[2] = 30;
        temperaturas[3] = 29;
        temperaturas[4] = 28;
        // a posição incial é o zero.

        System.out.println(temperaturas); // assim sai o endereço de mamorio salvo no pc
        System.out.println("No 1º primeiro dia a temperatura é: " + temperaturas[0]); // so trocar o indice que encontra o valor que queira
        System.out.println("Temperatura do 5 dia: " + temperaturas[4]);
        System.out.println(temperaturas.length); // saber o tamanho do array

        // para saber quais sados tem no array
        for (int i = 1; i < temperaturas.length; i++) {
            System.out.println("A temperatura do dia " + (i) + " é " + temperaturas[i] + " graus.");
            // observe que as posições que foram preenchidas mostrara os numeros adicionados, mas as posições vazias com numero zero aguardando add de algum dado.

        }
        //outra forma de usar o for para ver as temperaturas
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
