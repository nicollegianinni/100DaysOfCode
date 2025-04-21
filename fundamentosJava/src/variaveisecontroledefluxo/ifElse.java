package variaveisecontroledefluxo;

public class ifElse {
    public static void main(String[] args) {
        /* Laços de repetição IF ELSE
         * if (condição boleana, expressao que retorne true e false usa se operadores < > <= , >= ){
         * codigo;
         * }
         */
        int idade = 15;
        if (idade < 18) {
            System.out.println("Não pode acessar!");
        } else {
            System.out.println("pode acessar!");

        }
        /* OPERADORES LOGICOS:
         * OU usa se || uma condição precisa ta correta
         * E usa se && as duas codições precisam estar corretas
         */

        ///dados
        int idadeConvidado = 15;
        boolean amigoDoDono = true;

        if (idadeConvidado > 18 && amigoDoDono == true) {
            System.out.println("Você pode entrar na sala vip!");
        } else {
            System.out.println("Você nao pode entrar na sala vip!");
        }

        // Podemos aumentar a quantidade de ifs
        if (idadeConvidado > 18 || amigoDoDono) {

            if (idadeConvidado > 18 && amigoDoDono) {
                System.out.println("você tem 18 anos e é amigo do dono, você ganhara uma pulseira DOURADA!");
            }
            if (idadeConvidado < 18 && amigoDoDono) {
                System.out.println("Você é menor de 18 anos, mas você é amigo do dono, você ganhara uma pulseira VERDE!");
            } else {
                System.out.println("você tem menos de 18 anos, e nao é amigo do dono! você nao pode entrar!");
            }

        }
      // vamos usar a negação da variavel boolean !
        int senha = 10;
        boolean verde = false;

        if (senha <=10 && verde){
            System.out.println("ACESSO PERMITIDO!");
            if (senha <=10 && !verde){
                System.out.println("SEM ACESSO! mesmo que sua senha seja menor que 10, você nao esta de verde! ");
            }
        } else {
            System.out.println(" SEM ACESSO! sua senha é maior que 10 e voce nao esta de verde");
        }


    }
}




