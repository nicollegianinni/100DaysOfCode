package variaveisecontroledefluxo;

import java.util.Scanner;

public class LacoDoWhile {
    /* while: so prossegue se o parametro do parentese executar. Diferente do Do While.
     * Do while: executa primeiro o comando do Do depois checa o parametro do while.
     */

    public static void main(String[] args) {
        System.out.println("Vamos ver o que faz o laço de repetição 'Do While'.");

        int numero = 0;
        do {
            System.out.println(numero); // observe que aqui p numero é zero
            numero++; // quando entra aqui ele incrementa ganhando +1 podendo assim entrar no laço.
        } while (numero > 0 && numero < 10); // caso nao incrementasse nao entraria. Faça o teste, tire o incremento.
        System.out.println(numero); // Sem o incremento ele repete apenas o resultado zero duas vezes.

        // outro exemplo : vamos fazer uma impressora de tabuada
        Scanner entrada = new Scanner(System.in);

        int numeroTabuada = 0;
        int numeros = 0;
        int resultado = 0;

        System.out.println("Qual tabuada você quer saber?");
        numeroTabuada = entrada.nextInt();
        System.out.println("Essa é a tabuada do " + numeroTabuada);

        do {
            resultado = numeroTabuada * numeros;
            System.out.println( numeroTabuada + " x " + numeros + " = " + resultado);
            numeros++;
        } while (numeros <= 10);



    }
}

