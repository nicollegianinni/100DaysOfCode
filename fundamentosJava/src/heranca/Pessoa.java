package heranca;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    //IGNORE ESSES 3 BLOCOS ABAIXO; ELES SÃO PARA VERMOS COMO FUNCIONA A INICALIZAÇÃO (VEJA DEPOIS QUE ACABAR HERANÇA EM Test> Main02)
    static {
        System.out.println("Bloco de inicialização estatico de Pessoa");
    }

    {
        System.out.println("1 Bloco de inicalização não estatico de Pessoa");
    }

    {
        System.out.println("2 Bloco de inicalização não estatico de Pessoa");
    }

    //construtor default
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Dentro do metodo construtor");  // ignore é sobre inicialização
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
