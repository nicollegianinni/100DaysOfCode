package Enum;
//SAIDA USANDO A CLASSE ENUM PARA PESSOA JURIDICA E FISICA
public class CienteTeste2 {
    public static void main(String[] args) {

        ClienteClasse2 cliente1 = new ClienteClasse2("Manu", 35, TipoClienteEnum.PESSOA_JURIDICA, ClienteClasse2.TipoPagamento.DEBITO);
        ClienteClasse2 cliente2 = new ClienteClasse2("Cecilia", 35, TipoClienteEnum.PESSOA_FISICA,ClienteClasse2.TipoPagamento.CREDITO);
        ClienteClasse2 cliente3 = new ClienteClasse2("Livia", 35, TipoClienteEnum.PESSOA_FISICA,ClienteClasse2.TipoPagamento.CREDITO);
        ClienteClasse2 cliente4 = new ClienteClasse2("Manu", 35, TipoClienteEnum.PESSOA_JURIDICA,ClienteClasse2.TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        //SAIDA ESPERADA: Sera impresso "Com a classe Enum{nome,CPF,tipo} do metodo toString() da classe (ClienteClasse2)
        //como adicionamos um Enum 'TipoPagamento' na propria ClienteClasse2, e adicionamos no toString() devera sair todos os dados do objeto criado.
    }
}