package heranca;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;


    //construtor default
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("________________________________");
        System.out.println(" DADOS DA PESSOA ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
        if (endereco == null) return;
        System.out.println("Endereço: " + this.getEndereço().getRua());
        System.out.println("Nº: " + this.getEndereço().getNumero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereço() {
        return endereco;
    }

    public void setEndereço(Endereco endereço) {
        this.endereco = endereço;
    }


}
