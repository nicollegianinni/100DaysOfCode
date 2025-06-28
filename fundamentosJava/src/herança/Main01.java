package herança;

public class Main01 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Nicolle Gianinni", 31);
        Endereco endereçoPessoa1 = new Endereco("Avenida conselheiro aguiar", 430);
        pessoa1.setEndereço(endereçoPessoa1);
        pessoa1.imprime();
//        Funcionario func1 =  new Funcionario(pessoa1);
//        func1.setSalario(2500);
//        pessoa1.imprime();
    }
}
