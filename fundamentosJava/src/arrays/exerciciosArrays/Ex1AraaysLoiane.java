package arrays.exerciciosArrays;

public class Ex1AraaysLoiane {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        int[] B = A;

        // mostra o espaço de memoria
        System.out.println(B);

        // atraves do laço FOR, mostra os numeros de fato
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}
