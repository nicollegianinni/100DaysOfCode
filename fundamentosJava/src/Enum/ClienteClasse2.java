package Enum;
//Para substituir uma variavel que é limitada usamos a classe ENUM
//USANDO A CLASSE ENUM= TipoClienteEnum = PESSOA FISICA E JURIDICA, adiciona a classe por associação como atributo.
public class ClienteClasse2 {

    private String name;
    private int CPF;
    private TipoClienteEnum tipo; // adicionamos Aqui a classe TipoClienteEnum

    public ClienteClasse2(String name, int CPF, TipoClienteEnum tipo) { // adiciona tambem ao construtor
        this.name = name;
        this.CPF = CPF;
        this.tipo = tipo;
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

    @Override                             //metodo toString() para saida dos atributos
    public String toString() {
        return "Com a classe Enum{" +
                "name='" + this.getName() + '\'' +
                ", CPF=" + this.getCPF() +'\'' +
                ", tipo=" + this.getTipo() +'\'' +
                '}';
    }
}
