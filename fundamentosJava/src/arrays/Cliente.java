package arrays;

public class Cliente implements Imprime {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprime(){
        System.out.println(this.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
