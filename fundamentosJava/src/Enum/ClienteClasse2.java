package Enum;
//Para substituir uma variavel que é limitada usamos a classe ENUM
//USANDO A CLASSE ENUM= TipoClienteEnum = PESSOA FISICA E JURIDICA, adiciona a classe por associação como atributo.
public class ClienteClasse2 {

    public enum TipoPagamento{     // PODE SE CRIAR UM ENUM DENTRO DA CLASSE, sem precisar criar classe Enum
        DEBITO, CREDITO
    }
    private String name;
    private int CPF;
    private TipoClienteEnum tipo; // adicionamos Aqui a classe TipoClienteEnum criada fora

    private TipoPagamento tipoPagamento; // adiciona aqui o Enum TipoPagamento criado na propria classe

    private TipoContaEnum tipoConta; // so crie essa associação com o Enum 'TipoConta' por ultimo,
    // depois de testar os anteriores na ClasseTest2, adicione tambem ao construtor e ao toString()

    public ClienteClasse2(String name, int CPF, TipoClienteEnum tipo, TipoPagamento tipoPagamento, TipoContaEnum tipoConta) { // adiciona tambem ao construtor
        this.name = name;
        this.CPF = CPF;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
        this.tipoConta = tipoConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public TipoClienteEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoClienteEnum tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "ClienteClasse2{" +
                "name='" + name + '\'' +
                ", CPF=" + CPF +
                ", tipo=" + tipo + // Classe: TipoClienteEnum
                ", tipoPagamento=" + tipoPagamento + // Enum criado na classe
                ", NumerotipoConta: "+tipoConta+
                ", NumerotipoConta: "+tipoConta.VALOR+
                ", " +tipoConta.nomeRelatorio+
                '}';
    }
}
