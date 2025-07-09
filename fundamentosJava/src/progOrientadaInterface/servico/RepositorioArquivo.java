package progOrientadaInterface.servico;

import progOrientadaInterface.repositorio.Repositorio;
//PROGRAMAÇÃO ORIENTADA A INTERFACE
public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
