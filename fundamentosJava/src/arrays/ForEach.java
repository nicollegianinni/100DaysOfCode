package arrays;

import java.util.Random;

public class ForEach {
    // Bastante usado nos arrays
    // o For each é mais simples, faz a contagem como o for tradicional, mostra o resultado da lista, mas nao tem como acessar o indice.
    // para entender melhor, é como se dentro do parametro dicesse:
    // for ( int numero : Lista) -> numero percorra toda lista. (obs.: mesmo sem incremento e o length ele percorre o tamanho da lista).
    public static void main(String[] args) {

        System.out.println("For tradional");
        int[] notas = new int[10];
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("For each");

        for (int nota : notas) {
            System.out.println(nota);
        }

        System.out.println("usando randon");
        Random randon = new Random();
        int[] nootas = new int[10];
        for (int i = 0; i < nootas.length; i++) {
            nootas[i] = randon.nextInt();

        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(nootas[i]);
        }

        System.out.println();
        for (int noota : nootas) {
            System.out.println(noota);
        }

        // exemplo 2

        int[][] notasAlunos = new int[3][3];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 7;

        notasAlunos[1][0] = 6;
        notasAlunos[1][1] = 10;
        notasAlunos[1][2] = 8;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 8;
        notasAlunos[2][2] = 8;

        System.out.println();

        // for each

        for (int[] notaAluno : notasAlunos) {
            for ( int  Nota : notaAluno) {
                System.out.print(Nota + " ");
            }
            System.out.println();
        }
    }
}


