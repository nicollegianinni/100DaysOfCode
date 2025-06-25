package arrays;
//array por associação
//Para rodar ir dentro do pacote "Test" de arrays

public class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
