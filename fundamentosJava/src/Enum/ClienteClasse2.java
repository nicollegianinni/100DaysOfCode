package Enum;
//Adiciona o Enum = TipoClienteEnum por associação adicionando ao atributo
public class ClienteClasse2 {
    private String name;
    private int CPF;
    private TipoClienteEnum tipo;

    public ClienteClasse2(String name, int CPF, TipoClienteEnum tipo) {
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

    @Override
    public String toString() {
        return "Com a classe Enum{" +
                "name='" + name + '\'' +
                ", CPF=" + CPF +'\'' +
                ", tipo=" + tipo +'\'' +
                '}';
    }
}
