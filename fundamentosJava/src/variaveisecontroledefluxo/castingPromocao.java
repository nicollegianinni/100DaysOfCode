package variaveisecontroledefluxo;

import java.util.Scanner;

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
        double valorDecimal = 1100;
        int numeroDaSorte;
        numeroDaSorte = (int) valorDecimal;


        // ja o DOUBLE nao precisa de casting pois ele pode receber valor inteiro e decimal
        int numeroSorteado = 1000;
        double tranformeDecimal;
        tranformeDecimal = numeroDaSorte;
        System.out.println("Numero sorteado tranformado em decimal é: " + tranformeDecimal);

        //outro exemplo
        int i = 5;
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
        System.out.println("descritivo de cada valor: \n Double Decimal: " + decimalComum + "\n float (que ganhou valor do decimal): " + flutuante + "\n Soma das atribuicoes por casting: " + numero + "\n e tudo isso em numero inteiro seria " + numeroInteiro + "\nsomado com um float aleatorio da: " + floatAleatorio + "(observe que obedeceu a cada decimal)");

        // caso curioso o char consegue fazer o casting implicito para o int
        char charNumero = 12;
        int intNumero = 10;
        int somaNumero = intNumero + charNumero;
        System.out.println("a soma de um char promovido a int é: " + somaNumero);


        //CASTING STRING é uma classe para escrever texto, ja que o char so comporta apenas um caracter.

        Scanner entrada = new Scanner(System.in);

        String idadeCodigo;
        int codigo = 10;
        int numeracao;

        System.out.println("\n Olá vamos montar seu codigo com base na sua idade.\n Por favor digite sua idade: ");
        idadeCodigo = entrada.nextLine();

//      aqui ele tranforma a idadeCodigo em Int e soma com a IdadeCodigo que dá = 41
        numeracao = codigo + Integer.parseInt(idadeCodigo);
        System.out.println("\n Seu codigo somado a sua idade é: " + numeracao);

//      Aqui ele mantem a idadeCodigo como String juntando assim a idade digitada + o codigo 10  que dá 3110
        idadeCodigo = idadeCodigo + codigo;
        System.out.println("\n Seu codigo + sua idade é: " + idadeCodigo);


        // CASTING INT EM STRING
        String QRCode = "cod";
        String nome;
        System.out.println("Digite seu nome para gerar o codigo: ");
        nome = entrada.nextLine();

        String codigoNovo = QRCode + nome + idadeCodigo + Integer.toString(codigo);
        System.out.println("QR code gerado: " + codigoNovo);

        //CASTING INTEGER TIPO PRIMITIVO
        Integer valor =10;
        String nome3 = " era int, agora é string. ";
        String nome2 = valor.toString();
        nome2 = nome2 + nome3;
        System.out.println("\nCASTING INTEGER TIPO PRIMITIVO: " + nome2);
    }
}
