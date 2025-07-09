package polimorfismo.servico;

import polimorfismo.Computador;
import polimorfismo.Produto;
import polimorfismo.Tomate;

//SERVICE SERVE PARA A REGRA DE NEGOCIO
// se nao tiver acessando nenhum atributo de classe pode tornar os metodos staticos
public class CalculadoraImposto {

    //METODO CRIADO PARA FAZER UM RELATORIO DO IMPOSTO DOS PRODUTOS
    //computador
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Produto: " + computador.getNome());
        System.out.println("Valor: : " + computador.getValor());
        System.out.println("Imposto: " + imposto);
    }
    //tomate
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Produto: " + tomate.getNome());
        System.out.println("Valor: : " + tomate.getValor());
        System.out.println("Imposto: " + imposto);
    }

    //APLICANDO SERVICE A BOAS PRATICAS, USANDO POLIMORFISMO
    //metodo mais clean code, mais generico, mais desacoplado
    public static void CalculaImposto(Produto produto){
        System.out.println("----Relatorio de imposto----");
        double imposto = produto.calcularImposto(); // imposto recebe o metodo da interface
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("R$ : "+ produto.getValor());
        System.out.println("Imposto: "+ imposto);
        if (produto instanceof Tomate){ //Caso queira que mostre um atributo de alguma classe filha Faz por CASTING

            Tomate tomate = (Tomate) produto; //CASTING
            System.out.println("Data Validade: "+tomate.getDataValidade()); //saida esperada, nesse caso mostrar data de validade da classe tomate

//            System.out.println(((Tomate) produto).getDataValidade()); // ou mais simplificado ainda o CASTING
//
//            String dataValidade = ((Tomate)produto).getDataValidade(); // existem varias formas de fazer o CASTING
//            System.out.println(dataValidade);
        }
        System.out.println("---------------------------");
    }
}
