package variaveisecontroledefluxo;

import java.util.Scanner;

public class LacoWhile {
    /* Vamos ver o laço de repetição while: Ele so executa o laço se o parametro que esta no parentese for executado.
     *Diferente do Do While: que executa o do e depois testa o while.
     * e muito parecido com if, mas quando o if e else começa a ficar muito extenso, nos usamos o while
     * O while é um comando usado para fazer um laço (loop), repetir um trecho de código algumas vezes.
     * A ideia é que esse trecho de código seja repetido enquanto uma determinada condição permanecer verdadeira.
     */

    public static void main(String[] args) {
        double valorDaCompra = 180.00;
        float desconto = ((float) valorDaCompra * 0.10f);
        float novoValorDaCompra = (float) valorDaCompra - desconto ;

        while (valorDaCompra >= 100) {
            System.out.printf("Seu valor com desconto é %.2f " , novoValorDaCompra);
            break;
            }
        if (valorDaCompra < 100) {
            System.out.println("você nao teve desconto para essa compra! \n Complete 100 reais e tenha 10% de desconto!");
        }

        //outro exemplo
        Scanner teclado = new Scanner(System.in);

        int idadeCadaAno;
        int ano;
        System.out.print("\n Qual sua idade ?");
        idadeCadaAno = teclado.nextInt();
        System.out.print("\n Em que ano estamos ?");
        ano = teclado.nextInt();

        while (idadeCadaAno >=0 ){
            idadeCadaAno ++;
            ano++;
            System.out.print("No ano de " + ano + " sua idade será : " + idadeCadaAno);
            break;
        }
    }
}
