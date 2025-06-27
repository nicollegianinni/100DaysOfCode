package appCadastroSeminario;

import arrays.Professor;

public class main {
    public static void main(String[] args) {

        Local local = new Local("Rua das laranjeiras");
        Professores professor = new Professores("Robert Eistein", "backend");
        Estudante aluno = new Estudante("Maria", 26);
        Estudante[] estudantesParaSeminario = {};
        Seminario seminario = new Seminario("Por onde começar: Programação");
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminario(seminariosDisponiveis);
        seminario.setLocal(local);


        System.out.println();
        System.out.println("-------------------------------");
        Estudante estudante1 = new Estudante("Manuela", 22);
        Estudante estudante2 = new Estudante("Denise", 23);
        Estudante estudante3 = new Estudante("Rosaria", 25);
        Estudante[] Alunos = {estudante1, estudante2, estudante3};


        for (Estudante estudante : Alunos) {
            System.out.print(estudante.getNome() + ", ");
            System.out.println(estudante.getIdade() + " anos.");
        }

        System.out.println();
        seminario.setEstudante(Alunos);
        professor.imprime();


    }
}
