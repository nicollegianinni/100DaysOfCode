package variaveisecontroledefluxo;

import java.util.Scanner;

public class switchCase {
    // switch case é bastante usado para escolha de caso

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("\n Olá! Qual prato do menu você deseja? \n" +
                "\n 1 = Sushi - japão  \n 2 = Lasanha - França \n 3 = Yakissoba - China \n 4 = Feijoada - Brasileiro " +
                "\n 5 = Pizza - Itália \n 6 = Burguer Artesanal- Eua\n" +
                "\nDigite um numero: ");
        opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Sushi - japão");
                break;
            case 2:
                System.out.println("Lasanha - França");
                break;
            case 3:
                System.out.println("Yakissoba - China");
                break;
            case 4:
                System.out.println("Feijoada - Brasileiro");
                break;
            case 5:
                System.out.println("Pizza - Itália");
                break;
            case 6:
                System.out.println("Burguer Artesanal- Eua");
                break;
        }

        int confirmacao;
        int escolherDeNovo;

        System.out.println("****************************************************");
        System.out.println("Você deseja pedir a opcao " + opcao + "? " +
                "\n digite: \n sim = 1\n nao = 2  \n sair = 3");

        confirmacao = entrada.nextInt();
        switch (confirmacao) {
            case 1:
                System.out.println("****************************************************");
                System.out.println("Ok, você confirmou! Seu pedido será " + opcao + ". Ja esta sendo preparado.");
                break;
            case 2:
                System.out.println("****************************************************");
                System.out.println("Certo, escolha uma das opções:" +
                        "\n escolher de novamente = 4\n sair = 3 ");
                escolherDeNovo = entrada.nextInt();

                switch (escolherDeNovo) {
                    case 4:
                        System.out.println("****************************************************");
                        System.out.println("Ok, escolha novamente seu prato:" +
                                " \n[ Para nao gerar um loop infinito, usando POO você poderia linkar para o menu" +
                                "\n Na qual repatiria o menu novamente.] ");
                        break;
                    case 3:
                        System.out.println("****************************************************");
                        System.out.println("Entendi você quer sair. Ate breve!");
                        break;
                }
                break;
            case 3:
                System.out.println("****************************************************");
                System.out.println("Entendi você quer sair. Ate breve!");
                break;
        }
    }
}

