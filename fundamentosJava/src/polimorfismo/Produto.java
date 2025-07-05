package polimorfismo;
//produto é uma classe abstract para ser como um templete
public abstract class Produto implements Taxavel {

    protected String nome;
    protected double valor;

//METODO CONSTRUTOR
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

//METODO ABSTRACT PROPRIO DE PRODUTO
    public abstract void InfoAdd();

//gets e sets
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
//metodo to string
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
