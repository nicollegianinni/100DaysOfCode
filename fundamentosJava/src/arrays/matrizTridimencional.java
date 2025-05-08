package arrays;

public class matrizTridimencional {

    public static void main(String[] args) {

    // manipulando matrizes tridimencional 3 dimensoes (como dado num cubo cordenadas x,y,z)
    // nao é muito usual, mas na implementaçao de jogos é muito comum

    /* Exemplo:
    Faça um programa que crie uma matriz 3x3x3 onde cada eleento da matriz seja iguaç a soma dos seus indices (ex.: [1,2,1 => 1+2+1 = 4) ]
    obtenha a soma doe todos elementos da matriz, e obtenha a soma dos elementos pares e impares.
    exiba na tela os valores da soma total, soma de valores pares e impares.
    */
        //Observação: por ser 3d existe uma complexidade para imprimir os resultados

        //modo rapido de criar
        int[][][] medidasDoParalelepipedo = {{{1, 1, 1}, {2, 2, 2},{3, 3, 3}}};

        //modo comum de criar e adiconar informações
        int[][][] matrizTridimencional = new int[3][3][3];
        matrizTridimencional[0][0][0] = 3;
        matrizTridimencional[0][1][0] = 3;
        matrizTridimencional[0][1][1] = 3;

        matrizTridimencional[1][0][0] = 5;
        matrizTridimencional[1][1][0] = 5;
        matrizTridimencional[1][1][1] = 5;

        matrizTridimencional[2][0][0] = 3;
        matrizTridimencional[2][2][0] = 3;
        matrizTridimencional[2][2][2] = 3;


        for (int i = 0; i < medidasDoParalelepipedo.length; i++) {
            for (int j = 0; j < medidasDoParalelepipedo[i].length; j++) {
                for (int k = 0; k < medidasDoParalelepipedo[i].length; k++) {
                    System.out.print("|" + medidasDoParalelepipedo[i][j][k]);
                }
            }
            System.out.println();
        }
        System.out.println();

        //imprimindo na tela os valores
        for (int i = 0; i < matrizTridimencional.length; i++) {
            for (int j = 0; j < matrizTridimencional[i].length; j++) {
                for (int k = 0; k < matrizTridimencional[i].length; k++) {
                    System.out.print("|" + matrizTridimencional[i][j][k]);
                }
            }
            System.out.println();
        }
        System.out.println();


        //exercicio

        for (int i = 0; i < matrizTridimencional.length; i++) {
            for (int j = 0; j < matrizTridimencional[i].length; j++) {
                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
                    System.out.println("i = " + i + " |  J = " + j + " | K = " +k ); // para entender melhor o output debug
                    matrizTridimencional [i][j][k] = i + j +k;

                }
            }
            System.out.println();
        }
//
//        int soma =0;
//        int somapares =0;
//        int somaImpares=0;
//
//        for (int i = 0; i < matrizTridimencional.length; i++) {
//            for (int j = 0; j < matrizTridimencional[i].length; j++) {
//                for (int k = 0; k < matrizTridimencional[i].length; k++) {
//                    soma+= matrizTridimencional [i][j][k];
//                    if (matrizTridimencional [i][j][k] %2 ==0){
//                        somapares+=matrizTridimencional [i][j][k];
//                    } else {
//                        somaImpares +=matrizTridimencional [i][j][k];
//                    }
//                }
//            }
//        }
//        System.out.println("Soma total: " + soma);
//        System.out.println("Soma pares: " +somapares);
//        System.out.println("Soma impares: " +somaImpares);
    }
}

