package errors.TryCath;
//UNIFICANDO 2 EXCEPTIONS EM UM SÓ TRATAMENTO (TRY CATCH) do JAVA 7 em diante, abaixo tem que fazer separado
//Aqui vemos novamente os 2 erros de dividir por zero e de não ter posição suficiente do array
//Então fez se o tratamento dos 2 exception diferente da forma do Try catch multiplo (usando 2 catchs separadamente)
// Nesse caso a mensagem do erro fica generalizado 'houve um erro' (pq são 2 erros diferentes e apenas uma escrita)
//é mais interessante usar quando o erro for mais generico possivel
public class ExceptionsSimilares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int[] denom = {1, 0, 3, 0, 5};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException |ArrayIndexOutOfBoundsException exc){
                System.out.println("Houve um erro");
            }

        }
        System.out.println("fim do programa");
    }

}

