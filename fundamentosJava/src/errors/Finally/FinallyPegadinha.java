package errors.Finally;
// PEGADINHA FINALLY: Pode ser que o entrevistador pergunte:
// Se tiver o System.exit(0); no CATCH o que ocorre? o finnaly não é executado.

public class FinallyPegadinha {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int[] denom = {1, 0, 3, 0, 5};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException e) {
                //System.out.println(e.getMessage());
                System.out.println("Não pode dividir por zero");
                e.printStackTrace();
                System.exit(0); // termina execução do programa sem chamar o Finally
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Não tem mais numeros para dividir ");
                System.exit(0);
            }finally { // O FINALLY SEMPRE SERA EXECUTADO APOS A CHAMADA DO CATCH
                System.out.println("Fechando a chamada");
            }

        }
        System.out.println("Termina codigo");
    }
}
