package Enum;
//SAIDA USANDO A CLASSE ENUM PARA PESSOA JURIDICA E FISICA
public class CienteTeste2 {
    public static void main(String[] args) {
                                                                                                           //Esses objetos 'TipoPagamento' e 'TipoConta' foram criados depois
                                                                                                            //Para mostrar que tem como criar Enum na propria 'ClienteClasse2' e tambem adicionar parametro na classe Enum TipoContaEnum
        ClienteClasse2 cliente1 = new ClienteClasse2("Manu", 35, TipoClienteEnum.PESSOA_JURIDICA, ClienteClasse2.TipoPagamento.DEBITO, TipoContaEnum.CONTA_CORRENTE);
        ClienteClasse2 cliente2 = new ClienteClasse2("Cecilia", 35, TipoClienteEnum.PESSOA_FISICA,ClienteClasse2.TipoPagamento.CREDITO, TipoContaEnum.CONTA_PJ);
        ClienteClasse2 cliente3 = new ClienteClasse2("Livia", 35, TipoClienteEnum.PESSOA_FISICA,ClienteClasse2.TipoPagamento.CREDITO, TipoContaEnum.CONTA_POUPANÇA);
        ClienteClasse2 cliente4 = new ClienteClasse2("Manu", 35, TipoClienteEnum.PESSOA_JURIDICA,ClienteClasse2.TipoPagamento.DEBITO, TipoContaEnum.CONTA_CORRENTE);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        //SAIDA ESPERADA: Sera impresso "Com a classe Enum{nome,CPF,tipo} do metodo toString() da classe (ClienteClasse2)
        //como adicionamos um Enum 'TipoPagamento' na propria ClienteClasse2, e adicionamos no toString() devera sair todos os dados do objeto criado.
        //Depois de testar os anteriores, criou se um novo Enum 'TipoContaEnum' com parametros (tipoConta, numeroTipoConta e qual tipo da conta corrente Pj ou poupança)
    }
}