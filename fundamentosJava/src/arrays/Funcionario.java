package arrays;

public class Funcionario {

    private String nome;
    private Empresa empresa;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (empresa == null) return;
        System.out.println(empresa.getNome());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
