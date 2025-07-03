package Abstract;
//CLASSE ABSTRACT AVÓ
// ESSA CLASSE ABSTRATA PESSOA, É EXTENDIDA PARA A CLASSE TAMBEM ABSTRATA, FUNCIONARIO.
// FUNCIONARIO É EXTENDIDA PARA OS DEMAIS CARGOS(GERENTE, DESENVOLVEDORES, AGILISTAS ...)
// ENTÃO TEMOS A RELAÇÃO PESSOA SENDO AVO DAS CLASSES 'DOS CARGOS', Herdando assim os seus atributos e metodos abstratos.
public abstract class Pessoa {

    //metodo abstrato para todas as classes herdarem e subescrever
    // o metodo abstract nao pode ter body {corpo}
    public abstract void Status();

    //metodo não abstrato, não é obrigado as filhas e netas herdarem, podendo subescrever
    public void NIS(){
        System.out.println("Nis Ativo");
    }

}
