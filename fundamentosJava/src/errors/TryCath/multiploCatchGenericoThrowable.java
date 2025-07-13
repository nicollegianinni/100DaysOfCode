package errors.TryCath;
//Mutiplo catch generico chamando a classe mais superior Throwable ( não é uma boa pratica)
//Em caso de herança de Exceptions: Sempre declara uma exception mais primeiro especifica para depois vir a generica.
// Ex.: aqui declaramos o erro ArithmeticException para depois declarar o Throwable.
// Se for ao contrario do mais amplo (generico) para mais especifico, não compila,
// ja que o mais amplo 'throwable' abrange tudo, por ser uma superClasse classe mãe.

public class multiploCatchGenericoThrowable {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int[] denom = {1, 0, 3, 0, 5};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException e) { // CLASSE EXCEPTION FILHA DE THROWABLE
                //System.out.println(e.getMessage());
                System.out.println("Não pode dividir por zero");
                //e.printStackTrace();
            } catch (Throwable ex) { // THROWABLE SUPER CLASSE não uma boa pratica chamar a classe super throwable
                System.out.println("Não tem mais numeros para dividir ");
            }

        }
        System.out.println("Termina codigo");
    }
}
