package EntardaDados;

import java.util.Scanner;

public class Advinha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá Lívia, eu sou o programa que advinha seu futuro!");
        System.out.println("Digite aqui algo que eu responderei sim ou nao...");
        String palavras = teclado.nextLine();
        if (palavras.charAt(0) == ' ') {
            System.out.println("SIM");
        } else
            System.out.println("NÃO");
    }
}
