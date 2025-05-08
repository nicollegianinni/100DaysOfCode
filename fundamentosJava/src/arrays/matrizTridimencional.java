package arrays;

public class matrizTridimencional {
    public class matrizesTridimencional {

        public static void main(String[] args) {

            // manipulando matrizes tridimencional 3 dimensoes (como dado num cubo cordenadas x,y,z)
            // nao é muito usual, mas na implementaçao de jogos é muito comum

    /* Exemplo:
    Faça um programa que crie uma matriz 3x3x3 onde cada eleento da matriz seja iguaç a soma dos seus indices (ex.: [1,2,1 => 1+2+1 = 4) ]
    obtenha a soma doe todos elementos da matriz, e obtenha a soma dos elementos pares e impares.
    exiba na tela os valores da soma total, soma de valores pares e impares.
    */
            //modo rapido de criar
            int[][][] medidasDoParalelepipedo = {{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}};

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


            //imprimindo na tela os valores
            for (int i = 0; i < matrizTridimencional.length; i++) {
                for (int j = 0; j < matrizTridimencional[i].length; j++) {
                    for (int k = 0; k < matrizTridimencional[i].length; k++) {
                        System.out.println(matrizTridimencional[i][j][k]);
                    }
                }
                System.out.println();
            }
        }
    }
}
