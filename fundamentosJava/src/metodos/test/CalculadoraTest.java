package metodos.test;

import metodos.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println();
        System.out.println("Testando a soma");
        calculadora.somaDoisNumeros();
        System.out.println();
        System.out.println("Testado a subtração");
        calculadora.subtraiDoisNumeros();
        System.out.println();
        System.out.println("Testando a multiplicação");
        calculadora.multiplicaDoisNumeros(10,2);

        //diferente dos metodos void sem retorno, esse precisa salvar em uma variavel ou explicitar no sout(saida)
//       assim nao saida dados nenhum:
//        System.out.println("Testando a divisão");
//        calculadora.divideDoisNumeros(10,2);
//        System.out.println();
//        System.out.println("Testando o erro da divisão por zero");
//        calculadora.divideDoisNumeros(10,0);
//        System.out.println();
        // vamos ver a maneira correta:
        System.out.println();
        System.out.println("Testando a divisão");
        double result = calculadora.divideDoisNumeros(10,2);
        System.out.println(result);
        System.out.println("Testando o erro da divisão por zero");
        double resultado = calculadora.divideDoisNumeros(10,0);
        System.out.println(resultado);

        System.out.println("Testando metodo void com retorno");
        calculadora.imprimeDivisaoPorDoisNumeros(10,5);
        System.out.println();
        calculadora.imprimeDivisaoPorDoisNumeros(10,0);

        System.out.println();
        //observe que quando passamos uma variavel como argumento, os numeros permanece a variavel criada aqui
        // ja quando passamos usando a calculadora.alteraDoisNumeros usamos o parametro criado na função/metodo
        int num1 =1;
        int num2 =2;
        System.out.println("Importando os parametros da função:");
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println();
        System.out.println("Dentro dessa classe de teste: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();


    }
}
