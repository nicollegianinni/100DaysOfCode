package heranca.test;

import heranca.Funcionario;
// CLASSE CRIADA APENAS PARA VER COMO FUNCIONA A INICALIZAÇÃO USANDO AS CLASSES PESSOA E FUNCIONARO


/*      DEVE TER ESSA SAIDA NO TERMINAL:
        Bloco de inicialização estatico de Pessoa
        Bloco de inicialização estatico de Pessoa
        1 Bloco de inicalização não estatico de Pessoa
        2 Bloco de inicalização não estatico de Pessoa
        Dentro do metodo construtor
        1 Bloco de inicalização não estatico de Pessoa
        2 Bloco de inicalização não estatico de Pessoa
        Dentro do metodo construtor de Funcionario

 */
public class Main02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya", 32,2500);
        //
    }
}
