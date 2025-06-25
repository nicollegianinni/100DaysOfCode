package arrays;

import java.util.Arrays;

public class BuscaBinaria {
    public static void main(String[] args) {

        //fazer uma busca binaria
        int vet[] = {3,7,6,1,9,4,2}; // observe que o numero 1 esta na posição 3

        for (int v : vet){
            System.out.print(v + " ");
        }
        System.out.println();
        int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontei o valor 1, ele esta na posição " +p);

        System.out.println();
        System.out.println("adicionando numeros atraves do fill");
        int numeros[] = new int[20];
        Arrays.fill(numeros , 0);

        for (int num : numeros){
            System.out.print(num + " ");
        }
    }

}
