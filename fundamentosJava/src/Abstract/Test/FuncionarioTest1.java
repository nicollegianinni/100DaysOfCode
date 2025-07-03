package Abstract.Test;

import Abstract.*;

//CLASSE DE SAIDA - Referencia as classes: Funcionario, Desenvolvedores e Gerente.
public class FuncionarioTest1 {
    public static void main(String[] args) {

        Gerente funcionario1 = new Gerente("Roberto", 18000, Cargo.GERENTE);
        Desenvolvedores funcionario2 = new Desenvolvedores("Nicholle", 8000,Cargo.DESENVOLDEDOR);
        Agilistas funcionario3 = new Agilistas("Wilker",6000, Cargo.AGILE_MASTER);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);

        //NAO PODE INTANCIAR A CLASSE ABSTRACT NEM INTERFACES
//        Funcionario fun = new Funcionario("nome", 5000, Cargo.GERENTE);


    }
}
