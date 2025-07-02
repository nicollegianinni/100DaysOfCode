package Enum;
//Para criar uma variavel limitada usamos a classe ENUM, que tranforma numa constante.
// mas nesse momento vamos usar uma variavel 'STATIC FINAL' como se fosse um "ENUM"
// para compararmos o comportamento.
public class ClienteClasse1 {
    private String name;
    private int CPF;

//ADICIONAR O MODIFICADOR FINAL E STATIC PARA DEIXAR COMO UMA CONSTANTE como se fosse um ENUM
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    private String type; // como não tinha como imprimir no metodo la em baixo toString() PESSOA FISICA E JURIDICA,
    // criei um atributo para receber as Strings e imprimir no metodo toString() na classe ClienteTest1

    // Abaixo o metodo construtor, o cliente precisa passar os dados PESSOA_FISICA E PESSOA_JURIDICA nessa formatação se nao retona null.
    public ClienteClasse1(String name, int CPF, String tipo) {
        if (!tipo.equals(PESSOA_FISICA)&& !tipo.equals(PESSOA_JURIDICA))
            return ;
        this.name = name;
        this.CPF = CPF;
        this.type = tipo; // objeto type recebe o atributo static final se é PESSOA_FISICA ou PESSOA_JURIDICA
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "name='" + this.name + '\'' +
                ", CPF=" + this.CPF+ '\'' +
                 ", Tipo da conta: " + this.type ; // type recebeu tipo e imprimira o tipo da conta PESSOA FISICA E JURIDICA


    }
}
