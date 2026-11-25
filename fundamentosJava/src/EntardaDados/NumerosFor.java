package EntardaDados;

import java.util.Scanner;

public class NumerosFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para saber a sequencia dos proximos 25 numeros apartir dele:");
        int numero = entrada.nextInt() ;


        for (int i = numero; i <= numero +25; i++) {

            System.out.println(i);
        }

    }
}
