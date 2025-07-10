package errors.RuntimeException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {

        //METODO divisão
        System.out.println("Resultado da divisão é: " + divisao(4, 0));

        //METODO divideDoisNumeros
        try {
            divideDoisNumeros(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // OPÇÃO: CASO NAO SAIBA DO ERRO, VIU PORQUEMOSTROU NO CONSOLE, DE ACORDO COM O QUE DE VOCÊ FAZ A EXCEÇÃO
    private static int divisao(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace(); // mostrar a mensagem para entender qual exception
        }
        return 0;
    }

    // OPÇÃO SE JA SOUBER DO ERRO, MOSTRA UMA MENSAGEM AMIGAVEL PARA UM MELHOR ENTENDIMENTO (THROW = LANCE)
    private static int divideDoisNumeros(int a, int b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero!");
        }
        return 0;
    }
}