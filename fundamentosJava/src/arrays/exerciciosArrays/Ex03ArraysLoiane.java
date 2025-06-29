package arrays.exerciciosArrays;

public class Ex03ArraysLoiane {
    public static void main(String[] args) {

        double[] A = {4,9,16,25,36};
        double[]B=A;
        //visualizando se B recebeu A
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        System.out.println();
        //tranformando B em na raiz quadrada de A
        for (int i = 0; i < A.length; i++) {
            B[i]= Math.sqrt(A[i]);
            System.out.println(B[i]);
        }
    }
}
