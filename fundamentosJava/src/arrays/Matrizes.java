package arrays;

public class Matrizes {
    //Matrizes são arrays bidimencional ou tridimnesional ou irregular
    //Array/vetores é uma lista; Matriz é uma tabela, um array de uma array.

    public static void main(String[] args) {

        //exemplo erronea
        double[] aluno001 = new double[1];
        double[] aluno002 = new double[2];
        double[] aluno003 = new double[3];

        //... nao é correto fazer assim, hoje são 3 alunos mas imagine salvar as notas de todos que fazem enem, por exemplo? então nesse caso melhor usar a matriz

        double[][] notasAlunos = new double[4][3]; // primeiro indice é a quantidade de alunos e o outro as materias

        // aluno posição 0 na tabela
        notasAlunos[0][0] = 6; // 1 nota
        notasAlunos[0][1] = 10; // 2 nota
        notasAlunos[0][2] = 8; // 3 nota

        //aluno posição 1 na tabela
        notasAlunos[1][0] = 10; // 1 nota do aluno posição 1
        notasAlunos[1][1] = 7; // 2 nota
        notasAlunos[1][2] = 7; // 3 nota

        //aluno posição 2 na tabela
        notasAlunos[2][0] = 8; // 1 nota do aluno posição 2
        notasAlunos[2][1] = 8; // 2 nota
        notasAlunos[2][2] = 8; // 3 nota

        //aluno posição 3 na tabela
        notasAlunos[3][0] = 10; // 1 nota do aluno posição 3
        notasAlunos[3][1] = 8; // 2 nota
        notasAlunos[3][2] = 10; // 3 nota

        System.out.println("Primeira nota do aluno 1 que ambas são posição zero na tabela: " + notasAlunos[0][0]);
        System.out.println("Primeira nota (posição 0 na tabela) do aluno 4 (posição 3 na tabela)  : " + notasAlunos[3][0]);


        System.out.println();
        for (int i = 0; i < notasAlunos.length; i++) {
            //System.out.print(notasAlunos[i] + " "); // mostrara o espaço de memoria
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(" | " + notasAlunos[i][j]);
            }

            System.out.println();

        }
        //mudando a nota
        notasAlunos[3][0] = 6; // 1 nota do aluno posição 3
        // observe que mudou de 10 para 6
        System.out.println(notasAlunos[3][0]);
        System.out.println("A Primeira nota, do aluno 4 mudou de 9 para  : " + notasAlunos[3][0]);

        System.out.println();
        System.out.println();
        //media aritimetica
        System.out.println("Calculando a media de cada aluno.");
        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("A media do aluno " + i + " é " + (soma / 3));
        }

        //instanciando em uma linha uma matriz
        double[][]  notasVestibular = {{8, 9, 10}, {10, 9, 8}, {7, 10, 8}, {8, 8, 9}};
        System.out.println("Nota do vestibular: " + notasVestibular[0][0]); // mostrar a primeira nota do aluno 1/indice 0

        //output imprimindo valores na tela
        int aluno =1;
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Notas do Aluno "+ aluno);
            aluno++;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print("|" + notasVestibular[i][j]);

            }
            System.out.println();
        }
        System.out.println();

        //para inicializar sem declarar o tamanho do array, declara o 1 array e depois adiciona o segund:

        int [][] arrayInt = new int [3][];

        //adiciona o tamanho dos arrays que antes nao declarou ( nao é o valor de cada casa é o so tamanho)
        arrayInt[0] = new int [3];
        arrayInt[1] = new int [6];
        arrayInt[2] = new int [9];

        System.out.println("O tamanho de cada array:");
        for (int arrayBase [] : arrayInt){
            System.out.print("\n---------------------");
            System.out.println();
            for (int num : arrayBase){
                System.out.print(" " + num);
            }
        }
        System.out.println();

        // ou ja pode declarar o tamanho e os valores em seguida
        arrayInt[0] = new int []{1,2,3};
        arrayInt[1] = new int []{2,4};
        arrayInt[2] = new int []{3,4,1,3,5,2};

        System.out.println("\nO tamanho de cada array e os valores dentro deles:");
        for (int arrayBase [] : arrayInt){
            System.out.print("---------------------");
            System.out.println();
            for (int num : arrayBase){
                System.out.print(" " + num);
            }
            System.out.println();
        }
        System.out.println();
    }
}
