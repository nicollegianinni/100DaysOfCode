package EntardaDados;

import heranca.Pai;
// Essa classe é filha da classe 'Pai' do pacote 'Heranca e foi testado no Main01 do pacote 'Heranca'
public class TesteExtendePai extends Pai {

    private String nome;

    public void imprime(){
        System.out.println(this.nome); // atributo da propria classe
        System.out.println(this.sobrenome); // sobrenome é atributo da classe que ele extendeu (PAi pacote 'Heranca')
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
