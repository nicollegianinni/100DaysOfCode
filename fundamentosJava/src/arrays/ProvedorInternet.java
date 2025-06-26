package arrays;

public class ProvedorInternet implements Imprime{
    private String nome;
    private Cliente[] cliente;


    public ProvedorInternet(String nome, Cliente[] clientes) {
        this.nome = nome;
        this.cliente = clientes;
    }

    @Override
    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getCliente());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
}

