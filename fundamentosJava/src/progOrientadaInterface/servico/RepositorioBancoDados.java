package progOrientadaInterface.servico;

import progOrientadaInterface.repositorio.Repositorio;
//PROGRAMAÇÃO ORIENTADA A INTERFACE
public class RepositorioBancoDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em Banco de dados");
    }
}
