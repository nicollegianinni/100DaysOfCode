package polimorfismo2;

public abstract class Animal {
//atributos que são implementados nas 'classes filhas' mas naop precisa escrever nelas.
    private String nome;
    private int peso;
    private int idade;
    private int membros;

//METODO CONSTRUTOR ESCRITA OBRIGATORIA NAS 'CLASSES FILHAS'
    public Animal(String nome, int peso, int idade, int membros) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    public Animal(){

    }

//METODOS ABSTRACT ESCRITA E IMPLEMENTAÇÃO OBRIOGATORIA
    public abstract String locomover ();

    public abstract String alimentar ();

    public abstract String emitirSom ();

//Gets e Sets que implementam nas 'classes filhas' mas nao precisa escrever la
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

//METODO TO STRING PARA SAIDA DE DADOS SEM PRECISAR USAR GET E SET
    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
