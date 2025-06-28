package heranca;
//Essa classe Filho por esta dentro do pacote em que esta a classe "Pai",
// adere aos atributos podendo modifica-los. independente de usar extende.

public class Filho extends Pai{
    private String nome;

    public void imprime(){
        System.out.println("NOME DA FILHA:");
        System.out.println(this.getNome());
        System.out.println(this.sobrenome); // acesso direto ao metodo por causa o protected. Mude 'sobrenome' para privado e veja que nao permite mais o acesso
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
