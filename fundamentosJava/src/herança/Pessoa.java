package herança;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereço;

    private Funcionario funcionario;

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
        if (endereço == null) return;
        System.out.println("Endereço: " + this.getEndereço().getRua());
        System.out.println("Nº: " + this.getEndereço().getNumero());
        if(this.getFuncionario()==null)return;
        System.out.println("________________________________");
        System.out.println("Salario: " + this.getFuncionario().getSalario());
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
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
