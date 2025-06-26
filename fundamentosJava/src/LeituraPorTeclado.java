import java.util.Scanner;

public class LeituraPorTeclado {

    public static void main(String[] args) {
        //entrado com dados pela classe Scanner

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo:");
        String nome = teclado.nextLine();
        System.out.println(nome);
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();
        System.out.println("Digite seu sexo: (F/M)");
        char sexo = teclado.next().charAt(0); // next() primeira palavra, charAt() primeira letra da palavra
        System.out.println("----------------------------------------");
        System.out.println("Nome: "+ nome + " você tem " + idade + " anos " + " é do sexo "+ sexo);


    }
}
