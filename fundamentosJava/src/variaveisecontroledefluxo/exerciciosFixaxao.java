package variaveisecontroledefluxo;

public class exerciciosFixaxao {

//    Mais exercícios de fixação de sintaxe. Para quem já conhece um pouco de Java, pode ser muito
//    simples, mas recomendamos fortemente que você faça os exercícios a fim de se acostumar com erros de
//    compilação, mensagens do javac, convenção de código, etc.
//    Apesar de extremamente simples, precisamos praticar a sintaxe que estamos aprendendo. Para cada
//    exercício, crie um novo arquivo com extensão .java e declare aquele estranho cabeçalho, dando nome a


    public static void main(String[] args) {

//    1. Imprima todos os números de 150 a 300.
        int numero1 = 150;
        System.out.println("1. Imprima todos os números de 150 a 300.");
        while (numero1 >= 150 && numero1 <= 300) {
            System.out.println(numero1);
            numero1++;
        }


//        2. Imprima a soma de 1 até 1000.
        int number = 0;
        int resultado = 0;
        resultado = number;

        System.out.println("2. Imprima a soma de 1 até 1000.");
        while (number <= 1000) {
            resultado = resultado + number;
            number++;
        }
        System.out.println("A soma de 1 a 1000 é " + resultado);


//            3. Imprima todos os múltiplos de 3, entre 1 e 100.
        System.out.println("3. Imprima todos os múltiplos de 3, entre 1 e 100.");
        int numero = 0;
        resultado = 0;
        for (numero = 0; numero <= 100; numero++) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }

//        4. Imprima os fatoriais de 1 a 10.
        System.out.println("4. Imprima os fatoriais de 1 a 10.");

        int num = 6;
        long numeroFatorial = num * (num - 1);
        System.out.println(numeroFatorial);

        for (long i = (num - 1); i > 1; i--) {
            numeroFatorial *= (i - 1);
            System.out.println(numeroFatorial);
        }

//    Faça um FOR que inicie uma variável n (número) como 1, fatorial (resultado) como 1 e varia n de 1
//    até 10:
//        int fatorial = 2;
//        for (int n = 2; n <= 5; n++) {
//            fatorial *= (n - 1);
//            System.out.println(fatorial);
//      Aumente a quantidade de números que terão os fatoriais impressos
////    até 20, 30 e 40. Em um determinado momento, além de esse cálculo demorar, começará a mostrar
////    respostas completamente erradas. Por quê?
////    Mude de int para long a fim de ver alguma mudança, como no primeiro codigo.


// 6. (Opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
//    Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro elemento vale 0 , o
//    segundo vale 1, e daí por diante. O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-
//    ésimo elemento (ex: 8 = 5 + 3).

        int n1 = 0;
        int n2 = 1;
        int n3, count = 0;

        System.out.println("Serie fibonacci: " + n1 + " ");
        System.out.print(n2 + " ");
        while (count < 10) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            count++;
        }

//    7 . COLLATZ
//    O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13 , a saída
//    será:
//            40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
//    (Opcional) Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um
//    novo x de acordo com a seguinte regra:
//    Se x é par, x = x / 2 ;
//    Se x é impar, x = 3 * x + 1 ;
//    Imprime x ;

        System.out.print("\nsequencia de collatz: \n");
        int x = 13;
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
                System.out.print(" " + x + " ");
            } else {
                x = x * 3 + 1;
                System.out.print(x);
            }

        }

//    8. (Opcional) Imprima a seguinte tabela usando for s encadeados:
//            1
//            2 4
//            3 6 9
//            4 8 12 16
//    n n*2 n*3 .... n*n


        System.out.println(" \n\n");
        int numeral = 5;
        for (int linha = 1; linha <= numeral; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(linha * coluna + " ");
            }
            System.out.println();
        }

// DESAFIO FIBONACCI
//        Faça o exercício da série de Fibonacci usando apenas duas variáveis.

        System.out.println("\n\n");
        int anterior = 0;
        int atual = 1;
        while (atual < 100) {
            System.out.print(atual + " ");
            atual = anterior + atual;
            anterior = atual - anterior;
        }
        System.out.println(atual);
    }
}











