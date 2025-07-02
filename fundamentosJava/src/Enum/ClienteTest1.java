package Enum;
//USANDO VARIAVEL STATIC FINAL COMO SE FOSSE ENUM
//ENUMs serve para nao ter a inconsistencia de dados, não ir para o banco de dados com nomes sem padrão de formatação.
// Para esse exemplo 'ClienteClasse1' não usamos ENUM, usamos uma variavel STATIC E FINAL para 'funcionar como ENUM'
// mas para isso, precisa criar um metodo de checagem (condição if)
// se entrada de dados tiver de acordo com a formatação, permita a criação do objeto.
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

        //O COMPORTAMENTO DA SAIDA: Deve sair o metodo toString() criado na ClienteClasse1 (nome,CPF e tipo da conta)
        // Se tiver com a formatação correta em capslook criara o objeto. Caso nao esteja em maiusculo nao criara.
    }
}
