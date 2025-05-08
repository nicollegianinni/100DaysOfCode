package arrays;

public class Matrizes {
    //Matrizes são arrays bidimencional ou tridimnesional ou irregular
    //Array/vetores é uma lista; Matriz é uma tabela, um array de uma array.

    public static void main(String[] args) {

        //exemplo erronea
        double [] aluno001 = new double[1];
        double [] aluno002 = new double[2];
        double [] aluno003 = new double[3];

        //... nao é correto fazer assim, hoje são 3 alunos mas imagine salvar as notas de todos que fazem enem, por exemplo? então nesse caso melhor usar a matriz

        double [][] notasAlunos = new double[4][3]; // primeiro indice é a quantidade de alunos e o outro as materias

       // aluno posição 0 na tabela
        notasAlunos [0][0] = 6; // 1 nota
        notasAlunos [0][1] = 10; // 2 nota
        notasAlunos [0][2] = 8; // 3 nota

        //aluno posição 1 na tabela
        notasAlunos [1][0] = 10; // 1 nota do aluno posição 0
        notasAlunos [1][1] = 7; // 2 nota
        notasAlunos [1][2] = 7; // 3 nota

        //aluno posição 2 na tabela
        notasAlunos [2][0] = 9; // 1 nota do aluno posição 0
        notasAlunos [2][1] = 8; // 2 nota
        notasAlunos [2][2] = 8; // 3 nota

        //aluno posição 3 na tabela
        notasAlunos [3][0] = 9; // 1 nota do aluno posição 0
        notasAlunos [3][1] = 8; // 2 nota
        notasAlunos [3][2] = 10; // 3 nota

        System.out.println("Primeira nota do aluno 1 que ambas são posição zero na tabela: " + notasAlunos[0][0]);
        System.out.println("Primeira nota (posição 0 na tabela) do aluno 4 (posição 3 na tabela)  : " + notasAlunos[3][0]);

        for (int i =0; i<notasAlunos.length;i++){
            //System.out.print(notasAlunos[i] + " "); // mostrara o espaço de memoria
            for (int j =0; j<notasAlunos[i].length; j++){
                System.out.print(" | "+ notasAlunos[i][j]);
            }

            System.out.println();
        }
    }
}
