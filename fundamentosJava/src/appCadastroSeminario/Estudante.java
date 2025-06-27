package appCadastroSeminario;
//        Crie um sistema que gerencie seminários
//        sitema deverá cadastrar seminários, estudantes, professores e local onder será realizado
//        Um aluno poderá estar em apenas um seminário
//        Um seminário poderá ter nenhum ou vários alunos
//        Um professor poderá ministrar vários seminários
//        Um seminário deve ter um local
//        Campos básicos (excluindo relacionamento)
//        seminário: título
//        aluno: nome e idade
//        professor: nome, especialidade
//        local:endereço

public class Estudante {

    private String nome;
    private int idade;
    private Seminario seminario;


    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudante(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(seminario.getTitulo());
        System.out.println(seminario.getLocal());
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
