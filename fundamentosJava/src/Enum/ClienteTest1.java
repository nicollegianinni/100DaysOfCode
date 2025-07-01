package Enum;
//ENUMs serve para nao ter a inconsistencia de dados,
// ir para o banco de dados com nomes sem padrão de formatação como vemos abaixo.
public class ClienteTest1 {
    public static void main(String[] args) {

        ClienteClasse1 cliente1 = new ClienteClasse1("Manu",35,"PESSOA_FISICA");
        ClienteClasse1 cliente2 = new ClienteClasse1("Cecilia", 20,"Pessoa Fisica");
        ClienteClasse1 cliente3 = new ClienteClasse1("Ricardo", 31,"PESSOA_JURIDICA");
        ClienteClasse1 cliente4 = new ClienteClasse1("Robson", 45,"pessoa_juridica");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
