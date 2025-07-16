package errors.IOException.dominio;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }
    private  static void logar() throws LoginInvalidoException{

        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Livia";
        String senhaDB = "lilica";

        System.out.println("Usuario");
        String userNameDBDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if (!userNameDBDigitado.equals(userNameDB)|| !senhaDigitada.equals(senhaDB)){
            throw new LoginInvalidoException ("Usuario ou senha não conferem!");
        }
        System.out.println("usuario logado com sucesso!");

    }
}
