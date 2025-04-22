package variaveisecontroledefluxo;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class lacoFor {

// Laço de repetição FOR funciona parecido com o While.
//     for (inicializacao; condicao; incremento) {
//          codigo;
//         }
// Vamos ver um exemplo de tabuada:

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Tabuada do FOR");
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println("3 x " + numero + " = " + numero);
        }
// poderia ser trocado por while
        System.out.println("\nTabuada do WHILE");
        int i = 0;
        while (i <= 10) {
            System.out.println("3 x " + i + " = " + i);
            i++;
        }
        //incremento
        int w = 5;
        int x = ++w;
        System.out.println("incremento: refere se a acrescentar +1 numero ao resultado. ex.:" + x);

        // decremento
        int m = 5;
        int n = --m;
        System.out.println("decremento é quando diminui se -1 numero ao resultado. ex.: " + n);


        // INCREMENTO para saber de numeros primos ou divisiveis
        int p = 1;
        int y = 100;
        System.out.println("\nAchei os número entre " + p + " e " + y + " que são divisíveis por 100!  ");
        for (p = 1; p <= y; p++) {
            if (100 % p == 0) {
                System.out.println(p);
            }
        }

        // DECREMENTO para subtrair 10 em 10 ( de 100 a zero)
        int g;
        int h=10;
        System.out.println("\nEsses são os numeros subtraidos de 10 em 10( de 100 a zero) \n");
        for (g=110;g>=h;--g){
            g = g -10;
            System.out.println(g);
            g = g+1;
        }
        // usando o CONTINUE

        System.out.println("\nnumeros entre 50 e 60\n");
        for (int t = 0; t <+ 100; t++) {
            if (t >= 50 && t <= 60) {
                System.out.println(t);
            }
        }

        System.out.println("\nCUIDADO PARA NAO FICAR FORA DO SCOPO;\nimprimira 10 x 'olá!' e uma vez, 10. pois esta fora do escopo.\nex.: da linha 73!\n");
        int b;
        for (b = 0; b < 10; b++) {
            System.out.println("olá!");
        }
        System.out.println(b); // b era zero depois passou a ser 10 pelo incremento.
    }
}

