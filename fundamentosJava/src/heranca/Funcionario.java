package heranca;

public class Funcionario extends Pessoa {
    private double salario;

//IGNORE ESSES 3 BLOCOS ABAIXO; ELES SÃO PARA VERMOS COMO FUNCIONA A INICALIZAÇÃO (VEJA DEPOIS QUE ACABAR HERANÇA EM Test> Main02 )
    static {
        System.out.println("Bloco de inicialização estatico de Pessoa");
    }

    {
        System.out.println("1 Bloco de inicalização não estatico de Pessoa");
    }

    {
        System.out.println("2 Bloco de inicalização não estatico de Pessoa");
    }
    //construtor default

        public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
        System.out.println("Dentro do metodo construtor de Funcionario"); // ignore é sobre inicialização
    }

    //subescrita da classe mae
    public void imprime() {
        System.out.println("________________________________");
        System.out.println(" DADOS DA PESSOA ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
        if (this.getEndereço() == null) return;
        System.out.println("Endereço: " + this.getEndereço().getRua());
        System.out.println("Nº: " + this.getEndereço().getNumero());
        System.out.println("________________________________");
        System.out.println(" DADOS DO FUNCIONARIO ");
        System.out.println("Salario: " + this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
