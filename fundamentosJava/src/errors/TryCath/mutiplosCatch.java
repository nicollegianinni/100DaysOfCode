package errors.TryCath;
//multiplos catchs especificando o erro, nesse caso tiveram 2
public class mutiplosCatch {

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
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Não tem mais numeros para dividir ");
            }

        }
        System.out.println("Termina codigo");
    }
}
