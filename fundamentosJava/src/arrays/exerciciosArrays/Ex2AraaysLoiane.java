package arrays.exerciciosArrays;

public class Ex2AraaysLoiane {

    public static void main(String[] args) {

        int[] A = new int[8];
        int[] B = new int[A.length];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;

        B = A;
        //espaço de memoria
        System.out.println(B);
        // ver os numeros traves do FOR
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("B deve receber os valores de A em cada posição multiplicado por 2");

        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
            B[i] = A[i] * 2;
            System.out.println(B[i]);
        }

        //Visualizaçãoo do Array B fora do laço for
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

        System.out.println("=====================================");
        System.out.println("Outra maneira de fazer");
        System.out.println();
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8}; //cria array ja declara os valores
        int[] vetorB = vetorA; // atribui ao vetorB os valores do vetorA

        // Mostra na tela o valor de vetorB que recebeu vetorA
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);

        }

    }
}
