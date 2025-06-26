package arrays;

public class Empresa {

    private String nome;
    private Funcionario[] funcionarios;

    //SOBRECARGA de metodos quando o mesmo metodo assume 2 papeis como vemos abaixo no metodo construtor "Empresa"
    public Empresa(String nome) {
        this.nome = nome;
    }

    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (funcionarios == null) return;
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
