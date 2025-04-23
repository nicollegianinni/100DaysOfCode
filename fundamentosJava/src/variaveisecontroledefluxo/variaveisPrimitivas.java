package variaveisecontroledefluxo;

public class variaveisPrimitivas {

    /*Pagina 13-26: Apostila caelum - Variaveis primitivas e apos controle de fluxo
    * TIPOS DE VARIAVEIS: int INTEIRA, double ou float DECIMAL, long NUMEROS LONGOS, CHAR 1 letra, E BOLEANA (true ou false)
    *
    * primeiramente escreve o tipo da variavel depois escreve o nome dado a ela (a 1 letra minuscula seguindo camel case)
    * Ex.: tipoDaVariavel nomeDaVariavel ; idade guarda um numero inteiro
    * Ex.: int            idade ;
    * Logo no inicio ou apos, atribui um valor a essa variavel: int idade =20 ou depois, idade = 20;
    * tradução: "idade deve valer 20."
    * */

    public static void main(String[] args) {

        int idade;
        idade = 30;

        int idadeAnoQueVem;
        idadeAnoQueVem = idade + 1;
        System.out.println(idade);
        System.out.println(idadeAnoQueVem);


        //OPERADORES MATEMATICOS

        //soma
        int somaDeIdades;
        somaDeIdades = idade + idadeAnoQueVem;
        System.out.println(somaDeIdades);

        //subtração
        int subtraçãoDeIdades;
        subtraçãoDeIdades =  idadeAnoQueVem - idade;
        System.out.println(subtraçãoDeIdades);

        //divisão
        int divisaoDosNumeros;
        int TotalIdades;
        TotalIdades = 2;
        divisaoDosNumeros = idade / TotalIdades;
        System.out.println(divisaoDosNumeros);

        //multiplicação
        int multiplicacaoDasIdades;
        multiplicacaoDasIdades = idade * idadeAnoQueVem;
        System.out.println(multiplicacaoDasIdades);

        // OPERADOR MODULO % (o resto de uma divisao com numeros impares inteiros)
        int aSobraDaDivisão ;
        aSobraDaDivisão = idadeAnoQueVem % 2; //idadeDoAnoQueVem é um numero impar, dividido por 2 sobra 1 inteiro
        System.out.println(aSobraDaDivisão);

        //DOUBLE (numeros decimais)
        double pi = 3.14;
        double x = pi * 2;
        System.out.println("essa é a multiplicação de Pi por 2: "+ x);


        //BOLEANA (true ou false)
        /*vamos descobrir se a é maior ou menor que 30
        formatação você deblara a variavel boolean o nome da variavel e o que voce quer checar*/
        boolean verdade = true;
        boolean falso = false;

        int idades;
        int minhaIdade = 31; //
        boolean maiorQue30 = minhaIdade > 30;

        System.out.println("a idade é maior que 30 anos?" + maiorQue30 + ". Deu true, é verdadeiro em inglês!");

        // CHAR (guarda apenas uma letra, menuscula ou maiuscula usa se aspas simples)
        //Obs.: Char nao é tao usada por ter pouco espaco de memoria, para escritas
        // usamos a classe String, mas string ela nao é considerada variavel primitiva.
        char letra = 'A';

        char sim = 'S';
        char nao = 'N';
        System.out.println("você aprendeu algo novo hoje? (S/N)  Resposta: " + sim);

        //OPERADORES DE ATRIBUIÇÕES (um valor passa a copiar o outro apos uso de =
        int i = 5;
        int j = i;
        i = i + 1;

        System.out.println("i começou com 5, e agora +o novo valor de i + i é: "+ i + ". Mas o valor de J nao muda pois permanece valor do i inicial: j ficou: "+ j);
        // agora se eu atribuir novamente ao j ao novo valor do i, ele ficara com valor de 6;
        // Antes a atribuição do J estava escrito acima da operação do i. Agora esta escrito abaixo.
        j = i;
        System.out.println("novo valor do J é: "+ j);

        //Esses tipos primitivos são mais comuns, porem Java tem outros:
        // byte, short, long e float, que em outros situações são usados.

        //EXERCICIOS

        /* (1) Na empresa em que trabalhamos há tabelas de gastos de cada mes. Ao final do trimestre mes precisamos do valor total.
        * janeiro foi gasto 15 mil, fevereiro 23 mil e em março 17 mil.
        * Faça um programa que imprima o resultado.
        * LEMBRE SE NAO ESTAMOS USANDO STRING PARA TEXTO AINDA!
        *  */

        int janeiro = 15000;
        int fevereiro = 23000;
        int março = 17000;

        int somaDoTrimestre = janeiro + fevereiro + março ;
        System.out.println("Esse trimestre deu o total de "+ somaDoTrimestre + " mil reais.");

        //FLOAT
        float umaCasaDecimal = 10.8f;
        float duasCasasDecimais = 10.80f;
        System.out.println(duasCasasDecimais);

        float numeroA = 10;
        float numeroB = 3;
        float resultadoFloat = numeroA/ numeroB;
        System.out.println("Resultado em float: " + resultadoFloat);

        double numeroA2 = 10;
        double numeroB2 = 3;
        double resultadoDouble = numeroA2 / numeroB2;
        System.out.println("Resultado em double: "+ resultadoDouble);
        // observe que o double apresenta mais casas decimais, oculpando mais espaço de memoria.
        // Para escolhermos a casa decimais fazemos um seguinte, apenas no float:
        // Em vez de println (line) na saida escreve p printf (formatado), e depois escreve: %.2f para duas casa decimais etc, em vz de concatenar com + usa se virgula.
        System.out.printf("o resultado de float pode considerar a quantidade de casa decimal que você quiser, ex.: %.2f " , resultadoFloat);
        // exemplo de 1 e 3 casas decimas
        System.out.printf("\n1 casa decimal: %.1f \ne 3 casas decimais: %.3f\n" , resultadoFloat , resultadoDouble);


        //dividir numero por zero
        double number = 0;
        double resultado = 2 / number;
        System.out.println("Mude o 10 para 0 e verá que não é possivel a divisão, mostra infinity ou dará erro.\n Mas retornando o valor para 2 divido por 10 dá: " + resultado );


    }
}
