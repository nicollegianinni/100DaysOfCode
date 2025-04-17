package variaveisecontroledefluxo;

public class castingPromocao {

    /*CASTING E PROMOÇÃO
    CASTING: Quando atribuimos um valor a outra variavel.
    Ex.:
     double valorDaCompra = 10.50;
     int numeroPremio;
     numeroPremio = valorDaCompra;

    PROMOCAO:

    **/


    public static void main(String[] args) {

        //vamos usar o exemplo acima para INT

        double valorDaCompra = 10.50;
        int numeroPremio;
        // numeroPremio = ValorDaCompra;  Obs.: tire as barras e observe que ele nao compila.
        // mas se colocarmos o (int) antes da variavel atribuida, funcionara, passando a receber o novo inteiro valor.
        numeroPremio = (int) valorDaCompra;
        System.out.println("Você ganhou o premio de numero: " + numeroPremio);

        //outro exemplo
        double pi = 3.14;
        int valorInteiroDePI = (int) pi;
        System.out.println(" O valor inteiro de PI é: " + valorInteiroDePI);

        // observe que o numero pode conter ponto (virgual ou nao)
        double valorDecimal  = 1100;
        int numeroDaSorte;
        numeroDaSorte = (int) valorDecimal;


        // ja o DOUBLE nao precisa de casting pois ele pode receber valor inteiro e decimal
        int numeroSorteado = 1000;
        double tranformeDecimal;
        tranformeDecimal = numeroDaSorte;
        System.out.println("Numero sorteado tranformado em decimal é: " + tranformeDecimal);

        //outro exemplo
        int i = 5 ;
        double d = i;
        System.out.println(" A variavel decimal 'd'. Ela ainda nao tem valor. Apos a atribuicao ganhara o valor da inteira i, porem tranformara em decimal: " + d);


        // para o LONG ele cabe numeros longos
        long x = 123456789;
        // int i = x; nao compila
        int inteiro = (int) x;
        System.out.println("O Valor da variavel Long tinha um grande espaço de memoria (8 bytes) , transformado em inteiro o resultado é igual mas o espaço usado é menor (4 bytes): " + inteiro);


        // Caso FLOAT
        // float y = 2.00; se tirar barras vera que nao compila.
        // para funcionar temos que anotar o f ao final do numero indicando o ponto flutuante.
        float y = 2.00f;
        System.out.println(y);

        double decimalComum = 5;
        float flutuante;
       // flutuante = decimalComum; sem casting nao compila
        flutuante = (float) decimalComum;
        //calculo sem numeros so com atrubuicoes
        float numero = flutuante + (float) decimalComum;
        int numeroInteiro = (int) numero;
        float floatAleatorio = 3.14f; //float ta sublinhado por ser uma palavra reservado
        floatAleatorio = floatAleatorio + (float) numeroInteiro;
        System.out.println("descritivo de cada valor: \n Double Decimal: " +decimalComum + "\n float (que ganhou valor do decimal): " + flutuante + "\n Soma das atribuicoes por casting: " + numero + "\n e tudo isso em numero inteiro seria " + numeroInteiro + "\nsomado com um float aleatorio da: " + floatAleatorio + "(observe que obedeceu a cada decimal)" );

        // caso curioso o char consegue fazer o casting implicito para o int
        char charNumero = 12;
        int intNumero = 10;
        int somaNumero = intNumero + charNumero;
        System.out.println("a soma de um char promovido a int é: " + somaNumero);

    }
}
