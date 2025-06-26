package arrays;
//array por associação
//Para rodar ir dentro do pacote "Test" de arrays

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(Time time) {
        this.time = time;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (time.equals(null)) return;
        System.out.println(time.getNome());


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
