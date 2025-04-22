package variaveisecontroledefluxo;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class lacoFor {
// Laço de repetição FOR funciona parecido com o While. Vamos ver um exemplo de tabuada:

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Tabuada do FOR");
        for (int numero = 0; numero <=10; numero ++ ){
            System.out.println("3 x " + numero + " = " + numero );
        }
// poderia ser trocado por while
        System.out.println("\nTabuada do WHILE");
        int i = 0;
        while (i <= 10) {
            System.out.println("3 x " + i + " = " + i );
            i ++;
        }

    }
}
