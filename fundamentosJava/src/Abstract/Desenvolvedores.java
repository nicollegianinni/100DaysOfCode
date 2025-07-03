package Abstract;
// CLASSE CONCRETAS FILHA DE FUNCIONARIO E NETA DE PESSOA
public class Desenvolvedores extends Funcionario{
    public Desenvolvedores(String nome, double salario, Cargo cargo ) {
        super(nome, salario, cargo);
    }

    //metodo herdado da classe abstract avo Pessoa, pode subescrever algo ou vir pronto da classe mae
    public void Status(){
        System.out.println("Ativo");
    }
}
