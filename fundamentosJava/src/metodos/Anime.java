package metodos;
//Classe criada para utilizar o metodo toString()

public class Anime {
    private  String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String toString() {
        this.nome = nome;
        return "nome: "+ this.nome ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
