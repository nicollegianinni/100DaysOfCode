package Enum;
//usando a classe ENUM
public class ClienteClasse1 {

    private String name;
    private int CPF;
    private String type; //Para substituir uma variavel que é limitada usamos a classe ENUM
//PODERIA ADICIONAR O MODIFICADOR FINAL E STATIC PARA DEIXAR COMO UMA CONSTANTE
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

//    private ClienteEnum cliente;

    public ClienteClasse1(String name, int CPF, String type) {
        if (!type.equals(PESSOA_FISICA)&& !type.equals(PESSOA_JURIDICA))
            return;
        this.name = name;
        this.CPF = CPF;
        this.type = type;
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
                "name='" + name + '\'' +
                ", CPF=" + CPF + '\'' +
                ", type='" + type + '\'' ;

    }
}
