package arrays.Test;

import arrays.Escola;
import arrays.Professor;

public class EscolaProfessor {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Renato");
        Professor professor2 = new Professor("Silvania");
        Professor professor3 = new Professor("Adriano");
        Professor[] professores = {professor1,professor2, professor3};
        Escola escola = new Escola("Escola São jose" ,professores);

        // inserção do jogador no time - associando as classes
        escola.imprime();
    }
}
