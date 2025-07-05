package polimorfismo;
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
    public static void calcularImpostoComputador(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Produto: " + tomate.getNome());
        System.out.println("Valor: : " + tomate.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
