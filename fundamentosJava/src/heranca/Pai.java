package heranca;
//PROTECTED : controlador de acesso, onde as classes que extendem essa classe pode usar
// ou quem tiver no mesmo modulo. Ex.: classe filho
// Essa classe Pai tambem é 'mae' da classe 'TesteExtendePai' do pacote 'EntradaDados' e foi testado no main01 desse pacote
public class Pai {
    private String nome;
    protected String sobrenome;

    public void imprime(){
        System.out.println("NOME DO PAI:");
        System.out.println(this.getNome());
        System.out.println(this.getSobrenome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
