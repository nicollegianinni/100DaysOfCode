package heranca;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    //subescrita da classe mae
    public void imprime(){
        System.out.println("________________________________");
        System.out.println(" DADOS DA PESSOA ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
        if (this.getEndereço() == null)return;
        System.out.println("Endereço: " + this.getEndereço().getRua());
        System.out.println("Nº: " + this.getEndereço().getNumero());
        System.out.println("________________________________");
        System.out.println(" DADOS DO FUNCIONARIO ");
        System.out.println("Salario: "+ this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
