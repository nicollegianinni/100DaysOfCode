package errors.TryCath;
//Criando um erro para entender o try cath
//criamos um array (vetor) onde tem 4 pósições alocadas.
//vamos chamar a 5 posição para ver o erro e tratar
public class Exception {
    public static void main(String[] args) {

        //EXEMPLO 1
//        int[] vetor = new int[4];
//        System.out.println("Antes da exceção");
//
//        vetor[4]=1; // Erro só eixstem posições {0,1,2,3} não existe {4}: java.lang: ArrayIndexOutOfBoundsException
//        System.out.println("Esse texto nao será impresso, pois é apos o erro.");

        //comente o primeiro exemplo para testar o 2
        //o primeiro exemplo interrompe o codigo
        System.out.println("-------------------");

        //EXEMPLO 2
        System.out.println("Novo exemplo");
        int[] vetor2 = new int[4];
        try {
            vetor2[4]=1;
        }catch (java.lang.Exception e){
            System.out.println("Essa posição não existe no array!"); // mensagem amigavel do erro
            e.printStackTrace(); //por ultimo, mostrara onde esta o erro
            System.out.println(e.getMessage()); // mostrara uma mensagem mostrando qual erro
        }
        //mostrar essa mensagem continuando o codigo
        System.out.println("Agora mostrar essa mensagem pois o codigo nao é interrompido" +
                " mostrando o erro porem continua rodando.");
    }
}
