package heranca;

import EntardaDados.TesteExtendePai;

public class Main01 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Nicolle Gianinni", 31);
        Endereco endereçoPessoa1 = new Endereco("Avenida conselheiro aguiar", 430);
        pessoa1.setEndereço(endereçoPessoa1);
        pessoa1.imprime();

        Funcionario func1 =  new Funcionario("Livia Gabrielle", 22,3500);
        Endereco endereçoPessoa2 = new Endereco("Avenida Domingos Ferreira", 430);
        func1.setEndereço(endereçoPessoa2);
        func1.imprime();

        //Conclusão: é melhor que o metodo imprime() esteja na classe onde ha mais espeficidade.
        // Na classe funcinario ja que ele tem que
        // se implementar construtor na mae é obrigatorio implementar todos atributos da classe mae (pessoa) atraves do super

        // CLASSE PAI E FILHO
        Pai pai = new Pai();
        pai.setNome("Jonas");
        pai.setSobrenome("Soares");
        pai.imprime();
        System.out.println("----------------");
        Filho filha = new Filho();
        filha.setNome("Nicolle");
        filha.setSobrenome("Silva"); // atraves do set add sobrenome 'Silva' a filha
        // e atraves do metodo imprime trouxe diretamente do atributo nao do metodo get (ver classe filha)
        filha.imprime();
        System.out.println("-----------------"); // observe que em pai nada mudou
        pai.imprime();

        System.out.println();
        //Testando controlador de acesso PROTECTED da classe Pai
        TesteExtendePai teste1 = new TesteExtendePai();
        System.out.println("---------------------------");
        System.out.println("Testando se Protected permite acesso ao atributo da Classe de outro pacote, quando usa extends");
        teste1.setNome("Livia");
        teste1.setSobrenome("Santos");
        teste1.imprime();

    }

}
