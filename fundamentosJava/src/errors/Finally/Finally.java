package errors.Finally;
//FINALLY: abrir arquivo- leitura de arquivo- fecha arquivo no finally (geralmente usado no banco de dados)
//fecha a conexão com banco de dados
public class Finally {
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
            }finally {
                System.out.println("Finally sempre é executado apos o catch - " +
                        "Nesse caso, essa linha aparecerá sempre quando o laço for for executado " +
                        "mesmo com erro o codigo continua.");
            }

        }

    }
}
