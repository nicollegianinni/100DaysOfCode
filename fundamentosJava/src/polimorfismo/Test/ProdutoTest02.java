package polimorfismo.Test;

import polimorfismo.*;

//POLIMORFISMO
// PEGAMOS OS ATRUBUTOS DA CLASSE ABSTRACT 'PRODUTO' E REFERENCIAMOS O OBJETO NAS 'CLASSES FILHAS: COMPUTADOR E TOMATE'
//widening casting: - up casting - casting
public class ProdutoTest02 {
    public static void main(String[] args) {

        //METODO CONSTRUTOR PADRÃO DA CLASSE ABSTRACT
        //chamando atributos pelo get
        System.out.println("--------------------------------");
   // CLASSE MAE tipo gerenico  // CLASSE FILHA tipo mais especifico
        Produto produto1 = new Computador("Ryzen 7", 3800);
        System.out.println("Nome: "+produto1.getNome());// chamando pelo get
        System.out.println("valor: "+produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("detalhe do produto:  ");
        System.out.print(produto1); //chamando pelo toString() da classe produto
        System.out.println();
//---------------------------------------------------------------------
        System.out.println("--------------------------------");
        Produto produto2 = new Tomate("Tomate cereja", 20);
        System.out.println("Nome: "+produto2.getNome());
        System.out.println("valor: "+produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("detalhe do produto: ");
        System.out.print(produto2); // saida pelo metodo to String agora na sobreposição (to string de produto + tomate)
        System.out.println();
//---------------------------------------------------------------------
        //METODO CONSTRUTOR PARA ADICIONAR O ATRIBUTO 'data de validade'
        //para usar atributo proprio como vimos 'data de validade' em 'tomate' teriamos que instanciar apenas tomate
        Tomate tomate = new Tomate("Tomatinho",15, "12/10/2025");
        System.out.println("Data de validade: "+tomate.getDataValidade());
        //pode adicionar criando atributo instanciando o proprio objeto ou criando a 'data de validade' atraves do toString()
        System.out.print(tomate);
        System.out.println();

        //USANDO CLEAN CODE METODO MAIS EFICIENTE MAIS GENERICO MAIS DESACOPLADO
        //assim fica mais facil criar varios objetos
        // e depois so chama o metodo e passa o parametro o produto que você quer
        CalculadoraImposto.CalculaImposto(produto1);
        CalculadoraImposto.CalculaImposto(produto2);
        System.out.println();
//----------------------------------------------------------
        //Criando objeto UpCasting da classe mae Tv abstract 'Produto' e da classe filha 'Televisão'
        Produto televisão = new Televisao("Samsung 50\"",2500,"amoled" );
        System.out.println("Detalhes do produto: " + televisão);
        CalculadoraImposto.CalculaImposto(televisão);

    }
}
