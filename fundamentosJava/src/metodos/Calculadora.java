package metodos;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivisaoPorDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return; // o return nesse caso é como se fosse o else ou break
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros (int num1, int num2){
        num1=99;
        num2=33;
        System.out.println("Dentro do alteraDoisNumeros ");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+ num2);
    }

}



