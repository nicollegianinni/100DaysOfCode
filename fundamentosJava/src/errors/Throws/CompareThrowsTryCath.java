package errors.Throws;

import java.util.Scanner;
//entendendo o THROWS
//objetivo:
//observe:se você rodar esse programa, digitar um numero decimal (ex.: 5.5 - usando ponto no teclado de texto)
// se não tratar com try cath nem trows ele nao mostrara erros.
// se tratar mas, remover o print trace, continua sem saber onde esta o erro tranformando num 'bug' futuro
// por isso é importante tratar seja com throws ou try cath, colocar assinatura nio metodo em que pod ehave ro erro.
// e sempre deixar o print trace no cath para ver onde é o erro.
public class CompareThrowsTryCath {

    public static void main(String[] args) throws Exception  /**throws Exception**/ { // opção 1 coloca assinatura do throws no metodo ou trata com try cath

        //opção 2: TRATAMENTO COM TRY CATH
        //TRY CATCH: add a formatação e as mensagens Exception
        System.out.println("Digite um numero decimal: ");
        try {
            double num = leNumeros(); // opção 2: trata com try cath passando o print trace e um get message
            System.out.println("você digitou o numero " + num);
        } catch (Exception e) {
            System.out.println("Entrada invalida!"); // coloca uma mensagem amigavel
            // System.out.println(e.getMessage());  get message adicionara o tipo do erro
            e.printStackTrace();// trace fara o passo a passo onde foi o erro
        }
        System.out.println("fim do programa 1 ");

        //opção1: TRATAMENTO COM TWHROS - COLOCA SE A ASSINATURA NO METODO LA EM CIMA: 'throws Exception'
        // no throws add o throws ele traça os erros porem ele não continua o codigo, ele interrompe, finalizando com erro
        System.out.println("Digite um numero decimal: ");
        double num = leNumeros();
        System.out.println("fim do programa 2 ");

    }



    public static double leNumeros() throws Exception{  // avisa que
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
