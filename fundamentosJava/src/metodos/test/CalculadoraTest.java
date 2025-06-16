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
    }
}
