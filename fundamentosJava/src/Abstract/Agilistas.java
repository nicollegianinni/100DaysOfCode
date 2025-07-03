package Abstract;

public class Agilistas extends Funcionario{
    public Agilistas(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }

    //metodo herdado da classe abstract avo Pessoa, pode subescrever algo ou vir pronto da classe mae
    public void Status(){
        System.out.println("de ferias");
    }
}
