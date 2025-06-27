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

public class Seminario {

    private String titulo;
    private Estudante[] estudante;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
