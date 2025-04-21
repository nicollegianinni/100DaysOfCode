package variaveisecontroledefluxo;

public class LacoWhile {
    /* Vamos ver o laço de repetição while
     * quando o if e else começa a ficar muito extenso, nos usamos o while
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
    }
}
