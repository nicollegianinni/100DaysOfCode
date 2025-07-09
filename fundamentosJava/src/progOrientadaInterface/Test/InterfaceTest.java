package progOrientadaInterface.Test;

import progOrientadaInterface.repositorio.Repositorio;
import progOrientadaInterface.servico.RepositorioArquivo;
import progOrientadaInterface.servico.RepositorioBancoDados;
import progOrientadaInterface.servico.RepositorioMemoria;

//PROGRAMAÇÃO ORIENTADA A INTERFACE
public class InterfaceTest {
    public static void main(String[] args) {
        //modo padrão instanciando a classe que quer chamar
        RepositorioBancoDados inBancoDados = new RepositorioBancoDados();
        inBancoDados.salvar();
        //modo ORIENTADO A INTERFACE (polimorfismo)
        //almenta a facilidade de manutenção é uma boa pratica
        Repositorio  repositorio1 = new RepositorioBancoDados();
        repositorio1.salvar();

        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();

        Repositorio repositorio3 = new RepositorioArquivo();
        repositorio3.salvar();

    }
}
