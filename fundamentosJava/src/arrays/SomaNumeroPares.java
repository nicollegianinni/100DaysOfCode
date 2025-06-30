package arrays;

public class SomaNumeroPares {
//    TESTE CASAS BAHIA
//    Título: Soma de Números Pares
//    Enunciado
//    Escreva uma função chamada somaPares que recebe um array de números inteiros e retorna a soma apenas dos números pares contidos nesse array.
//    Regras:
//    A função deve ignorar os números ímpares.
//    Se o array estiver vazio ou não houver nenhum número par, retorne 0.
//    Exemplo:
//    somaPares([1, 2, 3, 4, 5, 6]) // retorna 12
//    somaPares([1, 3, 5])          // retorna 0
//    somaPares([])                 // retorna 0
    public static int somaPares (int[]array){
        int soma =0 ;

        if (array == null || array.length==0){
            return 0;
        }
        for (int numero : array){
            if (numero % 2 ==0){
                soma+=numero;
            }
        }return soma;
    }

    public static void main(String[] args) {

        int[] numeros= {1,2,3,4,5,6,7,8,9,10}; // resultado vai deve sair 30
        System.out.println(somaPares(numeros)); // chama a classe passando parametro que criamos na main
    }

}


