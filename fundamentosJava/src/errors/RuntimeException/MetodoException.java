package errors.RuntimeException;
//Criando um erro para entender o try cath
//criamos um array (vetor) onde tem 4 pósições alocadas.
//vamos chamar a 5 posição para ver o erro e tratar
//É IMPORTANTE COLOCAR O METODO DA EXCEPTION PRINTSTACKTRACE() PARA VER NOS LOGS
//EX.: BIBLIOTECAS COMO LOGS4J, ULTILIZARÁ ESSAS INFORMAÇÕES PARA MONTAR ARQYUIVOS DE REGISTROS DE LOGS.
public class MetodoException {
    public static void main(String[] args) {

        //EXEMPLO 1
//        int[] vetor = new int[4];
//        System.out.println("Antes da exceção");
//
//        vetor[4]=1; // Erro só eixstem posições {0,1,2,3} não existe {4}: java.lang: ArrayIndexOutOfBoundsException
//        System.out.println("Esse texto nao será impresso, pois é apos o erro.");

        //descomente o primeiro exemplo para testa-lo -
        // mostrara o erro sem defini onde é nem o que houve e nao contuinuara o codigo
        //o primeiro exemplo interrompe, o codigo nao roda nada apos


        //EXEMPLO 2
        System.out.println("Novo exemplo");
        int[] vetor2 = new int[4];
        try {
            vetor2[4]=1;   // Erro só eixstem posições {0,1,2,3} não existe {4}: java.lang: ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("EXCEPTION: Essa posição não existe no array!"); // MOSTRAR PARA USUARIOS- mensagem amigavel do erro
            //e.printStackTrace(); //MOSTRAR P DESENVOLVEDORES- por ultimo mostrara onde esta o erro
            //System.out.println(e.getMessage()); // //MOSTRAR P DESENVOLVEDORES -mostrara uma mensagem mostrando qual erro
        }
        //mostrar essa mensagem continuando o codigo
        System.out.println("Agora mostrar essa mensagem pois o codigo nao é interrompido" +
                " mostrando o erro porem continua rodando.");
    }
}
